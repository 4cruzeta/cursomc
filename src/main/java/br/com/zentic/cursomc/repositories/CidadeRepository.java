package br.com.zentic.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zentic.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
