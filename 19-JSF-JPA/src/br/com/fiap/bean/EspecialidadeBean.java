package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.EspecialidadeBO;
import br.com.fiap.entity.Especialidade;
import br.com.fiap.exception.DBException;

@ManagedBean
public class EspecialidadeBean {
	private Especialidade especialidade;
	private EspecialidadeBO bo;
	
	@PostConstruct
	private void iniciar(){
		especialidade = new Especialidade();
		bo = new EspecialidadeBO();
	}
	
	public String cadastrar(){
		FacesMessage msg;
		try {
			if(especialidade.getCodigo() == 0){
				bo.cadastrar(especialidade);
				msg = new FacesMessage("Cadastrado com sucesso!");
			}else{
				bo.atualizar(especialidade);
				msg = new FacesMessage("Alterado com Sucesso!");
				msg.setSeverity(FacesMessage.SEVERITY_INFO);
			}
		}  catch (DBException e) {
			e.printStackTrace();
			msg = new FacesMessage("Deu ruim");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			return "especialidade";
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		//Manter a mensagem após o redirect (nova requisição)
		FacesContext.getCurrentInstance().getExternalContext()
							.getFlash().setKeepMessages(true);
		return "lista-especialidade?faces-redirect=true";
		
	}
	
	public Especialidade getEspecialidade(){
		return especialidade;
	}
	
	public void setEspecialidade(Especialidade especialidade){
		this.especialidade = especialidade;
	}
}
