package cn.itdeer.common.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description :
 * PackageName : cn.itdeer.common.security
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/28/0:04
 */
@Slf4j
@Component("itdeerAuthenticationSuccessHandler")
public class ItdeerAuthenticationSuccessHandler implements AuthenticationSuccessHandler{

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        log.info("登录成功！");
    }
}
