/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proway_swing;

import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author 74703
 */
public class Exemplo extends javax.swing.JFrame {
    
    private int indicelinhaselecionada = -1;

    /**
     * Creates new form Exemplo
     */
    public Exemplo() {
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

        jLabelProduto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonApagar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelProduto.setText("Produto");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdutoActionPerformed(evt);
            }
        });

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        }

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExportar.setText("Exportat");
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProduto)
                    .addComponent(jLabelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonExportar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonApagar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExportar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nome = jTextFieldProduto.getText();
    
        DefaultTableModel modeloTabela = (DefaultTableModel) jTableProdutos.getModel();
        
        if (indicelinhaselecionada == -1){
            
            modeloTabela.addRow(new Object[]{nome});
        }else{
            modeloTabela.setValueAt(nome, indicelinhaselecionada,0);
            
            indicelinhaselecionada = -1;
        }
        
        jTextFieldProduto.setText("");
        
        jTextFieldProduto.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed

        int indicelinhaselecionada = jTableProdutos.getSelectedRow();
        
        if (indicelinhaselecionada == -1) {
        return; 
    }
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
                
        String nome = modelo.getValueAt(indicelinhaselecionada,0).toString();
        
        int opcaoEscolhida = JOptionPane.showConfirmDialog(
                this,
                "Deseja apagar o produto " + nome + "?","cuidado"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.WARNING_MESSAGE
        );
        if(opcaoEscolhida == JOptionPane.YES_OPTION){
            
            modelo.removeRow(indicelinhaselecionada);
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
 indicelinhaselecionada = jTableProdutos.getSelectedRow();
        
        if (indicelinhaselecionada == -1) {
        return; 
    }
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
                
        String nome = modelo.getValueAt(indicelinhaselecionada,0).toString(); 
        
        jTextFieldProduto.setText(nome);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed

try (Workbook planilha = new XSSFWorkbook()) {
            Sheet folha = planilha.createSheet("Produtos");

            Row linhaCabecalho = folha.createRow(0);
            linhaCabecalho.createCell(0).setCellValue("Nome");

            DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
            //percorrer cada uma das linhas da tabela
            for(var i = 0; i < modelo.getRowCount(); i ++){
                //obter o nome do produto iterada
                String nome = modelo.getValueAt (i,0) .toString();
                //criar uma linha na planilha
                Row linha = folha.createRow(i + 1);
                //criar uma celula definindo o nome do produto da linha iterada
                linha.createCell(0) .setCellValue(nome);
            }
            
            Path caminhoDesktop = Paths.get(
                    System.getProperty("user.home"), "Desktop");
            Path caminhoArquivo = caminhoDesktop.resolve("example.xlsx");
            
            FileOutputStream arquivoSaida = new FileOutputStream(caminhoArquivo.toFile());
            planilha.write(arquivoSaida);
            arquivoSaida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonExportarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
importarPlanilhaExcel();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void importarPlanilhaExcel() {
        //obter o caminha da pasta da area de trabalho do assunto
        var caminhoDesktop = Paths.get(
                System.getProperty("user.home"), "Desktop");
        //obter o caminho do arquivo do excel que será importado
        var caminhoArquivo = caminhoDesktop.resolve("example.xlsx");
        //Fará a abertura do arquivo excel
        if (!Files.exists(caminhoArquivo)) {
            System.out.println("star Trek");
            return;
        }
        try(Workbook workbook = new XSSFWorkbook(new FileInputStream(
                caminhoArquivo.toFile()))){
            // obter a planilha de produtos para importar para table
            var planilha = workbook.getSheet("produtos");
            //percorrer cada uma das linhas da planilha
            var modelo = (DefaultTableModel) jTableProdutos.getModel();
            for (var linha : planilha){
                //obter a primeira célula da linha alterada
                var celula = linha.getCell(0);
                //obter o texto da célula
                var textoCelula = celula.getStringCellValue();
                // Verificar se a linha é a linha do cabeçalho o usuario
                //continuar utilizando o sistema
                
                if(textoCelula.equals("Nome")){
                    continue;}
                modelo.addRow(new Object[] {textoCelula});
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldProduto;
    // End of variables declaration//GEN-END:variables
}
