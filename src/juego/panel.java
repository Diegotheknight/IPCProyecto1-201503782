/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author mige
 */
public class panel extends javax.swing.JPanel {
    private int sizeX = 20;
    private int sizeY = 20;
    private int matriz = 8;
    private Personaje jugador;
    private Dado dado;
    private int turno=6;
    
    /**
     * Creates new form panel
     */
    public panel(int matriz,int sizeX, int sizeY) {
        initComponents();
        setPreferredSize(new Dimension(420,420));
        
       // int pasos = dado.tirarDado(turno);
        this.sizeX = sizeX;// + pasos;
        this.sizeY = sizeY;// + pasos;
        this.matriz = matriz;
        jugador = new Personaje(25, 25);
       
        
       
     }

    public void moveUp(){
        jugador.posy -=sizeY;
        repaint();
    }
    
    public void moveDown(){
        jugador.posy +=sizeY;
        repaint();
    }
    
    public void moveLeft(){
        jugador.posx -=sizeX;
        repaint();
    }
    
    public void moveRight(){
        jugador.posx +=sizeX;
        repaint();
    }
    
    public void paint(Graphics g) {
            super.paintComponent(g);
            g.fillRect(25+jugador.posx,25+jugador.posy,sizeX,sizeY);
            for(int j=0;j<matriz;j++)
                for(int i=0;i<matriz;i++){
                    g.drawRect(25 + i*sizeX, 25 + j*sizeY, sizeX, sizeY);
                    
                }
            
            for(int j=0;j<matriz;j++)
                for(int i=0;i<matriz;i++){
                    g.drawRect(25 + i*sizeX, 25 + j*sizeY, sizeX, sizeY);
                }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
