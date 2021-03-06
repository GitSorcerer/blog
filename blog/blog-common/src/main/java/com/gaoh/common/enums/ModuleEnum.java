package com.gaoh.common.enums;

import lombok.Getter;

/**
 * TypeEnum
 *
 * @author gaoh
 * @date 2020/01/08 20:21
 * @email 2199382542@qq.com
 * @description 模块枚举
 */
@Getter
public enum ModuleEnum {
    /**
     * 文章模块
     */
    ARTICLE(0),
    /**
     * 图书模块
     */
    BOOK(1),
    /**
     * 图书笔记模块
     */
    BOOK_NOTE(2);

    private int value;

    ModuleEnum(int value) {
        this.value = value;
    }
}
