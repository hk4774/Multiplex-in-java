
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class searchFrame1 extends javax.swing.JInternalFrame {

    Connection con;
    Statement smt;
    ResultSet rs;
    public Object obj1, obj2, obj3, obj4, obj5, obj6;
    DateFormat formatter;
    Date dt, dt7;
    SimpleDateFormat sdf;
    String origin = null;
    String target = null;
    String fclass = null;
    String sql = null;
    String strdtver1;
    String strdtver2 = null;
    String strdtver3 = null;
    String search = "";
    private String m_name;
    private String s_name;
    private String date1;

    public searchFrame1() {
        initComponents();
        jLabel2.setVisible(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_s", "root", "");
            sdf = new SimpleDateFormat("dd-MM-yyyy");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        samp();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("JAVA Multiplex - Ticket Reservation System");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                searchframeclosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setMinimumSize(new java.awt.Dimension(771, 400));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(771, 400));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 17, 27));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cinemax Ticket Reservation System");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 420, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_cinemax.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -1, 190, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("--->");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 30, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("Date:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 40, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Date", "Today", "Tommorow" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("Movie Name:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Movie" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Show", "Morning", "Matinee", "Night" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 170, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 0));
        jLabel11.setText("Destination:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 90, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Movie Name", "Show Time", "RL Seats Available", "XC Seats Available", "NL Seats Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("Select Flight from search list for booking process");
        jTable1.setOpaque(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 770, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Select Flight from search list for booking process");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jButton2.setText("Book Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, -1, -1));

        jLabel3.setText("RL - Royal Class; XC - Executive Class; NL - Normal Class");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 0));
        jLabel12.setText("--->");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 30, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkin1.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Statement stmt = con.createStatement();
            stmt = con.createStatement();
            String sql1 = "SELECT * FROM `movie_info` WHERE `mname`='" + m_name + "' AND `show`='" + s_name + "' AND `day`='" + date1 + "'";// AND `mname`='"+m_name+"'";
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.getDataVector().removeAllElements();
            rs = stmt.executeQuery(sql1); //  AND  show = '"+s_name+"' ");
            Object[] rows;
            while (rs.next()) {
                rows = new Object[]{rs.getString("day"), rs.getString("mname"), rs.getString("show"), rs.getInt("rlseats"), rs.getInt("xcseats"), rs.getInt("nlseats")};
                model.addRow(rows);
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public Object GetData(JTable jTable1, int row_index, int col_index) {
        return jTable1.getModel().getValueAt(row_index, col_index);
    }
    String porigin;
    String ptarget;
    String pfclass;
    Date pdt;

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int rno = jTable1.getSelectedRow();
            obj1 = GetData(jTable1, rno, 0);
            obj2 = GetData(jTable1, rno, 1);
            obj3 = GetData(jTable1, rno, 2);
            obj4 = GetData(jTable1, rno, 3);
            obj5 = GetData(jTable1, rno, 4);
            obj6 = GetData(jTable1, rno, 5);

            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);
            System.out.println(obj4);
            System.out.println(obj5);
            System.out.println(obj6);
            //String strDate=obj1.toString();
            //pdt=sdf.parse(strDate);*/
        } catch (Exception pex) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (obj1 == null || obj2 == null || obj3 == null || obj4 == null || obj5 == null || obj6 == null) {
                JOptionPane.showMessageDialog(this, "Please Select filght from List");
            } else {
                bookingFrame1 bf1 = new bookingFrame1();
                nav_Frame1.jdpDesktop.remove(this);
                nav_Frame1.jdpDesktop.add(bf1);
                this.setVisible(false);
                bf1.setVisible(true);
                bf1.getSearchData(obj1, obj2, obj3);
            }
        } catch (NullPointerException nexc) {
            JOptionPane.showMessageDialog(this, nexc);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchframeclosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_searchframeclosing
        admin_frame.jdpDesktop.remove(this);
    }//GEN-LAST:event_searchframeclosing

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        try {
            m_name = jComboBox3.getSelectedItem().toString();
            //JOptionPane.showMessageDialog(this, m_name);
        } catch (Exception e) {
            System.out.println("Select any option!!!");
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        try {
            s_name = jComboBox4.getSelectedItem().toString();
            //JOptionPane.showMessageDialog(this, m_name);
        } catch (Exception e) {
            System.out.println("Select any option!!!");
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        try {
            date1 = jComboBox1.getSelectedItem().toString();
            //JOptionPane.showMessageDialog(this, m_name);
        } catch (Exception e) {
            System.out.println("Select any option!!!");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
        private void samp() {
        //Connection connection = null;
        try {
            Statement statement = con.createStatement();
            String query = "SELECT DISTINCT `mname` FROM `movie_info`";
            ResultSet rsi = statement.executeQuery(query);
            while (rsi.next()) {
                String name = rsi.getString("mname");
                jComboBox3.addItem(name);
            }//end while
            //   connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
