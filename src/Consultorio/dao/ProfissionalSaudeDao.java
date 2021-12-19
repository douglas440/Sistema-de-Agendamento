package Consultorio.dao;

import Consultorio.jdbc.ConnectionFactory;
import Consultorio.object.ProfissionalSaude;
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
public class ProfissionalSaudeDao {
    private Connection con;
    
    public ProfissionalSaudeDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    public void addProfissional(ProfissionalSaude obj){
        try {
            String sql = "insert into profissionalSaude (nome, especialista, valor, rg, cpf, telefone, email, cep,"
                    + "uf, cidade, bairro, numero) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getEspecialista());
            stm.setFloat(3, obj.getValor());
            stm.setString(4, obj.getRg());
            stm.setString(5, obj.getCpf());
            stm.setString(6, obj.getTelefone());
            stm.setString(7, obj.getEmail());
            stm.setString(8, obj.getCep());
            stm.setString(9, obj.getUf());
            stm.setString(10, obj.getCidade());
            stm.setString(11, obj.getBairro());
            stm.setString(12, obj.getNumero());
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null,"Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
    }
    
    public void updateProfissional(ProfissionalSaude obj){
        try {
            String sql = "update profissionalsaude set nome=?, especialista=?, valor=?, rg=?, telefone=?, email=?, cep=?, uf=?, cidade=?,"
                    + "bairro=?, numero=? where cpf=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getEspecialista());
            stm.setFloat(3, obj.getValor());
            stm.setString(4, obj.getRg());
            stm.setString(5, obj.getTelefone());
            stm.setString(6, obj.getEmail());
            stm.setString(7, obj.getCep());
            stm.setString(8, obj.getUf());
            stm.setString(9, obj.getCidade());
            stm.setString(10, obj.getBairro());
            stm.setString(11, obj.getNumero());
            stm.setString(12, obj.getCpf());
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null,"Cadastro atualizado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
    }
    public void deleteProfissional(ProfissionalSaude obj){
        try {
            String sql = "delete from profissional where cpf =?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getCpf());
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null,"Cadastro excluido!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e);;
        }   
    }
    
    ///metodo pra lista paciente na tabela
    public List<ProfissionalSaude> listarProfissionalSaude(){
        try {
            List<ProfissionalSaude> lista = new ArrayList<>();
            
            String sql = "select * from profissionalsaude";
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()){
                ProfissionalSaude obj = new ProfissionalSaude();
                
                
                obj.setNome(rs.getString("nome"));
                obj.setEspecialista(rs.getString("especialista"));
                obj.setValor(rs.getFloat("valor"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
                obj.setCep(rs.getString("cep"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
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
    public List<ProfissionalSaude> buscarProfissionalSaudePorNome(String nome){
        try {
            List<ProfissionalSaude> lista = new ArrayList<>();
            
            String sql = "select * from profissionalsaude where nome like  ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                ProfissionalSaude obj = new ProfissionalSaude();
                
                obj.setNome(rs.getString("nome"));
                obj.setEspecialista(rs.getString("especialista"));
                obj.setValor(rs.getFloat("valor"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
                obj.setCep(rs.getString("cep"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
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
    public ProfissionalSaude buscarPorEspecialista(String especialista){
        try {
            
            String sql = "select * from profissionalsaude where especialista =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, especialista);
            ResultSet rs = stmt.executeQuery();
            ProfissionalSaude obj = new ProfissionalSaude();
            
            if (rs.next()){
                obj.setNome(rs.getString("nome"));
                obj.setEspecialista(rs.getString("especialista"));
                obj.setValor(rs.getFloat("valor"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
                obj.setCep(rs.getString("cep"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
                obj.setNumero(rs.getString("numero"));
            }
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Profissional não encontrado"+ e);
            return null;
        }
    }
}