package com.cmpay.sachzhong.api;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @classname  Api
 * @author SachZhong 钟盛勤
 * @date 2020/6/9 14:30
 *
 * 接口数据返回的基本类
 */
public class Api {

    @JSONField(ordinal = 1)
    private int code;
    @JSONField(ordinal = 2)
    private String message;
    @JSONField(ordinal = 3)
    private String time;
    @JSONField(ordinal = 4)
    private Date date;
    @JSONField(ordinal = 5)
    private Object Data;

    public int getCode() {

        return code;
    }

    public void setCode(int code) {

        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    @Override
    public String toString() {
        return  JSON.toJSONString(this);
    }
}
