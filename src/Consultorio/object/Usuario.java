package Consultorio.object;

/**
 *
 * @author Douglas
 */
public class Usuario {
    
    private String login;
    private String senha;
    private String nomeUsuario;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nomeUsuario) {
        this.login = login;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
    }

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    
}
