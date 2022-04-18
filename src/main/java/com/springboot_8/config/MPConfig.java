package com.springboot_8.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 拦截器（Springboot8ApplicationTests.java中的testGetPage()需要用到这里的拦截器来实现分页）
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());

        return interceptor;
    }
}
