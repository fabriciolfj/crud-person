package com.fabriciolfj.github.crudperson.domain.service;

import com.fabriciolfj.github.crudperson.domain.entity.Pessoa;
import com.fabriciolfj.github.crudperson.domain.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public Pessoa findById(final Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada para o id: " + id));
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public void salvarPessoa(final Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public void delete(final Long id) {
        pessoaRepository.delete(findById(id));
    }
}
