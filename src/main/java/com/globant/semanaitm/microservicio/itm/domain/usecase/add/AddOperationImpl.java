package com.globant.semanaitm.microservicio.itm.domain.usecase.add;

public class AddOperationImpl implements AddOperation{
  @Override
  public Integer add(Integer operatorOne, Integer operatorTwo) {
    return operatorOne + operatorTwo;
  }
}
