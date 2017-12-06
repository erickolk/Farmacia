package classes;

public class Farmaceutico {

    private int id;
    private String login;
    private String senha;
    private String nome;
    private String rg;

    public Farmaceutico(String login, String senha, String nome, String rg) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.rg = rg;
    }

    public Farmaceutico(int id, String login, String senha, String nome, String rg) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
