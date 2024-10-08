/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author enyag
 */
public class Info_145 extends javax.swing.JFrame {
    private int numeroJugador = 0;
    private int numeroMaquina = 0;
    private int sumaAmbos = 0;
    private String ganadorFinal = "";

    /**
     * Creates new form Info_145
     */
    public Info_145() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
     public Info_145(int jugadorNum,int maquinaNum,int sumaAmbos,String ganadorFinal) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.numeroJugador = jugadorNum;
        this.numeroMaquina = maquinaNum;
        this.sumaAmbos = sumaAmbos;
        this.ganadorFinal = ganadorFinal;
        
        numPersona.setText(jugadorNum+"");
        numMaquina.setText(maquinaNum+"");
        resSuma.setText(sumaAmbos+"");
        superGanador.setText(ganadorFinal);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        infoTitulo = new javax.swing.JLabel();
        infoTitulo1 = new javax.swing.JLabel();
        infoTitulo2 = new javax.swing.JLabel();
        numPersona = new javax.swing.JTextField();
        numMaquina = new javax.swing.JTextField();
        ganadorTitulo = new javax.swing.JLabel();
        superGanador = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        resSuma = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        infoTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        infoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        infoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTitulo.setText("NUMERO ELEGIDO");

        infoTitulo1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        infoTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        infoTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTitulo1.setText("PERSONA");

        infoTitulo2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        infoTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        infoTitulo2.setText("MAQUINA");

        numPersona.setEditable(false);
        numPersona.setBackground(new java.awt.Color(255, 255, 255));

        numMaquina.setEditable(false);
        numMaquina.setBackground(new java.awt.Color(255, 255, 255));

        ganadorTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        ganadorTitulo.setForeground(new java.awt.Color(102, 102, 255));
        ganadorTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganadorTitulo.setText("GANADOR");

        superGanador.setForeground(new java.awt.Color(0, 0, 0));
        superGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        volver.setBackground(new java.awt.Color(0, 204, 204));
        volver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        resSuma.setForeground(new java.awt.Color(102, 102, 255));
        resSuma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(infoTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(infoTitulo2)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(infoTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(volver)
                                .addComponent(ganadorTitulo)))
                        .addComponent(numMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(superGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(infoTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(infoTitulo2)
                        .addGap(18, 18, 18)
                        .addComponent(numMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(infoTitulo1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(ganadorTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volver)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Boton para volver
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Juego_145 juego = new Juego_145();
        juego.setVisible(true);
        
        //Cerramos esta ventana de esta manera cuando cerramos la ventana se cierra solo esta
        //Pero no se cierran todas
        //CUIDADO NO PONER this.exit --> eso hara que se cierre toda la aplicacion
        this.dispose();
       
    }//GEN-LAST:event_volverActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //SE PUEDE HACER MEJOR PERO REUTILIZO CODIGO
        Juego_145 juego = new Juego_145();
        juego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    //Borro el main ya que no quiero que se ejecute

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ganadorTitulo;
    private javax.swing.JLabel infoTitulo;
    private javax.swing.JLabel infoTitulo1;
    private javax.swing.JLabel infoTitulo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numMaquina;
    private javax.swing.JTextField numPersona;
    private javax.swing.JLabel resSuma;
    private javax.swing.JLabel superGanador;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
