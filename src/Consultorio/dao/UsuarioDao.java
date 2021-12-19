package Consultorio.dao;

import Consultorio.jdbc.ConnectionFactory;
import Consultorio.object.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class UsuarioDao {
    private Connection con;
    
    public UsuarioDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void addUsuario(Usuario obj) {
        try{
            String sql = "insert into usuario(cpf, nomeUsuario, senha) values(?,?,?)";
                    
            PreparedStatement stm = con.prepareStatement(sql);
            
            
            stm.setString(1, obj.getLogin());
            stm.setString(2, obj.getNomeUsuario());
            stm.setString(3, obj.getSenha());
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null,"Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
    }
    public void deleteUsuario(Usuario obj){ 
        try {
            String sql = "delete from usuario where cpf=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, obj.getLogin());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Cadastro Excluido!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
    }
}
