package com.generation.blogpessoal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.blogpessoal.model.Postagem;
import org.springframework.data.repository.query.Param;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
