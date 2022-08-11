/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
public class ProyectoFinal extends JFrame implements ActionListener, ChangeListener{
    
    private String usuario;
    private String contra;
    
    private JButton b1, b2, b3, b4;
    private JLabel l1, l2, l3, l4;
    private JTextArea tA1, tA2;
    private JTextField tF1, tF2;
    

    public static void main(String[] args) {
        ProyectoFinal vInicio = new ProyectoFinal();
                
        //Ventana de Log-In
        vInicio.setBounds(750,400,400,300);
        vInicio.setVisible(true); 
        vInicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public ProyectoFinal(){
        setLayout(null);
        
        //titulo
        l1 = new JLabel("Para Ingresar:");
        l1.setBounds(30,0,120,20);
                
        //Ingres usuario y textField
        l2 = new JLabel("Usuario:");
        l2.setBounds(30,40,70,20);
        tF1 = new JTextField();
        tF1.setBounds(30,60,330,30);
        
        //Contra y textField
        l3 = new JLabel("Contraseña:");
        l3.setBounds(30,110,70,20);
        tF2 = new JTextField();
        tF2.setBounds(30,130,330,30);        
        
        //boton de continuar
        b1 = new JButton("Continuar");
        b1.setBounds(150,200,100,30);
        
        
        add(l1);
        add(l2);
        add(l3);
        add(tF1);
        add(tF2);
        
        add(b1);
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==b1){
            //Encener la nueva ventana
            MenuPrincipal mP = new MenuPrincipal();
            mP.setBounds(0,0,1920,1080);
            mP.show();
            
            //Poner Usuario activo en el titulo de la ventana
            String login =tF1.getText(); 
            mP.setTitle("Usuario: " + login);
            
            //Apagar la ventana de inicio(login)
            dispose();
            mP.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
        }
    }
    
    public void stateChanged(ChangeEvent f){
        
    }
}
