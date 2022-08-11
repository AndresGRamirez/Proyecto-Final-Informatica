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
public class Catalogo extends JFrame implements ActionListener, ChangeListener{
        
    private JLabel l1,l2,l3,l4,l5;
    private JLabel peli1, peli2, peli3, peli4;
    public String pel1, pel2, pel3, pel4, pel5, pel6, pel7, pel8;
    
    private ImageIcon peliDune, peliThor, peliJoker, peliTG;
    
    private JComboBox sel1, sel2, sel3, sel4;
    
    private JTextField tf;
    private JTextArea peliculas;
    private JScrollPane sc;
    
    Catalogo cat;
    
    String peli = "";
    
    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        cat.setBounds(0,0,1200,720);
        cat.setVisible(true);        
    }
    
    public Catalogo(){
        setLayout(null);
        
        l1 = new JLabel("Mantenimiento de Peliculas",SwingConstants.CENTER);
        l1.setBounds(-5,50,360,30);
        l1.setFont(new Font("Arial",Font.BOLD,20));      
             
        //Catalogo de Peliculas y sus Directorios                
        peliDune = new ImageIcon("C:\\Users\\Emiliano\\Pictures\\Cartelera\\Dune.jpg");
        peliThor = new ImageIcon("C:\\Users\\Emiliano\\Pictures\\Cartelera\\Thor- amor y trueno.jpg");
        peliJoker = new ImageIcon("C:\\Users\\Emiliano\\Pictures\\Cartelera\\Joker.jpg");
        peliTG = new ImageIcon("C:\\Users\\Emiliano\\Pictures\\Cartelera\\Top Gun.jpg");
        
        //Catalogo Peliculas String
        pel1 = new String("Dune");
        pel2 = new String("Thor");
        pel3 = new String("Joker");
        pel4 = new String("Top Gun");
        pel5 = new String("");
        pel6 = new String("");
        pel7 = new String("");
        pel8 = new String("");
                
        //Image Scale - Dune
        peli1 = new JLabel(peliDune);
        peli1.setBounds(20,120,150,200);
        Image img = peliDune.getImage();        
        Image scale = img.getScaledInstance(peli1.getWidth(), peli1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scale);
        peli1.setIcon(scaledIcon);
        
        //image Scale - Thor
        peli2 = new JLabel(peliThor);
        peli2.setBounds(180,120,150,200);
        Image img2 = peliThor.getImage();
        Image scale2 =img2.getScaledInstance(peli2.getWidth(), peli2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scale2);
        peli2.setIcon(scaledIcon2);
        
        //image Scale Joker
        peli3 = new JLabel(peliJoker);
        peli3.setBounds(20,450,150,200);
        Image img3 = peliJoker.getImage();
        Image scale3 =img3.getScaledInstance(peli3.getWidth(), peli3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(scale3);
        peli3.setIcon(scaledIcon3);
        
        //Image Scale TopGun
        peli4 = new JLabel(peliTG);
        peli4.setBounds(180,450,150,200);
        Image img4 = peliTG.getImage();
        Image scale4 =img4.getScaledInstance(peli4.getWidth(), peli4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(scale4);
        peli4.setIcon(scaledIcon4);
        
        //Botnes Editar Peliculas
        
        //seleccion sala 1
        sel1 = new JComboBox();
        sel1.setBounds(55,330,80,30);
        sel1.setFont(new Font("Arial",Font.BOLD,16));
        sel1.addItem(pel1);
        sel1.addItem(pel2);
        sel1.addItem(pel3);
        sel1.addItem(pel4);
        
        sel2 = new JComboBox();
        sel2.setBounds(210,330,80,30);
        sel2.setFont(new Font("Arial",Font.BOLD,16));
        sel2.addItem(pel2);
        sel2.addItem(pel1);
        sel2.addItem(pel3);
        sel2.addItem(pel4);
        
        //Seleccion de Peliculas
        
        
        
        //Imagenes de peliculas
        add(peli1);
        add(peli2);
        add(peli3);
        add(peli4);
        
        //Label Titulo y Seleccion de peliculas
        add(l1); 
        add(sel1);
        add(sel2);
        
        sel1.addActionListener(this);
        sel2.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        //Seleccionador 1
        if(e.getSource()==sel1){
            String s = (String)sel1.getSelectedItem();
            if(s == pel1){
                peli1.setIcon(peliDune);
                Image img = peliDune.getImage();        
                Image scale = img.getScaledInstance(peli1.getWidth(), peli1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli1.setIcon(scaledIcon);
            }
            if(s == pel2){
                peli1.setIcon(peliThor);
                Image img = peliThor.getImage();        
                Image scale = img.getScaledInstance(peli1.getWidth(), peli1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli1.setIcon(scaledIcon);
            }
            if(s == pel3){
                peli1.setIcon(peliJoker);
                Image img = peliJoker.getImage();        
                Image scale = img.getScaledInstance(peli1.getWidth(), peli1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli1.setIcon(scaledIcon);
            }
            if(s == pel4){
                peli1.setIcon(peliTG);
                Image img = peliTG.getImage();        
                Image scale = img.getScaledInstance(peli1.getWidth(), peli1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli1.setIcon(scaledIcon);
            }
            
        }  
        
        //seleccionador 2
        if(e.getSource()==sel2){
            String s = (String)sel2.getSelectedItem();
            if(s == pel1){
                peli2.setIcon(peliDune);
                Image img = peliDune.getImage();        
                Image scale = img.getScaledInstance(peli2.getWidth(), peli2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli2.setIcon(scaledIcon);
            }
            if(s == pel2){
                peli2.setIcon(peliThor);
                Image img = peliThor.getImage();        
                Image scale = img.getScaledInstance(peli2.getWidth(), peli2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli2.setIcon(scaledIcon);
            }
            if(s == pel3){
                peli2.setIcon(peliJoker);
                Image img = peliJoker.getImage();        
                Image scale = img.getScaledInstance(peli2.getWidth(), peli2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli2.setIcon(scaledIcon);
            }
            if(s == pel4){
                peli2.setIcon(peliTG);
                Image img = peliTG.getImage();        
                Image scale = img.getScaledInstance(peli2.getWidth(), peli2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scale);
                peli2.setIcon(scaledIcon);
            }
            
            
            
        }
    }
        
    public void stateChanged(ChangeEvent f){
        
    }
    
}
