import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.GestorDeTarefas;
import org.example.Tarefa;
import org.example.Usuario;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Pedro Hugo", "pedro.coura2803@gmail.com", "12243261");
        usuario.setNome("Pedro Hugo");
        usuario.setEmail("pedro.coura2803@gmail.com");
        usuario.setSenha("12243261");
    }

    @Test
    public void testNome() {
        assertEquals("Pedro Hugo", usuario.getNome());
    }

    @Test
    public void testEmail() {
        assertEquals("pedro.coura2803@gmail.com", usuario.getEmail());
    }

    @Test
    public void testSenha() {
        assertEquals("12243261", usuario.getSenha());
    }

    @Test
    public void testAdicionarUsuario() {
        GestorDeTarefas gestor = new GestorDeTarefas();
        Usuario usuario = new Usuario("Lucas", "Lucas@example.com", "senha123");
        gestor.adicionarUsuario(usuario);
        assertTrue(gestor.getUsuarios().contains(usuario));
    }

    @Test
    public void testRemoverUsuario() {
        GestorDeTarefas gestor = new GestorDeTarefas();
        Usuario usuario = new Usuario("Maria", "maria@example.com", "senha456");
        gestor.adicionarUsuario(usuario);
        gestor.removerUsuario(usuario);
        assertFalse(gestor.getUsuarios().contains(usuario));
    }

    @Test
    public void testAdicionarTarefa() {
        GestorDeTarefas gestor = new GestorDeTarefas();
        Tarefa tarefa = new Tarefa("Estudar", "Estudar para a prova de matemática", LocalDate.now().plusDays(7), "Alta",
                false);
        gestor.adicionarTarefa(tarefa);
        assertTrue(gestor.getTarefas().contains(tarefa));
    }

    @Test
    public void testRemoverTarefa() {
        GestorDeTarefas gestor = new GestorDeTarefas();
        Tarefa tarefa = new Tarefa("Tarefa", "Tarefa de S107", LocalDate.now().plusDays(2), "Média",
                false);
        gestor.adicionarTarefa(tarefa);
        gestor.removerTarefa(tarefa);
        assertFalse(gestor.getTarefas().contains(tarefa));
    }
}
