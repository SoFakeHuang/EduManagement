package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.ResponsResult;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 18:46
 * @Version 1.0
 */
public class BaseController {
    protected  <E> ResponsResult<E> inbound(E data, String msg){
        ResponsResult<E> result = new ResponsResult<E>();
        result.setFlag("s");
        result.setCode(200);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

    protected  <E> ResponsResult<E> errorHandler(Exception e){
        ResponsResult<E> result = new ResponsResult<E>();
        result.setFlag("e");
        result.setMsg(e.getMessage());
        return result;
    }

    protected  <E> ResponsResult<E> failHandler(String msg){
        ResponsResult<E> result = new ResponsResult<E>();
        result.setFlag("f");
        result.setCode(400);
        result.setMsg(msg);
        return result;
    }

    protected  <E> ResponsResult<E> failHandler(){
        ResponsResult<E> result = new ResponsResult<E>();
        result.setFlag("f");
        result.setCode(400);
        return result;
    }
}
