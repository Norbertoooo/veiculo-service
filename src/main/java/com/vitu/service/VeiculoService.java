package com.vitu.service;

import com.vitu.domain.Veiculo;

import java.util.List;

public interface VeiculoService {

    Veiculo criar(Veiculo veiculo);

    Veiculo buscarPorId(Long id);

    List<Veiculo> buscarTodos();

}
