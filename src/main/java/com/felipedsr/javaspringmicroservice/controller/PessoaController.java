package com.felipedsr.javaspringmicroservice.controller;

import com.felipedsr.javaspringmicroservice.model.Pessoa;
import com.felipedsr.javaspringmicroservice.repository.PessoaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll() {
        return new ResponseEntity<>(pessoaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pessoa> post(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(pessoaRepository.save(pessoa), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(String id) {
        pessoaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}