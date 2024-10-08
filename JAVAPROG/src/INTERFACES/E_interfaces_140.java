/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACES;

import java.awt.Color;
import java.util.InputMismatchException;

/**
 *
 * @author enyag
 */
public class E_interfaces_140 extends javax.swing.JFrame {

    /**
     * Creates new form E_interfaces_140
     */
    public E_interfaces_140() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textDolar = new javax.swing.JTextField();
        textEuro = new javax.swing.JTextField();
        botonDE = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        euroText = new javax.swing.JTextField();
        dolarText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textDolar.setText("Dolares:");

        textEuro.setText("Euro:");

        botonDE.setText("Boton");
        botonDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDEActionPerformed(evt);
            }
        });

        boton2.setText("Boton");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        euroText.setText("Euro:");

        dolarText.setText("Dolar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDolar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(textEuro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(euroText, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(dolarText))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(botonDE, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton2)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDE)
                    .addComponent(boton2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euroText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dolarText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//BOTON DE CONVERSION DOLAR A EURO

    private void botonDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDEActionPerformed
        final double euro = 0.93;//un euro vale eso
        try {
            //para convertir dolares a euros tengo que cantidad de dolar * Cambio a euro
         
            String dolarText = textDolar.getText();
            double dolares = Double.parseDouble(dolarText.substring(dolarText.indexOf(":") + 1));

            double dolarEuro = dolares * euro;

            textEuro.setText("Euros: " + dolarEuro + "€");

        } catch (NumberFormatException e) {
            textDolar.setText("elemento vacio");
        } 


    }//GEN-LAST:event_botonDEActionPerformed
//BOTON DE CONVERSION EURO A DOLAR
    //la operacion sera dinero que tengo * el cambio al que esta el euro en este caso un euro equivale a 1,07 dolares
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
       final double dolar = 1.07;//un euro equivale a 1,07
        try {
            String euroText = this.euroText.getText();//cojo el texto de la casilla de euros
            double euros = Double.parseDouble(euroText.substring(euroText.indexOf(":") + 1));//seleciono el valor de euros que se pone en el filText

            double euroDolar = euros * dolar;

            dolarText.setText("Dolares: " + euroDolar + "$");

        } catch (NumberFormatException e) {
            euroText.setText("elemento vacio");
        } 

    }//GEN-LAST:event_boton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(E_interfaces_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E_interfaces_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E_interfaces_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E_interfaces_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E_interfaces_140().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton2;
    private javax.swing.JButton botonDE;
    private javax.swing.JTextField dolarText;
    private javax.swing.JTextField euroText;
    private javax.swing.JTextField textDolar;
    private javax.swing.JTextField textEuro;
    // End of variables declaration//GEN-END:variables
}
