package com.dengue.api.dto;

import java.io.Serializable;
import java.util.Date;

import com.dengue.api.entity.Pessoas;

public class PessoasDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idPessoas;
	private String nomePessoas;
	private String cpfPessoas;
	private Date dataNascimentoPessoas;
	private String sexoPessoas;
	private String statusPessoas;
	private Date dataPessoas;
	private String cepPessoas;
	private String logradouroPessoas;
	private String bairroPessoas;
	private String localidadePessoas;
	private String ufPessoas;

	public PessoasDTO() {
		super();
	}


	public PessoasDTO(Integer idPessoas, String nomePessoas, String cpfPessoas, Date dataNascimentoPessoas,
			String sexoPessoas, String statusPessoas, Date dataPessoas, String cepPessoas, String logradouroPessoas,
			String bairroPessoas, String localidadePessoas, String ufPessoas) {
		super();
		this.idPessoas = idPessoas;
		this.nomePessoas = nomePessoas;
		this.cpfPessoas = cpfPessoas;
		this.dataNascimentoPessoas = dataNascimentoPessoas;
		this.sexoPessoas = sexoPessoas;
		this.statusPessoas = statusPessoas;
		this.dataPessoas = dataPessoas;
		this.cepPessoas = cepPessoas;
		this.logradouroPessoas = logradouroPessoas;
		this.bairroPessoas = bairroPessoas;
		this.localidadePessoas = localidadePessoas;
		this.ufPessoas = ufPessoas;
	}


	public Pessoas convertDtoToEntiy() {
		return new Pessoas(getIdPessoas(), getNomePessoas(), getCpfPessoas(), getDataNascimentoPessoas(), getSexoPessoas(),
				getStatusPessoas(), getDataPessoas(), getCepPessoas(), getLogradouroPessoas(), getBairroPessoas(),
				getLocalidadePessoas(), getUfPessoas());
	}

	
	public String getCpfPessoas() {
		return cpfPessoas;
	}


	public void setCpfPessoas(String cpfPessoas) {
		this.cpfPessoas = cpfPessoas;
	}


	public Integer getIdPessoas() {
		return idPessoas;
	}

	public void setIdPessoas(Integer idPessoas) {
		this.idPessoas = idPessoas;
	}

	public String getNomePessoas() {
		return nomePessoas;
	}

	public void setNomePessoas(String nomePessoas) {
		this.nomePessoas = nomePessoas;
	}

	public Date getDataNascimentoPessoas() {
		return dataNascimentoPessoas;
	}

	public void setDataNascimentoPessoas(Date dataNascimentoPessoas) {
		this.dataNascimentoPessoas = dataNascimentoPessoas;
	}

	public String getSexoPessoas() {
		return sexoPessoas;
	}

	public void setSexoPessoas(String sexoPessoas) {
		this.sexoPessoas = sexoPessoas;
	}

	public String getStatusPessoas() {
		return statusPessoas;
	}

	public void setStatusPessoas(String statusPessoas) {
		this.statusPessoas = statusPessoas;
	}

	public Date getDataPessoas() {
		return dataPessoas;
	}

	public void setDataPessoas(Date dataPessoas) {
		this.dataPessoas = dataPessoas;
	}

	public String getCepPessoas() {
		return cepPessoas;
	}

	public void setCepPessoas(String cepPessoas) {
		this.cepPessoas = cepPessoas;
	}

	public String getLogradouroPessoas() {
		return logradouroPessoas;
	}

	public void setLogradouroPessoas(String logradouroPessoas) {
		this.logradouroPessoas = logradouroPessoas;
	}

	public String getBairroPessoas() {
		return bairroPessoas;
	}

	public void setBairroPessoas(String bairroPessoas) {
		this.bairroPessoas = bairroPessoas;
	}

	public String getLocalidadePessoas() {
		return localidadePessoas;
	}

	public void setLocalidadePessoas(String localidadePessoas) {
		this.localidadePessoas = localidadePessoas;
	}

	public String getUfPessoas() {
		return ufPessoas;
	}

	public void setUfPessoas(String ufPessoas) {
		this.ufPessoas = ufPessoas;
	}

}
