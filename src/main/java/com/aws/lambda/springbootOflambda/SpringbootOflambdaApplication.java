package com.aws.lambda.springbootOflambda;

import com.aws.lambda.springbootOflambda.entity.Book;
import com.aws.lambda.springbootOflambda.repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringbootOflambdaApplication {

	@Autowired
    private BookDao bookDao;

     @Bean
	public Supplier<List<Book>> books(){
		return ()->bookDao.buildBooks();
	}
	@Bean
	public Function<String, List<Book>> findBookByName(){
		return (input)->bookDao.buildBooks().stream().filter(order->order.getName().equals(input)).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootOflambdaApplication.class, args);
	}

}
