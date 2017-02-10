package uunifast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    private String pathFile="";
    private UUnifast uunifast;
    private ArrayList<TaskSet> tasksets;
    private Modele modele;
    private Parser parser;
    private Parser p;
    private String pathFile2="";
    private String browsePath="out.xml";
    private String saveAsPath="out2.tex";
    
    public Interface() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Generateur");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nt = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gpu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        harmonicCheck = new javax.swing.JCheckBox();
        schedulable = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ntt = new javax.swing.JTextField();
        hp1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        path1 = new javax.swing.JTextField();
        genTaskSets = new javax.swing.JButton();
        saveTaskSets = new javax.swing.JButton();
        harmonicCheck1 = new javax.swing.JCheckBox();
        schedulable1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ntpu = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        browse = new javax.swing.JTextField();
        saveas = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Process Utilization ");

        pu.setText("0.8");
        pu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puActionPerformed(evt);
            }
        });

        jLabel2.setText("Number of Task");

        nt.setText("10");

        hp.setText("8");

        jLabel4.setText("Generated Process Utilization");

        gpu.setEditable(false);
        gpu.setText(" ");
        gpu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gpu.setSelectedTextColor(new java.awt.Color(51, 255, 0));

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        path.setEditable(false);

        jButton2.setText("Generate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save TaskSet");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        harmonicCheck.setSelected(true);
        harmonicCheck.setText("Harmonic Pariod");

        schedulable.setSelected(true);
        schedulable.setText("Schedulable");

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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(path))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(schedulable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(harmonicCheck))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gpu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harmonicCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(schedulable))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1 TaskSet", jPanel2);

        jLabel5.setText("Number of Task / TaskSet");

        ntt.setText("10");

        hp1.setText("8");

        jButton4.setText("Browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        path1.setEditable(false);
        path1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path1ActionPerformed(evt);
            }
        });

        genTaskSets.setText("Generate");
        genTaskSets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTaskSetsActionPerformed(evt);
            }
        });

        saveTaskSets.setText("Save TaskSet");
        saveTaskSets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTaskSetsActionPerformed(evt);
            }
        });

        harmonicCheck1.setSelected(true);
        harmonicCheck1.setText("Harmonic Pariod");

        schedulable1.setSelected(true);
        schedulable1.setText("Schedulable");

        jLabel6.setText("Number of TaskSet / ProcessUtilization");

        ntpu.setText("100");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(harmonicCheck1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hp1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ntt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(schedulable1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genTaskSets)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(saveTaskSets))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(path1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ntpu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ntpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ntt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harmonicCheck1)
                    .addComponent(hp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(path1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genTaskSets)
                    .addComponent(saveTaskSets)
                    .addComponent(schedulable1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("N TaskSet", jPanel3);

        browse.setEditable(false);
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        saveas.setEditable(false);

        jButton5.setText("Ficher XML");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Enregistrer Sous");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Generate");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Remarque:\n\nIl faut utiliser un fichier xml avec 800 taskset de 10 tache \n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(browse)
                    .addComponent(saveas)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Générer Graphe", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(pathFile.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Veuillez specifier un fichier de sauvegarde avant","Chemin Incorrect",JOptionPane.ERROR_MESSAGE);
        }
        else if(uunifast == null)
        {
            JOptionPane.showMessageDialog(this,"Veuillez generer avant","Erreur de generation",JOptionPane.ERROR_MESSAGE);
        }
        else
        parser.enregistre(pathFile);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            double u=Double.parseDouble(pu.getText());
            int n=Integer.parseInt(nt.getText());
            double t=Double.parseDouble(hp.getText());
            uunifast = new UUnifast(u, t, n, harmonicCheck.isSelected(),schedulable.isSelected());
            parser=new Parser(uunifast.ts);
            modele = new Modele(uunifast.ts.getTaskSet());
            table.setModel(modele);
            String val = uunifast.ts.processUtil()+"";
            gpu.setText(val.substring(0,9));
        }
        catch(NumberFormatException e){System.out.println("erreur format");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.setCurrentDirectory(new File("."));
        int res=jf.showSaveDialog(this);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            pathFile = jf.getSelectedFile().getAbsolutePath();
            path.setText(pathFile);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void puActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.setCurrentDirectory(new File("."));
        int res=jf.showSaveDialog(this);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            pathFile2 = jf.getSelectedFile().getAbsolutePath();
            path1.setText(pathFile2);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void genTaskSetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTaskSetsActionPerformed
        int nt = Integer.parseInt(ntt.getText());
        int ntp = Integer.parseInt(ntpu.getText());
        int n = 9;
        double th=Double.parseDouble(hp1.getText());
        ArrayList<TaskSet> tasksets = new ArrayList<>();
        for(int i = 1 ; i < n ; i++)
        {
            for(int j=0;j<ntp;j++)
            {  
                UUnifast u = new UUnifast(i/10.0, th, nt, harmonicCheck.isSelected(),schedulable.isSelected());
                tasksets.add(u.ts);
            }
        }
        p = new Parser(tasksets);
    }//GEN-LAST:event_genTaskSetsActionPerformed

    private void saveTaskSetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTaskSetsActionPerformed
        p.enregistre(pathFile2);
    }//GEN-LAST:event_saveTaskSetsActionPerformed

    private void path1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_path1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_path1ActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.setCurrentDirectory(new File("."));
        int res=jf.showOpenDialog(this);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            browsePath = jf.getSelectedFile().getAbsolutePath();
            browse.setText(browsePath);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.setCurrentDirectory(new File("."));
        int res=jf.showSaveDialog(this);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            saveAsPath = jf.getSelectedFile().getAbsolutePath();
            saveas.setText(saveAsPath);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(browsePath.equals(""))
           JOptionPane.showMessageDialog(this,"Veuillez specifier un fichier source","Chemin Incorrect",JOptionPane.ERROR_MESSAGE);
        else if(saveAsPath.equals(""))
            JOptionPane.showMessageDialog(this,"Veuillez specifier un fichier de sauvegarde avant","Chemin Incorrect",JOptionPane.ERROR_MESSAGE);
        else
            generate();
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField browse;
    private javax.swing.JButton genTaskSets;
    private javax.swing.JTextField gpu;
    private javax.swing.JCheckBox harmonicCheck;
    private javax.swing.JCheckBox harmonicCheck1;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField hp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nt;
    private javax.swing.JTextField ntpu;
    private javax.swing.JTextField ntt;
    private javax.swing.JTextField path;
    private javax.swing.JTextField path1;
    private javax.swing.JTextField pu;
    private javax.swing.JButton saveTaskSets;
    private javax.swing.JTextField saveas;
    private javax.swing.JCheckBox schedulable;
    private javax.swing.JCheckBox schedulable1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private String outBox(ArrayList<Double> list,String mediane,int j) {
        String resultat =   "\t\\filldraw[fill=green!20] (?,?) rectangle (?,?);\n" +
                            "\t\\draw (?,?) -- (?,?);\n"+
                            "\t\\draw (?,?) -- (?,?);\n" +
                            "\t\\draw (?,?) -- (?,?);\n" +
                            "\t\\draw (?,?) -- (?,?);\n" +
                            "\t\\draw (?,?) -- (?,?);";
        resultat = resultat.replaceFirst("[?]", (j-0.3)+"");
        resultat = resultat.replaceFirst("[?]", list.get(24).toString().substring(0, 5));
        resultat = resultat.replaceFirst("[?]", (j+0.3)+"");
        resultat = resultat.replaceFirst("[?]", list.get(74).toString().substring(0, 5));
        
        resultat = resultat.replaceFirst("[?]", (j-0.3)+"");
        resultat = resultat.replaceFirst("[?]", mediane.substring(0, 5));
        resultat = resultat.replaceFirst("[?]", (j+0.3)+"");
        resultat = resultat.replaceFirst("[?]", mediane.substring(0, 5));
        
        resultat = resultat.replaceFirst("[?]", (j)+"");
        resultat = resultat.replaceFirst("[?]", list.get(0).toString().substring(0, 5));
        resultat = resultat.replaceFirst("[?]", (j)+"");
        resultat = resultat.replaceFirst("[?]", list.get(24).toString().substring(0, 5));
        
        resultat = resultat.replaceFirst("[?]", (j)+"");
        resultat = resultat.replaceFirst("[?]", list.get(74).toString().substring(0, 5));
        resultat = resultat.replaceFirst("[?]", (j)+"");
        resultat = resultat.replaceFirst("[?]", list.get(99).toString().substring(0, 5));
        
        resultat = resultat.replaceFirst("[?]", (j-0.11)+"");
        resultat = resultat.replaceFirst("[?]", list.get(0).toString().substring(0, 5));
        resultat = resultat.replaceFirst("[?]", (j+0.11)+"");
        resultat = resultat.replaceFirst("[?]", list.get(0).toString().substring(0, 5));
        
        resultat = resultat.replaceFirst("[?]", (j-0.11)+"");
        resultat = resultat.replaceFirst("[?]", list.get(99).toString().substring(0, 5));
        resultat = resultat.replaceFirst("[?]", (j+0.11)+"");
        resultat = resultat.replaceFirst("[?]", list.get(99).toString().substring(0, 5));
        return resultat;
    }
    private String headerTiks(){
        return "\\begin{tikzpicture}[thick, framed]\n";
    }
    private String headerTex(){
        return "\\documentclass{article}\n" + "\\usepackage{tikz}\n" + "\\usetikzlibrary{arrows,backgrounds,snakes}\n" +"\\begin{document}\n"+"\\begin{center}\n";
    }
    private String footerTiks(){
        return "\\draw (0,0) -- (10,0);\n" +
"\\draw (0,0) -- (0,15);\n" +
"\\draw (0,0) -- (0,-0.3) node[fill=white] {0.0};                                                                                                                                 \n" +
"\\draw (0,0.0) -- (-0.5,0.0) node[fill=white] {0.0};                                                                                                                             \n" +
"\\draw (1,0) -- (1,-0.3) node[fill=white] {0.1};                                                                                                                                 \n" +
"\\draw (0,1.5) -- (-0.5,1.5) node[fill=white] {0.1};                                                                                                                             \n" +
"\\draw (2,0) -- (2,-0.3) node[fill=white] {0.2};                                                                                                                                 \n" +
"\\draw (0,3.0) -- (-0.5,3.0) node[fill=white] {0.2};                                                                                                                             \n" +
"\\draw (3,0) -- (3,-0.3) node[fill=white] {0.3};                                                                                                                                 \n" +
"\\draw (0,4.5) -- (-0.5,4.5) node[fill=white] {0.3};                                                                                                                             \n" +
"\\draw (4,0) -- (4,-0.3) node[fill=white] {0.4};                                                                                                                                 \n" +
"\\draw (0,6.0) -- (-0.5,6.0) node[fill=white] {0.4};                                                                                                                             \n" +
"\\draw (5,0) -- (5,-0.3) node[fill=white] {0.5};                                                                                                                                 \n" +
"\\draw (0,7.5) -- (-0.5,7.5) node[fill=white] {0.5};                                                                                                                             \n" +
"\\draw (6,0) -- (6,-0.3) node[fill=white] {0.6};                                                                                                                                 \n" +
"\\draw (0,9.0) -- (-0.5,9.0) node[fill=white] {0.6};                                                                                                                             \n" +
"\\draw (7,0) -- (7,-0.3) node[fill=white] {0.7};                                                                                                                                 \n" +
"\\draw (0,10.5) -- (-0.5,10.5) node[fill=white] {0.7};                                                                                                                           \n" +
"\\draw (8,0) -- (8,-0.3) node[fill=white] {0.8};                                                                                                                                 \n" +
"\\draw (0,12.0) -- (-0.5,12.0) node[fill=white] {0.8};                                                                                                                           \n" +
"\\draw (9,0) -- (9,-0.3) node[fill=white] {0.9};                                                                                                                                 \n" +
"\\draw (0,13.5) -- (-0.5,13.5) node[fill=white] {0.9};                                                                                                                           \n" +
"\\draw (10,0) -- (10,-0.3) node[fill=white] {1.0};                                                                                                                               \n" +
"\\draw (0,15.0) -- (-0.5,15.0) node[fill=white] {1.0};\n" +
"\\end{tikzpicture}" ;
    }
    private String footerTex(){
        return  "\\end{center}"+"\\end{document}";
    }
    private void generate() {
        Parser p = new Parser();
        p.ouvrir(browsePath);
        ArrayList<Double> list = new ArrayList<>();
        Comparator sorter = new Comparator<Double>() {
            @Override
            public int compare(Double v1, Double v2) {
                return v1.compareTo(v2);
            }
        };
        String headString=headerTex();
        String box = "";
        for(int j=1;j<9;j++)
        {
            list.clear();
            for(int i = ((j-1)*100); i < (j*100) ; i++)
            {
                TaskSet ts = p.getTaskSet(i);
                ts.genSleepTask();
                list.add(new Double(ts.processUtil()*15));
            }
            list.sort(sorter);
            double mediane = (list.get(50).doubleValue()+list.get(49).doubleValue())/2;
            box += outBox(list,mediane+"",j)+"\n";
        }
        String footerString = footerTex();
        try {
            FileWriter fw = new FileWriter(new File(saveAsPath));
            fw.write(headerTex());
            fw.write(headerTiks());
            fw.write(box);
            fw.write(footerTiks());
            fw.write(footerString);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
