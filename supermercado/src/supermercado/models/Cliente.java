package supermercado.models;

import java.util.Calendar;

public class Cliente {

	String nome;
	Long idade;
	String cpf;
	String endereco;
	Calendar datanascimento;
	String email;
	String telefone;

	public String getTelefone() {
		return telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Calendar datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.setTelefone(telefone);

	}
}