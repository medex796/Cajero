/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
/**
 *
 * @author Jhonny
 */
public class Cuentas extends javax.swing.JFrame {

    /**
     * Creates new form Cuentas
     */
    public Cuentas() {
        initComponents();
    }
    public Principal principal = new Principal();
    public String usuario = "null";
    
    public Cuentas(String usu) {
        initComponents();
        this.usuario=usu;
        cargar();
        cargarCuentas(usu);
        
    }
    public String nombreMoneda(String tipoMoneda){
        String res;
        res = "";
        if(tipoMoneda.equals("Dolares")){
            res = "Dollars";
            
        }else{
            res = "Bolivians";
        }
        return res;
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
        jLabel5 = new javax.swing.JLabel();
        btnAgregarCuenta = new javax.swing.JButton();
        btnCambiarContraseña = new javax.swing.JButton();
        panelCuentas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ELIJA CON QUE CUENTA DESEA HACER LAS OPERACIONES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 533, 76));

        btnAgregarCuenta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAgregarCuenta.setText("AGREGAR CUENTA");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 357, -1, -1));

        btnCambiarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCambiarContraseña.setText("CAMBIAR CONTRASEÑA");
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 357, -1, -1));

        javax.swing.GroupLayout panelCuentasLayout = new javax.swing.GroupLayout(panelCuentas);
        panelCuentas.setLayout(panelCuentasLayout);
        panelCuentasLayout.setHorizontalGroup(
            panelCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        panelCuentasLayout.setVerticalGroup(
            panelCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(panelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 560, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 658, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cargarCuentas(String usu){
        if(!principal.getListaCuenta().isEmpty()){
            panelCuentas.setLayout(new GridLayout(0, 1));
                for(int i =0;principal.getListaCuenta().size()>i;i++){
                    if(principal.getListaCuenta().get(i).getUsuario().equals(usu)){
                    JButton button = new JButton( String.valueOf(principal.getListaCuenta().get(i).getNumeroCuenta())+nombreMoneda(principal.getListaCuenta().get(i).getMoneda()));
                            int numeroCuentaAux=principal.getListaCuenta().get(i).getNumeroCuenta();
                        // Agregar un ActionListener al botón
                      button.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                           Menu menu = new Menu(usuario,numeroCuentaAux);
                          menu.setVisible(true);
                          menu.setLocationRelativeTo(null);
                          dispose();
                      }
                       });
                      button.setPreferredSize(new Dimension (309, 39));
                      
                     panelCuentas.add(button);
                
                
                    }
                }
        
        }
    
    
    }
    private void cargar (){
       
       FileInputStream archivo = null; // variable para leer datos de un arcchivo txt 
        ObjectInputStream convertidorarchivo = null;// variable que permitira en este caso sacar datos del archivo txt 

        try {
            archivo = new FileInputStream("D://ficherocajero3.txt");//llama al constructor que permite leer el archivo donde le pasamos la unbicacion del archivo 
            convertidorarchivo = new ObjectInputStream(archivo);// llamamos al constructor que permitira sacar datos del archivo donde le pasamos el archivo de donde queremos sacar los datos
               
                principal= (Principal)convertidorarchivo.readObject(); //agregamos ala lista el objeto que sacamos del archivo txt 
             
        }catch (IOException ex){// excepcion que nos ayuda si no encuentra el archivo 
          
            File archivos = new File ("D://ficherocajero3.txt"); // SI NO ENCUENTRA EL ARCHIVO SE CREARA UN NUEVO ARCHIVO 
        }catch (ClassNotFoundException cnfe)//ndica que Java no puede encontrar una clase específica en tiempo de ejecución, lo que generalmente ocurre debido a problemas como errores en el nombre de la clase
                {
                    cnfe.printStackTrace();
                }
       
       
       
       }
    private void actualizarLista() {
        try {
           
            FileOutputStream ficherosalida =new FileOutputStream ("D://ficherocajero3.txt") ; 
            ObjectOutputStream  convertidor = new ObjectOutputStream (ficherosalida);
            
                convertidor.writeObject(principal);
            
            convertidor.close();
            ficherosalida.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        crearCuenta cuenta = new crearCuenta (usuario);
        cuenta.setVisible(true);
        cuenta.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed
        cambioContrasena ventana =new cambioContrasena(usuario);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCuentas;
    // End of variables declaration//GEN-END:variables
}
