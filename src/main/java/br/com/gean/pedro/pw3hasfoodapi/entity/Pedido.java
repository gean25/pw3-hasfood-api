package br.com.gean.pedro.pw3hasfoodapi.entity;


	import java.time.LocalDate;

	import lombok.Getter;
	import lombok.Setter;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.EnumType;
	import javax.persistence.Enumerated;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	
	@Table(name = "TBL_PEDIDO")
	@Entity
	@Getter
	@Setter
	
public class Pedido {
		
		@Id
		@Column(name = "ID_PEDIDO")
		private Long id;
		
		@Column(name = "DT_PEDIDO")
		private LocalDate data;
		
		@Column(name = "TX_STATUS")
		private String status;
		
		@Column(name = "ID_RESTAURANTE")
		private Long restaurante;

}
