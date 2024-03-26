package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorDeTarefas {
    private List<Usuario> usuarios;
    private List<Tarefa> tarefas;

    public GestorDeTarefas() {
        this.usuarios = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void marcarTarefaComoConcluida(Tarefa tarefa) {
        tarefa.setConcluida(true);
    }
    
}
