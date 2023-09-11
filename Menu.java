//Rodirugez Lautaro.
package TP6Terminado;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    // capturar codigo al buscar un producto y no poder cambiar de codigo 
    //antes de confirmar el cambio, y se modifique otro prod..
    public static int codigoBuscado;

    public static TreeSet<Producto> listaProductos = new TreeSet<>();

    public Menu() {
        initComponents();
        cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        porRubro = new javax.swing.JMenuItem();
        porNombre = new javax.swing.JMenuItem();
        porPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmProductos.setText("Productos");
        jmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jmProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        porRubro.setText("Por Rubro");
        porRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porRubroActionPerformed(evt);
            }
        });
        jMenu2.add(porRubro);

        porNombre.setText("Por Nombre");
        porNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porNombreActionPerformed(evt);
            }
        });
        jMenu2.add(porNombre);

        porPrecio.setText("Por Precio");
        porPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(porPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void porNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorNombreView bpn = new BusquedaPorNombreView();
        bpn.setVisible(true);
        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_porNombreActionPerformed

    private void porPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorPrecioView bpp = new BusquedaPorPrecioView();
        bpp.setVisible(true);
        escritorio.add(bpp);
        escritorio.moveToFront(bpp);
    }//GEN-LAST:event_porPrecioActionPerformed

    private void porRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorRubroView bpr = new BusquedaPorRubroView();
        bpr.setVisible(true);
        escritorio.add(bpr);
        escritorio.moveToFront(bpr);    }//GEN-LAST:event_porRubroActionPerformed

    private void jmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        gestionProductos gp = new gestionProductos();
        gp.setVisible(true);
        escritorio.add(gp);
        escritorio.moveToFront(gp);  
        JOptionPane.showMessageDialog(this, "Opciones : \n"
                + "*BUSCAR:Puede ingresar un codigo y buscar el producto con el boton BUSCAR.\n "
                + "*NUEVO:Ingresar datos de producto, crearlo y agregarlo a la lista con boton NUEVO.\n "
                + "*MODIFICAR:ingrese el codigo del producto a modificar,cambie los datos y grabelos con boton GUARDAR.\n "
                + "*ELIMINAR: ingrese el codigo del producto que desea borrar de la lista, click boton ELIMINAR \n");            
        

    }//GEN-LAST:event_jmProductosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        gestionProductos gp = new gestionProductos();
        gp.setVisible(true);
        escritorio.add(gp);
        escritorio.moveToFront(gp);      }//GEN-LAST:event_jMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmProductos;
    private javax.swing.JMenuItem porNombre;
    private javax.swing.JMenuItem porPrecio;
    private javax.swing.JMenuItem porRubro;
    // End of variables declaration//GEN-END:variables

    //Guardado de productos (Utilize el mismo metodo que un compañero para no deber cargar dato por dato)
    private void cargarProductos() {
        listaProductos.add(new Producto(1, "Azucar 1Kg", 180.50, 5, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(2, "Yerba-Mate 500Gr", 600, 4, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(3, "Cafe 500Gr", 1500, 13, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(4, "Detergente 500Cc", 700, 35, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(5, "Lavandina 1L", 400.50, 17, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(6, "Trapo de piso Gris", 500, 95, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(7, "Colonia 500Cc", 750, 10, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(8, "Desodorante 500cc", 600.70, 302, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(9, "Shampoo 500Cc", 1200, 43, Categoria.PERFUMERIA));

    }

}
