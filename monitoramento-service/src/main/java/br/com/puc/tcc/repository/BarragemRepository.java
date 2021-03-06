package br.com.puc.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.puc.tcc.model.Barragem;

public interface BarragemRepository extends JpaRepository<Barragem, Long> {
	
	public List<Barragem> findByNomeContaining(String nome);
}
