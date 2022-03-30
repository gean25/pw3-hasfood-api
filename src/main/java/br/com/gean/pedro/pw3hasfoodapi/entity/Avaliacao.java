package br.com.gean.pedro.pw3hasfoodapi.entity;




import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AVALIACAO")
@Getter
@Setter
public class Avaliacao {
	@Id
	@Column(name = "ID_AVALIACAO")
	private Long id;
	
	@Column(name = "TX_COMENTARIO")
	private String comentario;
	
	@Column(name = "NR_NOTA")
	private String nota;
	
	@JoinColumn(name = "ID_PEDIDO")
	private Pedido pedido;
}
