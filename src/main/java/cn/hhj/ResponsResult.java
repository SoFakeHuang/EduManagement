package cn.hhj;

import java.util.List;

public class ResponsResult<E> {
    private String flag;
    private Integer code;
    private E data;
    private String msg;

    public ResponsResult(String flag, Integer code, E data, String msg) {
        this.flag = flag;
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
}
