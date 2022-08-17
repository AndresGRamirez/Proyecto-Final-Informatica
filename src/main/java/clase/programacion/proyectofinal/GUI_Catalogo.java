/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase.programacion.proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emiliano
 */
public class GUI_Catalogo extends javax.swing.JFrame {
    
    DefaultTableModel mdl = new DefaultTableModel();
    ArrayList<Peliculas> listPelis = new ArrayList<Peliculas>();

   
    public GUI_Catalogo() {
        initComponents();
        setTitle("MANTENIMIENTO DE PELICULAS");
        
        mdl.addColumn("Nombre");
        mdl.addColumn("Sala");
        mdl.addColumn("Edad");
        
        refreshTable();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombrePeli = new javax.swing.JLabel();
        numSala = new javax.swing.JLabel();
        edadPeli = new javax.swing.JLabel();
        peli_input = new javax.swing.JTextField();
        sel_Sala = new javax.swing.JComboBox<>();
        sel_Edad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Pelis = new javax.swing.JTable();
        b_Agregar = new javax.swing.JButton();
        b_Eliminar = new javax.swing.JButton();
        b_Clear = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1080, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimiento de Peliculas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 14, 286, 75));

        nombrePeli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombrePeli.setText("Nombre de Pelicula:");
        getContentPane().add(nombrePeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 107, 146, 39));

        numSala.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numSala.setText("Numero de Sala:");
        getContentPane().add(numSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 153, 146, 37));

        edadPeli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edadPeli.setText("Edad para la Pelicula:");
        getContentPane().add(edadPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 197, 146, 44));

        peli_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peli_inputActionPerformed(evt);
            }
        });
        getContentPane().add(peli_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 108, 352, 39));

        sel_Sala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sala 1", "Sala2", "Sala 3", "Sala 4" }));
        sel_Sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel_SalaActionPerformed(evt);
            }
        });
        getContentPane().add(sel_Sala, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 154, 352, 40));

        sel_Edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo Publico", "12+", "16+", "18+" }));
        getContentPane().add(sel_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 201, 352, 40));

        tbl_Pelis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Pelis);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 294, 516, 183));

        b_Agregar.setText("Agregar");
        b_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(b_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 260, -1, -1));

        b_Eliminar.setText("Eliminar");
        b_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(b_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 260, -1, -1));

        b_Clear.setText("Eliminar todos");
        b_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(b_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 260, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peli_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peli_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peli_inputActionPerformed

    private void sel_SalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel_SalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sel_SalaActionPerformed

    private void b_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_EliminarActionPerformed
        int fila = tbl_Pelis.getSelectedRow();
        
        if(fila >=0){
            mdl.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_b_EliminarActionPerformed

    private void b_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_AgregarActionPerformed
        
        try{
            Peliculas pelis = new Peliculas();
            pelis.setPelicula(peli_input.getText());
            pelis.setSala(sel_Sala.getSelectedItem().toString());
            pelis.setEdad(sel_Edad.getSelectedItem().toString());
            listPelis.add(pelis);
            refreshTable();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Falta un dato!");
            
        }
        
    }//GEN-LAST:event_b_AgregarActionPerformed

    private void b_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ClearActionPerformed
        int fila = tbl_Pelis.getRowCount();
        
        for(int i = fila-1; i >=0; i--){
            mdl.removeRow(i);
        }
    }//GEN-LAST:event_b_ClearActionPerformed

    
    public void refreshTable(){
        //Borrar todos los elementos del modelo, se hace para que no se dupliquen
        while(mdl.getRowCount()>0){
            mdl.removeRow(0);
        }
        
        for(Peliculas pel : listPelis){
            Object o[] = new Object[3];
            o[0] = pel.getPelicula();
            o[1] = pel.getSala();
            o[2] = pel.getEdad();
            mdl.addRow(o);
        }
        
        tbl_Pelis.setModel(mdl);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Agregar;
    private javax.swing.JButton b_Clear;
    private javax.swing.JButton b_Eliminar;
    private javax.swing.JLabel edadPeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrePeli;
    private javax.swing.JLabel numSala;
    private javax.swing.JTextField peli_input;
    private javax.swing.JComboBox<String> sel_Edad;
    private javax.swing.JComboBox<String> sel_Sala;
    private javax.swing.JTable tbl_Pelis;
    // End of variables declaration//GEN-END:variables
}
