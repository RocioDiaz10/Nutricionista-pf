/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.vistas;

/**
 *
 * @author facus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMFormularioComida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMPaciente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMFormularioDieta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMBusquedaXComida = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenu1.setText("Comidas");

        jMFormularioComida.setText("Formulario Comida");
        jMFormularioComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioComidaActionPerformed(evt);
            }
        });
        jMenu1.add(jMFormularioComida);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Paciente");

        jMPaciente.setText("Formulario Paciente");
        jMPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMPaciente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Dieta");

        jMFormularioDieta.setText("Formulario Dieta");
        jMFormularioDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioDietaActionPerformed(evt);
            }
        });
        jMenu3.add(jMFormularioDieta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consulta");

        jMBusquedaXComida.setText("Busqueda por Comida");
        jMBusquedaXComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBusquedaXComidaActionPerformed(evt);
            }
        });
        jMenu4.add(jMBusquedaXComida);

        jMenuItem5.setText("Comida por Dieta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Salir");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPacienteActionPerformed
       jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioPaciente fp= new FormularioPaciente();
        fp.setVisible(true);
        jDesktopPane1.add(fp);
        jDesktopPane1.moveToFront(fp);
    }//GEN-LAST:event_jMPacienteActionPerformed

    private void jMFormularioComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioComidaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioComida fc= new FormularioComida();
        fc.setVisible(true);
        jDesktopPane1.add(fc);
        jDesktopPane1.moveToFront(fc);
    }//GEN-LAST:event_jMFormularioComidaActionPerformed

    private void jMFormularioDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioDietaActionPerformed
     jDesktopPane1.removeAll();
     jDesktopPane1.repaint();    
     FormularioDieta fd= new FormularioDieta();
     fd.setVisible(true);
     jDesktopPane1.add(fd);
     jDesktopPane1.moveToFront(fd);
     
    }//GEN-LAST:event_jMFormularioDietaActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ComidaXDieta cxd= new ComidaXDieta();
        cxd.setVisible(true);
        jDesktopPane1.add(cxd);
        jDesktopPane1.moveToFront(cxd);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMBusquedaXComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBusquedaXComidaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        BusquedaXComida bxc= new BusquedaXComida();
        bxc.setVisible(true);
        jDesktopPane1.add(bxc);
        jDesktopPane1.moveToFront(bxc);
               
    }//GEN-LAST:event_jMBusquedaXComidaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMBusquedaXComida;
    private javax.swing.JMenuItem jMFormularioComida;
    private javax.swing.JMenuItem jMFormularioDieta;
    private javax.swing.JMenuItem jMPaciente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
