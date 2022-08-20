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
public class CierreCaja extends JFrame implements ActionListener, ChangeListener{    
    
    private JButton salir;
    private JLabel l1;
    
    public static void main(String[] args) {
        
        CierreCaja cc = new CierreCaja();      
        
        //Vetnana Principal        
        cc.setBounds(0,0,1200,720);
        cc.setVisible(true);        
    }
    
    public CierreCaja(){
        setLayout(null);
        
        l1 = new JLabel("Total de Ventas:");
        l1.setBounds(250,50,300,30);
        
        salir = new JButton("Salir");
        salir.setBounds(10,0,60,30);
        
        add(l1);
        add(salir);
        salir.addActionListener(this);
        
    }
    
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==salir){
            System.exit(0);
        }        
    }
        
    public void stateChanged(ChangeEvent f){
        
    }
    
}
