
package conversorInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import conversor.FindClasses;
import metrics.IMetrics;

@SuppressWarnings("serial")
public class Home extends javax.swing.JFrame {

 
    public Home() {
        initComponents();
        myInit();
    }
    
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        panelConvert = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelTo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnHome = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        txtValue = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        boxMetrics1 = new javax.swing.JComboBox<>();
        boxMetrics2 = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConvert.setBackground(new java.awt.Color(153, 153, 153));
        panelConvert.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); 
        jLabel1.setText("Convert:");

        javax.swing.GroupLayout panelConvertLayout = new javax.swing.GroupLayout(panelConvert);
        panelConvert.setLayout(panelConvertLayout);
        panelConvertLayout.setHorizontalGroup(
            panelConvertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConvertLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelConvertLayout.setVerticalGroup(
            panelConvertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConvertLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        panelTo.setBackground(new java.awt.Color(153, 153, 153));
        panelTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel2.setText("To:");

        javax.swing.GroupLayout panelToLayout = new javax.swing.GroupLayout(panelTo);
        panelTo.setLayout(panelToLayout);
        panelToLayout.setHorizontalGroup(
            panelToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelToLayout.setVerticalGroup(
            panelToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelToLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(54, 54, 54))
        );

        jToolBar1.setRollover(true);

        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHome);

        btnHelp.setText("Help");
        btnHelp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHelp);

        txtValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        boxMetrics1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        boxMetrics1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMetrics1ActionPerformed(evt);
            }
        });

        boxMetrics2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMetrics2ActionPerformed(evt);
            }
        });

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValue)
                        .addGap(18, 18, 18)
                        .addComponent(boxMetrics1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConvert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefresh))
                            .addComponent(boxMetrics2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(panelConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(boxMetrics1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConvert)
                            .addComponent(btnRefresh))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boxMetrics2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1))
                        .addGap(57, 57, 57))))
        );

        pack();
    }
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
       
     new Help().setVisible(true);
     dispose();
     
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       

        String selectedItem = (String) boxMetrics1.getSelectedItem();
       
        int index = selectedItem.indexOf("[");
        int lengthString = selectedItem.length() ;
        
        boxMetrics1.removeAllItems();

        if(index > -1 ){

            @SuppressWarnings("rawtypes")
			List<?> listClasse = new ArrayList();

            listClasse = FindClasses.ClassNames();

            for(int a=0;a<listClasse.size();a++) {

                String classe = (String) listClasse.get(a);

                int indexAbstractMet = classe.indexOf("AbstractMetric");
                int indexImetrics = classe.indexOf("IMetrics");



                if(indexAbstractMet == -1 && indexImetrics == -1){
                
                   String[] parts = classe.split("/");
                   String part1 = parts[0];
                   String[] parts2 = parts[1].split("\\.");
                   String part2 = parts2[0]; 

                    try {

                        Class<?> c = Class.forName(part1 + "." +part2);
                        Object obj = c.newInstance();
 
                        System.out.println("tipo " + obj.toString());
                        boxMetrics1.addItem(obj.toString());


                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } 

                }

            }

            boxMetrics1.setSelectedItem(selectedItem);
            
            int lengthCombo1 = boxMetrics1.getItemCount();
            boxMetrics2.removeAllItems();    
            
            boolean existsSelectedItem = false;
            
            for (int i = 0; i < lengthCombo1; i++) {
                String itemOfCombo = boxMetrics1.getItemAt(i);
                int indexCombo1 = itemOfCombo.indexOf(selectedItem);
                if(indexCombo1 > -1){
                    existsSelectedItem = true;
                }
            }
            
            if(!existsSelectedItem){
                selectedItem = (String) boxMetrics1.getItemAt(0);
                index = selectedItem.indexOf("[");
                lengthString = selectedItem.length();
            }
            
            String typeClass = selectedItem.substring(index,lengthString);
            
            for (int i = 0; i < lengthCombo1; i++) {

                String itemCombo1 = boxMetrics1.getItemAt(i);
                int indexCombo2 = itemCombo1.indexOf(typeClass);

                if(indexCombo2 > -1 ){
                    boxMetrics2.addItem(itemCombo1);
                }

            }
            
            boxMetrics1.setSelectedItem(selectedItem);
            
            

            
       }

    }

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
       
    
        String from = (String) boxMetrics1.getSelectedItem();
        String to = (String) boxMetrics2.getSelectedItem();
        String value = txtValue.getText();

        String[] parts;
        parts = from.split("\\(");
        String part1 = parts[0];
        Class<?> c;
        String[] parts2 = to.split("\\(");
        String part2 = parts2[0];
        

        try {
            
           c = Class.forName("metrics." + part1);
           Object obj = c.newInstance();
           IMetrics fromObj = (IMetrics) obj;
           Class<?> d = Class.forName("metrics." + part2);
           Object innerObj = d.newInstance();
           IMetrics toObj = (IMetrics) innerObj;
           jTextField1.setText( String.valueOf(toObj.Convert(fromObj, Double.parseDouble(value))));	

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnConvertActionPerformed

    private void boxMetrics1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMetrics1ActionPerformed
        
           
        boxMetrics2.removeAllItems();

        String selectedItem = (String) boxMetrics1.getSelectedItem();
        
        if(selectedItem != null){
	        int index = selectedItem.indexOf("[") ;
	        int lengthString = selectedItem.length() ;
	        
	        String typeClass = selectedItem.substring(index,lengthString);
	                
	           int lengthCombo1 = boxMetrics1.getItemCount();
	
	           for (int i = 0; i < lengthCombo1; i++) {
	
	               String itemCombo1 = boxMetrics1.getItemAt(i);
	               int indexCombo2 = itemCombo1.indexOf(typeClass);
	
	               if(indexCombo2 > -1 ){
	                   
	                   
	                   boxMetrics2.addItem(itemCombo1);
	               }
	
	           }
	
            boxMetrics1.setSelectedItem(selectedItem);

        }
        
        
        
    }//GEN-LAST:event_boxMetrics1ActionPerformed

    private void boxMetrics2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMetrics2ActionPerformed
        // 
    }//GEN-LAST:event_boxMetrics2ActionPerformed

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed
        
    }//GEN-LAST:event_txtValueActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    @SuppressWarnings("rawtypes")
	private void myInit() {
        
        setResizable(false);
        setLocationRelativeTo(null);
        
        txtValue.setFont(new java.awt.Font("Gadugi", 0, 18)); 

        List<?> listClasses = new ArrayList();

        listClasses = FindClasses.ClassNames();

        for(int a=0;a<listClasses.size();a++) {

            String classe = (String) listClasses.get(a);

            int indexAbstractMet = classe.indexOf("AbstractMetric");
            
            int indexIMetrics = classe.indexOf("IMetrics");

            if(indexAbstractMet == -1 && indexIMetrics == -1){

               String[] parts = classe.split("/");
               String part1 = parts[0];
               String[] parts2 = parts[1].split("\\.");
               String part2 = parts2[0]; 

                try {

                    Class c = Class.forName(part1 + "." +part2);
                    Object obj = c.newInstance();
                    
                    boxMetrics1.addItem(obj.toString());

                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } 

            }

        }

        String firstItem = (String) boxMetrics1.getSelectedItem();
        
        int firstIndex = firstItem.indexOf("[");
        int firstLenght = firstItem.length();

        if(firstIndex > -1 ){
              
            String typeClass = firstItem.substring(firstIndex,firstLenght);

            int lengthCombo = boxMetrics1.getItemCount();

            for (int i = 0; i < lengthCombo; i++) {

                String itemCombo = boxMetrics1.getItemAt(i);
                int indexOfCombo2 = itemCombo.indexOf(typeClass);

                if(indexOfCombo2 > -1 ){             
                    boxMetrics2.addItem(itemCombo);
                }
            }
        }
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox<String> boxMetrics1;
    private javax.swing.JComboBox<String> boxMetrics2;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    @SuppressWarnings("unused")
	private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelConvert;
    private javax.swing.JPanel panelTo;
    private javax.swing.JTextField txtValue;
  
}
