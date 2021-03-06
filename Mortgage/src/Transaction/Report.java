/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Report.java
 *
 * Created on Feb 28, 2015, 10:29:48 AM
 */

package Transaction;

import Transaction.Reports.*;
import java.io.File;
import javax.swing.JOptionPane;
import Admin.Forms.MyFont;
import Transaction.Services.Transervices;
import Transaction.model.Trancst_model;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 *
 * @author user
 */
public class Report extends javax.swing.JPanel {
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
    /** Creates new form Report */
    String custid;
    String custname;
    String status;
    public Report() {
        initComponents();
        MyFont.setUIFont (new javax.swing.plaf.FontUIResource ("Tunga",Font.BOLD,16));
        comboNames();
        this.setOpaque(false);
    }
    public void comboNames()
    {
        try
        {
        int i=0;
        List lst=null;
        Transervices ts=new Transervices();
        lst=(List)ts.getNames();
        String cods[]=new String[lst.size()];
        Iterator itm1=lst.iterator();
        while(itm1.hasNext())
        {
             cods[i]=(String)itm1.next();
             i++;
        }
        ncmb.setModel(new javax.swing.DefaultComboBoxModel(cods));
        ncmb.setMaximumRowCount(6);
        ncmb.setFocusable(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Initialization Failed Please Try Again");
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        ncmb = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        r3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tdate = new com.toedter.calendar.JDateChooser();
        fdate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        r5 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        r2 = new javax.swing.JRadioButton();
        reppan = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(245, 195, 195));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(null);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Lucida Bright", 1, 14));
        r1.setText("All");
        r1.setOpaque(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel2.add(r1);
        r1.setBounds(10, 10, 47, 30);

        ncmb.setFont(new java.awt.Font("Tunga", 1, 16));
        ncmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncmbActionPerformed(evt);
            }
        });
        jPanel2.add(ncmb);
        ncmb.setBounds(80, 40, 160, 30);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Tunga", 1, 16));
        r3.setText("ದಿನದ ಪ್ರಕಾರ");
        r3.setOpaque(false);
        jPanel3.add(r3);
        r3.setBounds(0, 0, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 16));
        jLabel1.setText("ದಿನದವರೆಗೆ :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(120, 40, 72, 30);

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 16));
        jLabel2.setText("ದಿನದಿಂದ :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(130, 10, 61, 29);

        tdate.setDateFormatString("dd/MM/yyyy");
        jPanel3.add(tdate);
        tdate.setBounds(200, 40, 130, 20);

        fdate.setDateFormatString("dd/MM/yyyy");
        jPanel3.add(fdate);
        fdate.setBounds(200, 10, 130, 20);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(250, 10, 340, 70);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(r5);
        r5.setFont(new java.awt.Font("Lucida Bright", 1, 14));
        r5.setText("Closed");
        r5.setOpaque(false);
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Lucida Bright", 1, 14));
        r4.setText("Opened");
        r4.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14));
        jLabel3.setText("Status");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5)
                        .addGap(27, 27, 27))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(600, 10, 220, 70);

        jButton2.setFont(new java.awt.Font("Lucida Bright", 1, 14));
        jButton2.setText("Gen. Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(860, 20, 130, 50);

        closebtn.setFont(new java.awt.Font("SansSerif", 1, 14));
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transaction/computer.png"))); // NOI18N
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        closebtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                closebtnKeyPressed(evt);
            }
        });
        jPanel2.add(closebtn);
        closebtn.setBounds(1030, 0, 40, 40);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tunga", 1, 16));
        r2.setText("ಹೆಸರು ");
        r2.setOpaque(false);
        jPanel2.add(r2);
        r2.setBounds(80, 10, 67, 30);

        reppan.setBackground(new java.awt.Color(255, 204, 204));
        reppan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reppan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reppan, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel4.setText("ಮುದ್ರಣ ಅಥವಾ ಹುಡುಕು");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5ActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        Admin.Forms.MainMenu.PanelInfo.removeAll();
        Admin.Forms.MainMenu.PanelInfo.repaint();
}//GEN-LAST:event_closebtnActionPerformed

    private void closebtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_closebtnKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_DOWN) {
            
        }
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_UP) {
            
        }
}//GEN-LAST:event_closebtnKeyPressed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if((r1.isSelected()==false)&&(r2.isSelected()==false)&&(r3.isSelected()==false)&&(r4.isSelected()==false)&&(r5.isSelected()==false)){JOptionPane.showMessageDialog(this, "Transaction ಮುದ್ರಣ ಪಡೆಯಲು ದಯವಿಟ್ಟು ಯವುದಾದರು ಒಂದು ವಿಧಾನವನ್ನು ಆಯ್ದುಕೊಳ್ಳಿ");}
        if(r1.isSelected()==true){genByAll();}
        if((r2.isSelected()==true)&&(ncmb.getSelectedIndex()==0)){JOptionPane.showMessageDialog(this, "ದಯವಿಟ್ಟು ಹೆಸರನ್ನು ಆಯ್ದುಕೊಳ್ಳಿ");}
        if((r2.isSelected()==true)&&(ncmb.getSelectedIndex()!=0)){genByName();}
        if((r3.isSelected()==true)&&((fdate.getDate()==null)||(tdate.getDate()==null))){JOptionPane.showMessageDialog(this, "ದಯವಿಟ್ಟು ದಿನದಿಂದ ಮತ್ತು ದಿನದವರೆಗೆ ದಿನಾಂಕ ಎರಡನ್ನು ಆಯ್ದುಕೊಳ್ಳಿ");}
        if((r3.isSelected()==true)&&((fdate.getDate()!=null)||(tdate.getDate()!=null))){genByDate();}
        if(r4.isSelected()==true){status=r4.getText();genByStatus();}
        if(r5.isSelected()==true){status=r5.getText();genByStatus();}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void ncmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncmbActionPerformed
        // TODO add your handling code here:
        String ccmb=(String) ncmb.getSelectedItem();
        if(!ccmb.equals("-Select-"))
        {
        String t1=(String) ncmb.getSelectedItem();
        try {
            Transervices ts=new Transervices();
            Trancst_model tsm=(Trancst_model)ts.viewbyName(t1);
            custname=tsm.getCname();
            custid=tsm.getCid();
        }catch(Exception e){JOptionPane.showMessageDialog(null, "data not found search another no"+e);}
        }
    }//GEN-LAST:event_ncmbActionPerformed
//---------------------Reports Strats-----------------------------------
    public void genByAll()
    {

    try{
            File fl=new File("src\\Transaction\\Reports\\All_Rep.jrxml");
            String rep=fl.getAbsolutePath();
            ALLRep repo=new ALLRep(rep);
            repo.setBounds(0, 0, reppan.getWidth(), reppan.getHeight());
            repo.setVisible(true);
            this.reppan.add(repo);
        }catch(Exception e){}
    }
    public void genByName()
    {
        HashMap param=new HashMap();
        String cstid=custid;
        String nam=custname;
        param.put("cid",cstid);
        param.put("cname",nam);
        try
        {
            File fl=new File("src\\Transaction\\Reports\\NameWise.jrxml");
            String rep=fl.getAbsolutePath();
            Name repo=new Name(rep, param);
            repo.setBounds(0, 0, reppan.getWidth(), reppan.getHeight());
            repo.setVisible(true);
            this.reppan.add(repo);
        }catch(Exception e){}
    }
    public void genByDate()
    {
        HashMap param=new HashMap();
        java.sql.Date fd= new java.sql.Date(fdate.getDate().getTime());
        java.sql.Date td= new java.sql.Date(tdate.getDate().getTime());
        param.put("fdat",fd);
        param.put("tdat",td);
        try
        {
            File fl=new File("src\\Transaction\\Reports\\Datewise.jrxml");
            String rep=fl.getAbsolutePath();
            ByDate repo=new ByDate(rep,param);
            repo.setBounds(0, 0, reppan.getWidth(), reppan.getHeight());
            repo.setVisible(true);
            this.reppan.add(repo);
        }catch(Exception e){}
    }
    public void genByStatus()
    {
        HashMap param=new HashMap();
        String nam=status;
        param.put("sts",nam);
        try
        {
            File fl=new File("src\\Transaction\\Reports\\Statuswise.jrxml");
            String rep=fl.getAbsolutePath();
            ByStatus repo=new ByStatus(rep, param);
            repo.setBounds(0, 0, reppan.getWidth(), reppan.getHeight());
            repo.setVisible(true);
            this.reppan.add(repo);
        }catch(Exception e){}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closebtn;
    private com.toedter.calendar.JDateChooser fdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox ncmb;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JDesktopPane reppan;
    private com.toedter.calendar.JDateChooser tdate;
    // End of variables declaration//GEN-END:variables
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
    //fun for creating shadow Stops**************************************************************
}
