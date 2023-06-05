/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.VeiculoController;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Veiculo;

/**
 *
 * @author User
 */
public class QueryScreenVeiculo extends javax.swing.JDialog {

    Veiculo veiculo = new Veiculo();
    
     VeiculoController veiculoController = new VeiculoController();
    
    /**
     * Creates new form queryScreenVeiculo
     */
    public QueryScreenVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Alterar de Ve�culo");
        
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
        txtAcessorios = new javax.swing.JTextField();
        lblFabricante = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        cbAnoModelo = new javax.swing.JComboBox<>();
        btnAlterar = new javax.swing.JButton();
        txtFabricante = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        cbQtdPortas = new javax.swing.JComboBox<>();
        txtModelo = new javax.swing.JTextField();
        lblIdVeiculo = new javax.swing.JLabel();
        lblAnoModelo = new javax.swing.JLabel();
        lblShowId = new javax.swing.JLabel();
        lblQtdPortas = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblAcessorios = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        txtAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcessoriosActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcessorios);
        txtAcessorios.setBounds(63, 283, 264, 24);

        lblFabricante.setForeground(new java.awt.Color(255, 255, 255));
        lblFabricante.setText("*Fabricante");
        jPanel1.add(lblFabricante);
        lblFabricante.setBounds(55, 143, 65, 16);

        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("*Placa");
        jPanel1.add(lblPlaca);
        lblPlaca.setBounds(232, 77, 37, 16);

        cbAnoModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        cbAnoModelo.setSelectedIndex(9);
        jPanel1.add(cbAnoModelo);
        cbAnoModelo.setBounds(55, 223, 95, 26);

        btnAlterar.setBackground(new java.awt.Color(0, 46, 116));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(120, 320, 159, 38);

        txtFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFabricanteActionPerformed(evt);
            }
        });
        jPanel1.add(txtFabricante);
        txtFabricante.setBounds(55, 165, 95, 24);

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        jPanel1.add(txtPlaca);
        txtPlaca.setBounds(232, 99, 95, 24);

        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("*Modelo");
        jPanel1.add(lblModelo);
        lblModelo.setBounds(232, 143, 46, 16);

        cbQtdPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        jPanel1.add(cbQtdPortas);
        cbQtdPortas.setBounds(232, 223, 95, 26);

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo);
        txtModelo.setBounds(232, 165, 95, 24);

        lblIdVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblIdVeiculo.setText("ID do Ve�culo : ");
        jPanel1.add(lblIdVeiculo);
        lblIdVeiculo.setBounds(152, 31, 82, 16);

        lblAnoModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblAnoModelo.setText("*Ano do Modelo");
        jPanel1.add(lblAnoModelo);
        lblAnoModelo.setBounds(55, 201, 88, 16);

        lblShowId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblShowId);
        lblShowId.setBounds(152, 49, 82, 22);

        lblQtdPortas.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdPortas.setText("*Quantidade de Portas");
        jPanel1.add(lblQtdPortas);
        lblQtdPortas.setBounds(232, 201, 128, 16);

        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("*Numero");
        jPanel1.add(lblNumero);
        lblNumero.setBounds(55, 79, 50, 16);

        lblAcessorios.setForeground(new java.awt.Color(255, 255, 255));
        lblAcessorios.setText("Acess�rios");
        jPanel1.add(lblAcessorios);
        lblAcessorios.setBounds(161, 261, 65, 16);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero);
        txtNumero.setBounds(55, 101, 95, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background4.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFabricanteActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcessoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcessoriosActionPerformed

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked

        veiculo.setNumero(getTxtNumero().getText());
        veiculo.setPlaca(getTxtPlaca().getText());
        veiculo.setFabricante(getTxtFabricante().getText());
        veiculo.setModelo(getTxtModelo().getText());
        veiculo.setAnoModelo(Integer.parseInt((String) getCbAnoModelo().getSelectedItem()));
        veiculo.setAcessorios(getTxtAcessorios().getText());
        veiculo.setQtdPortas(Integer.parseInt((String) getCbQtdPortas().getSelectedItem()));
        veiculo.setId(Integer.parseInt(getLblShowId().getText()));
          
        if ( veiculo.getNumero().isEmpty() || veiculo.getPlaca().isEmpty() || veiculo.getFabricante().isEmpty() || veiculo.getModelo().isEmpty() ) {

            JOptionPane.showMessageDialog(null, "Existem Informa��es sem atribui��o, por favor preencha todos os dados");
            return;

        } else {
                veiculoController.update(veiculo);
                JOptionPane.showMessageDialog(null, "Altera��o realizada com sucesso");  
                dispose();
            } 
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
      
            
        


        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

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
            java.util.logging.Logger.getLogger(QueryScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QueryScreenVeiculo dialog = new QueryScreenVeiculo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    public javax.swing.JComboBox<String> cbAnoModelo;
    public javax.swing.JComboBox<String> cbQtdPortas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcessorios;
    private javax.swing.JLabel lblAnoModelo;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblIdVeiculo;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblQtdPortas;
    private javax.swing.JLabel lblShowId;
    private javax.swing.JTextField txtAcessorios;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCbAnoModelo() {
        return cbAnoModelo;
    }
    
    public JComboBox<String> getCbQtdPortas() {
        return cbQtdPortas;
    }
    
    public JLabel getLblShowId () {
        return lblShowId;
    }
     
    public JTextField getTxtAcessorios() {
        return txtAcessorios;
    }

    public void setTxtAcessorios(JTextField txtAcessorios) {
        this.txtAcessorios = txtAcessorios;
    }

    public JTextField getTxtFabricante() {
        return txtFabricante;
    }

    public void setTxtFabricante(JTextField txtFabricante) {
        this.txtFabricante = txtFabricante;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(JTextField txtNumero) {
        this.txtNumero = txtNumero;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public void setTxtPlaca(JTextField txtPlaca) {
        this.txtPlaca = txtPlaca;
    }

    
}
