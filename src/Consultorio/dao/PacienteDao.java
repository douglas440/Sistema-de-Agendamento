package Consultorio.dao;

import Consultorio.jdbc.ConnectionFactory;
import Consultorio.object.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class PacienteDao {
    private Connection con;
    
    public PacienteDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    public void addPaciente(Paciente obj) {
        try {
            String sql = "insert into paciente(nome, rg, cpf, telefone, cep, uf, cidade,"
                    + "bairro, complemento, numero) values (?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getRg());
            stm.setString(3, obj.getCpf());
            stm.setString(4, obj.getTelefone());
            stm.setString(5, obj.getCep());
            stm.setString(6, obj.getUf());
            stm.setString(7, obj.getCidade());
            stm.setString(8, obj.getBairro());
            stm.setString(9, obj.getComplemento());
            stm.setString(10, obj.getNumero());
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null,"Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
    }
    
    public void updatePaciente(Paciente obj) {
        try {
            String sql = "update paciente set nome=?, rg=?, telefone=?, cep=?, uf=?, cidade=?, bairro=?,"
                    + "complemento=?, numero=? where cpf=?  ";
                    
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getRg());
            stm.setString(3, obj.getTelefone());
            stm.setString(4, obj.getCep());
            stm.setString(5, obj.getUf());
            stm.setString(6, obj.getCidade());
            stm.setString(7, obj.getBairro());
            stm.setString(8, obj.getComplemento());
            stm.setString(9, obj.getNumero());
            stm.setString(10, obj.getCpf());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Cadastro Atualizado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
    }
    
    public void deletePaciente(Paciente obj){ 
        try {
            String sql = "delete from paciente where cpf=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            
            
            stm.setString(1, obj.getCpf());
            
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Cadastro Excluido!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
    }
    ///metodo pra lista paciente na tabela
    public List<Paciente> listarPaciente(){
        try {
            List<Paciente> lista = new ArrayList<>();
            
            String sql = "select * from paciente";
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()){
                Paciente obj = new Paciente();
                
                
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCep(rs.getString("cep"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setNumero(rs.getString("numero"));
                
                
                lista.add(obj);
                     
            }
            
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
            return null;
        }
    }
    /// metodo pra pesquisa da tabela paciente, quando for escrevendo vai mostrando os nomes
    public List<Paciente> buscarPacientePorNome(String nome){
        try {
            List<Paciente> lista = new ArrayList<>();
            
            String sql = "select * from paciente where nome like  ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Paciente obj = new Paciente();
                
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCep(rs.getString("cep"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setNumero(rs.getString("numero"));
                
                lista.add(obj);
            }
            return lista;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Erro " + e);
            return null;
        }
    }
    
    ///pra mostra cliente no formulario venda
    public Paciente buscarPorCpf(String cpf){
        try {
            
            String sql = "select * from paciente where cpf =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            Paciente obj = new Paciente();
            
            if (rs.next()){
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCep(rs.getString("cep"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setNumero(rs.getString("numero"));
                
            }
            return obj;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Cliente não encontrado"+ e);
            return null;
        }
    }
}
