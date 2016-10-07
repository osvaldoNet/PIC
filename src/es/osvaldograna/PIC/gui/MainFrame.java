/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.osvaldograna.PIC.gui;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osvaldo
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openPanel = new javax.swing.JPanel();
        openPanel.setVisible(false);
        fileChooser = new javax.swing.JFileChooser();
        tableInternalFrame = new javax.swing.JInternalFrame();
        tablePane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        Select = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PIC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        openPanel.setPreferredSize(new java.awt.Dimension(200, 468));

        fileChooser.setFileFilter(new MyCustomFilter());
        fileChooser.setPreferredSize(new java.awt.Dimension(400, 400));
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout openPanelLayout = new javax.swing.GroupLayout(openPanel);
        openPanel.setLayout(openPanelLayout);
        openPanelLayout.setHorizontalGroup(
            openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(openPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );
        openPanelLayout.setVerticalGroup(
            openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(openPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );

        getContentPane().add(openPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 460, 450));

        tableInternalFrame.setClosable(true);
        tableInternalFrame.setIconifiable(true);
        tableInternalFrame.setMaximizable(true);
        tableInternalFrame.setResizable(true);
        tableInternalFrame.setVisible(false);

        tablePane.setBorder(null);
        tablePane.setViewportBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablePane.setViewportView(table);

        javax.swing.GroupLayout tableInternalFrameLayout = new javax.swing.GroupLayout(tableInternalFrame.getContentPane());
        tableInternalFrame.getContentPane().setLayout(tableInternalFrameLayout);
        tableInternalFrameLayout.setHorizontalGroup(
            tableInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(tableInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tableInternalFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        tableInternalFrameLayout.setVerticalGroup(
            tableInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(tableInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tableInternalFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(tableInternalFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        FileMenu.setText("File");

        Select.setText("Select files");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });
        FileMenu.add(Select);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        FileMenu.add(Exit);

        jMenuBar.add(FileMenu);

        About.setText("About");
        jMenuBar.add(About);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        fileChooser.setMultiSelectionEnabled(true);
        
        int returnVal = fileChooser.showOpenDialog(this);        
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            //data has two columns
            Object [][] data= new Object[files.length][2];
           
            int maxPathLength=0;
            int maxNameLength=0;
            
            for(int counter=0;counter<files.length;counter++){                
                String path = files[counter].getAbsolutePath();
                path=path.substring(0,path.lastIndexOf(File.separator));
                String name=files[counter].getName();
                
                data[counter][0]=path;
                data[counter][1]=name;               
                
                if(path.length()>maxPathLength) maxPathLength=path.length();
                if(name.length()>maxNameLength) maxNameLength=name.length();            
            }
            
            String [] columnNames={"Location","Name"};            
            //table.getColumnModel().getColumn(0).setPreferredWidth(maxPathLength+maxNameLength);
            //table.getColumnModel().getColumn(1).setPreferredWidth(maxPathLength+maxNameLength);
         
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            model.setColumnIdentifiers(columnNames);
            
            int fontSize=table.getFont().getSize();
            
            //borro filas existentes en la tabla si están vacías
            for(int counter=model.getRowCount()-1;counter>=0;counter--){               
                model.removeRow(counter);
            }
  
            int a=model.getRowCount();
            
            for (Object[] row : data) {
                model.addRow(row);
            }
                        
            table.setPreferredSize(new Dimension(table.getColumnModel().getColumn(0).getPreferredWidth()*2,data.length*18));
            
            //tomo dimensiones del frame principal            
            /*int ancho_tableInternalFrame=new Double(this.getSize().getWidth()-50).intValue();
            int alto_tableInternalFrame=new Double(this.getSize().getHeight()-50).intValue();
            int ancho_tablePane=ancho_tableInternalFrame-35;
            int alto_tablePane=alto_tableInternalFrame-35;*/
            int ancho_tablePane=(maxPathLength+maxNameLength)*(fontSize-(fontSize/3));
            int alto_tablePane=(data.length+20)*8;
            int ancho_tableInternalFrame=ancho_tablePane+35;
            int alto_tableInternalFrame=alto_tablePane+50;
            tablePane.setPreferredSize(new Dimension(ancho_tablePane,alto_tablePane));
            tableInternalFrame.setPreferredSize(new Dimension(ancho_tableInternalFrame,alto_tableInternalFrame));
            
            
            
            //tableInternalFrame.pack();            
            //int locX=(this.getWidth()-tableInternalFrame.getWidth())/2;
            //int locY=(this.getHeight()-tableInternalFrame.getHeight())/2;
            //tableInternalFrame.setLocation(locX,locY);
            //tablePane.setSize(new Dimension(ancho_tablePane,alto_tablePane));   
            
            tableInternalFrame.setVisible(true);
            
            revalidate();
            repaint();
    

    //        try {
    //          // What to do with the file, e.g. display it in a TextArea
    //         // textarea.read( new FileReader( file.getAbsolutePath() ), null );
    //         
    //        } catch (IOException ex) {
    //          System.out.println("problem accessing file"+file.getAbsolutePath());
    //        }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_SelectActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_ExitActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileChooserActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem Select;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel openPanel;
    private javax.swing.JTable table;
    private javax.swing.JInternalFrame tableInternalFrame;
    private javax.swing.JScrollPane tablePane;
    // End of variables declaration//GEN-END:variables
}

class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".bam/.bed" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".bam") || file.getAbsolutePath().endsWith(".bed");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "BAM or BED files";
            
        }
    }