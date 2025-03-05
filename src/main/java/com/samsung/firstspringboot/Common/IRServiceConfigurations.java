package com.samsung.firstspringboot.Common;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "irservice")
public class IRServiceConfigurations {
    private String apikey;
    private String apisecret;
    private String baseurl;
}
