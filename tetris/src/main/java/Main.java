/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author davidquesadagarcia
 */
public class Main {
    
    public static void main(String[] args) {
        int ancho = 11;
        int alto = 10;
        
        int x = 6;
        int y = 1;
        
        Tablero mitablero;
        mitablero = new Tablero(ancho,alto,6,1);
        mitablero.imprimir();
        System.out.println("\n\n");
        
        System.out.println("Escribe 'i' para ir a la izquierda, 'd' para ir a la derecha, o 'c' para no mover el asterisco");
        mitablero.setX(mitablero.getX() + 1);
        mitablero.setY(mitablero.getY() + 1);
        mitablero.imprimir();
    }
    
}
