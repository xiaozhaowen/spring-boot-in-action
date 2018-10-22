package com.xiaozhao.dto;


/**
 * 返回给客户端的结构
 *
 * @author xiaozhao
 * @date 2018/10/19下午4:06
 */
public class HttpResult {

    private Integer code;

    private String msg;

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
