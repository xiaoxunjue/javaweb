package com.revenant.javaweb.common.result;

public class ResultUtil {
    public static Result success(Object object) {
//        Result result = new Result(CODE_200);
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }


    public static Result error(ResultEnum resultCode) {
        Result result = new Result();
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getMsg());
        return result;
    }
}
