package infrastructure.dao;

import br.com.ifba.usuario.entity.Usuario;

public interface UsuarioIDao extends GenericIDao<Usuario> {

    Usuario findByLogin(String login);
}
