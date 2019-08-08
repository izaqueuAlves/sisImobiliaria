package Telas;

import classesControle.ControleVenda;
import classesEntidade.Contrato_Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Tela_Consulta_Contrato_Venda extends javax.swing.JFrame {

    public Tela_Consulta_Contrato_Venda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbContratosEmAberto = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfIdContrato = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfCliente_proprietario = new javax.swing.JTextField();
        tfCliente_comprador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricaoGeral = new javax.swing.JTextArea();
        tfPrecoNegociado = new javax.swing.JTextField();
        btAlterarContrato = new javax.swing.JButton();
        btFecharContrato = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfCondicoesPagamento1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(715, 715));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Consultar Contratos de Venda em Aberto");

        cbContratosEmAberto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbContratosEmAberto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbContratosEmAbertoItemStateChanged(evt);
            }
        });
        cbContratosEmAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContratosEmAbertoActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o contrato de acordo com os negociantes:");

        jLabel3.setText("Identificador Contrato:");

        jLabel4.setText("Entedereço do Imóvel:");

        jLabel5.setText("Cliente Proprietário:");

        jLabel6.setText("Cliente comprador");

        jLabel7.setText("Nova Descrição das Condições Pagamento:");

        jLabel8.setText("Preço Negociado:");

        tfIdContrato.setEditable(false);

        tfEndereco.setEditable(false);

        tfCliente_proprietario.setEditable(false);

        tfCliente_comprador.setEditable(false);

        tfDescricaoGeral.setEditable(false);
        tfDescricaoGeral.setColumns(20);
        tfDescricaoGeral.setRows(5);
        jScrollPane1.setViewportView(tfDescricaoGeral);

        btAlterarContrato.setText("Editar Contrato");
        btAlterarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarContratoActionPerformed(evt);
            }
        });

        btFecharContrato.setText("Fechar Contrato");
        btFecharContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharContratoActionPerformed(evt);
            }
        });

        jLabel9.setText("Descrição Geral do Contrato:");

        tfCondicoesPagamento1.setColumns(20);
        tfCondicoesPagamento1.setRows(5);
        jScrollPane2.setViewportView(tfCondicoesPagamento1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfIdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addComponent(tfEndereco)
                                .addComponent(cbContratosEmAberto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tfPrecoNegociado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btAlterarContrato)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btFecharContrato))))
                                        .addComponent(jLabel5)
                                        .addComponent(tfCliente_proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(0, 315, Short.MAX_VALUE))
                                        .addComponent(tfCliente_comprador))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbContratosEmAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfIdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCliente_proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCliente_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPrecoNegociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFecharContrato)
                    .addComponent(btAlterarContrato))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbContratosEmAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContratosEmAbertoActionPerformed
        //cbContratosEmAberto.getSelectedItem();
        int i = cbContratosEmAberto.getSelectedIndex();

        Contrato_Venda contrato = contratos.get(i);

        tfIdContrato.setText(Integer.toString(contrato.getIdContrato()));
        tfEndereco.setText("" + contrato.getImovel().getEndereco().getLogradouro() + ", "
                + contrato.getImovel().getEndereco().getComplemento() + ", "
                + contrato.getImovel().getEndereco().getNumero() + ", " + contrato.getImovel().getEndereco().getBairro() + ", "
                + contrato.getImovel().getEndereco().getCidade() + "");
        tfCliente_comprador.setText(contrato.getComprador().getNomeCompleto());
        tfCliente_proprietario.setText(contrato.getImovel().getProprietario().getNomeCompleto());
        tfDescricaoGeral.setText(contrato.getDescricaoVenda());
        tfPrecoNegociado.setText(Float.toString(contrato.getValorVenda()));

    }//GEN-LAST:event_cbContratosEmAbertoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void atualizeContratos() {

        tfCliente_comprador.setText("");
        tfCondicoesPagamento1.setText("");
        tfDescricaoGeral.setText("");
        tfEndereco.setText("");
        tfIdContrato.setText("");
        tfPrecoNegociado.setText("");
        tfCliente_proprietario.setText("");

        ControleVenda ctrlCCV = new ControleVenda();
        contratos = ctrlCCV.BuscarEmAberto();

        List<String> contratosStr = new ArrayList<String>();

        for (int i = 0; i < contratos.size(); i++) {
            Contrato_Venda contrato = contratos.get(i);
            String aux = "id: " + contrato.getIdContrato() + ";Cliente: " + contrato.getComprador().getNomeCompleto() + "; Proprietario: " + contrato.getImovel().getProprietario().getNomeCompleto();
            contratosStr.add(i, aux);

        }

        cbContratosEmAberto.setModel(new DefaultComboBoxModel(contratosStr.toArray()));
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizeContratos();
    }//GEN-LAST:event_formWindowOpened

    private void cbContratosEmAbertoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbContratosEmAbertoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbContratosEmAbertoItemStateChanged

    private void btAlterarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarContratoActionPerformed
        ControleVenda ctrlCCV = new ControleVenda();

        int i = cbContratosEmAberto.getSelectedIndex();
        Contrato_Venda contrato = contratos.get(i);

        int id = contrato.getIdContrato();

        String condicoesPagamento = tfCondicoesPagamento1.getText();
        String precoNegociado = tfPrecoNegociado.getText();

        //Para não precisar altear a classe, farei um código maior aqui:
        String descricao = tfDescricaoGeral.getText();

        descricao.split("CLÁUSULA");

        if (ctrlCCV.AlterarEmAberto(id, condicoesPagamento, precoNegociado)) {
            JOptionPane.showMessageDialog(null, "Contrato editado com sucesso!", "Aviso", 2);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao editar contrato!", "Erro", 0);
        }
    }//GEN-LAST:event_btAlterarContratoActionPerformed

    private void btFecharContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharContratoActionPerformed
        ControleVenda ctrlCCV = new ControleVenda();

        int i = cbContratosEmAberto.getSelectedIndex();
        Contrato_Venda contrato = contratos.get(i);

        int id = contrato.getIdContrato();

        System.out.println("id" + id);

        if (ctrlCCV.FecharEmAberto(id)) {
            JOptionPane.showMessageDialog(null, "Contrato Fechado com sucesso! Contrato salvo no .PDF na pasta padrão.", "Aviso", 2);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao editar contrato!", "Erro", 0);
        }

        atualizeContratos();

    }//GEN-LAST:event_btFecharContratoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Consulta_Contrato_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Consulta_Contrato_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Consulta_Contrato_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Consulta_Contrato_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Consulta_Contrato_Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarContrato;
    private javax.swing.JButton btFecharContrato;
    private javax.swing.JComboBox<String> cbContratosEmAberto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfCliente_comprador;
    private javax.swing.JTextField tfCliente_proprietario;
    private javax.swing.JTextArea tfCondicoesPagamento1;
    private javax.swing.JTextArea tfDescricaoGeral;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfIdContrato;
    private javax.swing.JTextField tfPrecoNegociado;
    // End of variables declaration//GEN-END:variables
    List<Contrato_Venda> contratos = new ArrayList<Contrato_Venda>();
}
