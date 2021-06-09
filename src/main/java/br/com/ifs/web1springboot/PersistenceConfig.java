package br.com.ifs.web1springboot;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages= "br.com.ifs.web1springboot.repository")
@Configuration
public class PersistenceConfig {

}
