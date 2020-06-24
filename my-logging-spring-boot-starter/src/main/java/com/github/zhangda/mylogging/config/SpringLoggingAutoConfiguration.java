package com.github.zhangda.mylogging.config;

import com.github.zhangda.mylogging.filter.SpringLoggingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringLoggingAutoConfiguration {

    @Bean
    public SpringLoggingFilter loggingFilter() {
        return new SpringLoggingFilter();
    }
}
