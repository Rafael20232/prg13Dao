/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import br.com.ifba.curso.controller.CursoController;
import br.com.ifba.entity.Curso;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CursoListar extends javax.swing.JFrame {

    public CursoListar() {
        initComponents();
        mostrarTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPesquisar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblEditar = new javax.swing.JLabel();
        lblExcluir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        txtAtualizar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnCadastrar.setText("Add");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 40, 20));

        btnEditar.setBackground(new java.awt.Color(0, 0, 255));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 40, 20));

        lblEditar.setText("Editar:");
        getContentPane().add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        lblExcluir.setText("Excluir:");
        getContentPane().add(lblExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 200, -1));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        txtAtualizar.setText("Pesquisar...");
        getContentPane().add(txtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Cod Curso", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTabela);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        AddNewTela cadastrar = new AddNewTela();
        cadastrar.setDefaultCloseOperation(CursoListar.DISPOSE_ON_CLOSE);
        cadastrar.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        CursoController cursoDao = new CursoController();
        List <Curso> cursos = cursoDao.findAll();
   
        DefaultTableModel tableModel = (DefaultTableModel) tblTabela.getModel();
        tableModel.setRowCount(0);

        // Adiciona os cursos à tabela
        for (Curso curso : cursos) {
            tableModel.addRow(new Object[]{
            curso.getId(),
            curso.getNome(),
            curso.getCodigoCurso(),
            curso.getAtivo()
            });
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        CursoController cursoDao = new CursoController(); 
        
        Curso curso = new Curso();

        // Obtém o índice da linha selecionada na tabela tblCurso.
        int linhaSelecionada = tblTabela.getSelectedRow(); 

        if (linhaSelecionada != -1) { 
            // Obtém o ID do curso na coluna 0 da linha selecionada.
            long idCurso = (long) tblTabela.getValueAt(linhaSelecionada, 0); 
            // Busca o curso no banco de dados pelo ID.
            curso = cursoDao.findById(idCurso); 
            // Exclui o curso encontrado do banco de dados.
            cursoDao.delete(curso); 
            // Remove a linha correspondente ao curso da tabela na interface gráfica.
            DefaultTableModel tableModel = (DefaultTableModel) tblTabela.getModel(); 
            tableModel.removeRow(linhaSelecionada); 
        } else {
    JOptionPane.showMessageDialog(this, "Selecione o curso a ser excluido."); 
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
                                             
        CursoController cursoDao = new CursoController();  
        String text = txtAtualizar.getText().trim();

        Curso curso = cursoDao.findByCodCurso(text);

        if (curso != null) {
            JOptionPane.showMessageDialog(this, 
                    "Curso Encontrado:\n" +
                    "ID: " + curso.getId() + "\n" +
                    "Nome: " + curso.getNome() + "\n" +
                    "Código: " + curso.getCodigoCurso());
        } else {
            JOptionPane.showMessageDialog(this, "Curso não encontrado");
        } 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
                                                
        EditaNewTela cadastrar = new EditaNewTela();
        cadastrar.setDefaultCloseOperation(CursoListar.DISPOSE_ON_CLOSE);
        cadastrar.setVisible(true);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mostrarTabela () {
        CursoController cursoDao = new CursoController();
        List<Curso> cursos = cursoDao.findAll();
   
        DefaultTableModel tableModel = (DefaultTableModel) tblTabela.getModel();
        tableModel.setRowCount(0);

        // Adiciona os cursos à tabela
        for (Curso curso : cursos) {
            tableModel.addRow(new Object[]{
            curso.getId(),
            curso.getNome(),
            curso.getCodigoCurso(),
            curso.getAtivo()
            });
        }
    }
     
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
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtAtualizar;
    // End of variables declaration//GEN-END:variables
}
