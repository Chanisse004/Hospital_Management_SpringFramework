package org.example.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.SQLException;

@Configuration
@ComponentScan("org.spring.hospital")
public class AppConfig {

    @Bean
    public Connection getConnection() throws SQLException {
        return new DatabaseConnection().getConnection();
    }
}