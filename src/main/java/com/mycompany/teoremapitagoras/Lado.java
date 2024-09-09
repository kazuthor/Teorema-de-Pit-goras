/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoremapitagoras;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class Lado {
    private Punto punto1;
    private Punto punto2;

    public Lado(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public double calcularLado(){
        double lado1 = Math.pow(punto2.getCoordx()- punto1.getCoordx(),2);
        double lado2 = Math.pow(punto2.getCoordy()- punto1.getCoordy(),2);
        double lado = Math.sqrt(lado1 +lado2);
        return lado;
    }

    
}