package com.cmpay.sachzhong.utils;

import org.springframework.util.Base64Utils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.UUID;


public class TokenUtil {

    public  String getToken(String userLoginName, String userPwd) throws UnsupportedEncodingException {

        return new String(Base64Utils.encode((userLoginName+userPwd).getBytes()),"utf-8").replace("=","");
    }

    public  String getToken() throws UnsupportedEncodingException {
        //获取当前时间
        String date=new Date().toString();
        //项目名+时间+uuid
        String token="SachZhongPay"+date+UUID.randomUUID();
        //再转base64
        return new String(Base64Utils.encode((token).getBytes()),"utf-8").replace("=","");
    }

}
