/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestioninventario;

import static gestioninventario.FileManager.archivo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;

/**
 *
 * @author usuario
 */
public class AgregarLibro extends javax.swing.JFrame {

    /**
     * Creates new form AgregarLibro
     */
    public AgregarLibro() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCantidad2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTxtCantidad2 = new javax.swing.JTextPane();
        jLblAgregar = new javax.swing.JLabel();
        jLblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtTitulo = new javax.swing.JTextPane();
        jLblPrecio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtPrecio = new javax.swing.JTextPane();
        jLblCantidad = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTxtCantidad = new javax.swing.JTextPane();
        jBtnAgregarLibro = new javax.swing.JButton();
        jLblAutor = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTxtAutor = new javax.swing.JTextPane();
        jLblISBN = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTxtISBN = new javax.swing.JTextPane();
        jBtnAtras = new javax.swing.JButton();
        jLblErrorAgregar = new javax.swing.JLabel();

        jLblCantidad2.setText("AUTOR/ES");

        jScrollPane5.setViewportView(jTxtCantidad2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblAgregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLblAgregar.setForeground(new java.awt.Color(0, 102, 153));
        jLblAgregar.setText("AGREGAR LIBRO");

        jLblTitulo.setText("TÍTULO");

        jScrollPane1.setViewportView(jTxtTitulo);

        jLblPrecio.setText("PRECIO");

        jScrollPane2.setViewportView(jTxtPrecio);

        jLblCantidad.setText("CANTIDAD");

        jScrollPane3.setViewportView(jTxtCantidad);

        jBtnAgregarLibro.setBackground(new java.awt.Color(204, 204, 255));
        jBtnAgregarLibro.setText("AGREGAR LIBRO");
        jBtnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarLibroActionPerformed(evt);
            }
        });

        jLblAutor.setText("AUTOR/ES");

        jScrollPane4.setViewportView(jTxtAutor);

        jLblISBN.setText("ISBN");

        jScrollPane6.setViewportView(jTxtISBN);

        jBtnAtras.setBackground(new java.awt.Color(204, 204, 255));
        jBtnAtras.setText("ATRAS");
        jBtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtrasActionPerformed(evt);
            }
        });

        jLblErrorAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblErrorAgregar.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLblErrorAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLblAgregar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jLblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4)
                                .addComponent(jLblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane6)
                                .addComponent(jLblISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtnAtras)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnAgregarLibro))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLblAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPrecio)
                    .addComponent(jLblCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblISBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAgregarLibro)
                    .addComponent(jBtnAtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLblErrorAgregar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarLibroActionPerformed
        /**/
        String titulo = jTxtTitulo;
        ArrayList<String> autores = jTxtAutor;
        double precio = jTxtPrecio;
        String ISBN = jTxtISBN;
        int cantidad = jTxtCantidad;

        Libro l = new Libro(titulo, autores, precio, ISBN, cantidad);
        // si no existe -> añadir libro al archivo // pero si existe -> mensaje de error que indique que existe.
        if (!l.equals(l)) {
            try {
                FileManager.writeFile();
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw); 
                bw.write(l);
                bw.flush();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(AgregarLibro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jLblErrorAgregar.setText("Este Libro ya existe");
        }
    }//GEN-LAST:event_jBtnAgregarLibroActionPerformed

    private void jBtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtrasActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_jBtnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregarLibro;
    private javax.swing.JButton jBtnAtras;
    private javax.swing.JLabel jLblAgregar;
    private javax.swing.JLabel jLblAutor;
    private javax.swing.JLabel jLblCantidad;
    private javax.swing.JLabel jLblCantidad2;
    private javax.swing.JLabel jLblErrorAgregar;
    private javax.swing.JLabel jLblISBN;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTxtAutor;
    private javax.swing.JTextPane jTxtCantidad;
    private javax.swing.JTextPane jTxtCantidad2;
    private javax.swing.JTextPane jTxtISBN;
    private javax.swing.JTextPane jTxtPrecio;
    private javax.swing.JTextPane jTxtTitulo;
    // End of variables declaration//GEN-END:variables
}
