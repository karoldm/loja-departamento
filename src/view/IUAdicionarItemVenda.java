package view;

import controller.ControladorProduto;
import controller.ControladorUsuario;
import controller.ControladorVendas;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

import model.ItemVenda;
import model.Produto;
import model.Usuario;
import model.Vendedor;

/**
 *
 * @author karol
 */
public class IUAdicionarItemVenda extends javax.swing.JDialog {

    private ArrayList<ItemVenda> itens = new ArrayList<>();
    private ControladorProduto controllerProdutos = new ControladorProduto();
    private ControladorVendas controllerVendas = new ControladorVendas();
    private ControladorUsuario controllerUsuarios = new ControladorUsuario();
    private float total = 0;
    private Vendedor vendedor = null;
    private Cliente cliente = null;

    /**
     * Creates new form IUVenda
     *
     * @param parent
     * @param modal
     */
    public IUAdicionarItemVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        jTableItens.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTableItens.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableItens.getColumnModel().getColumn(2).setPreferredWidth(400);
        jTableItens.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTableItens.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        DefaultTableCellRenderer c = new DefaultTableCellRenderer();  
 
        c.setHorizontalAlignment(SwingConstants.CENTER);
        
        jTableItens.getColumnModel().getColumn(0).setCellRenderer(c);
        jTableItens.getColumnModel().getColumn(1).setCellRenderer(c);
        jTableItens.getColumnModel().getColumn(2).setCellRenderer(c);
        jTableItens.getColumnModel().getColumn(3).setCellRenderer(c);
        jTableItens.getColumnModel().getColumn(4).setCellRenderer(c);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelar = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonInserirItem = new javax.swing.JButton();
        jTextFieldCodigoProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableItens = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jTextFieldCodigoVendedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Produtos");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jButtonCancelar.setBackground(new java.awt.Color(245, 66, 66));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonFinalizar.setBackground(new java.awt.Color(63, 201, 60));
        jButtonFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizar.setText("Próximo");
        jButtonFinalizar.setBorderPainted(false);
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonInserirItem.setBackground(new java.awt.Color(60, 121, 201));
        jButtonInserirItem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInserirItem.setText("Inserir Item");
        jButtonInserirItem.setBorderPainted(false);
        jButtonInserirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirItemActionPerformed(evt);
            }
        });

        jTextFieldCodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoProdutoFocusLost(evt);
            }
        });

        jLabel2.setText("Código do Produto:");

        jTableItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableItens);

        jLabel14.setText("Quantidade:");

        jLabel3.setText("Total:");

        jTextFieldValorTotal.setFocusable(false);

        jLabel4.setText("Código do Cliente:");

        jLabel5.setText("Código do Vendedor:");

        jTextFieldCodigoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoClienteFocusLost(evt);
            }
        });

        jTextFieldCodigoVendedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoVendedorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInserirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonInserirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonInserirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirItemActionPerformed
        String codigoProduto = jTextFieldCodigoProduto.getText();
        String quantidade = jTextFieldQuantidade.getText();

        if (!codigoProduto.isEmpty() && !quantidade.isEmpty()) {
            Produto produto = controllerProdutos.getProdutoByCodigo(
                    Integer.parseInt(codigoProduto));

            if (produto != null) {
                ItemVenda item = new ItemVenda(produto, Integer.parseInt(quantidade));
                itens.add(item);

                DefaultTableModel tableModel = (DefaultTableModel) jTableItens.getModel();

                Object[] produtoRow = new Object[5];
                produtoRow[0] = produto.getCodigoProduto();
                produtoRow[1] = produto.getNome();
                produtoRow[2] = produto.getDescricao();
                produtoRow[3] = String.format("%.2f", produto.getValor());
                produtoRow[4] = quantidade;

                tableModel.addRow(produtoRow);

                total += item.calcularTotal();

                jTextFieldValorTotal.setText(String.format("%.2f", total));

                jTextFieldCodigoProduto.setText("");
                jTextFieldQuantidade.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!", null, JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInserirItemActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        String codigoVendedor = jTextFieldCodigoVendedor.getText();
        String codigoCliente = jTextFieldCodigoCliente.getText();

        if (itens.size() > 0 && !codigoVendedor.isEmpty() && !codigoCliente.isEmpty()) {

            Usuario usuarioVendedor = controllerUsuarios.getUsuarioByCodigo(Integer.parseInt(codigoVendedor));
            Usuario usuarioCliente = controllerUsuarios.getUsuarioByCodigo(Integer.parseInt(codigoCliente));

            if (usuarioVendedor == null || !(usuarioVendedor instanceof Vendedor)) {
                JOptionPane.showMessageDialog(null, "Vendedor não  encontrado!", null, JOptionPane.ERROR_MESSAGE);
                jTextFieldCodigoVendedor.setText("");
                return;
            } else {
                vendedor = (Vendedor) usuarioVendedor;
            }

            if (usuarioCliente == null || !(usuarioCliente instanceof Cliente)) {
                JOptionPane.showMessageDialog(null, "Cliente não  encontrado!", null, JOptionPane.ERROR_MESSAGE);
                jTextFieldCodigoCliente.setText("");
                return;
            } else {
                cliente = (Cliente) usuarioCliente;
            }

            IUFinalizarVenda cad = new IUFinalizarVenda(null, true, itens, cliente, vendedor);
            cad.setLocationRelativeTo(this);
            cad.setVisible(true);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jTextFieldCodigoVendedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoVendedorFocusLost

    }//GEN-LAST:event_jTextFieldCodigoVendedorFocusLost

    private void jTextFieldCodigoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoClienteFocusLost

    }//GEN-LAST:event_jTextFieldCodigoClienteFocusLost

    private void jTextFieldCodigoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdutoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoProdutoFocusLost

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
            java.util.logging.Logger.getLogger(IUAdicionarItemVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUAdicionarItemVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUAdicionarItemVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUAdicionarItemVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUAdicionarItemVenda dialog = new IUAdicionarItemVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonInserirItem;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableItens;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldCodigoProduto;
    private javax.swing.JTextField jTextFieldCodigoVendedor;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
