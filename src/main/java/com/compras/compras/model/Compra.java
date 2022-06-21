package com.compras.compras.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TB_COMPRA")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private BigDecimal valor;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate comprado_em;

    private String comprado_onde;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getComprado_em() {
        return comprado_em;
    }

    public void setComprado_em(LocalDate comprado_em) {
        this.comprado_em = comprado_em;
    }

    public String getComprado_onde() {
        return comprado_onde;
    }

    public void setComprado_onde(String comprado_onde) {
        this.comprado_onde = comprado_onde;
    }
    
}
