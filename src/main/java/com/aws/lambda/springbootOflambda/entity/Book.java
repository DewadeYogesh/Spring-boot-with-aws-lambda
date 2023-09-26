package com.aws.lambda.springbootOflambda.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Book {

    private  int id;
    private  String name;
}
