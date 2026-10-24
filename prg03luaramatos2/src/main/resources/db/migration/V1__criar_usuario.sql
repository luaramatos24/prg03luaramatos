CREATE TABLE usuario (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    cpf VARCHAR(255),
    genero VARCHAR(255),
    dataNascimento VARCHAR(255),
    telefone VARCHAR(255),
    email VARCHAR(255),
    login VARCHAR(255),
    senha VARCHAR(255),
    PRIMARY KEY (id)
);
