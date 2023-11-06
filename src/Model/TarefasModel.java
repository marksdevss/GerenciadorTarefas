package Model;

import java.util.Date;

public class TarefasModel {

    int id_tarefa;

    String nome;

    String tipo_tarefa;

    String data_tarefas;

    public TarefasModel() {
    }

    public TarefasModel(int id_tarefa, String nome, String tipo_tarefa, String data_tarefas) {
        this.id_tarefa = id_tarefa;
        this.nome = nome;
        this.tipo_tarefa = tipo_tarefa;
        this.data_tarefas = data_tarefas;
    }

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_tarefa() {
        return tipo_tarefa;
    }

    public void setTipo_tarefa(String tipo_tarefa) {
        this.tipo_tarefa = tipo_tarefa;
    }

    public String getData_tarefas() {
        return data_tarefas;
    }

    public void setData_tarefas(String data_tarefas) {
        this.data_tarefas = data_tarefas;
    }

}
