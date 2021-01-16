package com.fitness.programmer.configuration_handlers;

import com.fitness.programmer.model.dto.BaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.Type;

@ControllerAdvice
public class RequestBodyAdviceChain implements RequestBodyAdvice {

    @Autowired
    JWTUtils jwtUtils;

    @Value("${auth.app.header_string}")
    private String headerString;

    @Override
    public boolean supports(MethodParameter methodParameter, Type type,
                            Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter,
                                  Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return o;
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter,
                                           Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
        return httpInputMessage;
    }

    @Override  // Set Created By or Updated By by request method
    public Object afterBodyRead(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type,
                                Class<? extends HttpMessageConverter<?>> aClass) {
        if (BaseDto.class.isAssignableFrom(o.getClass())) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String requestMethod = request.getMethod();
            String username = jwtUtils.getUsernameByJWT(request.getHeader(headerString).substring(7));
            if (HttpMethod.POST.name().equals(requestMethod)) {
                ((BaseDto) o).setCreatedBy(username);
            }
        }
        return o;
    }
}
