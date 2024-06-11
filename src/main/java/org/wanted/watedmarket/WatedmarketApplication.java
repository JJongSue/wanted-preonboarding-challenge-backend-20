package org.wanted.watedmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WatedmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatedmarketApplication.class, args);
    }

}
