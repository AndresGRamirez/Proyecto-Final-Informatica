package clase.programacion.proyectofinal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
/**
 *
 * @author Emiliano
 */
public class MenuPrincipal extends JFrame implements ActionListener, ChangeListener{
    
    //Botones y Labels
    private JButton b1,b2,b3,b4;    
    
    private JLabel l1,l2,l3l,l4;    
    
    //Menu
    private JMenu menu1, menu2;
    private JMenuBar mb;
    private JMenuItem mItem1, mItem2, mItem3, mItem4;    
    
    
    public static void main(String[] args) {
        
        MenuPrincipal vPrin = new MenuPrincipal();      
        
        //Vetnana Principal        
        vPrin.setBounds(0,0,1200,720);
        vPrin.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vPrin.setVisible(true);
        
    }
    
    public MenuPrincipal(){
        setLayout(null);
        
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        //Menu de Opciones
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        
        //Opcion de salir
        mItem2 = new JMenuItem("Salir");
        menu1.add(mItem2);
         
               
        
        
        
        //Botones para ir a las diferentes secciones de trabajo
        b1 = new JButton("Mantenimiento de Peliculas");
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBounds(250,250,450,150);
        
        b2 = new JButton("Mantenimiento de Salas");
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBounds(250,450,450,150);
        
        b3 = new JButton("Cobro de entradas");
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.setBounds(820,250, 450,150);
        
        b4 = new JButton("Cierre de Caja");
        b4.setFont(new Font("Arial",Font.BOLD,20));
        b4.setBounds(820,450,450,150);
                        
        //label de bienvenida
        l1 = new JLabel("Bienvenido, que desea hacer?");
        l1.setFont(new Font("Arial",Font.BOLD,20));
        l1.setBounds(620,50,400,200);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
                
        add(l1);
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
                
        mItem2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        //Catalogo y mantenimiento de peliculas
        if(e.getSource()==b1){
            GUI_Catalogo cat = new GUI_Catalogo();
            cat.setBounds(200,0,880,580);
            cat.show();
            cat.setResizable(false);
            
            
        }
        //Salas
        if(e.getSource()==b2){
            Salas sal = new Salas();
            sal.setBounds(0,0,1200,720);
            sal.show();
        }
        //Entradas
        if(e.getSource()==b3){
            Entradas ent = new Entradas();
            ent.setBounds(0,0,1200,720);
            ent.show();
            
        }
        //Cierre de Caja
        if(e.getSource()==b4){
            CierreCaja cc = new CierreCaja();
            cc.setBounds(1205,0,600,800);
            cc.show();
        }
        
        if(e.getSource()==mItem2){
            System.exit(0);
        }
                
    }
        
    public void stateChanged(ChangeEvent f){
        
    }
}
