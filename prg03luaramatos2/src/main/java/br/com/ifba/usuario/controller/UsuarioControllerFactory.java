package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.service.UsuarioService;
import infrastructure.dao.UsuarioDao;

public class UsuarioControllerFactory {

    public static IUsuarioController criar() {
        return new UsuarioController(
                new UsuarioService(
                        new UsuarioDao()
                )
        );
    }
}
