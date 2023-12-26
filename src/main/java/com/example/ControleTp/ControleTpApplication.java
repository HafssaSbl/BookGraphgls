package com.example.ControleTp;

import com.example.ControleTp.dao.Entities.Book;
import com.example.ControleTp.dao.Repositories.BookRepository;
import com.example.ControleTp.service.dtos.BookDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ControleTpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleTpApplication.class, args);
	}
	@Bean
	CommandLineRunner start(BookRepository bookRepository) {
		return args -> {

			List<Book> bookList = List.of(
					new Book("Book1", "Publisher1",LocalDate.of(2023, 1, 1), 15.99,"resume1"),
					new Book("Book2", "Publisher2",LocalDate.of(2023, 1, 1), 15.99,"resume1"),
					new Book("Book3", "Publisher3", 12.99, LocalDate.of(2023, 3, 1)),
					new Book("Book4", "Publisher4", 9.99, LocalDate.of(2023, 4, 1))
			);

			bookRepository.saveAll(bookList);



		};}
}
