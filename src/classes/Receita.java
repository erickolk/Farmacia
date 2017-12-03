package classes;

import java.util.Date;

public class Receita {

    private int id;
    private Date data;
    private Medico medico;
    private Paciente paciente;

    public Receita(Date data, Medico medico, Paciente paciente) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Receita(int id, Date data, Medico medico, Paciente paciente) {
        this.id = id;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
