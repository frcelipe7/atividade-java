package br.uepa.modelos;

public class Dimensoes {
    private double altura;
    private double largura;
    private double profundidade;

    // construtor
    Dimensoes (double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    // setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    // getters
    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }
}
