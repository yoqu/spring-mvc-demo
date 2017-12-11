package cn.jxufe.web.controller;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yoqu on 2017/12/11.
 */
//@Component
public class CustomHandlerExceptionResolver implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if (e instanceof IllegalArgumentException) {
            System.out.println("illegalArgumentException");
        } else {
            System.out.println("other exception");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error/error");
        return modelAndView;
    }
}
