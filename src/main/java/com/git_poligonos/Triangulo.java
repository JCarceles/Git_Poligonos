/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.git_poligonos;

/**
 *
 * @author manana
 */
public class Triangulo implements Poligonos{

    private int base, altura;
    
    @Override
    public double area() {
       return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return base * 3;
    }
    
}
