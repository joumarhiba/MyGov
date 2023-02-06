package com.mygov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableElasticsearchRepositories(basePackages = "*")
public class MinistereEF {
    public static void main(String[] args) {
        SpringApplication.run(MinistereEF.class, args);
    }
}