package com.vitu.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.micronaut.data.annotation.DateCreated;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String placa;

    private String modelo;

    private String marca;

    @DateCreated
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime criadoEm;

    public Veiculo() {
    }

    public Veiculo(Long id, String placa, String modelo, String marca) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", date=" + criadoEm +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(id, veiculo.id) && Objects.equals(placa, veiculo.placa) && Objects.equals(modelo, veiculo.modelo) && Objects.equals(marca, veiculo.marca) && Objects.equals(criadoEm, veiculo.criadoEm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placa, modelo, marca, criadoEm);
    }
}