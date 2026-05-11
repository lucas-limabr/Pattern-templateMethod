package com.designPattern.templateMethod.core;

public class EcommerceX extends Cashback {

    public EcommerceX(String nomeEmpresa, double percentualCashback, double valorCompra, boolean isActive) {
        super(nomeEmpresa, percentualCashback, valorCompra, isActive);
    }

    @Override
    public String aplicaCashback() {
        if (!this.isActive()) {
            return "Cashback inativo";
        }

        if (super.getValorCompra() < 100) {
            return "Cashback não se aplica para compras cujo valor é abaixo de R$100,00";
        }
        return "Cashback de " + super.calculaCashback() + " reais aplicado!";
    }
}
