
package view;

import controller.ControladorVendas;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karol
 */
public class IURelatorioVendasCartao extends javax.swing.JDialog {

    /**
     * Creates new form IURelatorioVendasCartao
     */
    public IURelatorioVendasCartao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        tabelaVendasCartao.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaVendasCartao.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabelaVendasCartao.getColumnModel().getColumn(2).setPreferredWidth(300);
        tabelaVendasCartao.getColumnModel().getColumn(3).setPreferredWidth(300);
        tabelaVendasCartao.getColumnModel().getColumn(4).setPreferredWidth(400);
        tabelaVendasCartao.getColumnModel().getColumn(5).setPreferredWidth(300);
        tabelaVendasCartao.getColumnModel().getColumn(6).setPreferredWidth(400);
        tabelaVendasCartao.getColumnModel().getColumn(7).setPreferredWidth(300);

        DefaultTableCellRenderer c = new DefaultTableCellRenderer();

        c.setHorizontalAlignment(SwingConstants.CENTER);

        tabelaVendasCartao.getColumnModel().getColumn(0).setCellRenderer(c);
        tabelaVendasCartao.getColumnModel().getColumn(1).setCellRenderer(c);
        tabelaVendasCartao.getColumnModel().getColumn(2).setCellRenderer(c);
        tabelaVendasCartao.getColumnModel().getColumn(3).setCellRenderer(c);
        tabelaVendasCartao.getColumnModel().getColumn(4).setCellRenderer(c);
        tabelaVendasCartao.getColumnModel().getColumn(5).setCellRenderer(c);
        tabelaVendasCartao.getColumnModel().getColumn(6).setCellRenderer(c);
        tabelaVendasCartao.getColumnModel().getColumn(7).setCellRenderer(c);
        
        ControladorVendas controller = new ControladorVendas();
        Object [][] row = controller.relatorioVendasCartao();
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaVendasCartao.getModel();
        
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
        tabelaVendasCartao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaVendasCartao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Vendedor", "Data", "Itens", "Total", "Desconto", "Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVendasCartao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(IURelatorioVendasCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IURelatorioVendasCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IURelatorioVendasCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IURelatorioVendasCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURelatorioVendasCartao dialog = new IURelatorioVendasCartao(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable tabelaVendasCartao;
    // End of variables declaration//GEN-END:variables
}