package br.com.pdist.apiteste.controller;


import br.com.pdist.apiteste.model.Usuario;
import br.com.pdist.apiteste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarios(){
        return this.usuarioService.getUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioPorId(@PathVariable("id") Long idUsuario){
        return this.usuarioService.getUsuarioPorId(idUsuario);
    }

    @PostMapping
    public Usuario inserirUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.inserirOuAtualizar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable(value = "id") Long id, @RequestBody Usuario usuario){

        return this.usuarioService.inserirOuAtualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable("id") Long id){
        this.usuarioService.remover(id);
    }

}
