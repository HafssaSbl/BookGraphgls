package com.example.ControleTp.service.Mappers;

import com.example.ControleTp.dao.Entities.Book;
import com.example.ControleTp.service.dtos.BookDTO;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;
import javax.management.modelmbean.ModelMBean;
import java.lang.reflect.Type;
@Component
public class BookMapper {

    private ModelMapper modelMapper = new ModelMapper();
    public Book fromBookRequestToBook(BookDTO bookRequest){
        return this.modelMapper.map(bookRequest, Book.class);
    }
    public Book fromBookToBookRequest(Book book){
        return this.modelMapper.map(book,(Type) BookDTO.class);
    }
}
