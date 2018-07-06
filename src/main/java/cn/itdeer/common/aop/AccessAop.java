package cn.itdeer.common.aop;

import cn.itdeer.modules.admin.system.entity.AccessRecord;
import cn.itdeer.modules.admin.system.service.AccessRecordService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;

/**
 * Description : 切面记录访问记录
 * PackageName : cn.itdeer.common.aop
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/6/13/23:30
 */

@Slf4j
@Order(1)
@Aspect
@Component
public class AccessAop {

    @Autowired
    private AccessRecordService accessRecordService;

    ThreadLocal<Long> startTime = new ThreadLocal<Long>();

    @Pointcut("execution(public * cn.itdeer.modules.front.*.*.*.*(..))")
    public void accessRecord(){}

    @Before("accessRecord()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.error("Access Record:    URL: {}    HTTP_METHOD: {}    IP: {}    CLASS_METHOD: {}    ARGS: {}", request.getRequestURL().toString(), request.getMethod(), request.getRemoteAddr(), joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));

        Long time = new Date().getTime();
        AccessRecord accessRecord = new AccessRecord(request.getRequestURL().toString(), request.getMethod(), request.getRemoteAddr(), joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()),time);

        accessRecordService.save(accessRecord);
    }


    @AfterReturning(returning = "ret", pointcut = "accessRecord()")
    public void doAfterReturning(Object ret) throws Throwable {
        log.info("RESPONSE : " + ret);
        log.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }
}
