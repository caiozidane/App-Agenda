package br.com.senaimt.controlador;

import br.com.senaimt.model.Aluno;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class AlunoController {
    private Aluno aluno;
    private ArrayList<Aluno> lista;
    
    public AlunoController(){
        lista = new ArrayList<>();
    }

    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }
    
    
    public String salvar(){
        lista.add(aluno);
    FacesContext.getCurrentInstance().addMessage(
    null, new FacesMessage("Sucesso!"));
        return "";
    }
    public Aluno getAluno() {
        if(aluno == null){
            aluno = new Aluno();
        }
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
