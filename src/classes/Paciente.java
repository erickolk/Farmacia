package classes;

public class Paciente {

    private int id;
    private String nome;
    private String rg;
    private String sus;

    public Paciente(int id, String nome, String rg, String sus) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.sus = sus;
    }

    public Paciente(String nome, String rg, String sus) {
        this.nome = nome;
        this.rg = rg;
        this.sus = sus;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", rg=" + rg + ", sus=" + sus + '}';
    }
 
}
