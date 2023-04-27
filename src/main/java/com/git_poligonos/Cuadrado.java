/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.git_poligonos;

/**
 *
 * @author manana
 */
public class Cuadrado implements Poligonos {

    private double lado;
    
    
    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;                
    }
    
}
