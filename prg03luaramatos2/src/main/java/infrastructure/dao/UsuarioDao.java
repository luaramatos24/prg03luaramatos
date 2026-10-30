package infrastructure.dao;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.infrastructure.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class UsuarioDao extends GenericDao<Usuario>
        implements UsuarioIDao {

    public UsuarioDao() {
        super(Usuario.class);
    }

    @Override
    public Usuario findByLogin(String login) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            return em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.login = :login",
                    Usuario.class
            )
            .setParameter("login", login)
            .getResultStream()
            .findFirst()
            .orElse(null);

        } catch (Exception e) {
            throw new RuntimeException(
                    "Erro ao buscar usuário pelo login.", e
            );
        } finally {
            em.close();
        }
    }
}
