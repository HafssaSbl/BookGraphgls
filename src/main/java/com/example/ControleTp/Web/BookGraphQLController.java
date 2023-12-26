package com.example.ControleTp.Web;

import com.example.ControleTp.dao.Repositories.BookRepository;
import com.example.ControleTp.service.Manage.BookManager;
import com.example.ControleTp.service.dtos.BookDTO;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.awt.print.Book;
import java.util.List;

@Controller
public class BookGraphQLController {
    private BookManager bookManager;

    public BookGraphQLController(BookManager bookManager) {
        this.bookManager = bookManager;
    }
    @MutationMapping
    public BookDTO savePerson(BookDTO bookDTO) {
        return bookManager.saveBook(bookDTO);
    }
}
