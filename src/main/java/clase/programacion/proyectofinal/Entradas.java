/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.programacion.proyectofinal;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
/**
 *
 * @author Emiliano
 */
public class Entradas extends JFrame implements ActionListener, ChangeListener{
    
    private JButton compra, butaca, comida;
    
    public static void main(String[] args) {
        
        Entradas ent = new Entradas();      
        
        //Vetnana Principal        
        ent.setBounds(0,0,1200,720);
        ent.setVisible(true);        
    }
    
    public Entradas(){
        
        setLayout(null);
        
        compra = new JButton("Compra de Entradas");
        compra.setBounds(80,250,450,150);
        
        butaca = new JButton("Seleccion de Butacas");
        butaca.setBounds(80,450,450,150);
        
        comida = new JButton("Compra de Comida");
        comida.setBounds(650,250, 450,150);
        
        add(compra);
        add(butaca);
        add(comida);        
    }
    
     public void actionPerformed(ActionEvent e){
        //if(e.getSource()==){
            
        //}        
    }
        
    public void stateChanged(ChangeEvent f){
        
    }
}
