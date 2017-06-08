package br.estacio.rodrigogferreira.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_turma")
public class Turma {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	private String matriculas;
	private String inicio;
	private String termino;
	private String totalVagas;
	private Boolean aberta;
	private String versao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(String matriculas) {
		this.matriculas = matriculas;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInico(String inico) {
		this.inico = inico;
	}

	public String getTermino() {
		return termino;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public String getTotalVagas() {
		return totalVagas;
	}

	public void setTotalVagas(String totalVagas) {
		this.totalVagas = totalVagas;
	}

	public Boolean getAberta() {
		return aberta;
	}

	public void setAberta(Boolean aberta) {
		this.aberta = aberta;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matriculas == null) ? 0 : matriculas.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result + ((termino == null) ? 0 : termino.hashCode());
		result = prime * result + ((totalVagas == null) ? 0 : totalVagas.hashCode());
		result = prime * result + ((aberta == null) ? 0 : aberta.hashCode());
		result = prime * result + ((versao == null) ? 0 : versao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;		
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matriculas == null) {
			if (other.matriculas != null)
				return false;
		} else if (!matriculas.equals(other.matriculas))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (termino == null) {
			if (other.termino != null)
				return false;
		} else if (!termino.equals(other.termino))
			return false;
		if (totalVagas == null) {
			if (other.totalVagas != null)
				return false;
		} else if (!totalVagas.equals(other.totalVagas))
			return false;
		if (aberta == null) {
			if (other.aberta != null)
				return false;
		} else if (!aberta.equals(other.aberta))
			return false;
		if (versao == null) {
			if (other.versao != null)
				return false;
		} else if (!versao.equals(other.versao))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Turma [id=" + id + ", matriculas=" + matriculas + ", inicio=" + inicio
				+ ", termino=" + termino + ", totalVagas=" + totalVagas + ", aberta=" + aberta + ", versao=" + versao + "]";
	}

}