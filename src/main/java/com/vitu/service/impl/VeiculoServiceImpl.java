package com.vitu.service.impl;

import com.vitu.domain.Veiculo;
import com.vitu.repository.VeiculoRepository;
import com.vitu.service.VeiculoService;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Singleton
public class VeiculoServiceImpl implements VeiculoService {

    private static final Logger LOG = LoggerFactory.getLogger(VeiculoServiceImpl.class);

    private final VeiculoRepository veiculoRepository;
    private final MeterRegistry meterRegistry;

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository, MeterRegistry meterRegistry) {
        this.veiculoRepository = veiculoRepository;
        this.meterRegistry = meterRegistry;
    }

    @Override
    public Veiculo criar(Veiculo veiculo) {
        meterRegistry.counter("veiculo.create").increment();
        return veiculoRepository.save(veiculo);
    }

    @Override
    public Veiculo buscarPorId(Long id) {
        LOG.info("Buscando veículo pelo id: {}", id);
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow();
        LOG.info("Veículo encontrado: {}", veiculo);
        return veiculo;
    }

    @Override
    public List<Veiculo> buscarTodos() {
        return veiculoRepository.findAll();
    }
}
