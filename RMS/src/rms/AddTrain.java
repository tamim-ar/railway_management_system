
package rms;



import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author LubnA
 */
public class AddTrain extends javax.swing.JFrame {
       Connection connect = jconnection.ConnecrDB();
       PreparedStatement pst = null;
       ResultSet rs = null;

    /**
     * Creates new form AddTrain
     */
    public AddTrain() {
        initComponents();
        connect = jconnection.ConnecrDB();
        Add_Train();
    }
    public void Add_Train(){
        
            try {
                pst = connect.prepareStatement("select * from addtrain");
                rs = pst.executeQuery();
                ResultSetMetaData rsd =(ResultSetMetaData)rs.getMetaData();
                int c;
                c = rsd.getColumnCount();
                DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                d.setRowCount(0);
                while(rs.next())
                {
                    Vector v = new Vector();
                    for(int i =0; i<c; i++)
                    {
                      v.add(rs.getString("tno"));
                      v.add(rs.getString("tname"));
                      v.add(rs.getString("splace"));
                      v.add(rs.getString("desplace"));
                      v.add(rs.getString("price"));
                        
                    }
                    d.addRow(v);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddTrain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttrainno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtstart = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdestination = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        addtrain1 = new javax.swing.JButton();
        txtedit = new javax.swing.JButton();
        txtdel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtreset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Train No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));
        jPanel1.add(txttrainno, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 53, 215, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Train Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, 86, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Start Place");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 198, -1, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 127, 215, -1));
        jPanel1.add(txtstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 197, 215, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Destination Place");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 267, 118, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 334, -1, -1));
        jPanel1.add(txtdestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 266, 215, -1));
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 333, 215, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 380, 450));

        addtrain1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addtrain1.setText("AddTrain");
        addtrain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtrain1ActionPerformed(evt);
            }
        });
        getContentPane().add(addtrain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 615, -1, 39));

        txtedit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtedit.setText("Edit");
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });
        getContentPane().add(txtedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 615, 87, 39));

        txtdel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtdel.setText("Delete");
        txtdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdelActionPerformed(evt);
            }
        });
        getContentPane().add(txtdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 615, 85, 39));

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Train No", "Train Name", "Start Place", "Destination Place", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 132, 609, 450));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setText("Add Train");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 79, 150, -1));

        txtreset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtreset.setLabel("Reset");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });
        getContentPane().add(txtreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 615, 85, 39));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, 73, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 23, 73, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/railway-station-and-beautiful-sky-at-sunset-railro-ZCB5E4L-1-1-1024x681.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addtrain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtrain1ActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO addtrain (tno, tname, splace, desplace, price) VALUES (?, ?, ?, ?, ?)";
        
      
            try {
                pst = connect.prepareCall(sql);
                pst.setString(1, txttrainno.getText());
                pst.setString(2, txtname.getText());
                pst.setString(3, txtstart.getText());
                pst.setString(4, txtdestination.getText());
                pst.setString(5, txtprice.getText());
                
                pst.execute();
                
                
                txttrainno.setText(null);
                txtname.setText(null);
                txtstart.setText(null);
                txtdestination.setText(null);
                txtprice.setText(null);
                Add_Train();
                
                
                
                
                
                
                JOptionPane.showMessageDialog(null, "Admin Added Successfully");
                
            } catch (SQLException ex) {
                Logger.getLogger(AddTrain.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
            
         
    }//GEN-LAST:event_addtrain1ActionPerformed

    private void txtdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdelActionPerformed
        // TODO add your handling code here:
        String tno = txttrainno.getText();
       
        
        
            try {
                pst = connect.prepareStatement("delete from addtrain where tno =? ");
                
                     pst.setString(1, tno);
                     int k = pst.executeUpdate();
                     
                     if(k==1)
                     {
                         JOptionPane.showMessageDialog(this, "Record Deleted");
                     }
                     else{
                          JOptionPane.showMessageDialog(this, "Record Failed");
                     }
                     txttrainno.setText("");
                     txtname.setText("");
                     txtstart.setText("");
                     txtdestination.setText("");
                     txtprice.setText("");
                     
                     txttrainno.requestFocus();
                      Add_Train();
                     
                     
                     
                     
                 
                     
                
                
                
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_txtdelActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
         
         int selectIndex = jTable1.getSelectedRow();
         txttrainno.setText(d.getValueAt(selectIndex,0).toString());
         txtname.setText(d.getValueAt(selectIndex,1).toString());
         txtstart.setText(d.getValueAt(selectIndex,2).toString());
         txtdestination.setText(d.getValueAt(selectIndex,3).toString());
         txtprice.setText(d.getValueAt(selectIndex,4).toString());
           
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
        // TODO add your handling code here:
        String tno = txttrainno.getText();
        String tname = txtname.getText();
        String splace = txtstart.getText();
        String desplace = txtdestination.getText();
        String price = txtprice.getText();
        
        
        
            try {
                pst = connect.prepareStatement("update addtrain set tname =?,splace=?,desplace =?,price =? where tno =?");
                pst.setString(1, tname);
                 pst.setString(2, splace);
                  pst.setString(3,desplace);
                   pst.setString(4, price);
                     pst.setString(5, tno);
                     int k = pst.executeUpdate();
                     
                     if(k==1)
                     {
                         JOptionPane.showMessageDialog(this, "Record Updated");
                     }
                     else{
                          JOptionPane.showMessageDialog(this, "Record Failed");
                     }
                     txttrainno.setText("");
                     txtname.setText("");
                     txtstart.setText("");
                     txtdestination.setText("");
                     txtprice.setText("");
                     
                     txttrainno.requestFocus();
                      Add_Train();
                     
                     
                     
                     
                 
                     
                
                
                
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_txteditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Admindashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtrain1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtdel;
    private javax.swing.JTextField txtdestination;
    private javax.swing.JButton txtedit;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JButton txtreset;
    private javax.swing.JTextField txtstart;
    private javax.swing.JTextField txttrainno;
    // End of variables declaration//GEN-END:variables
}
