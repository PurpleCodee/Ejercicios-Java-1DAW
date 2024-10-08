/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author MEDAC
 */
public class Vdatos extends javax.swing.JFrame {
    
    //PROPIEDADES DE CLASE --> Lo pongo en esta clase porque es donde quiero traer los datos
    //--> Pongo tantas como necesite
    private String nombre = "";
    private String pass = "";
    

    /**
     * Creates new form Vdatos
     */
    public Vdatos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //Creo un nuevo constructor (sobrecarga)
     public Vdatos(String name, String contrasenia) {
        initComponents();//--> que no se nos olvide si no no funciona nada
        setLocationRelativeTo(null);//--> Sireve para que la ventana salga centradita
        
        //Asignamos parametros a las propiedades
        this.nombre = name;
        this.pass = contrasenia;
        
        //Para este ejemplo de ejercicio
        //hacemos la siguiente se hace aqui
        resNombre.setText(name);
        resContraseña.setText(contrasenia);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoVdatos = new javax.swing.JPanel();
        resNombre = new javax.swing.JTextField();
        resContraseña = new javax.swing.JTextField();
        Datos = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        resNombre.setEditable(false);
        resNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        resContraseña.setEditable(false);

        Datos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Datos.setText("DATOS OBTENIDOS");

        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoVdatosLayout = new javax.swing.GroupLayout(fondoVdatos);
        fondoVdatos.setLayout(fondoVdatosLayout);
        fondoVdatosLayout.setHorizontalGroup(
            fondoVdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoVdatosLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Datos)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(fondoVdatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoVdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoVdatosLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(botonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoVdatosLayout.setVerticalGroup(
            fondoVdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoVdatosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Datos)
                .addGap(33, 33, 33)
                .addComponent(resNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVolver)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondoVdatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondoVdatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


//Boton de volver
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        //creamos una insrtancia de la ventana principal(es a la que queremos volver)
        Principal primera = new Principal();
        primera.setVisible(true);//la ponemos visible
        
        
        //Cerramos esta ventana de esta manera cuando cerramos la ventana se cierra solo esta
        //Pero no se cierran todas
        //CUIDADO NO PONER this.exit --> eso hara que se cierre toda la aplicacion
        this.dispose();
        
        
    }//GEN-LAST:event_botonVolverActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       //copiamos y pegamos el mimo codigo en en el metodo del boton
       //este metodo nos permite no poder cerrar la ventana dandole al boton de X
       //Importante masrcar DISPOSE -->en propiedades la primera que aparece
       
        Principal primera = new Principal();
        primera.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing
//MATA AL MAIN PARA QUE NO SE PUEDA EJECUTAR 
//--> NO QUEREMOS QUE SE EJECUTE DIRECTAMENTE ESTA VENTANA
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datos;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel fondoVdatos;
    private javax.swing.JTextField resContraseña;
    private javax.swing.JTextField resNombre;
    // End of variables declaration//GEN-END:variables
}
