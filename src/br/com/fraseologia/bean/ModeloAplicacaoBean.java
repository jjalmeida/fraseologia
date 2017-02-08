package br.com.fraseologia.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.fraseologia.modelo.ModeloAplicacao;

@ManagedBean
@RequestScoped
public class ModeloAplicacaoBean {

	ModeloAplicacao modelo = new ModeloAplicacao();

	public ModeloAplicacao getModelo() {
		return modelo;
	}

	public void setModelo(ModeloAplicacao modelo) {
		this.modelo = modelo;
	}
	
	
	
}
