package multiplex;

import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class checkoutFrame extends javax.swing.JInternalFrame {
    SimpleDateFormat sdf;
    Connection con;
    Statement smt;
    ResultSet rs;
    String fname;
    String lname;
    String gend;
    int age;
    double tperoson;    
    
    double st=0.0;
    double tfare=0.00;
    private String day;
    private String mname;
    private String shw;
    private String clss;
    private String fare;
    private int adult;
    private int child;
    /**
     * Creates new form checkoutFrame
     */
    public checkoutFrame() {
        initComponents();
        try
        {
            Class .forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_s","root","");
        }
        catch(Exception e)
        {
         System.out.println(e.getMessage());
        }
    }
    
    public void fun(String dy, String mnam, String sh, String cls, String fr, int adu, int chld, String fname1, String lname1, String age1, String gend1, String fname2, String lname2, String age2, String gend2, String fname3, String lname3, String age3, String gend3, String fname4, String lname4, String age4, String gend4, String fname5, String lname5, String age5, String gend5, String fname6, String lname6, String age6, String gend6){
         
        
        //Filling all the fields//
        fname = fname1;
        lname = lname1;
        gend = gend1;
        age = Integer.parseInt(age1);
        mname = mnam;
        shw = sh;
        day = dy;
        System.out.println(dy);
        jTextField25.setText(dy);
        jTextField26.setText(mnam);
        jTextField30.setText(sh);
        clss = cls;
        adult = adu;
        child = chld;
        jTextField28.setText(cls);
        jTextField29.setText(Integer.toString(adu));
        jTextField31.setText(Integer.toString(chld));
        jTextField1.setText(fname1);
        jTextField2.setText(lname1);
        jTextField3.setText(age1);
        jTextField4.setText(gend1);
      /*  jTextField5.setText(fname2);
        jTextField6.setText(lname2);
        jTextField7.setText(age2);
        jTextField8.setText(gend2);
        jTextField9.setText(fname3);
        jTextField10.setText(lname3);
        jTextField11.setText(age3);
        jTextField12.setText(gend3);
        jTextField13.setText(fname4);
        jTextField14.setText(lname4);
        jTextField15.setText(age4);
        jTextField16.setText(gend4);
        jTextField17.setText(fname5);
        jTextField18.setText(lname5);
        jTextField19.setText(age5);
        jTextField20.setText(gend5);
        jTextField21.setText(fname6);
        jTextField22.setText(lname6);
        jTextField23.setText(age6);
        jTextField24.setText(gend6);*/
        double a = Double.parseDouble(fr)*(Double.parseDouble(Integer.toString(adu))+Double.parseDouble(Integer.toString(chld)));
        tperoson = adu + chld;
        jTextField32.setText(Double.toString(a));
        st=(double)(Double.parseDouble(Double.toString(a))*20.0/100);
        jTextField33.setText(Double.toString(st));

        tfare= (double)(a+st);
        jTextField36.setText(Double.toString(tfare));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("JAVA Movie Ticket- Payment Process");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_cinemax.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 17, 27));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cinemax Ticket Reservation");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Day");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Movie Name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Show Time");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("No Of Children");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Class");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("No Of Adult");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Fare");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Service Tax (20%)");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Total Fare");

        jTextField25.setEditable(false);

        jTextField26.setEditable(false);
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField28.setEditable(false);

        jTextField29.setEditable(false);

        jTextField30.setEditable(false);

        jTextField31.setEditable(false);

        jButton1.setLabel("Checkout and Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField32.setEditable(false);

        jTextField33.setEditable(false);

        jTextField36.setEditable(false);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField28, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(jTextField25))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jTextField31))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel12)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        /*jTextField25.setText(day);
        jTextField26.setText(mname);
        jTextField30.setText(shw);
        jTextField28.setText(clss);
        jTextField29.setText(adult);
        jTextField31.setText(child);
        jTextField1.setText(cfname1);
        jTextField2.setText(clname1);
        jTextField3.setText(cage1);
        jTextField4.setText(cgend1);
        jTextField5.setText(cfname2);
        jTextField6.setText(clname2);
        jTextField7.setText(cage2);
        jTextField8.setText(cgend2);
        jTextField9.setText(cfname3);
        jTextField10.setText(clname3);
        jTextField11.setText(cage3);
        jTextField12.setText(cgend3);
        jTextField13.setText(cfname4);
        jTextField14.setText(clname4);
        jTextField15.setText(cage4);
        jTextField16.setText(cgend4);
        jTextField17.setText(cfname5);
        jTextField18.setText(clname5);
        jTextField19.setText(cage5);
        jTextField20.setText(cgend5);
        jTextField21.setText(cfname6);
        jTextField22.setText(clname6);
        jTextField23.setText(cage6);
        jTextField24.setText(cgend6);*/
//        double a = Double.parseDouble(fare)*(Double.parseDouble(adult)+Double.parseDouble(child));
    //    jTextField32.setText(Double.toString(a));
    //    st=(double)(Double.parseDouble(Double.toString(a))*20.0/100);
    //    jTextField33.setText(Double.toString(st));

    //    tfare= (double)(a+st);
        jTextField36.setText(Double.toString(tfare));
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int x = 0;
        try {
            String tmpa = null;
            if ( clss.equals("RL")){
                int a = adult + child;
                System.out.println(a);
                System.out.println(clss);
                Statement stmt = con.createStatement();
                stmt = con.createStatement();
                String sql = "SELECT rlseats from `movie_info` WHERE `mname`='"+mname+"' AND `show`='"+shw+"' AND `day`='"+day+"'";
                ResultSet rs1 = stmt.executeQuery(sql);
                int z = 0;
                while(rs1.next())
                z = rs1.getInt(1);
                System.out.println(z);
                x = z - a;
                String sql1="UPDATE `movie_info` SET `movie_info`.rlseats = '"+x+"' WHERE `mname`='"+mname+"' AND `show`='"+shw+"' AND `day`='"+day+"'";
                stmt.executeUpdate(sql1);
                int xz = a * 20;
                String sql2 = "INSERT INTO `customers`(`moviename`, `day`, `shw`, `fname`, `lname`, `age`, `gender`, `class`, `noofticket`, `fare`, `points`) VALUES ('"+mname+"', '"+day+"', '"+shw+"', '"+fname+"', '"+lname+"', '"+age+"', '"+gend+"', '"+clss+"', '"+tperoson+"', '"+tfare+"', '"+xz+"')";
                stmt.executeUpdate(sql2);
            }
            else if ( clss.equals("XC")){
                int a = adult + child;
                System.out.println(a);
                System.out.println(clss);
                Statement stmt = con.createStatement();
                stmt = con.createStatement();
                String sql = "SELECT xcseats from `movie_info` WHERE `mname`='"+mname+"' AND `show`='"+shw+"' AND `day`='"+day+"'";
                ResultSet rs1 = stmt.executeQuery(sql);
                int z = 0;
                while(rs1.next())
                z = rs1.getInt(1);
                System.out.println(z);
                x = z - a;
                String sql1="UPDATE `movie_info` SET `movie_info`.xcseats = '"+x+"' WHERE `mname`='"+mname+"' AND `show`='"+shw+"' AND `day`='"+day+"'";
                stmt.executeUpdate(sql1);
                int xz = a * 15;
                String sql2 = "INSERT INTO `customers`(`moviename`, `day`, `shw`, `fname`, `lname`, `age`, `gender`, `class`, `noofticket`, `fare`, `points`) VALUES ('"+mname+"', '"+day+"', '"+shw+"', '"+fname+"', '"+lname+"', '"+age+"', '"+gend+"', '"+clss+"', '"+tperoson+"', '"+tfare+"', '"+xz+"')";
                stmt.executeUpdate(sql2);
            }
            else if ( clss.equals("NL")){
                int a = adult + child;
                System.out.println(a);
                System.out.println(clss);
                Statement stmt = con.createStatement();
                stmt = con.createStatement();
                String sql = "SELECT nlseats from `movie_info` WHERE `mname`='"+mname+"' AND `show`='"+shw+"' AND `day`='"+day+"'";
                ResultSet rs1 = stmt.executeQuery(sql);
                int z = 0;
                while(rs1.next())
                z = rs1.getInt(1);
                System.out.println(z);
                x = z - a;
                String sql1="UPDATE `movie_info` SET `movie_info`.nlseats = '"+x+"' WHERE `mname`='"+mname+"' AND `show`='"+shw+"' AND `day`='"+day+"'";
                stmt.executeUpdate(sql1);
                int xz = a * 10;
                String sql2 = "INSERT INTO `customers`(`moviename`, `day`, `shw`, `fname`, `lname`, `age`, `gender`, `class`, `noofticket`, `fare`, `points` ) VALUES ('"+mname+"', '"+day+"', '"+shw+"', '"+fname+"', '"+lname+"', '"+age+"', '"+gend+"', '"+clss+"', '"+tperoson+"', '"+tfare+"'. '"+xz+"')";
                stmt.executeUpdate(sql2);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        JOptionPane.showMessageDialog(this,"Congratulation your ticket is booked");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
