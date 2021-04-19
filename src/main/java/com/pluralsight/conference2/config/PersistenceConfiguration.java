package com.pluralsight.conference2.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//     @Bean
//         public DataSource dataSource(){
//         DataSourceBuilder builder = DataSourceBuilder.create();
//         builder.username("root");
//         builder.password("juli0s");
//         builder.url("jdbc:mysql://localhost:3306/conference_demo");
//         System.out.println("Datasource im");
//         return builder.build();
//         }
}
