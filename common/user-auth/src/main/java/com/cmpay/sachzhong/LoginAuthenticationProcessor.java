package com.cmpay.sachzhong;

import com.cmpay.lemon.common.exception.LemonException;
import com.cmpay.lemon.framework.security.SimpleUserInfo;
import com.cmpay.lemon.framework.security.UserInfoBase;
import com.cmpay.lemon.framework.security.auth.AbstractGenericMatchableAuthenticationProcessor;
import com.cmpay.lemon.framework.security.auth.GenericAuthenticationToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

public class LoginAuthenticationProcessor  extends AbstractGenericMatchableAuthenticationProcessor<GenericAuthenticationToken> {


    /**
     * @param filterProcessesUrl 认证Url, 前缀必须与GenericAuthenticationFilter拦截的Url前缀一致
     */
    public LoginAuthenticationProcessor(String filterProcessesUrl) {
        super(filterProcessesUrl);
    }

    @Override
    protected UserInfoBase doProcessAuthentication(GenericAuthenticationToken genericAuthenticationToken) throws AuthenticationException {
        HttpServletRequest request = genericAuthenticationToken.getAuthenticationRequest().getHttpServletRequest();
        System.err.println(request);


        UserInfoBO login = bindLoginData(request);
        login.setLoginName("SachZhong");
        login.setUserId("001");
        login.setMblNo("15616902209");

        return new SimpleUserInfo(login.getUserId(),login.getLoginName(),login.getMblNo());
    }


    private UserInfoBO bindLoginData(HttpServletRequest request) {
        UserInfoBO userLoginBO = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            InputStream is = request.getInputStream();
            userLoginBO = objectMapper.readValue(is, UserInfoBO.class);
        } catch (IOException e) {
            throw LemonException.create(e);
        } catch (Exception e) {
            LemonException.throwLemonException("登陆认证失败", e.getMessage());
        }
        System.err.println(userLoginBO);

        return userLoginBO;
    }
}
