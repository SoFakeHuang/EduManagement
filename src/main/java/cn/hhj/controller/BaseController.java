package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.ResponsResult;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 18:46
 * @Version 1.0
 */
public class BaseController {
    protected  <E> ResponsResult<E> inbound(E data, String msg){
        return new ResponsResult<E>(BaseInfo.SUCCESS,BaseInfo.SUCCESS_CODE,data,msg);
    }

    protected  <E> ResponsResult<E> errorHandler(Exception e){
        return new ResponsResult<E>(BaseInfo.ERROR, null, null , e.getMessage());
    }

    protected  <E> ResponsResult<E> failHandler(String msg){
        return new ResponsResult<E>(BaseInfo.FAIL,null,null,msg);
    }
    protected  <E> ResponsResult<E> failHandler(){
        return new ResponsResult<E>(BaseInfo.FAIL,null,null, null);
    }
}
