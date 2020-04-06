package com.eric.ad.constant;

import lombok.Getter;

/**
 * @author Eric Li
 * @date 2020/4/6 11:13 上午
 */

@Getter
public enum CreativeType {

    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
