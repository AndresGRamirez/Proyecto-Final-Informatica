/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.programacion.proyectofinal;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author Emiliano
 */
public class Catalogo extends JFrame implements ActionListener, ChangeListener{
        
    private JLabel l1,l2,l3,l4,l5;
    private JLabel peli1, peli2, peli3, peli4;
    public String sala1,sala2,sala3,sala4,tP,aD,dM,M;
    
    private JButton b1;
    
    private ImageIcon peliDune, peliThor, peliJoker, peliTG;
    
    private JComboBox sel1, sel2;
    
    private JTextField tf, tf2, tf3;
    private JTextArea peliculas;
    private JScrollPane sc;
    
    
    public static final String[] column ={"Pelicula", "Sala", "Edad"};
    
    DefaultTableModel tbl = new DefaultTableModel(column,0);
    private JTable mantPeli = new JTable(tbl);
    ArrayList<Peliculas> listaPeli = new ArrayList<Peliculas>();
    
        
    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        cat.setBounds(0,0,1920,1080);
        cat.setVisible(true);        
    }
    
    public Catalogo(){
        setLayout(null);
        
        //String Salas 
        sala1 = new String("Sala 1");
        sala2 = new String("Sala 2");
        sala3 = new String("Sala 3");
        sala4 = new String("Sala 4");
        //String Edad
        tP = new String("Todo Publico");
        aD = new String("12 +");
        dM = new String("16+");
        M = new String("18+");  
        
        l1 = new JLabel("Mantenimiento de Peliculas",SwingConstants.CENTER);
        l1.setBounds(340,50,360,30);
        l1.setFont(new Font("Arial",Font.BOLD,20));
        
        l2 = new JLabel("Nombre de Pelicula: ");
        l2.setBounds(270,170,200,20);
        l2.setFont(new Font("Arial",Font.BOLD,18));
        tf = new JTextField();
        tf.setFont(new Font("Arial",Font.PLAIN,14));
        tf.setBounds(450,165,300,30);
        
        l3 = new JLabel("Numero de Sala: ");
        l3.setBounds(270,200,200,20);
        l3.setFont(new Font("Arial",Font.BOLD,18));
        //tf2 = new JTextField();
        //tf2.setFont(new Font("Arial",Font.PLAIN,14));
        //tf2.setBounds(450,195,300,30);
        
        l4 = new JLabel("Edad de la Pelicula: ");
        l4.setBounds(270,230,200,20);
        l4.setFont(new Font("Arial",Font.BOLD,18));
        tf3 = new JTextField();
        tf3.setFont(new Font("Arial",Font.PLAIN,14));
        tf3.setBounds(450,225,300,30);
        
        
        //seleccion salas
        sel1 = new JComboBox();
        sel1.setBounds(450,195,300,30);
        sel1.setFont(new Font("Arial",Font.BOLD,16));
        sel1.addItem(sala1);
        sel1.addItem(sala2);
        sel1.addItem(sala3);
        sel1.addItem(sala4);
        
        sel2 = new JComboBox();
        sel2.setBounds(450,225,300,30);
        sel2.setFont(new Font("Arial",Font.BOLD,16));
        sel2.addItem(tP);
        sel2.addItem(aD);
        sel2.addItem(dM);
        sel2.addItem(M);

        b1 = new JButton("Agregar");
        b1.setBounds(270,270,200,20);       
        
        tbl.addColumn("Nombre De Pelicula");
        tbl.addColumn("Sala");
        tbl.addColumn("Edad");
        
        sc = new JScrollPane();
        
        mantPeli.setFont(new Font("Arial",Font.PLAIN,16));
        mantPeli.setBounds(270,300,500,200);
        sc.setViewportView(mantPeli);
        
        refreshTable();           
        
        //Seleccion de Peliculas              
        add(sc);
        add(mantPeli);      
        
        //Label Titulo y Seleccion de peliculas
        add(l1); 
        add(l2);
        add(l3);
        add(l4);
        add(tf);
        add(b1);
        add(sel1);
        add(sel2);       
        
        sel1.addActionListener(this);
        sel2.addActionListener(this);
        b1.addActionListener(this);
        
    }   
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==b1){
            try{
                Peliculas peli = new Peliculas();
                peli.setPelicula(tf2.getText());
                peli.setSala(sel1.getSelectedItem().toString());
                peli.setEdad(sel2.getSelectedItem().toString());
                listaPeli.add(peli);
                refreshTable();
                //tbl.addRow(new Object[]{tf.getText()});
            
            } catch (Exception g){
                JOptionPane.showMessageDialog(this,"Hay un dato sin llenar!");
            }
        }       
    }
    
    public void refreshTable(){
        //Borrar todos los elementos del modelo, se hace para que no se dupliquen
        while(tbl.getRowCount()>0){
            tbl.removeRow(0);
        }
        
        for(Peliculas pel : listaPeli){
            Object o[] = new Object[3];
            o[0] = pel.getPelicula();
            o[1] = pel.getSala();
            o[2] = pel.getEdad();
            tbl.addRow(o);
        }
        
        mantPeli.setModel(tbl);
    }
        
    public void stateChanged(ChangeEvent f){
        
    }
    
}
