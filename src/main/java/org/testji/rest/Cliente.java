package org.testji.rest;

import lombok.Data;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Cliente {
	
	private String nombre;
	private String apellido;
	private int edad;

}
