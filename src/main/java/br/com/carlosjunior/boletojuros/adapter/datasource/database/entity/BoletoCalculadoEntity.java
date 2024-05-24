package br.com.carlosjunior.boletojuros.adapter.datasource.database.entity;

import br.com.carlosjunior.boletojuros.core.domain.enums.TipoBoleto;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "boleto_calculado")
public class BoletoCalculadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String codigo;
    @Column
    private BigDecimal valorOriginal;
    @Column
    private BigDecimal valor;
    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;
    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;
    @Column
    private BigDecimal juros;
    @Column
    private TipoBoleto tipo;
}
