package com.workflow.demo.controller.base;

import com.workflow.demo.entity.PageData;
import com.workflow.demo.util.UuidUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 *所有处理类父类
 * @Author: Elvis
 * @Date: 2019/9/1 22:07
 */
public class BaseController {

    /**
     * new PageData对象
     * @return
     */
    public PageData getPageData() {
        return new PageData(this.getRequest());
    }

    /**
     * 得到request对象
     * @return
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        return request;
    }

    /**得到32位的uuid
     * @return
     */
    public String get32UUID(){
        return UuidUtil.get32UUID();
    }
}
