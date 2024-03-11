package com.nttdatajava.pratica.Models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

  Long documento;

  @NotBlank(message = "Primer nombre es requerido")
  @Size(min = 3, max = 20, message = "Primer nombre requiere entre 3 a 20 caracteres")
  String Nombre1er;

  @NotBlank(message = "Segundo nombre es requerido")
  @Size(min = 3, max = 20, message =  "Segundo nombre requiere entre 3 a 20 caracteres")
  String Nombre2do;

  @NotBlank(message = "Primer apellido es requerido")
  @Size(min = 3, max = 20, message = "Primer apellido requiere entre 3 a 20 caracteres")
  String Apellido1er;

  @NotBlank(message = "Segundo apellido es requerido")
  @Size(min = 3, max = 20, message = "Segundo apellido requiere entre 3 a 20 caracteres")
  String Apellido2do;

  @NotBlank(message = "Telefono es requerido")
  @Size(min = 3, max = 10, message = "Telefono requiere entre 3 a 10 caracteres")
  String telefono;

  @NotBlank(message = "Direccion es requerido")
  @Size(min = 3, max = 50, message = "Direccion requiere entre 3 a 50 caracteres")
  String direccion;

  @NotBlank(message = "Ciudad es requerido")
  @Size(min = 3, max = 20, message = "Ciudad requiere entre 3 a 20 caracteres")
  String ciudad;
}

