package org.code4everything.efo.stand.web;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author pantao
 * @since 2019-04-10
 */
@SpringBootApplication
@EnableSwagger2Doc
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "org.code4everything.efo.stand.dao.repository")
public class EfoStandWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfoStandWebApplication.class, args);
    }
}
