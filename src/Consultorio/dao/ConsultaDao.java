package Consultorio.dao;

import Consultorio.jdbc.ConnectionFactory;
import Consultorio.object.Consulta;
import Consultorio.object.Paciente;
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
public class ConsultaDao {
    
    private Connection con;
    
    public ConsultaDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void addConsulta(Consulta obj) {
        try {
            String sql = "insert into consulta( paciente, nomep, obs, profissionalsaude, valor, dataconsulta,"
                    + "turnoconsulta) values (?,?,?,?,?,?,?)";

            PreparedStatement stm = con.prepareStatement(sql);
     
            stm.setString(1, obj.getPaciente());
            stm.setString(2, obj.getNomep());
            stm.setString(3, obj.getObs());
            stm.setString(4, obj.getProfissionalsaude());
            stm.setString(5, obj.getValor());
            stm.setString(6, obj.getDataconsulta());
            stm.setString(7, obj.getTurnoconsulta());
            
            stm.execute();
            stm.close();
        JOptionPane.showMessageDialog(null,"Consulta Agendada!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
    }
    public void updateConsulta(Consulta obj) {
        try {
            String sql = "update consulta set paciente=?, nomep=?, obs=?,"
                    + "profissionalsaude=?, valor=?, dataconsulta=?, turnoconsulta=? where id=?";
 
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getPaciente());
            stm.setString(2, obj.getNomep());
            stm.setString(3, obj.getObs());
            stm.setString(4, obj.getProfissionalsaude());
            stm.setString(5, obj.getValor());
            stm.setString(6, obj.getDataconsulta());
            stm.setString(7, obj.getTurnoconsulta());
            stm.setInt(8, obj.getId());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Consulta Alterada!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
    }
    
    public void deleteconsulta(Consulta obj){
        try {
            String sql = "delete from consulta where id=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getId());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Excluido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
    }
    
    public List<ProfissionalSaude> listarProfissionalSaude(){
        try {
            List<ProfissionalSaude> lista = new ArrayList<>();
            
            String sql = "select * from profissionalsaude";
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()){
                ProfissionalSaude obj = new ProfissionalSaude();
                
                obj.setEspecialista(rs.getString("especialista"));
                
                lista.add(obj);
            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
            return null;
        }
    }
    
    public List<Consulta> listarConsulta(){
        try {
            List<Consulta> lista = new ArrayList<>();
            
            String sql = "select * from consulta";
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()){
                Consulta obj = new Consulta();
                
                obj.setId(rs.getInt("id"));
                obj.setPaciente(rs.getString("paciente"));
                obj.setNomep(rs.getString("nomep"));
                obj.setObs(rs.getString("obs"));
                obj.setProfissionalsaude(rs.getString("profissionalSaude"));
                obj.setValor(rs.getString("valor"));
                obj.setDataconsulta(rs.getString("dataconsulta"));
                obj.setTurnoconsulta(rs.getString("turnoconsulta"));
                
                lista.add(obj);
                     
            }
            
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
            return null;
        }
    }
}