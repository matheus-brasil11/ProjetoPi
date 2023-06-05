/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.VeiculoController;
import javax.swing.JOptionPane;
import model.Veiculo;

/**
 *
 * @author User
 */
public class RegistrationScreenVeiculo extends javax.swing.JDialog {

    /**
     * Creates new form RegistrationScreenVeiculo
     */
    public RegistrationScreenVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro de Ve�culo");
    }
    
    public RegistrationScreenVeiculo() {
        setTitle("Cadastro de Ve�culo");
        initComponents();
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
        lblAcessorios = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtAcessorios = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        cbQtdPortas = new javax.swing.JComboBox<>();
        txtPlaca = new javax.swing.JTextField();
        cbAnoModelo = new javax.swing.JComboBox<>();
        lblFabricante = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblAnoModelo = new javax.swing.JLabel();
        lblQtdPortas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        lblAcessorios.setForeground(new java.awt.Color(255, 255, 255));
        lblAcessorios.setText("Acess�rios");
        jPanel1.add(lblAcessorios);
        lblAcessorios.setBounds(147, 207, 65, 16);

        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("*Numero");
        jPanel1.add(lblNumero);
        lblNumero.setBounds(50, 31, 50, 16);

        txtAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcessoriosActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcessorios);
        txtAcessorios.setBounds(50, 227, 269, 24);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero);
        txtNumero.setBounds(50, 53, 95, 24);

        btnCadastrar.setBackground(new java.awt.Color(0, 46, 116));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(101, 263, 159, 38);

        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("*Placa");
        jPanel1.add(lblPlaca);
        lblPlaca.setBounds(220, 30, 37, 16);

        cbQtdPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        jPanel1.add(cbQtdPortas);
        cbQtdPortas.setBounds(224, 175, 95, 26);

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        jPanel1.add(txtPlaca);
        txtPlaca.setBounds(220, 50, 95, 24);

        cbAnoModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        cbAnoModelo.setSelectedIndex(9);
        jPanel1.add(cbAnoModelo);
        cbAnoModelo.setBounds(50, 175, 95, 26);

        lblFabricante.setForeground(new java.awt.Color(255, 255, 255));
        lblFabricante.setText("*Fabricante");
        jPanel1.add(lblFabricante);
        lblFabricante.setBounds(50, 95, 65, 16);

        txtFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFabricanteActionPerformed(evt);
            }
        });
        jPanel1.add(txtFabricante);
        txtFabricante.setBounds(50, 117, 95, 24);

        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("*Modelo");
        jPanel1.add(lblModelo);
        lblModelo.setBounds(220, 100, 46, 16);

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo);
        txtModelo.setBounds(220, 120, 95, 24);

        lblAnoModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblAnoModelo.setText("*Ano do Modelo");
        jPanel1.add(lblAnoModelo);
        lblAnoModelo.setBounds(50, 153, 88, 16);

        lblQtdPortas.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdPortas.setText("*Quantidade de Portas");
        jPanel1.add(lblQtdPortas);
        lblQtdPortas.setBounds(220, 160, 128, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background3.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-180, -200, 820, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked

  
        VeiculoController veiculoController = new VeiculoController();
        Veiculo veiculo = new Veiculo();

        veiculo.setNumero(txtNumero.getText());
        veiculo.setPlaca(txtPlaca.getText());
        veiculo.setFabricante(txtFabricante.getText());
        veiculo.setModelo(txtModelo.getText());
        veiculo.setAnoModelo(Integer.parseInt((String) cbAnoModelo.getSelectedItem()));
        veiculo.setQtdPortas(Integer.parseInt((String) cbQtdPortas.getSelectedItem()));;
        veiculo.setAcessorios(txtAcessorios.getText());
        

        if ( veiculo.getNumero().isEmpty() || veiculo.getPlaca().isEmpty() || veiculo.getFabricante().isEmpty() || veiculo.getModelo().isEmpty() ) {

            JOptionPane.showMessageDialog(null, "Existem Informa��es sem atribui��o, por favor preencha todos os dados");
            return;

        } else {
            boolean result = veiculoController.save(veiculo);

            if(result) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                dispose();
            } 
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFabricanteActionPerformed

    private void txtAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcessoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcessoriosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationScreenVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrationScreenVeiculo dialog = new RegistrationScreenVeiculo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbAnoModelo;
    private javax.swing.JComboBox<String> cbQtdPortas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcessorios;
    private javax.swing.JLabel lblAnoModelo;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblQtdPortas;
    private javax.swing.JTextField txtAcessorios;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
