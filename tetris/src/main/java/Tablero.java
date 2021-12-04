
import com.mycompany.tetris.Linea;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author davidquesadagarcia
 */
public class Tablero {
    public int alto = 10;
    public int ancho = 10;
    
    private int x, y;
    private Linea linea = new Linea();
    /**
     * 
     * @param x posición horizontal de '*', entre 1 y 10
     * @param y posición vertical de '*', entre 1 y 10 ( 1 es arriba del todo, 10 es abajo)
     */
    public Tablero(int alto, int ancho, int x, int y) {
        this.alto = alto;
        this.ancho = ancho;
        linea = new Linea(ancho);
        this.x = x;
        this.y = y;
    }
    public void imprimir() {
        for( int i = 1; i < y; i++)
            linea.imprimir();
        
        linea.imprimir(x);
        
        for (int i = y + 1; i <= alto; i++) 
            linea.imprimir();
            
            
        
    }

    public int getX() {
        return x;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }
}
