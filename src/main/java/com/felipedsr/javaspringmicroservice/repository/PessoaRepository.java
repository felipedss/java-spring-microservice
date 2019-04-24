package com.felipedsr.javaspringmicroservice.repository;

import com.felipedsr.javaspringmicroservice.model.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
}