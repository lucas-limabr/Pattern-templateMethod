package com.designPattern.templateMethod.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcommerceYTest {

    EcommerceY ecommerceY;

    @BeforeEach
    void setUp() {
        ecommerceY = new EcommerceY("EcommerceY", 0.20, 200, true);
    }

    @Test
    void deveAplicarCashback() {
        assertEquals("Cashback de 40.0 reais aplicado!", ecommerceY.aplicaCashback());
    }

    @Test
    void deveRetornarCashbackInativo() {
        ecommerceY.setActive(false);
        assertEquals("Cashback inativo", ecommerceY.aplicaCashback());
    }

    @Test
    void deveRetornarCashbackNaoAplicavel() {
        ecommerceY.setValorCompra(199.9);
        assertEquals("Cashback não se aplica para compras cujo valor é abaixo de R$200,00", ecommerceY.aplicaCashback());
    }

}