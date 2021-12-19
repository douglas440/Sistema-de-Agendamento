package Consultorio.view;

import javax.swing.ImageIcon;
import Consultorio.object.Paciente;
import Consultorio.dao.PacienteDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Douglas
 */
public class FrmPaciente extends javax.swing.JFrame {
    
    ///metodo pra listar os pacientes na tabela
    public void listar(){
        PacienteDao dao = new PacienteDao();
        List<Paciente> lista = dao.listarPaciente();
        DefaultTableModel dados = (DefaultTableModel) tbPaciente.getModel();
        dados.setNumRows(0);
        
        for (Paciente c : lista){
            dados.addRow(new Object[]{
                
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getTelefone(),
                c.getCep(),
                c.getUf(),
                c.getCidade(),
                c.getBairro(),
                c.getComplemento(),
                c.getNumero()
            });
        }
    }

    public FrmPaciente() {
        initComponents();
        
        ///btsalvar.setEnabled(false);
        btcancelar.setEnabled(false);
        
        ///pra nao desabilitar o id
        ///tfid.setEnabled(false);
        
        ///pra foca no campo quando abrir o frm
        tfnome.requestFocus();
    }

    
    // pra limpa os campos quando apeta botao de novo
    public void limpa() {
        
        tfnome.setText("");
        ftrg.setText("");
        ftcpf.setText("");
        fttelefone.setText("");
        ftcep.setText("");
        cbuf.setSelectedItem("");
        tfcidade.setText("");
        tfbairro.setText("");
        tfcomplemento.setText("");
        tfnumero.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ftrg = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        ftcpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        fttelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        ftcep = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfcidade = new javax.swing.JTextField();
        tfbairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfcomplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfnumero = new javax.swing.JTextField();
        cbuf = new javax.swing.JComboBox<String>();
        btnovo = new javax.swing.JToggleButton();
        btalterar = new javax.swing.JToggleButton();
        btexcluir = new javax.swing.JToggleButton();
        btsalvar = new javax.swing.JToggleButton();
        btcancelar = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPaciente = new javax.swing.JTable();
        tfpesquisar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paciente");
        setIconImage(new ImageIcon(getClass().getResource("/Consultorio/imagem/11-removebg-preview.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nome");

        tfnome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel3.setText("RG");

        ftrg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            ftrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("CPF");

        ftcpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            ftcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Telefone");

        fttelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            fttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("CEP");

        ftcep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        try {
            ftcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("UF");

        jLabel8.setText("Cidade");

        jLabel9.setText("Bairro");

        tfcidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        tfbairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel10.setText("Complemento");

        tfcomplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel11.setText("Número");

        tfnumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        cbuf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftcep, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ftrg, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(tfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true), "Consultar Pancientes"));

        jLabel12.setText("Pesquisar");

        tbPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RG", "CPF", "Telefone", "CEP", "UF", "Cidade", "Bairro", "Complemento", "Número"
            }
        ));
        tbPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPaciente);

        tfpesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        tfpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed

        Paciente obj = new Paciente();

        obj.setNome(tfnome.getText());
        obj.setRg(ftrg.getText());
        obj.setCpf(ftcpf.getText());
        obj.setTelefone(fttelefone.getText());
        obj.setCep(ftcep.getText());
        obj.setUf(cbuf.getSelectedItem().toString());
        obj.setCidade(tfcidade.getText());
        obj.setBairro(tfbairro.getText());
        obj.setComplemento(tfcomplemento.getText());
        obj.setNumero(tfnumero.getText());
        
        PacienteDao dao = new PacienteDao();
        dao.addPaciente(obj);
        
        /// pra abilitar botoes
        btnovo.setEnabled(true); 
       btalterar.setEnabled(true); 
       btexcluir.setEnabled(true); 
       btsalvar.setEnabled(false); 
      btcancelar.setEnabled(false);
        
    }//GEN-LAST:event_btsalvarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed

        limpa();
        //pra abilitar botoes
        btnovo.setEnabled(true); 
        btalterar.setEnabled(true); 
        btexcluir.setEnabled(true); 
        btsalvar.setEnabled(false); 
        btcancelar.setEnabled(false);
        
    }//GEN-LAST:event_btcancelarActionPerformed

    
    
    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed

        
        Paciente obj = new Paciente();

        obj.setNome(tfnome.getText());
        obj.setRg(ftrg.getText());
        obj.setCpf(ftcpf.getText());
        obj.setTelefone(fttelefone.getText());
        obj.setCep(ftcep.getText());
        obj.setUf(cbuf.getSelectedItem().toString());
        obj.setCidade(tfcidade.getText());
        obj.setBairro(tfbairro.getText());
        obj.setComplemento(tfcomplemento.getText());
        obj.setNumero(tfnumero.getText());
        
        PacienteDao dao = new PacienteDao();
        dao.updatePaciente(obj);
        
        // pra abilitar botoes
        btnovo.setEnabled(false); 
        btalterar.setEnabled(false); 
        btexcluir.setEnabled(false); 
        btsalvar.setEnabled(true); 
        btcancelar.setEnabled(true);
        
        ///pra nao desabilitar o id
        ///tfid.setEnabled(false);
        
        ///pra foca no campo quando abrir o frm
        tfnome.requestFocus();
    }//GEN-LAST:event_btalterarActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed

        Paciente obj = new Paciente();
        obj.setCpf(ftcpf.getText());
        
        PacienteDao dao = new PacienteDao();
        dao.deletePaciente(obj);
        
    /// pra habilitar botoes
        btnovo.setEnabled(false); 
       btalterar.setEnabled(false); 
       btexcluir.setEnabled(false); 
       btsalvar.setEnabled(true); 
      btcancelar.setEnabled(true);
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed

    ///pra desabilitar botoes
       btnovo.setEnabled(false); 
       btalterar.setEnabled(false); 
       btexcluir.setEnabled(false); 
       btsalvar.setEnabled(true); 
       btcancelar.setEnabled(true); 
                   
    ///pra limpar os campos quando clicar no botao novo
        limpa();
    
    ///pra nao desabilitar o id
        ///tfid.setEnabled(false);
        
    ///pra foca no campo quando abrir o frm
        tfnome.requestFocus();
    }//GEN-LAST:event_btnovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        /// pra listar os paciente cadastrados
        listar();
        
    }//GEN-LAST:event_formWindowActivated

    private void tbPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacienteMouseClicked

                
        tfnome.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 0).toString());
        ftrg.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 1).toString());
        ftcpf.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 2).toString());
        fttelefone.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 3).toString());
        ftcep.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 4).toString());
        cbuf.setSelectedItem(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 5).toString());
        tfcidade.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 6).toString());
        tfbairro.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 7).toString());
        tfcomplemento.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 8).toString());
        tfnumero.setText(tbPaciente.getValueAt(tbPaciente.getSelectedRow(), 9).toString()); 
        
    }//GEN-LAST:event_tbPacienteMouseClicked

    ///metodo da pesquisar da tabela paciente
    private void tfpesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisarKeyPressed

        String nome = "%"+tfpesquisar.getText()+"%";
        
        PacienteDao dao = new PacienteDao();
        List<Paciente> lista = dao.buscarPacientePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tbPaciente.getModel();
        dados.setNumRows(0);
        
        for (Paciente c : lista){
            dados.addRow(new Object[]{
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getTelefone(),
                c.getCep(),
                c.getUf(),
                c.getCidade(),
                c.getBairro(),
                c.getComplemento(),
                c.getNumero()
            });
        }
        
    }//GEN-LAST:event_tfpesquisarKeyPressed

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
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPaciente;
    private javax.swing.JTextField tfbairro;
    private javax.swing.JTextField tfcidade;
    private javax.swing.JTextField tfcomplemento;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfnumero;
    private javax.swing.JTextField tfpesquisar;
    // End of variables declaration//GEN-END:variables

    void setVisibles(boolean b) {
    }
}
