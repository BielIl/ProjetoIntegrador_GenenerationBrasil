package grupo2.projeto.integrador.projetointegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import grupo2.projeto.integrador.projetointegrador.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

	public List<Card> findAllByfuncaoContainingIgnoreCase(String funcao);
}
