package com.fabriciolfj.github.crudperson.domain.repository;

import com.fabriciolfj.github.crudperson.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
