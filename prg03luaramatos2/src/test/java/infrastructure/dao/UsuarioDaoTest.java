package infrastructure.dao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioDaoTest {

    @Test
public void testFindByLoginComLoginNulo() {
    UsuarioDao dao = new UsuarioDao();

    assertNull(dao.findByLogin(null));
}

    @Test
    public void testFindByIdComIdNulo() {
        UsuarioDao dao = new UsuarioDao();

        assertThrows(RuntimeException.class, () -> {
            dao.findById(null);
        });
    }
}