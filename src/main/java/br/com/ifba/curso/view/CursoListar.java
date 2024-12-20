/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CursoListar extends javax.swing.JFrame {

   
    public CursoListar() {
        initComponents();
        carregarTabela();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfProcurar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblAdd = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfProcurar.setText("Pesquisar...");
        txfProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfProcurarActionPerformed(evt);
            }
        });
        txfProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfProcurarKeyPressed(evt);
            }
        });
        getContentPane().add(txfProcurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblAdd.setText("Excluir:");

        lblEditar.setText("Editar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(lblEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd)
                    .addComponent(lblEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 170, 80));

        btnPesquisar.setText("jButton1");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblInfo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 170));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
      JOptionPane.showConfirmDialog(
      null,
        "Deseja excluir o curso selecionado?",
        "Excluir curso",
        JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txfProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfProcurarActionPerformed

    private void txfProcurarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfProcurarKeyPressed
        
    }//GEN-LAST:event_txfProcurarKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
                                               
        String idString = txfProcurar.getText();

        if (!idString.isEmpty()) {
            try {
                Long idCurso = Long.parseLong(idString);
                
                EntityManagerFactory entityManagerFactory = 
                        Persistence.createEntityManagerFactory("gerenciamento_curso");
                
                EntityManager entityManager = 
                        entityManagerFactory.createEntityManager();
            
                
                Curso cursoEncontrado = entityManager.find(Curso.class, idCurso);
            
               
                if (cursoEncontrado != null) {
                    JOptionPane.showMessageDialog(this, "Curso encontrado: " + cursoEncontrado.getNome(), 
                        "Curso Encontrado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Curso não encontrado com o ID: " + idCurso, 
                        "Curso Não Encontrado", JOptionPane.ERROR_MESSAGE);
                }
          
            entityManager.close();
            entityManagerFactory.close();
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um ID válido.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, insira um ID de curso.", 
            "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
                                        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void carregarTabela() {
        String url = "jdbc:mysql://localhost:3306/prg12_gerenciamento_curso";
        String usuario = "root";
        String senha = "root"; 
        
        DefaultTableModel tabela = (DefaultTableModel) tblInfo.getModel();
        tabela.setNumRows(0);
        
        tblInfo.getColumnModel().getColumn(0);
        tblInfo.getColumnModel().getColumn(1);
        tblInfo.getColumnModel().getColumn(2);
        
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement pstm;
            ResultSet rs;
            
            pstm = conexao.prepareStatement("select * from cursos;");
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                tabela.addRow(new Object[]{
                    rs.getString(4),
                    rs.getString(3),
                    rs.getString(2)
                });
            }
            
            rs.close();
            pstm.close();
            conexao.close();
            
        } catch(Exception ErroListar) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela: " + ErroListar, "ERRO", JOptionPane.ERROR);
        }     
    }

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
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txfProcurar;
    // End of variables declaration//GEN-END:variables
}
