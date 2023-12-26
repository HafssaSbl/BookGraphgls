package com.example.ControleTp.dao.Entities;

import com.example.ControleTp.service.dtos.BookDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BookDTO {
    @Id

    private Long id_Book;
    private String titre;
    private String published;
    private Date datePublication;
    private float price;
    private String resume;

}
