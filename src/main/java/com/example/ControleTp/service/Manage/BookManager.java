package com.example.ControleTp.service.Manage;

import com.example.ControleTp.service.dtos.BookDTO;
import org.springframework.graphql.data.method.annotation.Argument;

import java.awt.print.Book;

public interface BookManager {
    public Book getBookByTitle(String title);
    public Book getBookByPublisherAmdPrice(String published,Float price);
    public BookDTO saveBook(BookDTO book);
    public void deleteBook(long ID);
}
