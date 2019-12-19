package br.com.senaimt.controlador;

import br.com.senaimt.model.Usuario;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class LoginController {
    
    private Usuario usuario;
       
    public String efetuarLogin(){
     if(usuario.getLogin() != null 
             && usuario.getLogin().equals("admin")){
      if(usuario.getSenha() != null
              && usuario.getSenha().equals("123")){
        return "sucesso";
      }else{
       return "erro";
      }
     }else{
     return "erro";
     }
    }
    
    public Usuario getUsuario() {
        if(usuario == null){
           usuario = new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   
    
}
