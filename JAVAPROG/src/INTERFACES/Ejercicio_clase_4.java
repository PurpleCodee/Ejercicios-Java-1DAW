/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author MEDAC
 */
public class Ejercicio_clase_4 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio_clase_4
     */
    public Ejercicio_clase_4() {
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

        grupoRadiux1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea3 = new javax.swing.JTextArea();
        panel2 = new javax.swing.JPanel();
        CheckBox1 = new javax.swing.JCheckBox();
        CheckBox2 = new javax.swing.JCheckBox();
        CheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JPanel();
        botonRadio1 = new javax.swing.JRadioButton();
        botonRadio2 = new javax.swing.JRadioButton();
        botonRadio3 = new javax.swing.JRadioButton();
        elegirNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        textArea3.setColumns(20);
        textArea3.setRows(5);
        jScrollPane1.setViewportView(textArea3);

        panel2.setForeground(new java.awt.Color(153, 153, 255));

        CheckBox1.setText("Leer");
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });

        CheckBox2.setText("Cantar");
        CheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox2ActionPerformed(evt);
            }
        });

        CheckBox3.setText("Fumar");
        CheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(CheckBox1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(CheckBox2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(CheckBox3)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Botoncito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        titulo1.setBackground(new java.awt.Color(102, 0, 102));
        titulo1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Ejercicio3");

        titulo2.setBackground(new java.awt.Color(102, 0, 102));
        titulo2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Ejercicio4");

        grupoRadiux1.add(botonRadio1);
        botonRadio1.setText("Paco");
        botonRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRadio1ActionPerformed(evt);
            }
        });

        grupoRadiux1.add(botonRadio2);
        botonRadio2.setText("Luis");
        botonRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRadio2ActionPerformed(evt);
            }
        });

        grupoRadiux1.add(botonRadio3);
        botonRadio3.setText("Adri");
        botonRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRadio3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondo3Layout = new javax.swing.GroupLayout(fondo3);
        fondo3.setLayout(fondo3Layout);
        fondo3Layout.setHorizontalGroup(
            fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRadio1)
                    .addComponent(botonRadio2)
                    .addComponent(botonRadio3))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        fondo3Layout.setVerticalGroup(
            fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonRadio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRadio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRadio3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        elegirNombre.setText("Elige uno: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(224, 224, 224)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                        .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elegirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fondo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo1)
                    .addComponent(titulo2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(elegirNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fondo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(360, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(706, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //EVENTO DEL BOTON
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    //EVENTO DEL BOTON DE CHEKbox1
    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        // TODO add your handling code here:
        String textitoBox1 = "";
        if (CheckBox1.isSelected()) {
            textitoBox1 = CheckBox1.getText();
            textArea3.append(textitoBox1 + " ");

        } else {

        }
    }//GEN-LAST:event_CheckBox1ActionPerformed
    //EVENTO DEL BOTON DE CHEKbox1
    private void CheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox2ActionPerformed
        // TODO add your handling code here:
        String textitoBox2 = "";
        if (CheckBox2.isSelected()) {
            textitoBox2 = CheckBox2.getText();
            textArea3.append(textitoBox2 + " ");
        } else {

        }
    }//GEN-LAST:event_CheckBox2ActionPerformed
    //EVENTO DEL BOTON DE CHEKbox1
    private void CheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox3ActionPerformed
        // TODO add your handling code here:
        String textitoBox3 = "";
        if (CheckBox3.isSelected()) {
            textitoBox3 = CheckBox3.getText();
            textArea3.append(textitoBox3 + " ");
        } else {

        }
    }//GEN-LAST:event_CheckBox3ActionPerformed
//BOTON NUMERO 1 RADIUS
    private void botonRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRadio1ActionPerformed
        // TODO add your handling code here:
        String nombreElegido1 = "";
        String trozoCortado = "";
        if (botonRadio1.isSelected()) {
            nombreElegido1 = elegirNombre.getText();//el label

            String nombre = botonRadio1.getText();//texto del nombre

            trozoCortado = nombreElegido1.substring(0, nombreElegido1.indexOf(":") + 1);
            elegirNombre.setText(trozoCortado + nombre);

        }
    }//GEN-LAST:event_botonRadio1ActionPerformed
//BOTON NUMERO 2 RADIUS
    private void botonRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRadio2ActionPerformed
        // TODO add your handling code here:
        String nombreElegido2 = "";
        String trozoCortado = "";

        if (botonRadio2.isSelected()) {
            nombreElegido2 = elegirNombre.getText();
            String nombre = botonRadio2.getText();//texto del nombre

            trozoCortado = nombreElegido2.substring(0, nombreElegido2.indexOf(":") + 1);
            elegirNombre.setText(trozoCortado + nombre);

        }
    }//GEN-LAST:event_botonRadio2ActionPerformed
//BOTON NUMERO 3 RADIUS
    private void botonRadio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRadio3ActionPerformed
        // TODO add your handling code here:
        String nombreElegido3 = "";
        String trozoCortado = "";
        
        if (botonRadio3.isSelected()) {
            nombreElegido3 = elegirNombre.getText();
            String nombre = botonRadio3.getText();//texto del nombre

            trozoCortado = nombreElegido3.substring(0, nombreElegido3.indexOf(":") + 1);
            elegirNombre.setText(trozoCortado + nombre);

        }
    }//GEN-LAST:event_botonRadio3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio_clase_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_clase_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_clase_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_clase_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_clase_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JRadioButton botonRadio1;
    private javax.swing.JRadioButton botonRadio2;
    private javax.swing.JRadioButton botonRadio3;
    private javax.swing.JLabel elegirNombre;
    private javax.swing.JPanel fondo3;
    private javax.swing.ButtonGroup grupoRadiux1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextArea textArea3;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
