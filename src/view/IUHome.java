package view;

/**
 *
 * @author karol
 */
public class IUHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public IUHome() {
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

        labelBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadastrarCliente = new javax.swing.JMenuItem();
        jMenuItemCadastrarVendedor = new javax.swing.JMenuItem();
        jMenuItemCadastrarFornecedor = new javax.swing.JMenuItem();
        jMenuItemCadastrarProduto = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemRealizarVenda = new javax.swing.JMenuItem();
        jMenuConsultar = new javax.swing.JMenu();
        jMenuItemRelProdutosCadastrados = new javax.swing.JMenuItem();
        jMenuItemRelProdutosAlimenticios = new javax.swing.JMenuItem();
        jMenuItemRelProdutosEletrodomesticos = new javax.swing.JMenuItem();
        jMenuItemRelProdutosEletronicos = new javax.swing.JMenuItem();
        jMenuItemRelProdutosVestuario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemRelProdutosMaisVendidos = new javax.swing.JMenuItem();
        jMenuItemRelFornecedoresCadastrados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemRelVendedoresCadastrados = new javax.swing.JMenuItem();
        jMenuItemClientesCadastrados = new javax.swing.JMenuItem();
        jMenuItemClientesOuro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemVendasCliente = new javax.swing.JMenuItem();
        jMenuItemVendasRealizadas = new javax.swing.JMenuItem();
        jMenuItemVendasDinheiro = new javax.swing.JMenuItem();
        jMenuItemVendasPIX = new javax.swing.JMenuItem();
        jMenuItemVendasCartao = new javax.swing.JMenuItem();
        jMenuItemVendasMes = new javax.swing.JMenuItem();
        jMenuItemVendedorMes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja Departamento");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(626, 469));
        setResizable(false);

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/background.jpg"))); // NOI18N
        labelBackground.setPreferredSize(new java.awt.Dimension(626, 469));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenuCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuCadastrar.setText("cadastrar");

        jMenuItemCadastrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/adicionar-usuario.png"))); // NOI18N
        jMenuItemCadastrarCliente.setText("cliente");
        jMenuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastrarCliente);

        jMenuItemCadastrarVendedor.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemCadastrarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/adicionar-usuario.png"))); // NOI18N
        jMenuItemCadastrarVendedor.setText("vendedor");
        jMenuItemCadastrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarVendedorActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastrarVendedor);

        jMenuItemCadastrarFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/fornecedor.png"))); // NOI18N
        jMenuItemCadastrarFornecedor.setText("fornecedor");
        jMenuItemCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastrarFornecedor);

        jMenuItemCadastrarProduto.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/produto.png"))); // NOI18N
        jMenuItemCadastrarProduto.setText("produto");
        jMenuItemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastrarProduto);

        jMenuBar1.add(jMenuCadastrar);

        jMenuVenda.setBackground(new java.awt.Color(255, 255, 255));
        jMenuVenda.setText("venda");

        jMenuItemRealizarVenda.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/comprar.png"))); // NOI18N
        jMenuItemRealizarVenda.setText("realizar venda");
        jMenuItemRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemRealizarVenda);

        jMenuBar1.add(jMenuVenda);

        jMenuConsultar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuConsultar.setText("consultar");

        jMenuItemRelProdutosCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelProdutosCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelProdutosCadastrados.setText("produtos cadastrados");
        jMenuItemRelProdutosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelProdutosCadastradosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelProdutosCadastrados);

        jMenuItemRelProdutosAlimenticios.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelProdutosAlimenticios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelProdutosAlimenticios.setText("produtos alimentícios");
        jMenuItemRelProdutosAlimenticios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelProdutosAlimenticiosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelProdutosAlimenticios);

        jMenuItemRelProdutosEletrodomesticos.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelProdutosEletrodomesticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelProdutosEletrodomesticos.setText("produtos eletrodomesticos");
        jMenuItemRelProdutosEletrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelProdutosEletrodomesticosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelProdutosEletrodomesticos);

        jMenuItemRelProdutosEletronicos.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelProdutosEletronicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelProdutosEletronicos.setText("produtos eletrônicos");
        jMenuItemRelProdutosEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelProdutosEletronicosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelProdutosEletronicos);

        jMenuItemRelProdutosVestuario.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelProdutosVestuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelProdutosVestuario.setText("produtos vestuário");
        jMenuItemRelProdutosVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelProdutosVestuarioActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelProdutosVestuario);

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItem2.setText("produtos ordenados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItem2);

        jMenuItemRelProdutosMaisVendidos.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelProdutosMaisVendidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelProdutosMaisVendidos.setText("dez produtos mais vendidos");
        jMenuItemRelProdutosMaisVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelProdutosMaisVendidosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelProdutosMaisVendidos);

        jMenuItemRelFornecedoresCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelFornecedoresCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelFornecedoresCadastrados.setText("fornecedores cadastrados");
        jMenuItemRelFornecedoresCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelFornecedoresCadastradosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelFornecedoresCadastrados);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuConsultar.add(jSeparator1);

        jMenuItemRelVendedoresCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelVendedoresCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemRelVendedoresCadastrados.setText("vendedores cadastrados");
        jMenuItemRelVendedoresCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelVendedoresCadastradosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemRelVendedoresCadastrados);

        jMenuItemClientesCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemClientesCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemClientesCadastrados.setText("clientes cadastrados");
        jMenuItemClientesCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesCadastradosActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemClientesCadastrados);

        jMenuItemClientesOuro.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemClientesOuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemClientesOuro.setText("clientes de ouro");
        jMenuItemClientesOuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesOuroActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemClientesOuro);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuConsultar.add(jSeparator2);

        jMenuItemVendasCliente.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVendasCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemVendasCliente.setText("vendas de um cliente");
        jMenuItemVendasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasClienteActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemVendasCliente);

        jMenuItemVendasRealizadas.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVendasRealizadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemVendasRealizadas.setText("vendas realizadas");
        jMenuItemVendasRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasRealizadasActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemVendasRealizadas);

        jMenuItemVendasDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVendasDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemVendasDinheiro.setText("vendas realizadas em dinheiro");
        jMenuItemVendasDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasDinheiroActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemVendasDinheiro);

        jMenuItemVendasPIX.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVendasPIX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemVendasPIX.setText("vendas realizadas em PIX");
        jMenuItemVendasPIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasPIXActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemVendasPIX);

        jMenuItemVendasCartao.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVendasCartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemVendasCartao.setText("vendas realizadas em cartão de crédito");
        jMenuItemVendasCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasCartaoActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemVendasCartao);

        jMenuItemVendasMes.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVendasMes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemVendasMes.setText("vendas mês");
        jMenuItemVendasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasMesActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemVendasMes);

        jMenuItemVendedorMes.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVendedorMes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/relatorio.png"))); // NOI18N
        jMenuItemVendedorMes.setText("vendedor do mês");
        jMenuItemVendedorMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedorMesActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemVendedorMes);

        jMenuBar1.add(jMenuConsultar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarClienteActionPerformed

        IUCadastrarCliente cad = new IUCadastrarCliente(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItemCadastrarClienteActionPerformed

    private void jMenuItemCadastrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarVendedorActionPerformed

        IUCadastrarVendedor cad = new IUCadastrarVendedor(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItemCadastrarVendedorActionPerformed

    private void jMenuItemCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarFornecedorActionPerformed

        IUCadastrarFornecedor cad = new IUCadastrarFornecedor(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItemCadastrarFornecedorActionPerformed

    private void jMenuItemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarProdutoActionPerformed

        IUCadastrarProduto cad = new IUCadastrarProduto(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItemCadastrarProdutoActionPerformed

    private void jMenuItemRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarVendaActionPerformed

        IUAdicionarItemVenda cad = new IUAdicionarItemVenda(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItemRealizarVendaActionPerformed

    private void jMenuItemRelProdutosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutosCadastradosActionPerformed

        IURelatorioProdutosCadastrados rel = new IURelatorioProdutosCadastrados(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelProdutosCadastradosActionPerformed

    private void jMenuItemRelProdutosAlimenticiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutosAlimenticiosActionPerformed

        IURelatorioProdutosAlimenticios rel = new IURelatorioProdutosAlimenticios(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelProdutosAlimenticiosActionPerformed

    private void jMenuItemRelProdutosEletrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutosEletrodomesticosActionPerformed

        IURelatorioProdutosEletrodomesticos rel = new IURelatorioProdutosEletrodomesticos(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelProdutosEletrodomesticosActionPerformed

    private void jMenuItemRelProdutosEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutosEletronicosActionPerformed

        IURelatorioProdutosEletronicos rel = new IURelatorioProdutosEletronicos(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelProdutosEletronicosActionPerformed

    private void jMenuItemRelProdutosVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutosVestuarioActionPerformed

        IURelatorioProdutosVestuario rel = new IURelatorioProdutosVestuario(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelProdutosVestuarioActionPerformed

    private void jMenuItemRelProdutosMaisVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutosMaisVendidosActionPerformed

        IURelatorioProdutosMaisVendidos rel = new IURelatorioProdutosMaisVendidos(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelProdutosMaisVendidosActionPerformed

    private void jMenuItemRelFornecedoresCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelFornecedoresCadastradosActionPerformed

        IURelatorioFornecedoresCadastrados rel = new IURelatorioFornecedoresCadastrados(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelFornecedoresCadastradosActionPerformed

    private void jMenuItemRelVendedoresCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelVendedoresCadastradosActionPerformed

        IURelatorioVendedoresCadastrados rel = new IURelatorioVendedoresCadastrados(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelVendedoresCadastradosActionPerformed

    private void jMenuItemClientesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesCadastradosActionPerformed

        IURelatorioClientesCadastrados rel = new IURelatorioClientesCadastrados(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemClientesCadastradosActionPerformed

    private void jMenuItemClientesOuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesOuroActionPerformed

        IURelatorioClientesOuro rel = new IURelatorioClientesOuro(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemClientesOuroActionPerformed

    private void jMenuItemVendasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasClienteActionPerformed

        IURelatorioVendasCliente rel = new IURelatorioVendasCliente(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemVendasClienteActionPerformed

    private void jMenuItemVendasRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasRealizadasActionPerformed

        IURelatorioVendasRealizadas rel = new IURelatorioVendasRealizadas(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemVendasRealizadasActionPerformed

    private void jMenuItemVendasDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasDinheiroActionPerformed

        IURelatorioVendasDinheiro rel = new IURelatorioVendasDinheiro(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemVendasDinheiroActionPerformed

    private void jMenuItemVendasPIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasPIXActionPerformed

        IURelatorioVendasPIX rel = new IURelatorioVendasPIX(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemVendasPIXActionPerformed

    private void jMenuItemVendasCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasCartaoActionPerformed

        IURelatorioVendasCartao rel = new IURelatorioVendasCartao(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemVendasCartaoActionPerformed

    private void jMenuItemVendasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasMesActionPerformed

        IURelatorioVendasMes rel = new IURelatorioVendasMes(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemVendasMesActionPerformed

    private void jMenuItemVendedorMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedorMesActionPerformed

        IURelatorioVendedorMes rel = new IURelatorioVendedorMes(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItemVendedorMesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        IURelatorioProdutosOrdenados rel = new IURelatorioProdutosOrdenados(this, false);
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(IUHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenu jMenuConsultar;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadastrarCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarFornecedor;
    private javax.swing.JMenuItem jMenuItemCadastrarProduto;
    private javax.swing.JMenuItem jMenuItemCadastrarVendedor;
    private javax.swing.JMenuItem jMenuItemClientesCadastrados;
    private javax.swing.JMenuItem jMenuItemClientesOuro;
    private javax.swing.JMenuItem jMenuItemRealizarVenda;
    private javax.swing.JMenuItem jMenuItemRelFornecedoresCadastrados;
    private javax.swing.JMenuItem jMenuItemRelProdutosAlimenticios;
    private javax.swing.JMenuItem jMenuItemRelProdutosCadastrados;
    private javax.swing.JMenuItem jMenuItemRelProdutosEletrodomesticos;
    private javax.swing.JMenuItem jMenuItemRelProdutosEletronicos;
    private javax.swing.JMenuItem jMenuItemRelProdutosMaisVendidos;
    private javax.swing.JMenuItem jMenuItemRelProdutosVestuario;
    private javax.swing.JMenuItem jMenuItemRelVendedoresCadastrados;
    private javax.swing.JMenuItem jMenuItemVendasCartao;
    private javax.swing.JMenuItem jMenuItemVendasCliente;
    private javax.swing.JMenuItem jMenuItemVendasDinheiro;
    private javax.swing.JMenuItem jMenuItemVendasMes;
    private javax.swing.JMenuItem jMenuItemVendasPIX;
    private javax.swing.JMenuItem jMenuItemVendasRealizadas;
    private javax.swing.JMenuItem jMenuItemVendedorMes;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel labelBackground;
    // End of variables declaration//GEN-END:variables
}
