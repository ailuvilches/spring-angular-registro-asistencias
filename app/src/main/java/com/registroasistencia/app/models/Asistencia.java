package com.registroasistencia.app.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asistencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fechaIngreso;
	
	@Column(name = "ingreso_confirmado")
	private Boolean ingresoConfirmado;
	
	@Column(name = "salida_confirmada")
	private Boolean salidaConfirmado;
	
	@ManyToOne
	@JoinColumn(name = "estudiante_id")
	private Estudiante estudiante;

}
