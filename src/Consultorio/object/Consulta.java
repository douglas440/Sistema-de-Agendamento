package Consultorio.object;

/**
 *
 * @author Douglas
 */
public class Consulta {
    
   
    private int id;
    private String paciente;
    private String nomep;
    private String obs;
    private String profissionalsaude;
    private String valor;
    private String dataconsulta;
    private String turnoconsulta;

    public Consulta() {
    }

    public Consulta(int id, String paciente, String nomep, String obs, String profissionalsaude, String valor, String dataconsulta, String turnoconsulta) {
        this.id = id;
        this.paciente = paciente;
        this.nomep = nomep;
        this.obs = obs;
        this.profissionalsaude = profissionalsaude;
        this.valor = valor;
        this.dataconsulta = dataconsulta;
        this.turnoconsulta = turnoconsulta;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    

    
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getProfissionalsaude() {
        return profissionalsaude;
    }

    public void setProfissionalsaude(String profissionalsaude) {
        this.profissionalsaude = profissionalsaude;
    }

    public String getDataconsulta() {
        return dataconsulta;
    }

    public void setDataconsulta(String dataconsulta) {
        this.dataconsulta = dataconsulta;
    }

    public String getTurnoconsulta() {
        return turnoconsulta;
    }

    public void setTurnoconsulta(String turnoconsulta) {
        this.turnoconsulta = turnoconsulta;
    }
    

}
