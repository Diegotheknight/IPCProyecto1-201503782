/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Usuario
 */
public class Dado {
    public int tirarDado(int rango) {
        double resultado;
        resultado=Math.random()*rango; // Se le suma 1 si el valor del 0 es 10. 
        return (int)resultado;
    
    }
    
   
}
    


