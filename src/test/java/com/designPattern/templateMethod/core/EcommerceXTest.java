package com.designPattern.templateMethod.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcommerceXTest {

    EcommerceX ecommerceX;

    @BeforeEach
    void setUp() {
        ecommerceX = new EcommerceX("EcommerceX", 0.10, 100, true);
    }

    @Test
    void deveAplicarCashback() {
        assertEquals("Cashback de 10.0 reais aplicado!", ecommerceX.aplicaCashback());
    }

    @Test
    void deveRetornarCashbackInativo() {
        ecommerceX.setActive(false);
        assertEquals("Cashback inativo", ecommerceX.aplicaCashback());
    }

    @Test
    void deveRetornarCashbackNaoAplicavel() {
        ecommerceX.setValorCompra(99.9);
        assertEquals("Cashback não se aplica para compras cujo valor é abaixo de R$100,00", ecommerceX.aplicaCashback());
    }
}