package conversorInterface;

@SuppressWarnings("serial")
public class Help extends javax.swing.JFrame{



    public Help() {
        initComponents();
    }

    
 
    private void initComponents() {

        windowJava = new javax.swing.JInternalFrame();
        panelLogo = new javax.swing.JLabel();
        panelText = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 333));

        windowJava.setVisible(true);

        panelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversorInterface/logo-unicamp-t.png"))); // NOI18N
        panelLogo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Unicamp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18))); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jTextPane1.setText("'Projeto II' - Group A - 4 \n\nGuilherme - Samantha - Alexandre - Juan ");
        jTextPane1.setOpaque(false);
        panelText.setViewportView(jTextPane1);

        javax.swing.GroupLayout windowJavaLayout = new javax.swing.GroupLayout(windowJava.getContentPane());
        windowJava.getContentPane().setLayout(windowJavaLayout);
        windowJavaLayout.setHorizontalGroup(
            windowJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowJavaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelText, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        windowJavaLayout.setVerticalGroup(
            windowJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowJavaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(windowJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLogo))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowJava)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowJava)
        );

        pack();
    }

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

    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JInternalFrame windowJava;
    private javax.swing.JLabel panelLogo;
    private javax.swing.JScrollPane panelText;
	

}
