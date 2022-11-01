package com.baeldung.taskmanagementapplesson.spring;


// Sample of Bean creation
// we have to use the @Configuration annotation


import com.baeldung.taskmanagementapplesson.persistence.repository.impl.ProjectRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {

    @Bean
    public ProjectRepositoryImpl projectRepository(){
        return new ProjectRepositoryImpl();
    }
}
