package com.globant.semanaitm.microservicio.itm.application;

import com.globant.semanaitm.microservicio.itm.domain.usecase.add.AddOperationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
  public AddOperationImpl getAddOperationImpl(){
    return new AddOperationImpl();
  }
}
