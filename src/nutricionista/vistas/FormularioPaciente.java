/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import nutricionista.accesodatos.PacienteData;
import nutricionista.entidades.Paciente;

/**
 *
 * @author facus
 */
public class FormularioPaciente extends javax.swing.JInternalFrame {

    private PacienteData pacienteData= new PacienteData();
    private Paciente pacienteActual=null;
    public FormularioPaciente() {
        initComponents();
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLFormulario = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLdni = new javax.swing.JLabel();
        jLDomicilio = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jTDni = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTCelular = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jLFormulario.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        jLFormulario.setText("Formulario Paciente");

        jLNombre.setText("Nombre");

        jLApellido.setText("Apellido");

        jLdni.setText("DNI");

        jLDomicilio.setText("Domicilio");

        jLCelular.setText("Celular");

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLdni, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                        .addComponent(jLDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTApellido)
                                .addComponent(jTNombre)
                                .addComponent(jTDomicilio)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                    .addComponent(jBBuscar))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jBModificar)
                        .addGap(27, 27, 27)
                        .addComponent(jBEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpiar)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLFormulario)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLdni)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jBBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNombre)
                        .addGap(29, 29, 29)
                        .addComponent(jLApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCelular)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBLimpiar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
         int dni= Integer.parseInt(jTDni.getText());
         String nombre= jTNombre.getText();
         String apellido= jTApellido.getText();
         String domicilio=jTDomicilio.getText();
         int celular=Integer.parseInt(jTCelular.getText());
        
        if(apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty()){
            JOptionPane.showMessageDialog(this, "Campo Vacio. Completar todos los datos");
            return;
        }
        
        
                
        if(pacienteActual==null){
            pacienteActual=new Paciente( nombre,  apellido,  dni,  domicilio, celular);
            pacienteData.guardarPaciente(pacienteActual);
            
        }
       



        // TODO add your handling code here:
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        
        if(pacienteActual!=null){
            
            pacienteData.eliminarPaciente(pacienteActual.getDni());
            pacienteActual=null;
            limpiarCampos();
            
        }else
            JOptionPane.showMessageDialog(this, "no existe el paciente");
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        
       try{
        int dni= Integer.parseInt(jTDni.getText());
         String nombre= jTNombre.getText();
         String apellido= jTApellido.getText();
         String domicilio=jTDomicilio.getText();
         int celular=Integer.parseInt(jTCelular.getText());
         
         if(apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty()){
            JOptionPane.showMessageDialog(this, "Campo Vacio. Completar todos los datos");
            return;
        }
         
       pacienteActual.setDni(dni);
       pacienteActual.setNombre(nombre);
       pacienteActual.setApellido(apellido);
       pacienteActual.setDomicilio(domicilio);
       pacienteActual.setCelular(celular);
       
        
       pacienteData.modificarPaciente(pacienteActual);
     }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "ERROR. Debe ingresar el numero de DNI");
    }  
        
           
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
   
        try{
        int dni= Integer.parseInt(jTDni.getText());
      
        Paciente paciente= pacienteData.buscarPacienteDNI(dni);
        pacienteActual=pacienteData.buscarPacienteDNI(dni);
       
        if(pacienteActual!=null){
       
        jTNombre.setText(pacienteActual.getNombre());
        jTApellido.setText(pacienteActual.getApellido());
        jTDomicilio.setText(pacienteActual.getDomicilio());
        
        jTCelular.setText(String.valueOf(pacienteActual.getCelular()));
      
        }
        }catch (NumberFormatException ex){
          JOptionPane.showMessageDialog(this,"debe ingresar un numero valido");
      }
        
     
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
   
        limpiarCampos();
        pacienteActual=null;
        
    }//GEN-LAST:event_jBLimpiarActionPerformed

    
    
private void limpiarCampos(){
        
        jTDni.setText("");
        jTNombre.setText("");
        jTApellido.setText("");
        jTDomicilio.setText("");
        jTCelular.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLFormulario;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLdni;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
