package grupo2.projeto.integrador.projetointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_skills")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Skill obrigatorio")
	private String skill;

	@Enumerated(EnumType.STRING)
	public Nivel nivel;
	
	
	// ManyToOne(mappedBy = "card", cascade = CascadeType.All)
	// @JsonIgnoreProperties("card")
	//private Card card;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	/*public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}*/

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
}
