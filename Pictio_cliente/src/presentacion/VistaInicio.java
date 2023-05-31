/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import presentacion.Controlador;

/**
 *
 * @author User
 */
public class VistaInicio extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;

    public VistaInicio(Modelo m) {
        modelo = m;
        initComponents();
        capturarEventos();

    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControl() {
       if(control == null){
            control = new Controlador(this);
            
        }
        return control;
    }

    public void setControl(Controlador control) {
        this.control = control;
    }

    public JButton getBotonJugar() {

        return botonJugar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void setBotonJugar(JButton botonJugar) {
        this.botonJugar = botonJugar;
    }

    public JLabel getEtiquetaFondo() {
        return etiquetaFondo;
    }

    public void setEtiquetaFondo(JLabel etiquetaFondo) {
        this.etiquetaFondo = etiquetaFondo;
    }

    public JLabel getEtiquetaMenu() {
        return etiquetaMenu;
    }

    public void setEtiquetaMenu(JLabel etiquetaMenu) {
        this.etiquetaMenu = etiquetaMenu;
    }

    public JLabel getEtiquetaNombre() {
        return etiquetaNombre;
    }

    public void setEtiquetaNombre(JLabel etiquetaNombre) {
        this.etiquetaNombre = etiquetaNombre;
    }

    public JLabel getEtiquetaTitulo() {
        return etiquetaTitulo;
    }

    public void setEtiquetaTitulo(JLabel etiquetaTitulo) {
        this.etiquetaTitulo = etiquetaTitulo;
    }

    public JTextField getTextNombre() {
        return textNombre;
    }

    public void setTextNombre(JTextField jTextField1) {
        this.textNombre = jTextField1;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaMenu = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        botonJugar = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiquetaMenu.setText("No se ha creado el servidor");
        getContentPane().add(etiquetaMenu);
        etiquetaMenu.setBounds(90, 90, 170, 14);

        textNombre.setText("jugador1");
        getContentPane().add(textNombre);
        textNombre.setBounds(160, 140, 150, 20);

        etiquetaNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaNombre.setText("Ingresa tu nombre");
        getContentPane().add(etiquetaNombre);
        etiquetaNombre.setBounds(20, 140, 129, 19);

        botonJugar.setBackground(new java.awt.Color(153, 153, 153));
        botonJugar.setText("Crear partida");
        getContentPane().add(botonJugar);
        botonJugar.setBounds(100, 190, 130, 23);

        etiquetaTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        etiquetaTitulo.setText("Pictionary");
        getContentPane().add(etiquetaTitulo);
        etiquetaTitulo.setBounds(90, 10, 180, 60);

        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Fondo.jpg"))); // NOI18N
        etiquetaFondo.setAlignmentY(0.0F);
        getContentPane().add(etiquetaFondo);
        etiquetaFondo.setBounds(0, 0, 1024, 576);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonJugar;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaMenu;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
        
        botonJugar.addActionListener(getControl());

    }
}
