package com.isharejoy.openplatform.exception;

import com.isharejoy.openplatform.enums.ReturnEnums;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BaseException extends RuntimeException {
    private Integer code;

    public BaseException(ReturnEnums returnEnums) {
        super(returnEnums.getMsg());
        this.code = returnEnums.getCode();
    }
}
