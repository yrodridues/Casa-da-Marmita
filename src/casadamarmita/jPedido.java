/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadamarmita;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class jPedido extends javax.swing.JFrame {

    ArrayList<Pedido> arquivoPedido;

    public int jPedido(int a) {
        initComponents();
        arquivoPedido = new ArrayList<>();
        return a;
    }
    
    public String Teste(String args[]){

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;
        int e = 0;
        int resultado = 0;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;

        //</editor-fold>

        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        qtde1 = new javax.swing.JTextField();
        qtde2 = new javax.swing.JTextField();
        qtde3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SELECIONE A OPÇÃO DESEJADA");

        jLabel2.setText("QUANTIDADE");

        jLabel3.setText("QUANTIDADE");

        jLabel4.setText("QUANTIDADE");

        jButton1.setText("Confirmar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        qtde1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtde1ActionPerformed(evt);
            }
        });

        jLabel5.setText("ARROZ, FEIJÃO, MACARRÃO A CARBONARA, FRANGO EMPANADO.");

        jLabel6.setText("ARROZ, FEIJÃO, BIFE DE BOI, FRANGO OU PORCO, FRITAS E SALADA");

        jLabel7.setText("ARROZ, FEIJÃO, FRICASSÊ CREMOSO DE FRANGO, BATATA PALHA.");

        jMenu1.setText("Inicio");
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtde2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtde3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(qtde1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(qtde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qtde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        Pedido p = new Pedido() {
            public void idPedido() {
            }
        };
        
        p.setQtde1(Float.parseFloat(qtde1.getText()));
        p.setQtde2(Float.parseFloat(qtde2.getText()));
        p.setQtde3(Float.parseFloat(qtde3.getText()));

        arquivoPedido.add(p);

        JOptionPane.showMessageDialog(null, "Produto gravado com sucesso.");
        
        String r = "";
        for (int i = 0; i < arquivoPedido.size(); i++) {
            r = r + "Preço 1: " + arquivoPedido.get(i).getQtde1()*10 + "\n";
        }
        int i = 0;
        r = r + "Preço 2: " + arquivoPedido.get(i).getQtde2()*12 + "\n";
        i = 0;
       r = r + "Preço 3: " + arquivoPedido.get(i).getQtde3()*15 + "\n";
        i = 0;
      
        JOptionPane.showMessageDialog(null, r);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jPrincipal pri = new jPrincipal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void qtde1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtde1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtde1ActionPerformed

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
            java.util.logging.Logger.getLogger(jPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField qtde1;
    private javax.swing.JTextField qtde2;
    private javax.swing.JTextField qtde3;
    // End of variables declaration//GEN-END:variables
}
