package com.hrn.gateway.filter;

import com.hrn.gateway.constant.Constants;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

@Slf4j
public class PostFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        long startTime = (long) RequestContext.getCurrentContext().get(Constants.START_TIME_KEY);
        log.info("请求完成,耗时{}秒", (System.currentTimeMillis() - startTime) / 1000);
        return null;
    }
}
