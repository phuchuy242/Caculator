/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caculator;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 *
 * @author LENOVO
 */
public class frmDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form frmDangNhap
     */
    
    private double firstValue = 0;
    private String operator = "";
    private boolean resultDisplayed = false;
    
    public frmDangNhap() {
        initComponents();
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        buttonchia = new javax.swing.JButton();
        buttonmu2 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        buttonnhan = new javax.swing.JButton();
        buttonphantram = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttoncong = new javax.swing.JButton();
        buttonphanso = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        buttonxoa = new javax.swing.JButton();
        buttontru = new javax.swing.JButton();
        buttonbang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaLichsu = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                buttonchiaAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });

        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5));

        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1);

        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button2);

        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button3);

        buttonchia.setText("/");
        buttonchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonchiaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonchia);

        buttonmu2.setText("^2");
        buttonmu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmu2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonmu2);

        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button4);

        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button5);

        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button6);

        buttonnhan.setText("*");
        buttonnhan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                buttonnhanStateChanged(evt);
            }
        });
        buttonnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnhanActionPerformed(evt);
            }
        });
        jPanel2.add(buttonnhan);

        buttonphantram.setText("%");
        buttonphantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonphantramActionPerformed(evt);
            }
        });
        jPanel2.add(buttonphantram);

        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button7);

        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button8);

        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button9);

        buttoncong.setText("+");
        buttoncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncongActionPerformed(evt);
            }
        });
        jPanel2.add(buttoncong);

        buttonphanso.setText("1/x");
        buttonphanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonphansoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonphanso);

        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        jPanel2.add(button0);

        jButton9.setText("+/-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        buttonxoa.setText("C");
        buttonxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonxoaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonxoa);

        buttontru.setText("-");
        buttontru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontruActionPerformed(evt);
            }
        });
        jPanel2.add(buttontru);

        buttonbang.setText("=");
        buttonbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbangActionPerformed(evt);
            }
        });
        jPanel2.add(buttonbang);

        jLabel1.setText("Lịch Sử");

        TextAreaLichsu.setColumns(20);
        TextAreaLichsu.setRows(5);
        TextAreaLichsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaLichsuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TextAreaLichsu);

        jButton2.setText("Lưu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Cập Nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        if (resultDisplayed) {
            txtResult.setText("");  
            resultDisplayed = false;
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
    }//GEN-LAST:event_button0ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (resultDisplayed) {
            txtResult.setText("");  
            resultDisplayed = false;
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
    }//GEN-LAST:event_button1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if (resultDisplayed) {
            txtResult.setText("");  
            resultDisplayed = false;
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
    }//GEN-LAST:event_button4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       try {
        String text = txtResult.getText().trim();

        // Nếu là số nguyên thì chuyển sang số thực, ngược lại chuyển thành số nguyên
        if (text.matches("-?\\d+")) { // Kiểm tra nếu là số nguyên
            text = text + ".0"; // Chuyển thành số thực
        } else if (text.matches("-?\\d+\\.0")) { // Kiểm tra nếu là số thực dạng x.0
            text = text.substring(0, text.length() - 2); // Chuyển thành số nguyên
        }
        
        txtResult.setText(text);
    } catch (Exception e) {
        txtResult.setText("Error");
        e.printStackTrace();
    }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void buttonchiaAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_buttonchiaAncestorMoved
         
    }//GEN-LAST:event_buttonchiaAncestorMoved

    private void buttonbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbangActionPerformed
        // TODO add your handling code here:
         try {
        String equation = txtResult.getText();
        String[] parts = equation.split(" ");
    
        double firstValue = Double.parseDouble(parts[0]);  
        double secondValue = Double.parseDouble(parts[2]); 
        String operator = parts[1];  

        double result = 0;

        switch (operator) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                } else {
                    txtResult.setText("Error");
                    return;
                }
                break;
            default:
                txtResult.setText("Error");
                return;
        }
        
        String resultText = (result % 1 == 0) ? String.valueOf((int) result) : String.valueOf(result);
        txtResult.setText(equation + " = " + resultText);
        resultDisplayed = true;

        String history = TextAreaLichsu.getText();
        history += equation + " = " + resultText + "\n";  
        TextAreaLichsu.setText(history);
    } catch (Exception e) {
        txtResult.setText("Error");
    }

    }//GEN-LAST:event_buttonbangActionPerformed

    private void buttonnhanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_buttonnhanStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonnhanStateChanged

    private void buttonchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonchiaActionPerformed
         txtResult.setText(txtResult.getText() + " / ");
    }//GEN-LAST:event_buttonchiaActionPerformed

    private void buttonnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnhanActionPerformed
         txtResult.setText(txtResult.getText() + " * ");
    }//GEN-LAST:event_buttonnhanActionPerformed

    private void buttoncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncongActionPerformed
         txtResult.setText(txtResult.getText() + " + ");
    }//GEN-LAST:event_buttoncongActionPerformed

    private void buttontruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontruActionPerformed
         txtResult.setText(txtResult.getText() + " - ");
    }//GEN-LAST:event_buttontruActionPerformed

    private void buttonmu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmu2ActionPerformed
        try {
            double value = Double.parseDouble(txtResult.getText());  
            value = Math.pow(value, 2);  
            txtResult.setText(value + " ^ 2 = " + value);  

            resultDisplayed = true;
            String history = TextAreaLichsu.getText();
            history += value + " ^ 2 = " + value + "\n";  
            TextAreaLichsu.setText(history);  
        } catch (Exception e) {
            txtResult.setText("Error");  
        }
    }//GEN-LAST:event_buttonmu2ActionPerformed

    private void buttonphansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonphansoActionPerformed
        try {
            double value = Double.parseDouble(txtResult.getText());
            if (value != 0) {
                value = 1 / value;  
                txtResult.setText("1 / " + value + " = " + value);
                resultDisplayed = true;
                String history = TextAreaLichsu.getText();
                history += "1 / " + value + " = " + value + "\n";  
                TextAreaLichsu.setText(history);  
            } else {
                txtResult.setText("Error");
            }
        } catch (Exception e) {
            txtResult.setText("Error");
        }
    }//GEN-LAST:event_buttonphansoActionPerformed

    private void buttonphantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonphantramActionPerformed
        try {
            double value = Double.parseDouble(txtResult.getText());  
            value = value / 100;  
            txtResult.setText(value + " % = " + value);  
            resultDisplayed = true;
            String history = TextAreaLichsu.getText();
            history += value + " % = " + value + "\n";  
            TextAreaLichsu.setText(history);  
        } catch (Exception e) {
            txtResult.setText("Error");  
        }
    }//GEN-LAST:event_buttonphantramActionPerformed

    private void buttonxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonxoaActionPerformed
        txtResult.setText("");
    }//GEN-LAST:event_buttonxoaActionPerformed

    private void TextAreaLichsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaLichsuMouseClicked
        String selectedHistory = TextAreaLichsu.getSelectedText();
    
    if (selectedHistory != null && !selectedHistory.trim().isEmpty()) {
        txtResult.setText(selectedHistory.trim());
        resultDisplayed = false;
    } else {
        txtResult.setText(""); // Đảm bảo xóa nếu không có gì được chọn
    }

    // Debug kiểm tra xem có chọn được văn bản không
    System.out.println("Selected text: " + selectedHistory);
    }//GEN-LAST:event_TextAreaLichsuMouseClicked

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dulieu.txt", true))) {
        String data = TextAreaLichsu.getText();
        writer.write(data);
        writer.newLine(); 
        JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi lưu dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
        Files.write(Paths.get("dulieu.txt"), new byte[0]);
        TextAreaLichsu.setText("");
        JOptionPane.showMessageDialog(this, "Xóa toàn bộ dữ liệu thành công!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
    var lines = Files.readAllLines(Paths.get("dulieu.txt"));
    String text = String.join("\n", lines);
    TextAreaLichsu.setText(text);
    JOptionPane.showMessageDialog(this, "Tải dữ liệu thành công!");
} catch (IOException e) {
    JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaLichsu;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonbang;
    private javax.swing.JButton buttonchia;
    private javax.swing.JButton buttoncong;
    private javax.swing.JButton buttonmu2;
    private javax.swing.JButton buttonnhan;
    private javax.swing.JButton buttonphanso;
    private javax.swing.JButton buttonphantram;
    private javax.swing.JButton buttontru;
    private javax.swing.JButton buttonxoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
