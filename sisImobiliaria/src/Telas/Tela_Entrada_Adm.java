package Telas;

import classesControle.Relatorios;
import classesEntidade.Contrato_Aluguel;
import classesEntidade.Corretor;
import classesEntidade.Imovel;
import classesEntidade.Cliente;
import classesEntidade.Situacao_Imovel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tela_Entrada_Adm extends javax.swing.JFrame {

    public Tela_Entrada_Adm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bem vindo ao sistema de Gestão Imobiliária");

        jMenu1.setText("Cadastrar");

        jMenuItem7.setText("Corretor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Comprador");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Locatário");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Proprietário");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Imóvel");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Venda de Imóvel");

        jMenuItem12.setText("Abrir Contrato Venda");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Consultar Contratos em Aberto");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Aluguel de Imóvel");

        jMenuItem14.setText("Abrir Contrato Aluguel");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Consultar Contratos em Aberto");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Gerar Relatório");

        jMenuItem1.setText("Corretores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Compradores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Proprietários");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Locatários");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Imóveis disponíveis");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Contratos Aluguel Vigentes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(476, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        //Gerar PDF aqui
        Corretor c = new Corretor();
        ArrayList<Corretor> a = new ArrayList<Corretor>();
        a = (ArrayList<Corretor>) c.GetTodos();
        String nome = "Relatório todos os corretores";
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(nome);

        for (Corretor a1 : a) {
            lista.add(a1.getNomeCompleto());
        }

        Relatorios.gerarRelatorio(lista, nome);

        JOptionPane.showMessageDialog(rootPane, "Um PDF será gerado e salvo na pasta raiz do projeto!");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        telaCadastrarComprador = new Tela_Cadastrar_Comprador();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadastrarComprador.setLocation((tela.width - telaCadastrarComprador.getSize().width) / 2, (tela.height - telaCadastrarComprador.getSize().height) / 2);
        telaCadastrarComprador.setVisible(true);     //mostra a tela de login do adm
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //Redirecionar Tela
        telaCadastrarCorretor = new Tela_Cadastrar_Corretor();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadastrarCorretor.setLocation((tela.width - telaCadastrarCorretor.getSize().width) / 2, (tela.height - telaCadastrarCorretor.getSize().height) / 2);
        telaCadastrarCorretor.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        //Redirecionar Tela
        telaCadastrarLocatario = new Tela_Cadastrar_Locatario();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadastrarLocatario.setLocation((tela.width - telaCadastrarLocatario.getSize().width) / 2, (tela.height - telaCadastrarLocatario.getSize().height) / 2);
        telaCadastrarLocatario.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        //Redirecionar Tela
        telaCadastrarProprietario = new Tela_Cadastrar_Proprietario();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadastrarProprietario.setLocation((tela.width - telaCadastrarProprietario.getSize().width) / 2, (tela.height - telaCadastrarProprietario.getSize().height) / 2);
        telaCadastrarProprietario.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        //Redirecionar Tela
        telaCadastrarImovel = new Tela_Cadastrar_Imovel();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadastrarImovel.setLocation((tela.width - telaCadastrarImovel.getSize().width) / 2, (tela.height - telaCadastrarImovel.getSize().height) / 2);
        telaCadastrarImovel.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        telaAberturaContratorVenda = new Tela_Abertura_Contrator_Venda();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaAberturaContratorVenda.setLocation((tela.width - telaAberturaContratorVenda.getSize().width) / 2, (tela.height - telaAberturaContratorVenda.getSize().height) / 2);
        telaAberturaContratorVenda.setVisible(true);     //mostra a tela de login do adm
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        telaConsultaContratoVenda = new Tela_Consulta_Contrato_Venda();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaConsultaContratoVenda.setLocation((tela.width - telaConsultaContratoVenda.getSize().width) / 2, (tela.height - telaConsultaContratoVenda.getSize().height) / 2);
        telaConsultaContratoVenda.setVisible(true);     //mostra a tela de login do adm
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        telaAberturaContratorAluguel = new Tela_Abertura_Contrato_Aluguel();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaAberturaContratorAluguel.setLocation((tela.width - telaAberturaContratorAluguel.getSize().width) / 2, (tela.height - telaAberturaContratorAluguel.getSize().height) / 2);
        telaAberturaContratorAluguel.setVisible(true);     //mostra a tela de login do adm
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        telaConsultaContratoAluguel = new Tela_Consulta_Contrato_Aluguel();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        telaConsultaContratoAluguel.setLocation((tela.width - telaConsultaContratoAluguel.getSize().width) / 2, (tela.height - telaConsultaContratoAluguel.getSize().height) / 2);
        telaConsultaContratoAluguel.setVisible(true);     //mostra a tela de login do adm

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Cliente c = new Cliente();
        ArrayList<Cliente> a = new ArrayList<Cliente>();

        a = (ArrayList<Cliente>) c.GetTodos();

        String nome = "Relatório todos os clientes";
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(nome);

        for (Cliente a1 : a) {
            lista.add(a1.getNomeCompleto());
        }

        Relatorios.gerarRelatorio(lista, nome);

        JOptionPane.showMessageDialog(rootPane, "Um PDF será gerado e salvo na pasta raiz do projeto!");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Cliente c = new Cliente();
        ArrayList<Cliente> a = new ArrayList<Cliente>();

        a = (ArrayList<Cliente>) c.getTodosProprietarios();

        String nome = "Relatório todos os Proprietarios";
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(nome);

        for (Cliente a1 : a) {
            lista.add(a1.getNomeCompleto());
        }

        Relatorios.gerarRelatorio(lista, nome);

        JOptionPane.showMessageDialog(rootPane, "Um PDF será gerado e salvo na pasta raiz do projeto!");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Cliente c = new Cliente();
        ArrayList<Cliente> a = new ArrayList<Cliente>();

        a = (ArrayList<Cliente>) c.getTodosLocatarios();

        String nome = "Relatório todos os Locatarios";
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(nome);

        for (Cliente a1 : a) {
            lista.add(a1.getNomeCompleto());
        }

        Relatorios.gerarRelatorio(lista, nome);

        JOptionPane.showMessageDialog(rootPane, "Um PDF será gerado e salvo na pasta raiz do projeto!");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Imovel c = new Imovel();
        ArrayList<Imovel> a = new ArrayList<Imovel>();

        a = (ArrayList<Imovel>) c.GetTodos();

        String nome = "Relatório todos os Imoveis disponível";
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(nome);

        for (Imovel a1 : a) {
            if (Situacao_Imovel.DISPONIVEL_ALGUEL.getValor() == a1.getSituacao_Imovel()) {
                lista.add(a1.getEndereco().toString() + ": Dispóvel para Aluguel");
            }
            if (a1.getSituacao_Imovel() == Situacao_Imovel.DISPONIVEL_VENDA.getValor()) {
                lista.add(a1.getEndereco().toString() + ": Dispóvel para Venda");
            }
            if (a1.getSituacao_Imovel() == Situacao_Imovel.DISPONIVEL_VENDA_ALUGUEL.getValor()) {
                lista.add(a1.getEndereco().toString() + ": Dispóvel para Venda e Aluguel");
            }
        }

        Relatorios.gerarRelatorio(lista, nome);

        JOptionPane.showMessageDialog(rootPane, "Um PDF será gerado e salvo na pasta raiz do projeto!");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Contrato_Aluguel c = new Contrato_Aluguel();
        ArrayList<Contrato_Aluguel> a = new ArrayList<Contrato_Aluguel>();

        a = (ArrayList<Contrato_Aluguel>) c.GetVigentes();

        String nome = "Relatório todos os Contratos de Aluguel Vigentes";
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(nome);

        for (Contrato_Aluguel a1 : a) {
            lista.add("Contrato: " + a1.getIdContrato() + ", Contratantes: Locatario" + a1.getLocatario().getNomeCompleto() + " Proprietário: " + a1.getImovel().getProprietario().getNomeCompleto());
        }

        Relatorios.gerarRelatorio(lista, nome);

        JOptionPane.showMessageDialog(rootPane, "Um PDF será gerado e salvo na pasta raiz do projeto!");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Entrada_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Entrada_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Entrada_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Entrada_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Entrada_Adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
    Tela_Cadastrar_Corretor telaCadastrarCorretor;
    Tela_Cadastrar_Comprador telaCadastrarComprador;
    Tela_Cadastrar_Locatario telaCadastrarLocatario;
    Tela_Cadastrar_Proprietario telaCadastrarProprietario;
    Tela_Cadastrar_Imovel telaCadastrarImovel;
    Tela_Abertura_Contrator_Venda telaAberturaContratorVenda;
    Tela_Abertura_Contrato_Aluguel telaAberturaContratorAluguel;
    Tela_Consulta_Contrato_Venda telaConsultaContratoVenda;
    Tela_Consulta_Contrato_Aluguel telaConsultaContratoAluguel;
}
