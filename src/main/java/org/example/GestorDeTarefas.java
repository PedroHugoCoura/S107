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

}
