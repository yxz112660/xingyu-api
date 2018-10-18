package com.isharejoy.openplatform.enums;

import lombok.Getter;

@Getter
public enum ReturnEnums {

    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    QD_EMPTY_ERROR(15001, "参数为空"),
    ;
    private Integer code;

    private String msg;

    ReturnEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
