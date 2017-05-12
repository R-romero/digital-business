package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.EspecialidadeBO;
import br.com.fiap.entity.Especialidade;
import br.com.fiap.exception.DBException;

@ManagedBean
public class ListaEspecialidadeBean {
	private List<Especialidade> especialidade;
	
	private EspecialidadeBO bo;
	
	@PostConstruct
	private void init(){
		bo = new EspecialidadeBO();
		especialidade = bo.listar();
	}
	
	public String excluir(int codigo){
		FacesMessage msg;
		try {
			bo.remover(codigo);
			msg = new FacesMessage("Especialidade Removida!");
		} catch (DBException e) {
			e.printStackTrace();
			msg = new FacesMessage("Erro");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		FacesContext.getCurrentInstance().getExternalContext()
			.getFlash().setKeepMessages(true);
		return "lista-especialidade?faces-redirect=true";
	}

	public List<Especialidade> getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(List<Especialidade> especialidade) {
		this.especialidade = especialidade;
	}
}
