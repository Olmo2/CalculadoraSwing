/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.GUI;

import com.olmo.negocio.Calculadora;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 *
 * @author OLMO
 */
public class CalculadoraGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Calculadora calc;

    public CalculadoraGUI() {
        calc = new Calculadora();
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

        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonEq = new javax.swing.JButton();
        buttonRest = new javax.swing.JButton();
        buttonSum = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();
        buttonMult = new javax.swing.JButton();
        textResult = new javax.swing.JTextField();
        buttonClear = new javax.swing.JButton();
        buttonDot = new javax.swing.JButton();
        button0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        buttonEq.setText("=");
        buttonEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqActionPerformed(evt);
            }
        });

        buttonRest.setText("-");
        buttonRest.setMaximumSize(new java.awt.Dimension(34, 34));
        buttonRest.setMinimumSize(new java.awt.Dimension(34, 34));
        buttonRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestActionPerformed(evt);
            }
        });

        buttonSum.setText("+");
        buttonSum.setMaximumSize(new java.awt.Dimension(34, 34));
        buttonSum.setMinimumSize(new java.awt.Dimension(34, 34));
        buttonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumActionPerformed(evt);
            }
        });

        buttonDiv.setText("/");
        buttonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivActionPerformed(evt);
            }
        });

        buttonMult.setText("*");
        buttonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultActionPerformed(evt);
            }
        });

        textResult.setEditable(false);
        textResult.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        textResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonClear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonClear.setText("CE");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonDot.setText(".");
        buttonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDotActionPerformed(evt);
            }
        });

        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(buttonEq, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonSum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonRest, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(button1)
                                    .addComponent(button2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button7)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(button3)
                                .addComponent(buttonRest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDiv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button0)
                    .addComponent(buttonMult)
                    .addComponent(buttonDot))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        textResult.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*RESTA*/
    private void buttonRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(buttonRest.getText()));
    }//GEN-LAST:event_buttonRestActionPerformed

    /*SUMA*/
    private void buttonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(buttonSum.getText()));
    }//GEN-LAST:event_buttonSumActionPerformed

    /*NÚMERO 6*/
    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button6.getText()));
    }//GEN-LAST:event_button6ActionPerformed
    /*NÚMERO 1*/
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button1.getText()));
    }//GEN-LAST:event_button1ActionPerformed

    /*NÚMERO 4*/
    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button4.getText()));
    }//GEN-LAST:event_button4ActionPerformed
    /*NÚMERO 2*/
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button2.getText()));
    }//GEN-LAST:event_button2ActionPerformed

    /*NÚMERO 3*/
    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button3.getText()));
    }//GEN-LAST:event_button3ActionPerformed

    /*NÚMERO 5*/
    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button5.getText()));
    }//GEN-LAST:event_button5ActionPerformed

    /*NÚMERO 7*/
    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button7.getText()));
    }//GEN-LAST:event_button7ActionPerformed

    /*NÚMERO 8*/
    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button8.getText()));
    }//GEN-LAST:event_button8ActionPerformed

    /*NÚMERO 9*/
    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button9.getText()));
    }//GEN-LAST:event_button9ActionPerformed

    /*IGUAL*/

    private void buttonEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqActionPerformed
        System.out.println(Float.parseFloat("6.2"));

        String str;
        Float num1;
        Float num2;
        int i = 0;
        int inicio = 0;

        str = textResult.getText();

        for (i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case '+':
                    if (i != 0) {
                        num1 = Float.parseFloat(str.substring(inicio, i));
                        num2 = Float.parseFloat(str.substring(i + 1));
                        textResult.setText(calc.suma(num1, num2));

                    }
                    break;
                case '-':
                    if (i != 0) {
                        num1 = Float.parseFloat(str.substring(inicio, i));
                        num2 = Float.parseFloat(str.substring(i + 1));
                        textResult.setText(calc.resta(num1, num2));
                    }

                    break;
                case '*':
                    if (i != 0) {
                        num1 = Float.parseFloat(str.substring(inicio, i));
                        num2 = Float.parseFloat(str.substring(i + 1));
                        textResult.setText(calc.mult(num1, num2));
                    } else {
                        inicio = 1;
                    }
                    break;
                case '/':
                    if (i != 0) {
                        num1 = Float.parseFloat(str.substring(inicio, i));
                        num2 = Float.parseFloat(str.substring(i + 1));
                        textResult.setText(calc.div(num1, num2));
                    } else {
                        inicio = 1;
                    }

                    break;

            }
        }

    }//GEN-LAST:event_buttonEqActionPerformed

    /*DIVISIÓN*/
    private void buttonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(buttonDiv.getText()));
    }//GEN-LAST:event_buttonDivActionPerformed

    /*MULTIPLICACIÓN*/
    private void buttonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(buttonMult.getText()));
    }//GEN-LAST:event_buttonMultActionPerformed

    /*BORRAR*/
    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textResult.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    /*PUNTO*/
    private void buttonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDotActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(buttonDot.getText()));
    }//GEN-LAST:event_buttonDotActionPerformed

    /*CERO*/
    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        txt = textResult.getText();
        textResult.setText(txt.concat(button0.getText()));
    }//GEN-LAST:event_button0ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }

    public JTextField getTextResult() {
        return textResult;
    }

    public void setTextResult(String textResult) {
        this.textResult.setText(textResult);
    }

    private String txt;

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDiv;
    private javax.swing.JButton buttonDot;
    private javax.swing.JButton buttonEq;
    private javax.swing.JButton buttonMult;
    private javax.swing.JButton buttonRest;
    private javax.swing.JButton buttonSum;
    private javax.swing.JTextField textResult;
    // End of variables declaration//GEN-END:variables
}
