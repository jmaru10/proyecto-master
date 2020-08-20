
package frm;

import javax.swing.JOptionPane;
import orgplus.OrgPLUS;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Toolkit;
import java.awt.Window.Type;

/**
 *
 * @author jmarulanda
 */
@SuppressWarnings("serial")
public class MarcasUMMPLUS extends javax.swing.JFrame {

    OrgPLUS Org = new OrgPLUS();
    plantilla plan= new plantilla(); 
    public  static String marca;
    public static int numero;
 
  public MarcasUMMPLUS() {
  	setIconImage(Toolkit.getDefaultToolkit().getImage(MarcasUMMPLUS.class.getResource("/icono/descarga.png")));
        initComponents();
        setLocationRelativeTo(null);
  this.setResizable(false);       
  }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnYerbabuena = new javax.swing.JButton();
        BtnPacifika = new javax.swing.JButton();
        BtnCarmel = new javax.swing.JButton();
        BtnLoguin = new javax.swing.JButton();
        BtnRealHuman = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LblPLU = new javax.swing.JLabel();
        TxtNumeroPLU = new javax.swing.JTextField();

        jButton4.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UMMPlus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(131, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
        			.addGap(185))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnYerbabuena.setBackground(new java.awt.Color(255, 255, 255));
        BtnYerbabuena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnYerbabuena.setText("YBNA");
        BtnYerbabuena.setMaximumSize(new java.awt.Dimension(50, 40));
        BtnYerbabuena.setMinimumSize(new java.awt.Dimension(50, 40));
        BtnYerbabuena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnYerbabuenaActionPerformed(evt);
            }
        });

        BtnPacifika.setBackground(new java.awt.Color(255, 255, 255));
        BtnPacifika.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnPacifika.setText("PCKA");
        BtnPacifika.setMaximumSize(new java.awt.Dimension(50, 40));
        BtnPacifika.setMinimumSize(new java.awt.Dimension(50, 40));
        BtnPacifika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPacifikaActionPerformed(evt);
            }
        });

        BtnCarmel.setBackground(new java.awt.Color(255, 255, 255));
        BtnCarmel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCarmel.setText("CRML");
        BtnCarmel.setName(""); // NOI18N
        BtnCarmel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarmelActionPerformed(evt);
            }
        });

        BtnLoguin.setBackground(new java.awt.Color(255, 255, 255));
        BtnLoguin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnLoguin.setText("LGIN");
        BtnLoguin.setMaximumSize(new java.awt.Dimension(50, 40));
        BtnLoguin.setMinimumSize(new java.awt.Dimension(50, 40));
        BtnLoguin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoguinActionPerformed(evt);
            }
        });

        BtnRealHuman.setBackground(new java.awt.Color(255, 255, 255));
        BtnRealHuman.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRealHuman.setText("REAL");
        BtnRealHuman.setMaximumSize(new java.awt.Dimension(50, 40));
        BtnRealHuman.setMinimumSize(new java.awt.Dimension(50, 40));
        BtnRealHuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRealHumanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BtnCarmel)
                .addGap(18, 18, 18)
                .addComponent(BtnLoguin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnPacifika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnYerbabuena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnRealHuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCarmel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(BtnLoguin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnPacifika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnYerbabuena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnRealHuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LblPLU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblPLU.setText("Ingrese el ultimo numero de PLU utilizado ");

        TxtNumeroPLU.setText("0");
        TxtNumeroPLU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroPLUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPLU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNumeroPLU)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPLU, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(TxtNumeroPLU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
	private void BtnPacifikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPacifikaActionPerformed
          numero = Integer.parseInt(TxtNumeroPLU.getText());
         
        if(Integer.parseInt(TxtNumeroPLU.getText())!= 0 && Integer.parseInt(TxtNumeroPLU.getText()) > 258330){
         marca="PCFK1";
         plantilla jframe = new plantilla();
         jframe.show();
         dispose();
         }
        if(Integer.parseInt(TxtNumeroPLU.getText())== 0)
         JOptionPane.showMessageDialog(null, " el campo PLU esta vacio");
          else 
        if(Integer.parseInt(TxtNumeroPLU.getText()) < 258330)
         JOptionPane.showMessageDialog(null, "numero de PLU invalido");
 
    }//GEN-LAST:event_BtnPacifikaActionPerformed

    @SuppressWarnings("deprecation")
	private void BtnCarmelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarmelActionPerformed
          numero = Integer.parseInt(TxtNumeroPLU.getText());
          if(Integer.parseInt(TxtNumeroPLU.getText())!= 0 && Integer.parseInt(TxtNumeroPLU.getText()) > 258330){
         marca="CRML1";
         plantilla jframe = new plantilla();
         jframe.show();
         dispose();
          }
          if(Integer.parseInt(TxtNumeroPLU.getText())== 0)
         JOptionPane.showMessageDialog(null, " el campo PLU esta vacio");
          else 
        if(Integer.parseInt(TxtNumeroPLU.getText()) < 258330)
         JOptionPane.showMessageDialog(null, "numero de PLU invalido");
    }//GEN-LAST:event_BtnCarmelActionPerformed

    @SuppressWarnings("deprecation")
	private void BtnYerbabuenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnYerbabuenaActionPerformed
         numero = Integer.parseInt(TxtNumeroPLU.getText());
         if(Integer.parseInt(TxtNumeroPLU.getText())!= 0 && Integer.parseInt(TxtNumeroPLU.getText()) > 258330){
         marca="YBNA1";
         
         plantilla jframe = new plantilla();
         jframe.show();
         dispose();
         }
         if(Integer.parseInt(TxtNumeroPLU.getText())== 0)
         JOptionPane.showMessageDialog(null, " el campo PLU esta vacio");
          else 
        if(Integer.parseInt(TxtNumeroPLU.getText()) < 258330)
         JOptionPane.showMessageDialog(null, "numero de PLU invalido");
    }//GEN-LAST:event_BtnYerbabuenaActionPerformed

    @SuppressWarnings("deprecation")
	private void BtnLoguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoguinActionPerformed
         numero = Integer.parseInt(TxtNumeroPLU.getText());
         if(Integer.parseInt(TxtNumeroPLU.getText())!= 0 && Integer.parseInt(TxtNumeroPLU.getText()) >258330){
          marca="LGIN1";
 
          plantilla jframe = new plantilla();
          jframe.show();
          dispose();
         }
         if(Integer.parseInt(TxtNumeroPLU.getText())== 0)
         JOptionPane.showMessageDialog(null, " el campo PLU esta vacio");
          else 
        if(Integer.parseInt(TxtNumeroPLU.getText()) < 258330)
         JOptionPane.showMessageDialog(null, "numero de PLU invalido");
    }//GEN-LAST:event_BtnLoguinActionPerformed
 
    private void TxtNumeroPLUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroPLUActionPerformed
      
    }//GEN-LAST:event_TxtNumeroPLUActionPerformed

    @SuppressWarnings("deprecation")
	private void BtnRealHumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealHumanActionPerformed
        
        numero = Integer.parseInt(TxtNumeroPLU.getText());
         if(Integer.parseInt(TxtNumeroPLU.getText())!= 0 && Integer.parseInt(TxtNumeroPLU.getText()) >258330){
          marca="REAL1";
 
          plantilla jframe = new plantilla();
          jframe.show();
          dispose();
         }
         if(Integer.parseInt(TxtNumeroPLU.getText())== 0)
         JOptionPane.showMessageDialog(null, " el campo PLU esta vacio");
          else 
        if(Integer.parseInt(TxtNumeroPLU.getText()) < 258330)
         JOptionPane.showMessageDialog(null, "numero de PLU invalido");
    }//GEN-LAST:event_BtnRealHumanActionPerformed

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
            java.util.logging.Logger.getLogger(MarcasUMMPLUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcasUMMPLUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcasUMMPLUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcasUMMPLUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MarcasUMMPLUS().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnCarmel;
    public static javax.swing.JButton BtnLoguin;
    public static javax.swing.JButton BtnPacifika;
    public static javax.swing.JButton BtnRealHuman;
    public static javax.swing.JButton BtnYerbabuena;
    private javax.swing.JLabel LblPLU;
    public static javax.swing.JTextField TxtNumeroPLU;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
