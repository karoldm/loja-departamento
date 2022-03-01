
package view;

import controller.ControladorProduto;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karol
 */
public class IURelatorioProdutosVestuario extends javax.swing.JDialog {

    /**
     * Creates new form IURelatorioProdutosVestuario
     */
    public IURelatorioProdutosVestuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        tabelaProdutosVestuario.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabelaProdutosVestuario.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabelaProdutosVestuario.getColumnModel().getColumn(2).setPreferredWidth(400);
        tabelaProdutosVestuario.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabelaProdutosVestuario.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabelaProdutosVestuario.getColumnModel().getColumn(5).setPreferredWidth(200);
        tabelaProdutosVestuario.getColumnModel().getColumn(6).setPreferredWidth(200);
         
        DefaultTableCellRenderer c = new DefaultTableCellRenderer();
 
        c.setHorizontalAlignment(SwingConstants.CENTER);
        
        tabelaProdutosVestuario.getColumnModel().getColumn(0).setCellRenderer(c);
        tabelaProdutosVestuario.getColumnModel().getColumn(1).setCellRenderer(c);
        tabelaProdutosVestuario.getColumnModel().getColumn(2).setCellRenderer(c);
        tabelaProdutosVestuario.getColumnModel().getColumn(3).setCellRenderer(c);
        tabelaProdutosVestuario.getColumnModel().getColumn(4).setCellRenderer(c);
        tabelaProdutosVestuario.getColumnModel().getColumn(5).setCellRenderer(c);
        tabelaProdutosVestuario.getColumnModel().getColumn(6).setCellRenderer(c);
        
        ControladorProduto controller = new ControladorProduto();
        Object [][] row = controller.relatorioProdutosVestuario();
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutosVestuario.getModel();
        
        for(int i = 0; i < row.length; i++){
            modelo.addRow(row[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosVestuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos de Vestuário");
        setPreferredSize(new java.awt.Dimension(700, 300));

        tabelaProdutosVestuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição", "Fabricação", "Valor", "Fornecedor", "Disponível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutosVestuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(IURelatorioProdutosVestuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IURelatorioProdutosVestuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IURelatorioProdutosVestuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IURelatorioProdutosVestuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURelatorioProdutosVestuario dialog = new IURelatorioProdutosVestuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutosVestuario;
    // End of variables declaration//GEN-END:variables
}
