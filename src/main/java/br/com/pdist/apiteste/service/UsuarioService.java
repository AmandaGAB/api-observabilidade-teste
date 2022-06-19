package br.com.pdist.apiteste.service;


import br.com.pdist.apiteste.model.Usuario;
import br.com.pdist.apiteste.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Usuario> getUsuarios(){

        return this.usuarioRepository.findAll();
    }

    public Usuario getUsuarioPorId(Long idUsuario){
        return this.usuarioRepository.findById(idUsuario).orElse(null);
    }

    public Usuario inserirOuAtualizar(Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    public void remover(Long id){
        this.usuarioRepository.deleteById(id);
    }
}
