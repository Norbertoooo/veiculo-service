package com.vitu.service.impl;

import com.vitu.domain.Veiculo;
import com.vitu.repository.VeiculoRepository;
import com.vitu.service.VeiculoService;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class VeiculoServiceImpl implements VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public Veiculo criar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @Override
    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Veiculo> buscarTodos() {
        return veiculoRepository.findAll();
    }
}
