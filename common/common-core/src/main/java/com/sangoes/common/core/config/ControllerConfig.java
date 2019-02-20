package com.sangoes.common.core.config;

import cn.hutool.core.util.StrUtil;
import com.sangoes.common.core.constants.CommonConstants;
import com.sangoes.common.core.utils.http.HttpContextUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * controller 增强
 *
 * @author jerrychir
 * @date 2019 2019/2/20 3:17 PM
 */
@Slf4j
@Aspect
@Component
public class ControllerConfig {
    /**
     * 切面
     */
    @Pointcut("execution(public com.sangoes.common.core.utils.msg.Result *(..))")
    public void pointCutResult() {
    }

    /**
     * 拦截器具体实现
     *
     * @param pjp 切点 所有返回对象R
     * @return 结果包装
     */
    @Around("pointCutResult()")
    public Object methodRHandler(ProceedingJoinPoint pjp) throws Throwable {
        return methodHandler(pjp);
    }

    /**
     * 处理方法
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    private Object methodHandler(ProceedingJoinPoint pjp) throws Throwable {
        // 获取时间
        long startTime = System.currentTimeMillis();
        // 获取request
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();

//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();

        // 获取username
        String username = request.getHeader(CommonConstants.X_USER_HEADER);
        if (StrUtil.isNotBlank(username)) {
            // FIXME 记录下
//            AuthUtils.setUser();
            log.info("Controller AOP get username:{}", username);
        }

        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(pjp.getArgs()));

        Object result = pjp.proceed();
        log.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));


        return result;
    }
}
