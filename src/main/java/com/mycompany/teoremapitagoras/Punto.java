/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teoremapitagoras;

/**
 *
 * @author Admin
 */
public class Punto {
    private double coordx;
    private double coordy;

    public Punto() {
    }

    public Punto(double coordx, double coordy) {
        this.coordx = coordx;
        this.coordy = coordy;
    }

    public double getCoordx() {
        return coordx;
    }

    public void setCoordx(double coordx) {
        this.coordx = coordx;
    }

    public double getCoordy() {
        return coordy;
    }

    public void setCoordy(double coordy) {
        this.coordy = coordy;
    }

    

    public double distancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.coordx - this.coordx, 2) + Math.pow(otro.coordy- this.coordy, 2));
    }
}