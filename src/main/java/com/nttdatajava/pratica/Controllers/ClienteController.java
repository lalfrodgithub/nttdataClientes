package com.nttdatajava.pratica.Controllers;

import com.nttdatajava.pratica.Exceptions.RecordNotFoundException;
import com.nttdatajava.pratica.Models.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/clientes")
public class ClienteController {


  @GetMapping( path = "/{tipo}/{documento}")
  public ResponseEntity<?> getClienteById(@PathVariable("tipo") String tipo, @PathVariable("documento") Long documento) {
    
  //  try {
      
    
    if (tipo.equals("C") || tipo.equals("P")) {
    
      if (documento <= 0 ) {
        throw new RecordNotFoundException("Invalid numero de documento: " + documento);
      }

      if ( documento!=23445322) {
        throw new RecordNotFoundException("Numero de documento " + documento +" no coincide con el documento existente");
      }
    }else{
      throw new RecordNotFoundException("Invalido tipo documento: " + tipo + ", debe ser C ó P");
    }
    //HttpStatus.BAD_REQUEST.valueOf(444);
    Cliente cliente = Cliente.builder().documento(documento).Nombre1er("Luis").Nombre2do("Fernando").Apellido1er("Martinez").
    Apellido2do("Jimenez").telefono("6574934").direccion("Cra 109A # 83 49 Engativa").ciudad("Bogota").build();
    return ResponseEntity.ok(cliente);
  
  
  //} catch (Exception e) {
    // TODO: handle exception
  //  throw new RecordNotFoundException("Falla en el servicio: " + e);
  //}


  }
  


}


