package com.felipedsr.javaspringmicroservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@NoArgsConstructor
@Document("pessoas")
public class Pessoa {

    @Id
    private String id;

    @Field("nome")
    private String nome;

}