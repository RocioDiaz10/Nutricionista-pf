/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.vistas;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import nutricionista.accesodatos.ComidaData;
import nutricionista.accesodatos.DietaComidaData;
import nutricionista.accesodatos.DietaData;
import nutricionista.accesodatos.PacienteData;
import nutricionista.entidades.Comida;
import nutricionista.entidades.Dieta;
import nutricionista.entidades.DietaComida;
import nutricionista.entidades.Paciente;


public class ComidaXDieta extends javax.swing.JInternalFrame {
 private Connection con=null;
    
 
    private Dieta diet;
    private Comida comid;
    private DietaComida comxdieta;
    
    private List<Comida>ListaC;
    private List <Dieta>ListaD;
    
    private DietaComidaData dcData;
    private ComidaData cData;
    private DietaData DData;
    
  private DefaultTableModel tabla= new DefaultTableModel();
  
    public ComidaXDieta() {
        initComponents();
        
        DData= new DietaData();
        ListaD=(ArrayList<Dieta>)DData.ListDieta();
        dcData= new DietaComidaData();
        cData=new ComidaData();
        
        cargaDietas();
        armarTabla();
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jCDieta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRcomidaIncluida = new javax.swing.JRadioButton();
        jRcomidaNo = new javax.swing.JRadioButton();
        jBincluir = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTcomidas = new javax.swing.JTable();
        jBmodificar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Dieta");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Lista Comidas");

        jRcomidaIncluida.setText("Comidas Incluidas");
        jRcomidaIncluida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcomidaIncluidaActionPerformed(evt);
            }
        });

        jRcomidaNo.setText("Comidas No Incluidas");
        jRcomidaNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcomidaNoActionPerformed(evt);
            }
        });

        jBincluir.setText("INCLUIR");
        jBincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBincluirActionPerformed(evt);
            }
        });

        jBexcluir.setText("EXCLUIR");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jTcomidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTcomidas);

        jBmodificar.setText("MODIFICAR");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCDieta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRcomidaIncluida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRcomidaNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBincluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBexcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBexcluir)
                    .addComponent(jBincluir)
                    .addComponent(jBmodificar))
                .addGap(18, 18, 18))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jRcomidaIncluida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRcomidaNo)
                        .addGap(39, 39, 39))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRcomidaNo)
                    .addComponent(jRcomidaIncluida))
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(jBincluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBmodificar)
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRcomidaIncluidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcomidaIncluidaActionPerformed
       borrarFilasTablas();
      jRcomidaIncluida.setSelected(true); 
          jRcomidaNo.setSelected(false);
       cargarDatosIncluidas();
       jBexcluir.setEnabled(true);
       jBincluir.setEnabled(false);
        
        
        
    }//GEN-LAST:event_jRcomidaIncluidaActionPerformed

    private void jBincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBincluirActionPerformed
       int filasSeleccionadas=jTcomidas.getSelectedRow();
        if (filasSeleccionadas!=-1){
            Dieta a=(Dieta)jCDieta.getSelectedItem();
            int id_comida= (Integer)tabla.getValueAt(filasSeleccionadas, 0);
            String nombre= (String)tabla.getValueAt(filasSeleccionadas, 1);
            String detalle= (String)tabla.getValueAt(filasSeleccionadas, 2);
            int cantCalorias= (Integer)tabla.getValueAt(filasSeleccionadas, 3);
            
            Comida c= new Comida(id_comida,nombre,detalle,cantCalorias);// comida recuperada de la tabla
            
            DietaComida i= new DietaComida(c, a);
            dcData.GuardarDietaComida(i);
            borrarFilasTablas();
                                     
    }//GEN-LAST:event_jBincluirActionPerformed
    }
    private void jRcomidaNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcomidaNoActionPerformed
       borrarFilasTablas();
      jRcomidaNo.setSelected(true); //se desactiva el boton comidas incluidas
      jRcomidaIncluida.setSelected(false); 
       cargarDatosNoIncluidas();// se llama al metodo
       jBexcluir.setEnabled(false);// habilita los botones incluir y deshabilita el otro
       jBincluir.setEnabled(true);
    }//GEN-LAST:event_jRcomidaNoActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
int filasSeleccionadas=jTcomidas.getSelectedRow();
        if (filasSeleccionadas!=-1){
            Dieta a=(Dieta)jCDieta.getSelectedItem();
            
            int id_comida= (Integer)tabla.getValueAt(filasSeleccionadas, 0);
            dcData.borrarIncluidasEnDieta(id_comida, a.getId_dieta());
            borrarFilasTablas();
            
      
        }
                }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed


    }//GEN-LAST:event_jBmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBincluir;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox<Dieta> jCDieta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRcomidaIncluida;
    private javax.swing.JRadioButton jRcomidaNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTcomidas;
    // End of variables declaration//GEN-END:variables

private void armarTabla(){
    ArrayList<Object> filaCabecera =new ArrayList<>();
filaCabecera.add("ID_COMIDA");
filaCabecera.add("NOMBRE");
filaCabecera.add("DETALLE");
filaCabecera.add("CANTIDAD CALORIAS");
for(Object it: filaCabecera){
    tabla.addColumn(it);
    
}
jTcomidas.setModel(tabla);

}
private void cargaDietas(){ //carga el combobox
    
    for(Dieta item:ListaD){
        
        jCDieta.addItem(item);
        
    }
}    
private void borrarFilasTablas(){
    int indice=tabla.getRowCount()-1;
    for (int i =indice ;i>=0;i--){
        tabla.removeRow(i);
    }



}

private void cargarDatosNoIncluidas(){
    
    Dieta selec= (Dieta)jCDieta.getSelectedItem();
    List <Comida> listaC=(ArrayList) dcData.comidaNoIncluida(selec.getId_dieta());
    
    for (Comida c: listaC){
      tabla.addRow(new Object[] { c.getId_comida() , c.getNombre() , c.getDetalle(), c.getCantCalorias() });
    }
}

private void cargarDatosIncluidas(){
    
   Dieta selec= (Dieta)jCDieta.getSelectedItem();
    List <Comida> listaC=(ArrayList)dcData.comidaIncluidas(selec.getId_dieta());
    
    for (Comida c: listaC){                     
      tabla.addRow(new Object[] { c.getId_comida() , c.getNombre() , c.getDetalle(), c.getCantCalorias() });
}
}
}

