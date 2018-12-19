package com.lh.security;


import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录验证失败处理器
 * @Author: 水越帆
 * @date: Create in 23:35 2018/11/24
 * QQ:1548353431
 */
public class LoginAuthFailHandler extends SimpleUrlAuthenticationFailureHandler {
    //从urlEntryPoint获取url进行处理
    private final LoginUrlEntryPoint urlEntryPoint;

    public LoginAuthFailHandler(LoginUrlEntryPoint urlEntryPoint) {
        this.urlEntryPoint = urlEntryPoint;
    }

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {
        String targetUrl =
                this.urlEntryPoint.determineUrlToUseForThisRequest(request, response, exception);//获取url

        targetUrl += "?" + exception.getMessage();
        super.setDefaultFailureUrl(targetUrl);
        super.onAuthenticationFailure(request, response, exception);
    }
}
