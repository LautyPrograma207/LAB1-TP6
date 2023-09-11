//Rodriguez Lautaro.
package TP6Terminado;
import javax.swing.JOptionPane;
import static TP6Terminado.Menu.listaProductos;
public class gestionProductos extends javax.swing.JInternalFrame {

  
    public gestionProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbRubro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Gestion de Productos");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Código :");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Descripción :");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setText("Precio :");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Rubro :");

        cbRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Elija una opcion", "COMESTIBLE", "LIMPIEZA", "PERFUMERIA" }));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("Stock :");

        btnNuevo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(0, 0, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnGuardar)
                        .addGap(36, 36, 36)
                        .addComponent(btnEliminar)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtCodigo)
                            .addComponent(jtDescripcion)
                            .addComponent(jtPrecio)
                            .addComponent(cbRubro, 0, 133, Short.MAX_VALUE)
                            .addComponent(jtStock))
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addGap(10, 10, 10)
                .addComponent(btnSalir)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        try {
            int cont = 0;
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            Menu.codigoBuscado = codigo;
            for (Producto prod : Menu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    jtDescripcion.setText(prod.getDescripcion());
                    //paso precio a string para setearlo en el jtPrecio:
                    String precioString = Double.toString(prod.getPrecio());
                    jtPrecio.setText(precioString);
                    String rubroString = prod.getRubro().toString();
                    cbRubro.setSelectedItem(rubroString);
                    //paso el stock de int a string para setText
                    String stockString = Integer.toString(prod.getStock());
                    jtStock.setText(stockString);
                    cont = cont - 1;
                }
                cont = cont + 1;
                if (Menu.listaProductos.size() == cont) {
                    borrarCampos();
                    JOptionPane.showMessageDialog(this, "El codigo: " + codigo + " NO existe, puede registrar un producto con el codigo ingresado ");
                }
            }

        } catch (NumberFormatException nfe) {
            borrarCampos();
            JOptionPane.showMessageDialog(this, "Ingrese un numero en el código, para realizar la busqueda del producto");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            // el producto se va agregar solo si el codigo no existe y todos los datos estan completos. 
            boolean existe = false;
            for (Producto prod : Menu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    jtCodigo.setText("");
                    existe = true;
                    JOptionPane.showMessageDialog(this, "Producto Existente: el código ya esta registrado\n"
                            + "Puede ingresar el código y modificar los datos del producto");
                }
            }
            //capturo los campos de texto en variables con el tipo de dato parseado:
            String descripcion = jtDescripcion.getText().trim();
            Double precio = Double.parseDouble(jtPrecio.getText().trim());
            int stock = Integer.parseInt(jtStock.getText().trim());
            String categoria = cbRubro.getSelectedItem().toString();

            if (categoria.equals("- Elija una opcion")) {
                JOptionPane.showMessageDialog(this, "Seleccione un Rubro por favor...");
            }
            if (existe == false) {
                listaProductos.add(new Producto(codigo, descripcion, precio, stock, Categoria.valueOf(categoria)));
                JOptionPane.showMessageDialog(this, "¡ Producto Agregado !");
            }

        } catch (NumberFormatException nfe) {
            //si hay datos vacios o datos incorrectos , mostrara un cartel.
            jtCodigo.setText("");
            JOptionPane.showMessageDialog(this, "Datos incorrectos o vacios, verifique los datos ingresados");

        }
        borrarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            boolean datosOk = true;
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            if (codigo!= Menu.codigoBuscado){
                datosOk=false;
            }
            if (jtDescripcion.getText().trim().equals("") || jtPrecio.getText().trim().equals("") || jtStock.getText().trim().equals("") || jtStock.getText().trim().equals("")) {
                datosOk = false;
                JOptionPane.showMessageDialog(this, "Datos vacios, ingrese todos los datos...");
            }
            for (Producto prod : Menu.listaProductos) {
                if (prod.getCodigo() == codigo && datosOk == true) {
                    //capturo los campos de texto en variables con el tipo de dato parseado:
                    String descripcion = jtDescripcion.getText().trim();
                    Double precio = Double.parseDouble(jtPrecio.getText().trim());
                    int stock = Integer.parseInt(jtStock.getText().trim());
                    String categoria = cbRubro.getSelectedItem().toString();
                    //Seleccion por Rubro
                    if (categoria.equals("- Elija una opcion")) {
                        JOptionPane.showMessageDialog(this, "Seleccione un Rubro por favor...");
                    } else {
                        prod.setDescripcion(descripcion);
                        prod.setPrecio(precio);
                        prod.setStock(stock);
                        if (categoria.equalsIgnoreCase("PERFUMERIA")) {
                            prod.setRubro(Categoria.PERFUMERIA);
                        }
                        if (categoria.equalsIgnoreCase("COMESTIBLE")) {
                            prod.setRubro(Categoria.COMESTIBLE);
                        }
                        if (categoria.equalsIgnoreCase("LIMPIEZA")) {
                            prod.setRubro(Categoria.LIMPIEZA);
                        }
                        JOptionPane.showMessageDialog(this, "Cambios Guardados !");
                    }
                }
            }
            String categoria = cbRubro.getSelectedItem().toString();
            if (categoria.equals("- Elija una opcion")) {
                JOptionPane.showMessageDialog(this, "Seleccione un Rubro por favor...");
            }
        } catch (NumberFormatException nfe) {
            //si hay datos vacios o datos incorrectos , mostrara un cartel.
            jtCodigo.setText("");
            JOptionPane.showMessageDialog(this, "Datos incorrectos, verifique los datos ingresados");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Datos vacios, verifique los datos ingresados");
        }
        borrarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean eliminar = false;
        try {
            int codigo = Integer.parseInt(jtCodigo.getText().trim());
            //busco el producto por el codigo para eliminarlo
            for (Producto prod : Menu.listaProductos) {
                if (prod.getCodigo() == codigo) {
                    eliminar = true;
                    break;
                }
            }
            if (eliminar == true) {
                Menu.listaProductos.removeIf(prod -> prod.getCodigo() == codigo);
                JOptionPane.showMessageDialog(this, "Producto Eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
            }
        } catch (NumberFormatException nfe) {
            //si hay datos vacios o datos incorrectos , mostrara un cartel.
            jtCodigo.setText("");
            JOptionPane.showMessageDialog(this, "Ingrese el codigo del producto que desea eliminar");
        }
        borrarCampos();


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Ocultamos gestion de productos:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
    private void borrarCampos() {
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        cbRubro.setSelectedIndex(0);
    }
}
