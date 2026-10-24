package br.com.ifba.prg03luaramatos2;

import org.flywaydb.core.Flyway;

public class Prg03luaramatos2 {

    public static void main(String[] args) {

        Flyway flyway = Flyway.configure()
                .dataSource(
                        "jdbc:mysql://localhost:3306/gestao_financeira_teste",
                        "root",
                        "Ll.24042003"
                )
                .load();

        flyway.migrate();

        System.out.println("Migrations executadas com sucesso!");
    }
}
