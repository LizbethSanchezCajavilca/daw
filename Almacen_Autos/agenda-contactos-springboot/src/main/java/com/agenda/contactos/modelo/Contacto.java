package com.agenda.contactos.modelo;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
public class Contacto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Debe ingresar su nombre")
	private String dueno;
	
	@NotBlank(message = "Debe ingresar Ubicacion")
	private String ubi;

	@NotEmpty(message = "Debe ingresar su modelo")
	private String modelo;

	@NotBlank(message = "Debe ingresar su placa")
	private String placa;

	private LocalDateTime fechaRegistro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public String getUbi() {
		return ubi;
	}

	public void setUbi(String ubi) {
		this.ubi = ubi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	@PrePersist
	public void asignarFechaRegistro() {
		fechaRegistro = LocalDateTime.now();
	}

}
