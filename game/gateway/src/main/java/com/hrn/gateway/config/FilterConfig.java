package com.hrn.gateway.config;

import com.hrn.gateway.filter.PostFilter;
import com.hrn.gateway.filter.PreFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public ZuulFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public ZuulFilter postFilter() {
        return new PostFilter();
    }

}
