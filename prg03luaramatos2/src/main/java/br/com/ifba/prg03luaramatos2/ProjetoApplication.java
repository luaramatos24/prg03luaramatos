package br.com.ifba.prg03luaramatos2;

import br.com.ifba.login.view.TelaLogin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"br.com.ifba", "infrastructure"})
public class ProjetoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ProjetoApplication.class)
                        .headless(false)
                        .run(args);

        TelaLogin tela = context.getBean(TelaLogin.class);
        tela.setVisible(true);
    }
}
