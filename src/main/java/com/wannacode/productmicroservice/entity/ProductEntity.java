package com.wannacode.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(value = "Sensores")
@Getter
@Setter
@NoArgsConstructor

public class ProductEntity {
	@Id
	private String id;
	private String nombreSensor;
	private String marca;
	private String modelo;
	private Double temperatura;
	private Double distancia;
	private Double horasTrabajo;
	
	public String getNombreSensor() {
		return nombreSensor;
	}
	public void setNombreSensor(String nombreSensor) {
		this.nombreSensor = nombreSensor;
	}
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public Double getDistancia() {
		return distancia;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	public Double getHorasTrabajo() {
		return horasTrabajo;
	}
	public void setHorasTrabajo(Double horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}


