/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author the_g
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
     //   private IBMW app;
   // private Parametros param;

    /*public Interfaz() {
        initComponents();
        
        this.app = new );
        this.param = this.app.getParam();
        this.inicializarParametros(param);

        Timer timer = new Timer(1, (ActionEvent ae) -> { // Actualizar interfaz cada 1ms (0,001s)
            this.actualizarInterfaz();
            
        });
        timer.start();
    }*/

    public Interfaz() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Grupo_1.add(Op_Pro);
        Grupo_1.add(Op_En);
        Grupo_1.add(Op_Al);
        Grupo_1.add(Op_Ca);
        Grupo_1.add(Op_Di);
       
        Timer timer = new Timer(1, (ActionEvent ae) -> { // Actualizar interfaz cada 1ms (0,001s)
            this.actualizarInterfaz();
            
        });
        timer.start();
       
    }
        Jefe j = new Jefe();
        ProdMotor pm = new ProdMotor();
        ProdParabrisas pp = new ProdParabrisas ();
        ProdRuedas pr = new ProdRuedas ();
           Ensambladores ensa=new Ensambladores();
           Gerente ge = new Gerente();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Op_Pro = new javax.swing.JRadioButton();
        Op_En = new javax.swing.JRadioButton();
        Op_Al = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        Op_Ca = new javax.swing.JRadioButton();
        Op_Di = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CR = new javax.swing.JTextField();
        CM = new javax.swing.JTextField();
        CP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DRest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EsJefe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EsGe = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        AddPro = new javax.swing.JButton();
        DisPro = new javax.swing.JButton();
        AddEn = new javax.swing.JButton();
        DisEn = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel2.setText("PICASIMO MOTORS");

        Op_Pro.setText("Productores Ruedas");
        Op_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_ProActionPerformed(evt);
            }
        });

        Op_En.setText("Ensambladores");

        Op_Al.setText("Almacen");

        jLabel1.setText("Seleccione parametro a consultar:");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Op_Ca.setText("Carros listos");

        Op_Di.setText("Dias Restantes");

        jButton1.setText("Leer Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ruedas ");

        jLabel5.setText("Parabrisas ");

        jLabel6.setText("Motores");

        CR.setEditable(false);
        CR.setBackground(new java.awt.Color(255, 255, 255));
        CR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRActionPerformed(evt);
            }
        });

        CM.setEditable(false);
        CM.setBackground(new java.awt.Color(255, 255, 255));
        CM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMActionPerformed(evt);
            }
        });

        CP.setEditable(false);
        CP.setBackground(new java.awt.Color(255, 255, 255));
        CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPActionPerformed(evt);
            }
        });

        jLabel7.setText("Disponible en Almacen:");

        DRest.setEditable(false);
        DRest.setBackground(new java.awt.Color(255, 255, 255));
        DRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRestActionPerformed(evt);
            }
        });

        jLabel8.setText("Dias Restantes:");

        EsJefe.setEditable(false);
        EsJefe.setBackground(new java.awt.Color(255, 255, 255));
        EsJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsJefeActionPerformed(evt);
            }
        });

        jLabel9.setText("Jefe");

        jLabel10.setText("Gerente");

        EsGe.setEditable(false);
        EsGe.setBackground(new java.awt.Color(255, 255, 255));
        EsGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsGeActionPerformed(evt);
            }
        });

        jLabel11.setText("Estado actual de:");

        jLabel12.setText("Contratar y despedir empelados:");

        jLabel13.setText("Productores");

        jLabel14.setText("Ensambladores");

        AddPro.setText("+");
        AddPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProActionPerformed(evt);
            }
        });

        DisPro.setText("-");

        AddEn.setText("+");

        DisEn.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(DRest, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(115, 115, 115))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Op_Pro)
                            .addComponent(Op_En)
                            .addComponent(Op_Al)
                            .addComponent(Op_Di)
                            .addComponent(Op_Ca)
                            .addComponent(Consultar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addGap(311, 311, 311))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(233, 233, 233))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AddEn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AddPro))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DisPro, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(DisEn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EsJefe, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(EsGe))
                .addGap(184, 184, 184))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jButton1)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)))
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op_Pro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Op_En)
                    .addComponent(jLabel4)
                    .addComponent(CR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Op_Al)
                    .addComponent(jLabel5)
                    .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Op_Ca)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op_Di)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Consultar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(EsJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EsGe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(AddPro)
                    .addComponent(DisPro))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(AddEn)
                    .addComponent(DisEn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DRest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(64, 64, 64))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Op_ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_ProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Op_ProActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
        String mensaje = "";
        
        if(Op_Pro.isSelected()){
            mensaje = "La cantidad de Productores es: ";
        }else if(Op_En.isSelected()){
            mensaje = "La cantidad de Ensambladores es: ";
        }else if(Op_Al.isSelected()){
            mensaje = "La cantiadad de elementos en el almacen es: ";
        }else if(Op_Ca.isSelected()){
            mensaje = "La cantidad de carros listos es: ";
        }else if(Op_Di.isSelected()){
            mensaje = "La cantidad de dias para el despacho es: ";
        }else{
            mensaje = "No se selcciono ninguna opcion";
        }
        JOptionPane.showMessageDialog(this, mensaje);
        
        
    }//GEN-LAST:event_ConsultarActionPerformed
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Archivo a = new Archivo();
        a.LeerTxt("C:\\texto\\Hola");
        JOptionPane.showMessageDialog(this,a);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRActionPerformed

    private void CMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMActionPerformed

    private void CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPActionPerformed

    private void DRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRestActionPerformed
        
        int d = 85;
        
        
        this.DRest.setText(String.valueOf(d));
        System.out.print(j.getDiaD());
        
        
        
       
    }//GEN-LAST:event_DRestActionPerformed

    private void EsJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsJefeActionPerformed

    private void EsGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsGeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsGeActionPerformed

    private void AddProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddProActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    public void actualizarInterfaz(){
        //Actualizar interfaz
        this.DRest.setText(String.valueOf(j.getDiaD()));
        this.CR.setText(String.valueOf(ensa.getcsntR()));
         this.CP.setText(String.valueOf(ensa.getcsntP()));
          this.CM.setText(String.valueOf(ensa.getcsntM()));
        this.EsGe.setText(ge.evaluar());
        this.EsJefe.setText(j.evaluar());
        
        
//        this.mesonPF.setText(String.valueOf(app.getMesonPF().getCantUnidades()));
//        this.mesonP.setText(String.valueOf(app.getMesonP().getCantUnidades()));
//        
//        //Actualizar cocineros y mesoneros
//        this.cocinerosE.setText(String.valueOf(app.getCantCocinerosE()));
//        this.cocinerosPF.setText(String.valueOf(app.getCantCocinerosPF()));
//        this.cocinerosP.setText(String.valueOf(app.getCantCocinerosP()));
//        this.mesoneros.setText(String.valueOf(app.getCantMesoneros()));
//        
//        
//        
//        //Actualizar ordenes armadas
//        this.ordenesAtendidas.setText(String.valueOf(AplicacionRestaurante.getOrdenesArmadas()));
//        
//        //Actualizar cronometrador
//        this.cronometrador.setText(app.getCronometrador().getStatus());
//        
//        //Actualizar gerente
//        this.gerente.setText(app.getGerente().getStatus());
//                
//        //Actualizar horas para el cierre 
//        this.horas.setText(String.valueOf(app.getCronometrador().getContador()));
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEn;
    private javax.swing.JButton AddPro;
    private javax.swing.JTextField CM;
    private javax.swing.JTextField CP;
    private javax.swing.JTextField CR;
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField DRest;
    private javax.swing.JButton DisEn;
    private javax.swing.JButton DisPro;
    private javax.swing.JTextField EsGe;
    private javax.swing.JTextField EsJefe;
    private javax.swing.ButtonGroup Grupo_1;
    private javax.swing.JRadioButton Op_Al;
    private javax.swing.JRadioButton Op_Ca;
    private javax.swing.JRadioButton Op_Di;
    private javax.swing.JRadioButton Op_En;
    private javax.swing.JRadioButton Op_Pro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
