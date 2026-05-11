package com.designPattern.templateMethod.core;

public abstract class Cashback {

    private String nomeEmpresa;
    private boolean isActive;
    private double valorCompra;
    private double percentualCashback;

    public Cashback(String nomeEmpresa, double percentualCashback, double valorCompra, boolean isActive) {
        this.nomeEmpresa = nomeEmpresa;
        this.percentualCashback = percentualCashback;
        this.valorCompra = valorCompra;
        this.isActive = isActive;
    }

    public abstract String aplicaCashback();

    public final double calculaCashback() {
        return valorCompra * this.getPercentualCashback();
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getPercentualCashback() {
        return percentualCashback;
    }
}
