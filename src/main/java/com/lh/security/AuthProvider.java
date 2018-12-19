package com.lh.security;

import com.lh.entity.User;
import com.lh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * 自定义认证实现
 * @Author: 水越帆
 * @date: Create in 23:22 2018/11/24
 * QQ:1548353431
 */
public class AuthProvider implements AuthenticationProvider {
    @Autowired
    private IUserService userService;

    private final Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();//获取用户名
        String inputPassword = (String) authentication.getCredentials();//获取输入的密码
        User user = userService.findUserByName(userName);
        if (user == null){
            throw new AuthenticationCredentialsNotFoundException("authError");

        }
        if (this.passwordEncoder.isPasswordValid(user.getPassword(),inputPassword,user.getId())){

            return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());//返回
        }
        throw new BadCredentialsException("authError");//
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;//支持所有的认证类
    }

}
