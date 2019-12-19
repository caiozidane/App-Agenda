package br.com.senaimt.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MenuController {
    
  public String cadastrar(){
      return "cadastrar";
  }  
  public String listar(){
      return "listar";
  }
}
