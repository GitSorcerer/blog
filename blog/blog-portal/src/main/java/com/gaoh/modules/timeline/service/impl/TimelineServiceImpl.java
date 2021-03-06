package com.gaoh.modules.timeline.service.impl;

import com.gaoh.entity.manage.timeline.Timeline;
import com.gaoh.entity.manage.timeline.TimelineMonth;
import com.gaoh.entity.manage.timeline.TimelinePost;
import com.gaoh.modules.timeline.mapper.TimelineMapper;
import com.gaoh.modules.timeline.service.TimelineService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * TimeLineServiceImpl
 *
 * @author gaoh
 * @date 2020/02/24 20:47
 * @email 2199382542@qq.com
 * @description
 */
@Service
public class TimelineServiceImpl implements TimelineService {

    @Resource
    private TimelineMapper timelineMapper;

    /**timelineMapper
     * 获取timeLine数据
     *
     * @return
     */
    @Override
    public List<Timeline> listTimeLine() {
        List<Timeline> timelineList = timelineMapper.listTimeline();
        genTimelineMonth(timelineList);
        return timelineList;
    }

    private List<Timeline> genTimelineMonth(List<Timeline> timelineList) {
        for(Timeline timeline : timelineList) {
            List<TimelineMonth> timelineMonthList = new ArrayList<>();
           for (int i = Calendar.DECEMBER + 1; i > 0; i--) {
               List<TimelinePost> postList = timelineMapper.listTimelinePost(timeline.getYear(), i);
               if(CollectionUtils.isEmpty(postList)) {
                   continue;
               }
               TimelineMonth month = new TimelineMonth();
               month.setCount(postList.size());
               month.setMonth(i);
               month.setPosts(postList);
               timelineMonthList.add(month);
           }
           timeline.setMonths(timelineMonthList);
        }
        return timelineList;
    }

}
