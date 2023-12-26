package com.example.ControleTp.service.dtos;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookDTO {
    private String titre;
    private String published;
    private Date datePublication;
    private float price;
    private String resume;
}
