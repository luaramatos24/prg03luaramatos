CREATE TABLE administradores (
    id BIGINT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_administradores_usuario
        FOREIGN KEY (id) REFERENCES usuario(id)
);
