package br.com.fraseologia.modelo;

import java.util.ArrayList;
import java.util.List;

public class ModeloAplicacao {

	private String categoria;
	private String tipo;
	private String codigo;
	private String descricao;
	private String arvoreClassificacao;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getArvoreClassificacao() {
		return arvoreClassificacao;
	}

	public void setArvoreClassificacao(String arvoreClassificacao) {
		this.arvoreClassificacao = arvoreClassificacao;
	}

	public List<ModeloAplicacao> populaListaFileShare() {
		List<ModeloAplicacao> listaFileShare = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao fh1 = new ModeloAplicacao();
		fh1.setCategoria("Fileshare");
		fh1.setTipo("Solicitação");
		fh1.setCodigo("SBBASDD063");
		fh1.setDescricao("(BBA) Mapeamento de Recurso de rede");
		fh1.setArvoreClassificacao("IBBA \\ SD \\ Rede \\ Mapeamento de Recurso de rede");
		listaFileShare.add(fh1);

		return listaFileShare;
	}
	
	public List<ModeloAplicacao> populaListaInternet() {
		List<ModeloAplicacao> listaInternet = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao i1 = new ModeloAplicacao();
		i1.setCategoria("Internet");
		i1.setTipo("Incidente");
		i1.setCodigo("SBBASDD222");
		i1.setDescricao("(BBA) Navegador internet - Erro máquina do usuário");
		i1.setArvoreClassificacao("IBBA \\ SD \\ Internet Explorer \\ Erro máquina do usuário");
		listaInternet.add(i1);

		return listaInternet;
	}
	
	public List<ModeloAplicacao> populaListaOffice() {
		List<ModeloAplicacao> listaOffice = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao of1 = new ModeloAplicacao();
		of1.setCategoria("Office");
		of1.setTipo("Incidente");
		of1.setCodigo("SBBASDD141");
		of1.setDescricao("(BBA) MS Excel - Demais problemas");
		of1.setArvoreClassificacao("IBBA \\ SD \\ MS Excel \\ Demais problemas");
		listaOffice.add(of1);
		
		ModeloAplicacao of2 = new ModeloAplicacao();
		of2.setCategoria("Office");
		of2.setTipo("Incidente");
		of2.setCodigo("SBBASDD440");
		of2.setDescricao("(BBA) MS Excel - Problemas para abrir");
		of2.setArvoreClassificacao("IBBA \\ SD \\ MS Excel \\ Problemas para abrir");
		listaOffice.add(of2);
		
		ModeloAplicacao of4 = new ModeloAplicacao();
		of4.setCategoria("Office");
		of4.setTipo("Incidente");
		of4.setCodigo("SBBASDD441");
		of4.setDescricao("(BBA) MS Word - Problemas para abrir");
		of4.setArvoreClassificacao("IBBA \\ SD \\ MS Word \\ Problemas para abrir");
		listaOffice.add(of4);
		
		ModeloAplicacao of3 = new ModeloAplicacao();
		of3.setCategoria("Office");
		of3.setTipo("Solicitação");
		of3.setCodigo("SBBASDD039");
		of3.setDescricao("(BBA) MS Excel - Dúvidas/Orientações");
		of3.setArvoreClassificacao("IBBA \\ MS Excel \\ Dúvidas/Orientações");
		listaOffice.add(of3);
		
		ModeloAplicacao of5 = new ModeloAplicacao();
		of5.setCategoria("Office");
		of5.setTipo("Solicitação");
		of5.setCodigo("SBBASDD040");
		of5.setDescricao("(BBA) MS Word - Configuração");
		of5.setArvoreClassificacao("IBBA \\ SD \\ MS Word \\ Configuração");
		listaOffice.add(of5);
		
		ModeloAplicacao of6 = new ModeloAplicacao();
		of6.setCategoria("Office");
		of6.setTipo("Solicitação");
		of6.setCodigo("SBBASDD041");
		of6.setDescricao("(BBA) MS Word - Dúvidas/Orientações");
		of6.setArvoreClassificacao("IBBA \\ SD \\ MS Word \\ Dúvidas/Orientações");
		listaOffice.add(of6);

		return listaOffice;
	}
	
	public List<ModeloAplicacao> populaListaOutlook() {
		List<ModeloAplicacao> listaOutlook = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao ou1 = new ModeloAplicacao();
		ou1.setCategoria("Outlook");
		ou1.setTipo("Incidente");
		ou1.setCodigo("SBBASDD035 ");
		ou1.setDescricao("(BBA) Outlook: Problemas para Abrir");
		ou1.setArvoreClassificacao("IBBA \\ SD \\ Outlook \\ Problemas para Abrir");
		listaOutlook.add(ou1);
		
		ModeloAplicacao ou2 = new ModeloAplicacao();
		ou2.setCategoria("Outlook");
		ou2.setTipo("Incidente");
		ou2.setCodigo("SBBASD1000");
		ou2.setDescricao("(BBA) Outlook: problemas ");
		ou2.setArvoreClassificacao("IBBA \\ SD \\ Outlook \\ Problemas");
		listaOutlook.add(ou2);
		
		ModeloAplicacao ou3 = new ModeloAplicacao();
		ou3.setCategoria("Outlook");
		ou3.setTipo("Incidente");
		ou3.setCodigo("SBBASDD439");
		ou3.setDescricao("(BBA) Outlook - Travado/Problemas para encerrar");
		ou3.setArvoreClassificacao("IBBA \\ SD \\ Outlook \\ Travado/Problemas para encerrar");
		listaOutlook.add(ou3);
		
		ModeloAplicacao ou4 = new ModeloAplicacao();
		ou4.setCategoria("Outlook");
		ou4.setTipo("Incidente");
		ou4.setCodigo("SBBASDD035");
		ou4.setDescricao("(BBA) Outlook - Problemas para Abrir");
		ou4.setArvoreClassificacao("IBBA \\ SD \\ Outlook \\ Problemas para Abrir");
		listaOutlook.add(ou4);
		
		ModeloAplicacao ou5 = new ModeloAplicacao();
		ou5.setCategoria("Outlook");
		ou5.setTipo("Solicitação");
		ou5.setCodigo("SBBAUA2190");
		ou5.setDescricao("(BBA) Criação de Acesso ao Enterprise Vault");
		ou5.setArvoreClassificacao("IBBA \\ ADM de Usuários \\ Outlook \\ Criação de acesso ao Enterprise Vault");
		listaOutlook.add(ou5);
		
		ModeloAplicacao ou6 = new ModeloAplicacao();
		ou6.setCategoria("Outlook");
		ou6.setTipo("Solicitação");
		ou6.setCodigo("SBBASDD033");
		ou6.setDescricao("(BBA) Configuração de Perfil - Outlook");
		ou6.setArvoreClassificacao("IBBA \\ SD \\ Outlook \\ Configuração de Perfil");
		listaOutlook.add(ou6);
		
		ModeloAplicacao ou7 = new ModeloAplicacao();
		ou7.setCategoria("Outlook");
		ou7.setTipo("Solicitação");
		ou7.setCodigo("SBBASDD033");
		ou7.setDescricao("(BBA) Outlook - Configuração de Perfil");
		ou7.setArvoreClassificacao("IBBA \\ SD \\ Outlook \\ Configuração de Perfil");
		listaOutlook.add(ou7);
		
		ModeloAplicacao ou8 = new ModeloAplicacao();
		ou8.setCategoria("Outlook");
		ou8.setTipo("Solicitação");
		ou8.setCodigo("SBBASDD036");
		ou8.setDescricao("(BBA) Outlook - Dúvidas/Orientações");
		ou8.setArvoreClassificacao("IBBA \\ SD \\ Outlook \\ Dúvidas/Orientações");
		listaOutlook.add(ou8);
		
		ModeloAplicacao ou9 = new ModeloAplicacao();
		ou9.setCategoria("Outlook");
		ou9.setTipo("Solicitação");
		ou9.setCodigo("SBBAUA2191");
		ou9.setDescricao("(BBA) - Outlook -Inclusão de Caixa Genérica ou Departamental no Enterprise Vault");
		ou9.setArvoreClassificacao("IBBA \\ ADM de Usuários \\ Outlook \\ Inclusão de Caixa Genérica ou Departamental no Enterprise Vault");
		listaOutlook.add(ou1);

		return listaOutlook;
	}
	
	public List<ModeloAplicacao> populaListaPerifericos() {
		List<ModeloAplicacao> listaPerifericos = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao p1 = new ModeloAplicacao();
		p1.setCategoria("Periferico");
		p1.setTipo("Incidente");
		p1.setCodigo("SBBASDD411");
		p1.setDescricao("(BBA) Mouse - Indisponibilidade PARCIAL");
		p1.setArvoreClassificacao("IBBA \\ SD \\ Mouse \\ Indisp. PARCIAL");
		listaPerifericos.add(p1);
		
		ModeloAplicacao p2 = new ModeloAplicacao();
		p2.setCategoria("Periferico");
		p2.setTipo("Incidente");
		p2.setCodigo("SBBASDD457");
		p2.setDescricao("(BBA) Mouse - Indisponibilidade PARCIAL");
		p2.setArvoreClassificacao("IBBA \\ SD \\ Mouse \\ Indisp. PARCIAL");
		listaPerifericos.add(p2);
		
		ModeloAplicacao p4 = new ModeloAplicacao();
		p4.setCategoria("Periferico");
		p4.setTipo("Incidente");
		p4.setCodigo("SBBASDD410");
		p4.setDescricao("(BBA) Monitor - Indisponibilidade PARCIAL");
		p4.setArvoreClassificacao("IBBA \\ SD \\ Monitor \\ Indisp. PARCIAL");
		listaPerifericos.add(p4);
		
		ModeloAplicacao p5 = new ModeloAplicacao();
		p5.setCategoria("Periferico");
		p5.setTipo("Incidente");
		p5.setCodigo("SBBASDD456");
		p5.setDescricao("(BBA) Monitor - Indisponibilidade TOTAL");
		p5.setArvoreClassificacao("IBBA \\ SD \\ Monitor \\ Indisp. TOTAL");
		listaPerifericos.add(p5);
		
		ModeloAplicacao p6 = new ModeloAplicacao();
		p6.setCategoria("Periferico");
		p6.setTipo("Incidente");
		p6.setCodigo("SBBASDD412");
		p6.setDescricao("(BBA) Notebook - Problemas");
		p6.setArvoreClassificacao("IBBA \\ SD \\ Notebook \\ Problemas");
		listaPerifericos.add(p6);
		
		ModeloAplicacao p7 = new ModeloAplicacao();
		p7.setCategoria("Periferico");
		p7.setTipo("Incidente");
		p7.setCodigo("SBBASDD455");
		p7.setDescricao("(BBA) Teclado - Indisponibilidade TOTAL");
		p7.setArvoreClassificacao("IBBA \\ SD \\ Teclado \\ Indisp. TOTAL");
		listaPerifericos.add(p7);
		
		ModeloAplicacao p8 = new ModeloAplicacao();
		p8.setCategoria("Periferico");
		p8.setTipo("Incidente");
		p8.setCodigo("SBBASDD420");
		p8.setDescricao("(BBA) Teclado - Indisponibilidade PARCIAL");
		p8.setArvoreClassificacao("IBBA \\ SD \\ Teclado \\ Indisp. PARCIAL");
		listaPerifericos.add(p8);
		
		ModeloAplicacao p3 = new ModeloAplicacao();
		p3.setCategoria("Periferico");
		p3.setTipo("Solicitação");
		p3.setCodigo("SBBASDD430");
		p3.setDescricao("(BBA) Instalação de periférico / hardware");
		p3.setArvoreClassificacao("IBBA \\ SD \\ IMAC \\ Instalação/Atualização de Software (CH)");
		listaPerifericos.add(p3);
		
		ModeloAplicacao p9 = new ModeloAplicacao();
		p9.setCategoria("Periferico");
		p9.setTipo("Solicitação");
		p9.setCodigo("SBBASDD437");
		p9.setDescricao("(BBA) IMAC - Formatação de Micro Computador/Notebook (CH)");
		p9.setArvoreClassificacao("IBBA \\ SD \\ IMAC \\ Formatação de Micro Computador/Notebook (CH)");
		listaPerifericos.add(p9);
		
		ModeloAplicacao p10 = new ModeloAplicacao();
		p10.setCategoria("Periferico");
		p10.setTipo("Solicitação");
		p10.setCodigo("SBBASDCS25 ");
		p10.setDescricao("(BBA) Layout - Nova Posição");
		p10.setArvoreClassificacao("IBBA \\ Suporte Local \\ Layout \\ Nova Posição");
		listaPerifericos.add(p10);
		
		ModeloAplicacao p11 = new ModeloAplicacao();
		p11.setCategoria("Periferico");
		p11.setTipo("Solicitação");
		p11.setCodigo("SBBASDCS24");
		p11.setDescricao("(BBA) Layout - Troca de Posições ");
		p11.setArvoreClassificacao("IBBA \\ Suporte Local \\ Layout \\ Troca de Posições");
		listaPerifericos.add(p11);

		return listaPerifericos;
	}
	
	public List<ModeloAplicacao> populaListaSoftware() {
		List<ModeloAplicacao> listaSoftware = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao sw1 = new ModeloAplicacao();
		sw1.setCategoria("Software");
		sw1.setTipo("Solicitação");
		sw1.setCodigo("SBBASDD431");
		sw1.setDescricao("(BBA) IMAC - Instalação/Atualização de Software (CH)");
		sw1.setArvoreClassificacao("IBBA \\ SD \\ IMAC \\ Instalação/Atualização de Software (CH)");
		listaSoftware.add(sw1);
		
		ModeloAplicacao sw2 = new ModeloAplicacao();
		sw2.setCategoria("Software");
		sw2.setTipo("Solicitação");
		sw2.setCodigo("SBBASPM005");
		sw2.setDescricao("Pedido de Homologação de Software Especializados");
		sw2.setArvoreClassificacao("IBBA \\ SPMS \\ Homologação de Software MEDIUM");
		listaSoftware.add(sw2);

		return listaSoftware;
	}
	
	public List<ModeloAplicacao> populaListaTelecom() {
		List<ModeloAplicacao> listaTelocom = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao t1 = new ModeloAplicacao();
		t1.setCategoria("Telecom");
		t1.setTipo("Incidente");
		t1.setCodigo("SBBASDCS47");
		t1.setDescricao("(BBA) Ramal - Problemas");
		t1.setArvoreClassificacao("IBBA\\TELEFONIA\\Telefonia Fixa\\Problemas\\Aparelho Danificado");
		listaTelocom.add(t1);
		
		ModeloAplicacao t2 = new ModeloAplicacao();
		t2.setCategoria("Telecom");
		t2.setTipo("Solicitação");
		t2.setCodigo("SBBASDCS49");
		t2.setDescricao("(BBA) Movimentação de Ramal");
		t2.setArvoreClassificacao("IBBA\\TELEFONIA\\Telefonia Fixa\\Solicitações\\Movimentação de Ramal");
		listaTelocom.add(t2);
		
		ModeloAplicacao t3 = new ModeloAplicacao();
		t3.setCategoria("Telecom");
		t3.setTipo("Solicitação");
		t3.setCodigo("SBBASDCS31");
		t3.setDescricao("(BBA) Criação de Ramal");
		t3.setArvoreClassificacao("IBBA \\ Suporte Local \\ Ramal \\ Criação");
		listaTelocom.add(t3);

		return listaTelocom;
	}
	
	public List<ModeloAplicacao> populaListaVDI(){
		List<ModeloAplicacao> listaVDI = new ArrayList<ModeloAplicacao>();
		
		ModeloAplicacao v2 = new ModeloAplicacao();
		v2.setCategoria("VDI");
		v2.setTipo("Solicitação");
		v2.setCodigo("SBBASDCS16");
		v2.setDescricao("(BBA) MV - Aumento de Espaço em Disco");
		v2.setArvoreClassificacao("IBBA \\ Suporte Local \\ MV-Aumento de Espaço em Disco");
		listaVDI.add(v2);
		
		ModeloAplicacao v3 = new ModeloAplicacao();
		v3.setCategoria("VDI");
		v3.setTipo("Solicitação");
		v3.setCodigo("SBBASD0026");
		v3.setDescricao("(BBA) MV - Exclusão de Máquina da Bolha");
		v3.setArvoreClassificacao("IBBA \\ MV \\ MV - Exclusão de Máquina da Bolha");
		listaVDI.add(v3);
		
		ModeloAplicacao v4 = new ModeloAplicacao();
		v4.setCategoria("VDI");
		v4.setTipo("Solicitação");
		v4.setCodigo("SBBASDD020");
		v4.setDescricao("(BBA) MV - Deleção de MV");
		v4.setArvoreClassificacao("IBBA \\ SD \\ MV \\ Deleção de MV");
		listaVDI.add(v4);
		
		ModeloAplicacao v5 = new ModeloAplicacao();
		v5.setCategoria("VDI");
		v5.setTipo("Solicitação");
		v5.setCodigo("SBBASDD019");
		v5.setDescricao("(BBA) MV - Criação de MV");
		v5.setArvoreClassificacao("IBBA \\ SD \\ MV \\ Criação de MV");
		listaVDI.add(v5);
		
		return listaVDI;
	}
	
	public List<ModeloAplicacao> populaListaWindows() {
		List<ModeloAplicacao> listaWindowns = new ArrayList<ModeloAplicacao>();

		ModeloAplicacao w1 = new ModeloAplicacao();
		w1.setCategoria("Windows");
		w1.setTipo("Incidente");
		w1.setCodigo("SBBASDD422");
		w1.setDescricao("(BBA) Windows - Problemas de impressão");
		w1.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Problemas de impressão");
		listaWindowns.add(w1);
		
		ModeloAplicacao w2 = new ModeloAplicacao();
		w2.setCategoria("Windows");
		w2.setTipo("Incidente");
		w2.setCodigo("SBBASDD051");
		w2.setDescricao("(BBA) Windows - Mensagem de Erro - Indisponibilidade PARCIAL");
		w2.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Mensagem de Erro-Indisp. PARCIAL");
		listaWindowns.add(w2);
		
		ModeloAplicacao w3 = new ModeloAplicacao();
		w3.setCategoria("Windows");
		w3.setTipo("Incidente");
		w3.setCodigo("SBBASDD453");
		w3.setDescricao("(BBA) Windows - Fora do Domínio - Indisponibilidade TOTAL");
		w3.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Fora do Domínio-Indisp. TOTAL");
		listaWindowns.add(w3);
		
		ModeloAplicacao w4 = new ModeloAplicacao();
		w4.setCategoria("Windows");
		w4.setTipo("Incidente");
		w4.setCodigo("SBBASDD053");
		w4.setDescricao("(BBA) Windows - Problemas de Performance - Indisponibilidade PARCIAL");
		w4.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Problemas de Performance-Indisp. PARCIAL");
		listaWindowns.add(w4);
		
		ModeloAplicacao w5 = new ModeloAplicacao();
		w5.setCategoria("Windows");
		w5.setTipo("Incidente");
		w5.setCodigo("SBBASDD447");
		w5.setDescricao("(BBA) Windows - Não Inicia - Indisponibilidade TOTAL");
		w5.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Não Inicia-Indisp. TOTAL");
		listaWindowns.add(w5);

		ModeloAplicacao w6 = new ModeloAplicacao();
		w6.setCategoria("Windows");
		w6.setTipo("Incidente");
		w6.setCodigo("SBBASDD054");
		w6.setDescricao("(BBA) Windows - Travado - Indisponibilidade TOTAL");
		w6.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Travado-Indisp. TOTAL");
		listaWindowns.add(w6);
		
		ModeloAplicacao w7 = new ModeloAplicacao();
		w7.setCategoria("Windows");
		w7.setTipo("Solicitação");
		w7.setCodigo("SBBASDD052");
		w7.setDescricao("(BBA) Windows - Configuração de Impressora");
		w7.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Configuração de Impressora");
		listaWindowns.add(w7);
		
		ModeloAplicacao w8 = new ModeloAplicacao();
		w8.setCategoria("Windows");
		w8.setTipo("Solicitação");
		w8.setCodigo("SBBAUA1547");
		w8.setDescricao("(BBA) Windows - Configuração de Vídeo");
		w8.setArvoreClassificacao("IBBA \\ ADM de Usuários \\ Windows \\ Configuração de Vídeo");
		listaWindowns.add(w8);
		
		ModeloAplicacao w9 = new ModeloAplicacao();
		w9.setCategoria("Windows");
		w9.setTipo("Solicitação");
		w9.setCodigo("SBBASDD037");
		w9.setDescricao("(BBA) Windows - Configurações");
		w9.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Configurações");
		listaWindowns.add(w9);
		
		ModeloAplicacao w10 = new ModeloAplicacao();
		w10.setCategoria("Windows");
		w10.setTipo("Solicitação");
		w10.setCodigo("SBBASDD038");
		w10.setDescricao("(BBA) Windows - Dúvidas/Orientações");
		w10.setArvoreClassificacao("IBBA \\ SD \\ Windows \\ Dúvidas/Orientações");
		listaWindowns.add(w10);
		
		ModeloAplicacao w11 = new ModeloAplicacao();
		w11.setCategoria("Windows");
		w11.setTipo("Solicitação");
		w11.setCodigo("SBBASD1073");
		w11.setDescricao("(BBA) Wireless - Configuração");
		w11.setArvoreClassificacao("IBBA \\ SD \\ Wireless \\ Configuração");
		listaWindowns.add(w11);
		
		ModeloAplicacao v1 = new ModeloAplicacao();
		v1.setCategoria("VDI");
		v1.setTipo("Solicitação");
		v1.setCodigo("SBBASHDW05");
		v1.setDescricao("(BBA) - Hardware - Movimentação de arquivos entre MV's / MC's (IMAC)");
		v1.setArvoreClassificacao("IBBA \\ ARQUIVO \\ Movimentação de arquivos entre MV's / MC's (IMAC)");
		listaWindowns.add(v1);

		return listaWindowns;
	}
}
