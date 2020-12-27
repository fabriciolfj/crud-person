package com.fabriciolfj.github.crudperson.api.mapper;

import com.fabriciolfj.github.crudperson.domain.entity.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper {

    Pessoa toEntity(final PessoaDTO dto);
}
