package com.aws.lambda.springbootOflambda.repository;

import com.aws.lambda.springbootOflambda.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Repository
public class BookDao {


    public List<Book>  buildBooks(){

        return Stream.of(

                new Book(1,"java"),
                new Book(2,"AWS"),
                new Book(3,"Spring"),
                new Book(4,"SprinBoot"),
                new Book(5,"Microservices")).collect(Collectors.toList());






    }


}
