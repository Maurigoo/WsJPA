package modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "coches")
public class Coche {
	@Id
	private int id;
	private String marca;
	private String modelo;
	private long km;
	
	
}
