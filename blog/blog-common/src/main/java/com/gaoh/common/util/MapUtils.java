package com.gaoh.common.util;

import java.util.HashMap;

/**
 * MapUtils
 *
 * @author gaoh
 * @date 2018/10/22 19:38
 * @email 2199382542@qq.com
 * @description Map工具类
 */
public class MapUtils extends HashMap<String,Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key,value);
        return this;
    }
}
