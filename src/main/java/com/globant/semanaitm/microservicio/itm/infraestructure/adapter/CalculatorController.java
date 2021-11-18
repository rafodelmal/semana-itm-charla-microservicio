package com.globant.semanaitm.microservicio.itm.infraestructure.adapter;

import com.globant.semanaitm.microservicio.itm.domain.usecase.add.AddOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CalculatorController {

  private final AddOperation addOperation;

  @GetMapping(value = "/")
  public String init(){
    return "Hello World";
  }

  @GetMapping(value = "/add")
  public Integer add(Integer operatorOne, Integer operatorTwo){
    return addOperation.add(operatorOne, operatorTwo);
  }
}
