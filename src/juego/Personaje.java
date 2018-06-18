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
public class Personaje {
   // public Tipo tipo;
    public int posx;
    public int posy;
    //public Ataque ataques;
   // public Estado estado;
   // public Timer timer;
   // public Dado dado;
    public String prueba;
    
    
    
    public Personaje(int posx, int posy){
        setPosx(posx); setPosy(posy);;
    }
    
    public Personaje(){
        int[][] matriz = new int[8][8];
    }
    
    
    public void setPrueba(String prueba){
        this.prueba = prueba;
    }
    
    public String getPrueba(){
        
        return prueba;
    }
    
    public void setPosx(int posx){
        
    }
    
    public void setPosy(int posy){
        
    }
    
    public int getPosx(){
        
        return posx;
    }
    
    public int getPosy(){
        
        return posy;
    }
    
    
    public void llenar(int tam, Personaje[][] personaje){
    /*    int k = 0;
        int rCol;
        
        int RCol = (int) Math.random()*tam;
        do {            
            int Rcol;
            
            if(personaje[Rcol][Rcol]){
                
            }
            
        } while (true);
      */ 
    }
}
