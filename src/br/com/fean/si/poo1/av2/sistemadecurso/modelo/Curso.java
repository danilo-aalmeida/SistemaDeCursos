package br.com.fean.si.poo1.av2.sistemadecurso.modelo;

public class Curso {

	private Integer id;
	private String nome;
	private Double valor;



	public Curso(Integer id, String nome, Double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ID: " + id + "; Nome: " + nome + "; Valor: " + valor;


	}





}
