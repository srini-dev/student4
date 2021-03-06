/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SysPermission.java
 *
 * Created on Nov 21, 2014, 12:18:24 PM
 */

package Admin;

//For shadow
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.border.LineBorder;

/**
 *
 * @author user
 */
public class SysPermission extends javax.swing.JPanel {

    //attrib for shadow starts************************************************
    protected int strokeSize = 1;
    protected Color shadowColor = Color.black;
    protected boolean shady = true;
    protected boolean highQuality = true;
    protected Dimension arcs = new Dimension(20, 20);
    protected int shadowGap = 5;
    protected int shadowOffset = 4;
    protected int shadowAlpha = 150;
//attrib for shadow stops************************************************

    /** Creates new form SysPermission */
    public SysPermission() {
        setOpaque(false);
        initComponents();

         System.out.println("Done.........");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        spt2 = new javax.swing.JCheckBox();
        spt3 = new javax.swing.JCheckBox();
        spt4 = new javax.swing.JCheckBox();
        spt5 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        spt6 = new javax.swing.JCheckBox();
        spt7 = new javax.swing.JCheckBox();
        spt8 = new javax.swing.JCheckBox();
        spt9 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        spt10 = new javax.swing.JCheckBox();
        spt11 = new javax.swing.JCheckBox();
        spt12 = new javax.swing.JCheckBox();
        spt13 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        spt14 = new javax.swing.JCheckBox();
        spt15 = new javax.swing.JCheckBox();
        spt16 = new javax.swing.JCheckBox();
        spt17 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        spt18 = new javax.swing.JCheckBox();
        spt19 = new javax.swing.JCheckBox();
        spt20 = new javax.swing.JCheckBox();
        spt21 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        spt1 = new javax.swing.JComboBox();
        applybtn = new javax.swing.JButton();
        removebtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14));

        spt2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt2.setText("ADD");
        spt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt2KeyPressed(evt);
            }
        });

        spt3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt3.setText("EDIT");
        spt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt3KeyPressed(evt);
            }
        });

        spt4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt4.setText("DELETE");
        spt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt4KeyPressed(evt);
            }
        });

        spt5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt5.setText("View");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spt5)
                    .addComponent(spt4)
                    .addComponent(spt3)
                    .addComponent(spt2))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(spt2)
                .addGap(18, 18, 18)
                .addComponent(spt3)
                .addGap(18, 18, 18)
                .addComponent(spt4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spt5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", jPanel1);

        spt6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt6.setText("ADD");
        spt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt6KeyPressed(evt);
            }
        });

        spt7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt7.setText("EDIT");
        spt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt7KeyPressed(evt);
            }
        });

        spt8.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt8.setText("DELETE");
        spt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt8KeyPressed(evt);
            }
        });

        spt9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt9.setText("View");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spt9)
                    .addComponent(spt8)
                    .addComponent(spt7)
                    .addComponent(spt6))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(spt6)
                .addGap(18, 18, 18)
                .addComponent(spt7)
                .addGap(18, 18, 18)
                .addComponent(spt8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spt9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Staff", jPanel2);

        spt10.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt10.setText("ADD");
        spt10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt10KeyPressed(evt);
            }
        });

        spt11.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt11.setText("EDIT");
        spt11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt11KeyPressed(evt);
            }
        });

        spt12.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt12.setText("DELETE");
        spt12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt12KeyPressed(evt);
            }
        });

        spt13.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt13.setText("View");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spt13)
                    .addComponent(spt12)
                    .addComponent(spt11)
                    .addComponent(spt10))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(spt10)
                .addGap(18, 18, 18)
                .addComponent(spt11)
                .addGap(18, 18, 18)
                .addComponent(spt12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spt13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fees details ", jPanel3);

        jPanel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel4KeyPressed(evt);
            }
        });

        spt14.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt14.setText("ADD");
        spt14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt14KeyPressed(evt);
            }
        });

        spt15.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt15.setText("EDIT");
        spt15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt15KeyPressed(evt);
            }
        });

        spt16.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt16.setText("DELETE");
        spt16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt16KeyPressed(evt);
            }
        });

        spt17.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt17.setText("View");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spt17)
                    .addComponent(spt16)
                    .addComponent(spt15)
                    .addComponent(spt14))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(spt14)
                .addGap(18, 18, 18)
                .addComponent(spt15)
                .addGap(18, 18, 18)
                .addComponent(spt16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spt17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Examination", jPanel4);

        spt18.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt18.setText("ADD");
        spt18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt18KeyPressed(evt);
            }
        });

        spt19.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt19.setText("EDIT");
        spt19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt19KeyPressed(evt);
            }
        });

        spt20.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt20.setText("DELETE");
        spt20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt20KeyPressed(evt);
            }
        });

        spt21.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt21.setText("View");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spt21)
                    .addComponent(spt20)
                    .addComponent(spt19)
                    .addComponent(spt18))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(spt18)
                .addGap(18, 18, 18)
                .addComponent(spt19)
                .addGap(18, 18, 18)
                .addComponent(spt20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spt21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Attendence", jPanel5);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("User");

        spt1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        spt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select User-" }));
        spt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spt1KeyPressed(evt);
            }
        });

        applybtn.setFont(new java.awt.Font("Lucida Sans", 1, 12));
        applybtn.setText("Apply");

        removebtn.setFont(new java.awt.Font("Lucida Sans", 1, 12));
        removebtn.setText("Remove All");

        closebtn.setFont(new java.awt.Font("Lucida Sans", 1, 12));
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(spt1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(applybtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removebtn)
                        .addGap(18, 18, 18)
                        .addComponent(closebtn)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applybtn)
                    .addComponent(removebtn)
                    .addComponent(closebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void spt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt1KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            applybtn.requestFocus(true);
        }
    }//GEN-LAST:event_spt1KeyPressed

    private void spt18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt18KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt19.requestFocus(true);
        }
    }//GEN-LAST:event_spt18KeyPressed

    private void spt19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt19KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt20.requestFocus(true);
        }
    }//GEN-LAST:event_spt19KeyPressed

    private void spt20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt20KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt21.requestFocus(true);
        }
    }//GEN-LAST:event_spt20KeyPressed

    private void spt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt2KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt3.requestFocus(true);
        }
    }//GEN-LAST:event_spt2KeyPressed

    private void spt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt3KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt4.requestFocus(true);
        }
    }//GEN-LAST:event_spt3KeyPressed

    private void spt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt4KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt5.requestFocus(true);
        }
    }//GEN-LAST:event_spt4KeyPressed

    private void spt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt6KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt7.requestFocus(true);
        }
    }//GEN-LAST:event_spt6KeyPressed

    private void spt7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt7KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt8.requestFocus(true);
        }
    }//GEN-LAST:event_spt7KeyPressed

    private void spt8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt8KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt9.requestFocus(true);
        }
    }//GEN-LAST:event_spt8KeyPressed

    private void spt10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt10KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt11.requestFocus(true);
        }
    }//GEN-LAST:event_spt10KeyPressed

    private void spt11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt11KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt12.requestFocus(true);
        }
    }//GEN-LAST:event_spt11KeyPressed

    private void spt12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt12KeyPressed
        // TODO add your handling code here:
        int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt13.requestFocus(true);
        }
    }//GEN-LAST:event_spt12KeyPressed

    private void jPanel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jPanel4KeyPressed

    private void spt15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt15KeyPressed
        // TODO add your handling code here:
         int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt16.requestFocus(true);
        }
         
    }//GEN-LAST:event_spt15KeyPressed

    private void spt16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt16KeyPressed
        // TODO add your handling code here:
         int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt17.requestFocus(true);
        }


    }//GEN-LAST:event_spt16KeyPressed

    private void spt14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spt14KeyPressed
        // TODO add your handling code here:
         int keycode=evt.getKeyCode();
        if(keycode==10)
        {
            spt15.requestFocus(true);
        }
    }//GEN-LAST:event_spt14KeyPressed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        Admin.Forms.MainMenu.PanelInfo.removeAll();
        Admin.Forms.MainMenu.PanelInfo.repaint();
    }//GEN-LAST:event_closebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applybtn;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton removebtn;
    private javax.swing.JComboBox spt1;
    private javax.swing.JCheckBox spt10;
    private javax.swing.JCheckBox spt11;
    private javax.swing.JCheckBox spt12;
    private javax.swing.JCheckBox spt13;
    private javax.swing.JCheckBox spt14;
    private javax.swing.JCheckBox spt15;
    private javax.swing.JCheckBox spt16;
    private javax.swing.JCheckBox spt17;
    private javax.swing.JCheckBox spt18;
    private javax.swing.JCheckBox spt19;
    private javax.swing.JCheckBox spt2;
    private javax.swing.JCheckBox spt20;
    private javax.swing.JCheckBox spt21;
    private javax.swing.JCheckBox spt3;
    private javax.swing.JCheckBox spt4;
    private javax.swing.JCheckBox spt5;
    private javax.swing.JCheckBox spt6;
    private javax.swing.JCheckBox spt7;
    private javax.swing.JCheckBox spt8;
    private javax.swing.JCheckBox spt9;
    // End of variables declaration//GEN-END:variables

     //fun for creating shadow Starts**************************************************************
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int shadowGap = this.shadowGap;
        Color shadowColorA = new Color(shadowColor.getRed(),
	shadowColor.getGreen(), shadowColor.getBlue(), shadowAlpha);
        Graphics2D graphics = (Graphics2D) g;

        //Sets antialiasing if HQ.
        if (highQuality) {
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
        }

        //Draws shadow borders if any.
        if (shady) {
            graphics.setColor(shadowColorA);
            graphics.fillRoundRect(
                    shadowOffset,// X position
                    shadowOffset,// Y position
                    width - strokeSize - shadowOffset, // width
                    height - strokeSize - shadowOffset, // height
                    arcs.width, arcs.height);// arc Dimension
        } else {
            shadowGap = 1;
        }

        //Draws the rounded opaque panel with borders.
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width - shadowGap, height - shadowGap, arcs.width, arcs.height);
        graphics.setColor(getForeground());
        graphics.setStroke(new BasicStroke(strokeSize));
        graphics.drawRoundRect(0, 0, width - shadowGap,
		height - shadowGap, arcs.width, arcs.height);

        //Sets strokes to default, is better.
        graphics.setStroke(new BasicStroke());
    }
    //fun for creating shadow Stops*************************************************************
}
