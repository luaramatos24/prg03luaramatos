package infrastructure.dao;

import infrastructure.entity.PersistenceEntity;
import br.com.ifba.infrastructure.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class GenericDao<Entity extends PersistenceEntity>
        implements GenericIDao<Entity> {

    private final Class<Entity> tipo;

    public GenericDao(Class<Entity> tipo) {
        this.tipo = tipo;
    }

    @Override
    public void save(Entity entity) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao salvar entidade.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public void update(Entity entity) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao atualizar entidade.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public void delete(Entity entity) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();

            Entity entidadeGerenciada = em.merge(entity);
            em.remove(entidadeGerenciada);

            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao excluir entidade.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public Entity findById(Long id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            return em.find(tipo, id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar entidade por ID.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Entity> findAll() {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            String jpql = "SELECT e FROM " + tipo.getSimpleName() + " e";
            return em.createQuery(jpql, tipo).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar entidades.", e);
        } finally {
            em.close();
        }
    }
}
