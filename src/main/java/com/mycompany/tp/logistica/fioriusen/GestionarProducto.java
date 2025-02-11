/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp.logistica.fioriusen;

import com.mycompany.tp.logistica.fioriusen.dtos.ProductoDTO;
import com.mycompany.tp.logistica.fioriusen.entidades.Producto;
import com.mycompany.tp.logistica.fioriusen.gestores.GestorProducto;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zapam
 */
public class GestionarProducto extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel2
     */
    private JFrame ventana;
    private JPanel padre;

    public GestionarProducto(JFrame ventana, JPanel padre) {
        this.ventana = ventana;
        this.padre = padre;
        ventana.setTitle("Gestionar productos - Búsqueda de producto");
        ventana.setSize(800, 700);
        initComponents();
        ventana.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();
        peso = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textPeso = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        precio = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        tablaResultado = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setText("Código");

        peso.setText("Peso");

        nombre.setText("Nombre");

        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        textCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCodigoKeyTyped(evt);
            }
        });

        textPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPesoActionPerformed(evt);
            }
        });
        textPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPesoKeyTyped(evt);
            }
        });

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        precio.setBackground(new java.awt.Color(255, 255, 255));
        precio.setText("Precio");

        textPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioActionPerformed(evt);
            }
        });
        textPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre)
                    .addComponent(peso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precio)
                        .addGap(18, 18, 18)
                        .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peso)
                    .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado de búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Código", "Peso", "Precio", "Desc."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaResultado.setDragEnabled(true);
        tablaResultado.setShowGrid(true);
        jScrollPane37.setViewportView(tablaResultado);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnEditar.setText("Editar producto");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo producto");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText(" Eliminar producto");

        btnVolver.setText("Cancelar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnNuevo)
                    .addComponent(btnVolver)
                    .addComponent(btnEliminar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        String cod = textCodigo.getText();
        if (!(cod.matches("[A-Z]"))) {
            JOptionPane.showMessageDialog(this, "Introduzca un valor correcto", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {
            System.out.println(cod);
        }
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodigoKeyTyped
        // TODO add your handling code here:

        if (textCodigo.getText().length() > 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textCodigoKeyTyped

    private void textPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPesoActionPerformed

    private void textPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPesoKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if (Character.isLowerCase(letra)) {
            evt.setKeyChar(Character.toUpperCase(letra));
        }

        if (textPeso.getText().length() > 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textPesoKeyTyped

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        // TODO add your handling code here:
        if (textNombre.getText().length() > 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textNombreKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        GestorProducto gp = new GestorProducto();
        Boolean control = true;

        ProductoDTO dto = new ProductoDTO(textNombre.getText(), textCodigo.getText(), textPeso.getText(), textPrecio.getText(), "0");

        int[] mensaje = gp.validarDatos(dto);
        if (textNombre.getText().isEmpty() && textCodigo.getText().isEmpty() && textPeso.getText().isEmpty() && textPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete al menos un criterio de búsqueda.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control = false;
            Toolkit.getDefaultToolkit().beep();

        }
        if (mensaje[1] == 1) {
            JOptionPane.showMessageDialog(this, "El campo NOMBRE debe ser alfabético", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control = false;
            Toolkit.getDefaultToolkit().beep();
        }
        if (mensaje[2] == 1) {
            JOptionPane.showMessageDialog(this, "El campo CODIGO sólo puede contener números", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control = false;
            Toolkit.getDefaultToolkit().beep();
        }
        if (mensaje[3] == 1) {
            JOptionPane.showMessageDialog(this, "El campo PESO sólo puede contener números", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control = false;
            Toolkit.getDefaultToolkit().beep();
        }
        if (mensaje[4] == 1) {
            JOptionPane.showMessageDialog(this, "El campo PRECIO sólo puede contener números", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control = false;
            Toolkit.getDefaultToolkit().beep();
        }

        if (control == true) {

            List<Producto> listaProductosDTO = gp.buscarSegunCriterio(dto);
            DefaultTableModel model = (DefaultTableModel) tablaResultado.getModel();
            int filas = model.getRowCount();
            if (filas > 0) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
            }
            if (listaProductosDTO.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se han encontrado productos con los criterios seleccionados.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                control = false;
                Toolkit.getDefaultToolkit().beep();
            } else {

                for (int i = 0; i < listaProductosDTO.size(); i++) {
                    model.addRow(new Object[]{listaProductosDTO.get(i).getId(),listaProductosDTO.get(i).getNombre(), listaProductosDTO.get(i).getCodigo(), listaProductosDTO.get(i).getPeso(), listaProductosDTO.get(i).getPrecioUnitario(), listaProductosDTO.get(i).getDescripcion()});
                }
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void textPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioActionPerformed

    private void textPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrecioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablaResultado.getModel();
        int fila = tablaResultado.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una sucursal de la tabla.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String id = model.getValueAt(fila, 0).toString();
            ProductoDTO dto = new ProductoDTO(model.getValueAt(fila, 1).toString(),
                    model.getValueAt(fila, 2).toString(),
                    model.getValueAt(fila, 3).toString(),
                    model.getValueAt(fila, 4).toString(),
                    model.getValueAt(fila, 5).toString());
            System.out.println("Valores: " + model.getValueAt(fila, 1).toString() + " " + model.getValueAt(fila, 2).toString() + " " + model.getValueAt(fila, 3).toString());

            ventana.setContentPane(new ModificarProducto(ventana, this, dto, id));
            ventana.revalidate();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        ventana.setContentPane(new AltaProducto(ventana, this));
        ventana.revalidate();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "¿Desea regresar a la pantalla del Menú Principal?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        switch (result) {
            case JOptionPane.YES_OPTION:
                ventana.setContentPane(new Menu(ventana, this));
                ventana.revalidate();
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel codigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel peso;
    private javax.swing.JLabel precio;
    private javax.swing.JTable tablaResultado;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPeso;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}
