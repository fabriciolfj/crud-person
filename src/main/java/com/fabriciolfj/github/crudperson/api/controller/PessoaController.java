package com.fabriciolfj.github.crudperson.api.controller;

import com.fabriciolfj.github.crudperson.api.mapper.PessoaDTO;
import com.fabriciolfj.github.crudperson.api.mapper.PessoaMapper;
import com.fabriciolfj.github.crudperson.domain.entity.Pessoa;
import com.fabriciolfj.github.crudperson.domain.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;
    public final PessoaMapper mapper;

    @GetMapping("/{id}")
    public Pessoa findById(@PathVariable("id") final Long id) {
        return pessoaService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(final PessoaDTO pessoaDTO) {
        pessoaService.salvarPessoa(mapper.toEntity(pessoaDTO));
    }

    @GetMapping
    public List<Pessoa> findAll() {
        return pessoaService.findAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") final Long id) {
        pessoaService.delete(id);
    }
}
