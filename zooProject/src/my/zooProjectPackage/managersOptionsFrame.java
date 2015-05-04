/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * managersOptionsFrame.java
 *
 * Created on 25-Feb-2014, 20:53:46
 */

package my.zooProjectPackage;
/**
 *
 * @author patrick
 */
public class managersOptionsFrame extends javax.swing.JFrame {

    /** Creates new form managersOptionsFrame */
    public managersOptionsFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newAnimalEntryButton = new javax.swing.JButton();
        newStaffEntryButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        searchRecordsButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Options Frame");
        setMinimumSize(new java.awt.Dimension(710, 540));
        getContentPane().setLayout(null);

        newAnimalEntryButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        newAnimalEntryButton.setText("New Animal Entry");
        newAnimalEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAnimalEntryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newAnimalEntryButton);
        newAnimalEntryButton.setBounds(40, 60, 260, 40);

        newStaffEntryButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        newStaffEntryButton.setText("New Staff Entry");
        newStaffEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStaffEntryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newStaffEntryButton);
        newStaffEntryButton.setBounds(40, 190, 260, 40);

        logOutButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOutButton);
        logOutButton.setBounds(590, 470, 90, 27);

        searchRecordsButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        searchRecordsButton.setText("Search, Update & Delete Records");
        searchRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRecordsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchRecordsButton);
        searchRecordsButton.setBounds(40, 330, 260, 40);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/babyRhino(Edited2).jpg"))); // NOI18N
        backgroundImage.setMaximumSize(new java.awt.Dimension(800, 700));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 700, 510);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-716)/2, (screenSize.height-545)/2, 716, 545);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // When this button is clicked a New Frame Object called Frame is created & the User
        // is returned to the Main login Frame.
        loginFrame frame = new loginFrame();
        frame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void newStaffEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStaffEntryButtonActionPerformed
        // This code creates a new frame object that when called, activates the desired frame.
        newStaffEntryFrame frame = new newStaffEntryFrame();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_newStaffEntryButtonActionPerformed

    private void newAnimalEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAnimalEntryButtonActionPerformed
        // This code creates a new frame object that when called, activates the desired frame.
        newAnimalEntryFrame frame = new newAnimalEntryFrame();
        frame.setVisible(true);
        setVisible(false); 
    }//GEN-LAST:event_newAnimalEntryButtonActionPerformed

    private void searchRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRecordsButtonActionPerformed
        // This code changes the header text to show the below text in quotes. 
        searchUpdateDeleteFrame frame = new searchUpdateDeleteFrame();
        frame.setVisible(true);
        frame.searchResultsHeadingLabel.setText("        Manager Search Results");
        setVisible(false);
        dispose();
    }//GEN-LAST:event_searchRecordsButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managersOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton newAnimalEntryButton;
    private javax.swing.JButton newStaffEntryButton;
    private javax.swing.JButton searchRecordsButton;
    // End of variables declaration//GEN-END:variables

}