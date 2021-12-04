package com.mycompany.tetris;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author davidquesadagarcia
 */
public class Linea {
    public static int ancho = 10;
    
    public static final char BORDE = '|';
    public static final char PIEZA = '|';
    
    public static void imprimir() {
        imprimir(null);
    }
    
    public static void imprimir(Integer i) {
        imprimirCaracter(0, BORDE);
        int espacios = ancho;
        if ( i!= null) {
            // para que i sea mayor o = que 1 y menor o = quel ancho
            i = Math.max(1, i);
            i = Math.min(ancho , i);
            espacios = i -1;
            imprimirCaracter(espacios, PIEZA);
            espacios = ancho - i;
        }
        imprimirCaracter(espacios, BORDE);
        imprimirCaracter(0, '\n');
    }
    
    public static void imprimirCaracter(int espacios, char caracter) {
        /*int i = 0;
        int a = (i == 1) ? 3:2;*/
        String formato = "%" + ((espacios <= 0)?"":espacios) + "s";
        System.out.println( String.format(formato, caracter + ""));
    }

    public Linea(int ancho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Linea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}