package com.yxz.xingyuornament.utils;


import com.yxz.xingyuornament.dto.ReturnMsg;

public class ReturnUtil {
    public static ReturnMsg success(Object object) {
        ReturnMsg result = new ReturnMsg();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static ReturnMsg success(Integer code,String msg) {
        ReturnMsg result = new ReturnMsg();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static ReturnMsg success() {
        return success(null);
    }

    public static ReturnMsg error(Integer code,String msg) {
        return error(code,msg,null);
    }

    public static ReturnMsg error(Integer code,String msg,Object object) {
        ReturnMsg result = new ReturnMsg();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }
}
