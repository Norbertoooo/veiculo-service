package com.vitu.web;

import com.vitu.domain.Veiculo;
import com.vitu.service.VeiculoService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/veiculos")
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @Get
    public HttpResponse<List<Veiculo>> buscarTodos() {
        List<Veiculo> veiculo = veiculoService.buscarTodos();
        return HttpResponse.ok(veiculo);
    }

    @Post
    public HttpResponse<Veiculo> criar(@Body Veiculo veiculo) {
        Veiculo veiculoCriado = veiculoService.criar(veiculo);
        return HttpResponse.created(veiculoCriado);
    }

    @Get("/{id}")
    public HttpResponse<Veiculo> buscarPorId(@PathVariable Long id) {
        Veiculo veiculo = veiculoService.buscarPorId(id);
        return HttpResponse.ok(veiculo);
    }
}
