package Consultorio.view;

import javax.swing.ImageIcon;
import Consultorio.dao.ProfissionalSaudeDao;
import Consultorio.object.ProfissionalSaude;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Douglas
 */
public class FrmProfissional extends javax.swing.JFrame {

    /**
     * Creates new form FrmProfissional
     */
    ///metodo pra listar os pacientes na tabela
    public void listar(){
        ProfissionalSaudeDao dao = new ProfissionalSaudeDao();
        List<ProfissionalSaude> lista = dao.listarProfissionalSaude();
        DefaultTableModel dados = (DefaultTableModel) tbsaude.getModel();
        dados.setNumRows(0);
        
        for (ProfissionalSaude c : lista){
            dados.addRow(new Object[]{
                
                c.getNome(),
                c.getEspecialista(),
                c.getValor(),
                c.getRg(),
                c.getCpf(),
                c.getTelefone(),
                c.getEmail(),
                c.getCep(),
                c.getUf(),
                c.getCidade(),
                c.getBairro(),
                c.getNumero()
            });
        }
    }    
    

    public FrmProfissional() {
        initComponents();
        
    ///btsalvar.setEnabled(false);
        btcancelar.setEnabled(false);
        
    ///pra nao desabilitar o id
        ///tfid.setEnabled(false);
        
    ///pra foca no campo quando abrir o frm
        tfnome.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnovo = new javax.swing.JToggleButton();
        btalterar = new javax.swing.JToggleButton();
        btexcluir = new javax.swing.JToggleButton();
        btsalvar = new javax.swing.JToggleButton();
        btcancelar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfespecialista = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfcidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfbairro = new javax.swing.JTextField();
        tfnumero = new javax.swing.JTextField();
        cbuf = new javax.swing.JComboBox<String>();
        fttelefone = new javax.swing.JFormattedTextField();
        ftrg = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        ftcpf = new javax.swing.JFormattedTextField();
        ftcep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tfvalor = new javax.swing.JTextField();
        a = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsaude = new javax.swing.JTable();
        tfpesquisar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Consultorio/imagem/11-removebg-preview.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnovo.setBackground(new java.awt.Color(204, 204, 255));
        btnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Consultorio/imagem/user_add.png"))); // NOI18N
        btnovo.setText("Novo");
        btnovo.setBorder(null);
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btalterar.setBackground(new java.awt.Color(204, 204, 255));
        btalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Consultorio/imagem/user_edit.png"))); // NOI18N
        btalterar.setText("Alterar");
        btalterar.setBorder(null);
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        btexcluir.setBackground(new java.awt.Color(204, 204, 255));
        btexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Consultorio/imagem/user_delete.png"))); // NOI18N
        btexcluir.setText("Excluir");
        btexcluir.setBorder(null);
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btsalvar.setBackground(new java.awt.Color(204, 204, 255));
        btsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Consultorio/imagem/disk.png"))); // NOI18N
        btsalvar.setText("Salvar");
        btsalvar.setBorder(null);
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btcancelar.setBackground(new java.awt.Color(204, 204, 255));
        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Consultorio/imagem/cancel.png"))); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.setBorder(null);
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        tfnome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel3.setText("Especialista");

        tfespecialista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel5.setText("CPF");

        jLabel6.setText("Telefone");

        jLabel7.setText("Email");

        tfemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel8.setText("CEP");

        jLabel9.setText("UF");

        jLabel10.setText("Cidade");

        tfcidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        tfcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Bairro");

        jLabel12.setText("Número");

        tfbairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        tfnumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        cbuf.setBackground(new java.awt.Color(204, 204, 255));
        cbuf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        fttelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            fttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ftrg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            ftrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setText("RG");

        ftcpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            ftcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ftcep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            ftcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Valor da Consulta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(140, 140, 140)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ftrg, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel6))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(ftcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ftcep, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(tfcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(tfespecialista, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(tfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfespecialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ftcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true), "Consultar Funcionario"));

        jLabel13.setText("Pesquisar");

        tbsaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbsaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Especialista", "Valor", "RG", "CPF", "Telefone", "Email", "CEP", "UF", "Cidade", "Bairro", "Número"
            }
        ));
        tbsaude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsaudeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbsaude);

        tfpesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        tfpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(aLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 875, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        listar();
        
    }//GEN-LAST:event_formWindowActivated

    
    public void limpa() {
        
        tfnome.setText("");
        tfespecialista.setText("");
        tfvalor.setText("");
        ftrg.setText("");
        ftcpf.setText("");
        fttelefone.setText("");
        tfemail.setText("");
        ftcep.setText("");
        cbuf.setSelectedItem("");
        tfcidade.setText("");
        tfbairro.setText("");
        tfnumero.setText("");
    }
    
    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed

        ProfissionalSaude obj = new ProfissionalSaude();

        obj.setNome(tfnome.getText());
        obj.setEspecialista(tfespecialista.getText());
        obj.setValor(Float.parseFloat(tfvalor.getText()));
        obj.setRg(ftrg.getText());
        obj.setCpf(ftcpf.getText());
        obj.setTelefone(fttelefone.getText());
        obj.setEmail(tfemail.getText());
        obj.setCep(ftcep.getText());
        obj.setUf(cbuf.getSelectedItem().toString());
        obj.setCidade(tfcidade.getText());
        obj.setBairro(tfbairro.getText());
        obj.setNumero(tfnumero.getText());
        

        ProfissionalSaudeDao dao = new ProfissionalSaudeDao();
        dao.updateProfissional(obj);

    /// pra habilitar botoes
       btnovo.setEnabled(false); 
       btalterar.setEnabled(false); 
       btexcluir.setEnabled(false); 
       btsalvar.setEnabled(true); 
       btcancelar.setEnabled(true);
       
    ///pra nao desabilitar o id
      /// tfid.setEnabled(false);
       
    ///pra foca no campo quando abrir o frm
        tfnome.requestFocus();
    }//GEN-LAST:event_btalterarActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed

        ProfissionalSaude obj = new ProfissionalSaude();

        obj.setCpf(ftcpf.getText());

        ProfissionalSaudeDao dao = new ProfissionalSaudeDao();
        dao.deleteProfissional(obj);
        
        /// pra habilitar botoes
        btnovo.setEnabled(false); 
       btalterar.setEnabled(false); 
       btexcluir.setEnabled(false); 
       btsalvar.setEnabled(true); 
      btcancelar.setEnabled(true);
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed

        ProfissionalSaude obj = new ProfissionalSaude();

        obj.setNome(tfnome.getText());
        obj.setEspecialista(tfespecialista.getText());
        obj.setValor(Float.parseFloat(tfvalor.getText()));
        obj.setRg(ftrg.getText());
        obj.setCpf(ftcpf.getText());
        obj.setTelefone(fttelefone.getText());
        obj.setEmail(tfemail.getText());
        obj.setCep(ftcep.getText());
        obj.setUf(cbuf.getSelectedItem().toString());
        obj.setCidade(tfcidade.getText());
        obj.setBairro(tfbairro.getText());
        obj.setNumero(tfnumero.getText());

        ProfissionalSaudeDao dao = new ProfissionalSaudeDao();
        dao.addProfissional(obj);
        
        /// pra habilitar botoes
        btnovo.setEnabled(true); 
       btalterar.setEnabled(true); 
       btexcluir.setEnabled(true); 
       btsalvar.setEnabled(false); 
      btcancelar.setEnabled(false);
    }//GEN-LAST:event_btsalvarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed

        limpa();
        
    /// habilitar botoes
       btnovo.setEnabled(true); 
       btalterar.setEnabled(true); 
       btexcluir.setEnabled(true); 
       btsalvar.setEnabled(false); 
       btcancelar.setEnabled(false);
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tfcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcidadeActionPerformed

    private void tbsaudeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsaudeMouseClicked

        tfnome.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 0).toString());
        tfespecialista.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 1).toString());
        tfvalor.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 2).toString());
        ftrg.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 3).toString());
        ftcpf.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 4).toString());
        fttelefone.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 5).toString());
        tfemail.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 6).toString());
        ftcep.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 7).toString());
        cbuf.setSelectedItem(tbsaude.getValueAt(tbsaude.getSelectedRow(), 8).toString());
        tfcidade.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 9).toString());
        tfbairro.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 10).toString());
        tfnumero.setText(tbsaude.getValueAt(tbsaude.getSelectedRow(), 11).toString());
        
    }//GEN-LAST:event_tbsaudeMouseClicked

    private void tfpesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisarKeyPressed

        String nome = "%"+tfpesquisar.getText()+"%";
        
        ProfissionalSaudeDao dao = new ProfissionalSaudeDao();
        List<ProfissionalSaude> lista = dao.buscarProfissionalSaudePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tbsaude.getModel();
        dados.setNumRows(0);
        
        for (ProfissionalSaude c : lista){
            dados.addRow(new Object[]{
                c.getNome(),
                c.getEspecialista(),
                c.getValor(),
                c.getRg(),
                c.getCpf(),
                c.getTelefone(),
                c.getEmail(),
                c.getCep(),
                c.getUf(),
                c.getCidade(),
                c.getBairro(),
                c.getNumero()
            });
        }                                     
        
    }//GEN-LAST:event_tfpesquisarKeyPressed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
  
        limpa();
    
    /// habilitarbotoes
       btnovo.setEnabled(false); 
       btalterar.setEnabled(false); 
       btexcluir.setEnabled(false); 
       btsalvar.setEnabled(true); 
       btcancelar.setEnabled(true);
       
    ///pra nao desabilitar o id
       ///tfid.setEnabled(false);
       
    ///pra foca no campo quando abrir o frm
       tfnome.requestFocus();
    }//GEN-LAST:event_btnovoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProfissional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JToggleButton btalterar;
    private javax.swing.JToggleButton btcancelar;
    private javax.swing.JToggleButton btexcluir;
    private javax.swing.JToggleButton btnovo;
    private javax.swing.JToggleButton btsalvar;
    private javax.swing.JComboBox<String> cbuf;
    private javax.swing.JFormattedTextField ftcep;
    private javax.swing.JFormattedTextField ftcpf;
    private javax.swing.JFormattedTextField ftrg;
    private javax.swing.JFormattedTextField fttelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbsaude;
    private javax.swing.JTextField tfbairro;
    private javax.swing.JTextField tfcidade;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfespecialista;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfnumero;
    private javax.swing.JTextField tfpesquisar;
    private javax.swing.JTextField tfvalor;
    // End of variables declaration//GEN-END:variables

}
