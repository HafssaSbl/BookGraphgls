package com.example.ControleTp.service.Manage;

import com.example.ControleTp.dao.Repositories.BookRepository;
import com.example.ControleTp.service.Mappers.BookMapper;
import com.example.ControleTp.service.dtos.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
@Component
public class BookManagerAction implements BookManager{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookByTitle(String title) {
        return null;
    }

    @Override
    public Book getBookByPublisherAmdPrice(String published, Float price) {
        return null;
    }

    @Override
    public BookDTO saveBook(BookDTO book) {
        return bookMapper.fromBookToBookRequest(bookRepository.save(bookMapper.fromBookRequestToBook(book)));
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
