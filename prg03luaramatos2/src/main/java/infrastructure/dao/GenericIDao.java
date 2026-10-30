package infrastructure.dao;

import infrastructure.entity.PersistenceEntity;
import java.util.List;

public interface GenericIDao<Entity extends PersistenceEntity> {

    void save(Entity entity);

    void update(Entity entity);

    void delete(Entity entity);

    Entity findById(Long id);

    List<Entity> findAll();
}
