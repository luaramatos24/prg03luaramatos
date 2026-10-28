ALTER TABLE usuario
ADD CONSTRAINT uk_usuario_login UNIQUE (login);
