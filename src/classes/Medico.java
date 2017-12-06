package classes;

public class Medico {
    private int id;
    private String nome;
    private String crm;
    private String rg;
    private String area;
    private String login;
    private String senha;

    public Medico(String nome, String crm, String rg, String area, String login, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.rg = rg;
        this.area = area;
        this.login = login;
        this.senha = senha;
    }

    public Medico(int id, String nome, String crm, String rg, String area, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.rg = rg;
        this.area = area;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
    
    
}
