/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Bharat
 */
public class issueBook extends javax.swing.JFrame {

    /**
     * Creates new form issueBook
     */
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public issueBook() {
        super("Issue Book");
        initComponents();
        conn = databaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookId = new javax.swing.JTextField();
        studentId = new javax.swing.JTextField();
        issueDate = new com.toedter.calendar.JDateChooser();
        dueDate = new com.toedter.calendar.JDateChooser();
        issue = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 170));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 116, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 202, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Due Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 242, -1, -1));

        bookId.setBackground(new java.awt.Color(255, 255, 204));
        bookId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdActionPerformed(evt);
            }
        });
        getContentPane().add(bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 110, 200, -1));

        studentId.setBackground(new java.awt.Color(255, 255, 204));
        studentId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 154, 200, -1));

        issueDate.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 200, 200, -1));

        dueDate.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 240, 200, -1));

        issue.setBackground(new java.awt.Color(255, 255, 204));
        issue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        issue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/issue book.png"))); // NOI18N
        issue.setText("Issue");
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        getContentPane().add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 303, -1, -1));

        cancel.setBackground(new java.awt.Color(255, 255, 204));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/red-x-mark-transparent-background-3.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 303, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/123456.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy");
        String bkId = bookId.getText();
        String stdId = studentId.getText();
        String issue = dFormat.format(issueDate.getDate());
        String due = dFormat.format(dueDate.getDate());
        String returnBook = "no";
        
        try
        {
            String sql = null;
            stmt = conn.createStatement();
            sql = "select * from books where bookId = '"+bkId+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                sql = "select * from student where studentID= '"+stdId+"'";
                rs = stmt.executeQuery(sql);
                if(rs.next())
                {
                    sql = "insert into issue(bookID, studentID, issueDate, dueDate, returnBook) values('"+bkId+"', '"+stdId+"', '"+issue+"', '"+due+"', '"+returnBook+"')";
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Book Issed successfully!!");
                    setVisible(false);
                    new issueBook().setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Student NOT Found!!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Not Available!!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection error!!");
            setVisible(false);
            new newBook().setVisible(true);
        }
    }//GEN-LAST:event_issueActionPerformed

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
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookId;
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser dueDate;
    private javax.swing.JButton issue;
    private com.toedter.calendar.JDateChooser issueDate;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField studentId;
    // End of variables declaration//GEN-END:variables
}
