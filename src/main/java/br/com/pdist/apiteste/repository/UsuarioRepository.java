package br.com.pdist.apiteste.repository;

import br.com.pdist.apiteste.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
