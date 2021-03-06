/*
 * To change this license header, choose License Headers in Theloai Theloaioperties.
 * To change this tSachlate file, choose Tools | TSachlates
 * and open the tSachlate in the editor.
 */
package GUI;

/**
 *
 * @author Huy
 */

import DLL.*;
import DAL.*;
import ENTITY.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MAIN extends javax.swing.JFrame {

    
    SachDLL SachDll=new SachDLL();
    ArrayList<Sach> listSach=new ArrayList<>();
    
    TacgiaDLL TacgiaDLL= new TacgiaDLL();
    ArrayList<Tacgia> listTacgia=new ArrayList<>();
    
    TheloaiDLL TheloaiDLL=new TheloaiDLL();
    ArrayList<Theloai> listTheloai=new ArrayList<>();
//ham hien thi ten phong ban
public void bidingTacgia(){
        listTacgia=TacgiaDLL.getAll();
        for(Tacgia d : listTacgia){
            cbxTacgia.addItem(d.getTgName());
        }
    }
 //ham hien thi ten du an
    public void bidingTheloai(){
        listTheloai=TheloaiDLL.getAll();
        for(Theloai d : listTheloai){
            cbxTheloai.addItem(d.getTlName());
        }
    }
 //ham hien thi du lieu nhan vien
    public void Biding(){
        listSach=SachDll.getALL();
        Vector clums=new Vector();
        clums.add("Mã sách");
        clums.add("Tên sách");
        clums.add("Năm XB");
        clums.add("Ngày nhập");
        clums.add("Số lượng");
        clums.add("Đơn giá");
        clums.add("Tác giả");
        clums.add("Thể loại");
        Vector data=new Vector();
        for(Sach S : listSach){
            Vector row=new Vector();
            row.add(S.getsID());
            row.add(S.getTenSach());
            row.add(S.getNamXB());
            row.add(S.getNgayNhap());
            row.add(S.getSoLuong());
            row.add(S.getDonGia());
            listTacgia=TacgiaDLL.getByID(S.getTgID());
            if(listTacgia.size()>0){
                row.add(listTacgia.get(0).getTgName());
            }else{
                row.add("is Empty");
            }
            
            listTheloai=TheloaiDLL.getByID(S.getTlID());
            if(listTheloai.size()>0){
                row.add(listTheloai.get(0).getTlName());
            }else{
                row.add("is Empty");
            }
            data.add(row);
        }
        DefaultTableModel dtm=new DefaultTableModel(data,clums);
        tbSach.setModel(dtm);
    }
    
    
    /**
     * Creates new form MAIN
     */
    public MAIN() {
        initComponents();
        Biding();
        bidingTheloai();
        bidingTacgia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        txtTensach = new javax.swing.JTextField();
        txtNamXB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgaynhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDongia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxTacgia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxTheloai = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lb_name = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMasach = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Năm XB", "Ngày nhập", "Số lượng", "Đơn giá", "Tác giả", "Thể loại"
            }
        ));
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        txtTensach.setName("txt_sachName"); // NOI18N

        txtNamXB.setName("txt_namXB"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Mã sách");

        txtNgaynhap.setName("txt_ngayNhap"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Tên sách");

        txtSoluong.setName("txt_soLuong"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Năm xuất bản");

        txtDongia.setName("txt_donGia"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Ngày nhập");

        cbxTacgia.setName("cb_tgID"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Số lượng");

        cbxTheloai.setName("cb_tlID"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Đơn giá");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Xin chào !");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Cập nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Tác giả");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Thêm mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lb_name.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lb_name.setForeground(java.awt.Color.blue);
        lb_name.setText("Huy");
        lb_name.setName("jlabel_name"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Thể loại");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Quản lý sách");

        txtMasach.setName("txt_sID"); // NOI18N

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("Hệ thống");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Đăng nhập");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Thoát");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        jMenuItem4.setText("Hiển thị danh mục sách");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Hiển thị danh mục tác giả");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Hiển thị danh mục thể loại");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Trợ giúp");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 16, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbxTacgia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMasach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                        .addComponent(txtTensach, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNamXB, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(51, 51, 51)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(jLabel11)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSoluong, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNgaynhap, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDongia)
                                        .addComponent(cbxTheloai, 0, 204, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lb_name)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(48, 48, 48)
                        .addComponent(jButton4)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(lb_name))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNgaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(cbxTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         listSach=SachDll.getALL();
        listTacgia=TacgiaDLL.getAll();
        
        listSach=SachDll.getALL();
        listTacgia=TacgiaDLL.getAll();
        
        String sID=txtMasach.getText();
        String tenSach=txtTensach.getText();
        String namXB=txtNamXB.getText();
        String ngayNhap=txtNgaynhap.getText();
        String soLuong=txtSoluong.getText();
        String donGia=txtDongia.getText();
        int tgID=cbxTacgia.getSelectedIndex();
        int tlID=cbxTheloai.getSelectedIndex();

        int idTg=listTacgia.get(tgID).getTgID();
        int idTl=listTheloai.get(tlID).getTlID();

        Sach s=new Sach();
        s.setsID(Integer.valueOf(sID));
        s.setTenSach(tenSach);
        s.setNamXB(Integer.valueOf(namXB));
        s.setNgayNhap(ngayNhap);
        s.setSoLuong(Integer.valueOf(soLuong));
        s.setDonGia(Integer.valueOf(donGia));
        s.setTgID(idTg);
        s.setTlID(idTl);

        if(SachDll.Update(s)){
            JOptionPane.showMessageDialog(this, "Update emp Success.!");
            Biding();
        }else{
            JOptionPane.showMessageDialog(this, "Update emp Fail.!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        // TODO add your handling code here:
        if(tbSach.getSelectedRow()!=-1){
            int row=tbSach.getSelectedRow();
            listSach=SachDll.getALL();
            
            txtMasach.setText(String.valueOf(listSach.get(row).getsID()));
            txtTensach.setText(listSach.get(row).getTenSach());
            txtNamXB.setText(String.valueOf(listSach.get(row).getNamXB()));
            txtNgaynhap.setText(listSach.get(row).getNgayNhap());
            txtSoluong.setText(String.valueOf(listSach.get(row).getSoLuong()));
            txtDongia.setText(String.valueOf(listSach.get(row).getDonGia()));

            listTacgia=TacgiaDLL.getByID(listSach.get(row).getTgID());
            if(listTacgia.size()>0){
                cbxTacgia.setSelectedItem(listTacgia.get(0).getTgID());
            }else{
                cbxTacgia.setSelectedIndex(0);
            }

            listTheloai=TheloaiDLL.getByID(listSach.get(row).getTlID());
            if(listTheloai.size()>0){
                cbxTheloai.setSelectedItem(listTheloai.get(0).getTlID());
            }else{
                cbxTheloai.setSelectedIndex(0);
            }
        }
        
    }//GEN-LAST:event_tbSachMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        listSach=SachDll.getALL();
        listTacgia=TacgiaDLL.getAll();
        
        String sID=txtMasach.getText();
        String tenSach=txtTensach.getText();
        String namXB=txtNamXB.getText();
        String ngayNhap=txtNgaynhap.getText();
        String soLuong=txtSoluong.getText();
        String donGia=txtDongia.getText();
        int tgID=cbxTacgia.getSelectedIndex();
        int tlID=cbxTheloai.getSelectedIndex();

        int idTg=listTacgia.get(tgID).getTgID();
        int idTl=listTheloai.get(tlID).getTlID();

        Sach s=new Sach();
        s.setsID(Integer.valueOf(sID));
        s.setTenSach(tenSach);
        s.setNamXB(Integer.valueOf(namXB));
        s.setNgayNhap(ngayNhap);
        s.setSoLuong(Integer.valueOf(soLuong));
        s.setDonGia(Integer.valueOf(donGia));
        s.setTgID(idTg);
        s.setTlID(idTl);
        if(SachDll.AddData(s)){
            JOptionPane.showMessageDialog(this, "Thêm Hoàn tất.!");
            Biding();
        }else{
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       listSach=SachDll.getALL();
        
        String sID=txtMasach.getText();

        Sach s=new Sach();
        s.setsID(Integer.valueOf(sID) );
        if(SachDll.Delete(s)){
            JOptionPane.showMessageDialog(this, "Delete emp Success.!");
            Biding();
        }else{
            JOptionPane.showMessageDialog(this, "Delete emp Fail.!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxTacgia;
    private javax.swing.JComboBox<String> cbxTheloai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JLabel lb_name;
    private javax.swing.JTable tbSach;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtMasach;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtNgaynhap;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTensach;
    // End of variables declaration//GEN-END:variables
}
