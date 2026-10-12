package br.com.ifba.prg03luaramatos2;

import br.com.ifba.usuario.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestePersistencia {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;

        try {
            emf = Persistence.createEntityManagerFactory("gestao_financeira");
            EntityManager em = emf.createEntityManager();

            Usuario usuario = new Usuario(
                    "Usuario Teste",
                    "00000000000",
                    "teste.jpa",
                    "senhaTeste"
            );

            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();

            System.out.println("Usuário salvo com sucesso! ID: " + usuario.getId());

            Usuario consultado = em.find(Usuario.class, usuario.getId());
            System.out.println("Usuário consultado: " + consultado.getNome());

            em.close();

        } catch (Exception e) {
            System.out.println("Erro ao testar a persistência:");
            e.printStackTrace();
        } finally {
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        }
    }
}
