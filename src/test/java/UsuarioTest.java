import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.example.Usuario;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Leo Franco", "mendoncawho@outlook.com", "senha123");
    }

    @Test
    public void testNome() {
        assertEquals("Leo Franco", usuario.getNome());
    }

    @Test
    public void testEmail() {
        assertEquals("mendoncawho@outlook.com", usuario.getEmail());
    }

    @Test
    public void testSenha() {
        assertEquals("senha123", usuario.getSenha());
    }
}
