package com.yxz.xingyuornament.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReturnMsg<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    @JsonProperty("message")
    private String msg;

    /** 具体的内容. */
    private T data;






    public ReturnMsg() {}

    public ReturnMsg(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public ReturnMsg(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
