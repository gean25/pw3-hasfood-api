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
@Table(name = "TBL_ENTREGA")
@Getter
@Setter

public class Entrega {
	@Id
	@Column(name = "ID_ENTREGA")
	private Long id;
	
	@Column(name = "TX_NOME_CLIENTE")
	private String cliente;
	
	@Column(name = "TX_ENDERECO")
	private String endereco;
	
	@JoinColumn(name = "ID_PEDIDO")
	private Pedido pedido;
}
