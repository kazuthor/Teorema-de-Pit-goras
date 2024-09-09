/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoremapitagoras;

/**
 *
 * @author Admin
 */
public class TrianguloRectangulo {
    private Lado lado1;
    private Lado lado2;

    public TrianguloRectangulo() {
    }

    public Lado getLado1() {
        return lado1;
    }

    public void setLado1(Lado lado1) {
        this.lado1 = lado1;
    }

    public Lado getLado2() {
        return lado2;
    }

    public void setLado2(Lado lado2) {
        this.lado2 = lado2;
    }

    public double calcularHipotenusa() {
        if (lado1 == null || lado2 == null) {
            throw new IllegalStateException("Ambos lados deben ser configurados para calcular la hipotenusa.");
        }
        double hipotenusa = Math.sqrt(Math.pow(lado1.calcularLado(), 2) + Math.pow(lado2.calcularLado(), 2));
        return hipotenusa;
    }
}
