package br.com.ifba.infrastructure.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY = criarFactory();

    private static EntityManagerFactory criarFactory() {
        try {
            Properties config = new Properties();

            try (InputStream input = JPAUtil.class
                    .getClassLoader()
                    .getResourceAsStream("application.properties")) {

                if (input == null) {
                    throw new RuntimeException(
                            "Arquivo application.properties não encontrado."
                    );
                }

                config.load(input);
            }

            Map<String, Object> propriedades = new HashMap<>();

            propriedades.put(
                    "jakarta.persistence.jdbc.url",
                    config.getProperty("spring.datasource.url")
            );
            propriedades.put(
                    "jakarta.persistence.jdbc.user",
                    config.getProperty("spring.datasource.username")
            );
            propriedades.put(
                    "jakarta.persistence.jdbc.password",
                    config.getProperty("spring.datasource.password")
            );
            propriedades.put(
                    "jakarta.persistence.jdbc.driver",
                    config.getProperty("spring.datasource.driver-class-name")
            );
            propriedades.put(
                    "hibernate.format_sql",
                    config.getProperty("spring.jpa.properties.hibernate.format_sql")
            );
            propriedades.put(
                    "hibernate.show_sql",
                    config.getProperty("spring.jpa.properties.hibernate.show_sql")
            );
            propriedades.put(
                    "hibernate.hbm2ddl.auto",
                    config.getProperty("spring.jpa.hibernate.ddl-auto")
            );

            return Persistence.createEntityManagerFactory(
                    "gestao_financeira", propriedades
            );

        } catch (Exception e) {
            throw new RuntimeException(
                    "Erro ao configurar a conexão com o banco.", e
            );
        }
    }

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}