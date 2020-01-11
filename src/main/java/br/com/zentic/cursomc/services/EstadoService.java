package br.com.zentic.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zentic.cursomc.domain.Estado;
import br.com.zentic.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
}
