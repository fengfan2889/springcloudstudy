package com.jyw.study.spring.property.system.entity.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jyw
 */
@ConfigurationProperties(prefix ="server")
@Component
@Data
public class MyConfig {

    private String name ;

}
