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
public class Salas extends JFrame implements ActionListener, ChangeListener{
    
    private JButton sala1, sala2,sala3, sala4;
    
    public static void main(String[] args) {
        
        Salas sal = new Salas();      
        
        //Vetnana Principal        
        sal.setBounds(0,0,1200,720);
        sal.setVisible(true);        
    }
    
    public Salas(){
        setLayout(null);
        
        sala1 = new JButton("Sala 1");
        sala1.setBounds(80,250,450,150);
        
        sala2 = new JButton("Sala 2");
        sala2.setBounds(80,450,450,150);
        
        sala3 = new JButton("Sala 3");
        sala3.setBounds(650,250, 450,150);
        
        sala4 = new JButton("Sala 4");
        sala4.setBounds(650,450,450,150);
        
        add(sala1);
        add(sala2);
        add(sala3);
        add(sala4);
        
        
    }
    
     public void actionPerformed(ActionEvent e){
        //if(e.getSource()==){
            
        //}        
    }
        
    public void stateChanged(ChangeEvent f){
        
    }
}
