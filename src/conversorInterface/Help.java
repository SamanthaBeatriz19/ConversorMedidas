/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorInterface;

import conversor.FileReader;


public class Help extends javax.swing.JFrame {


    public Help() {
        initComponents();
        myComponents();
        
        jTextPane1.setText(FileReader.getHelpText());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnHome_help = new javax.swing.JButton();
        btnHelp_help = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 380));
        setPreferredSize(new java.awt.Dimension(600, 300));
        setSize(new java.awt.Dimension(650, 300));

        panelLogo.setFont(new java.awt.Font("Gadugi", 0, 18));
        panelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversorInterface/logo-unicamp-t.png"))); // NOI18N
        panelLogo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unicamp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18))); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Gadugi", 0, 18)); 
        jScrollPane1.setViewportView(jTextPane1);

        jToolBar1.setRollover(true);

        btnHome_help.setText("Home");
        btnHome_help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome_help.setFocusable(false);
        btnHome_help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_helpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome_help);

        btnHelp_help.setText("Help");
        btnHelp_help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHelp_help.setFocusable(false);
        btnHelp_help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp_help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHelp_help);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myComponents() {
        setResizable(false);
        setLocationRelativeTo(null);
    }
    private void btnHome_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_helpActionPerformed
        
        new Home().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnHome_helpActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
                
            }
        });
    }

   
    
  
    private javax.swing.JButton btnHelp_help;
    private javax.swing.JButton btnHome_help;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel panelLogo;
}
