package br.com.brejaonline.parses;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

import br.com.brejaonline.endereco.v1.Endereco;
import br.com.brejaonline.pessoa.v1.PessoaFisica;

public abstract class Parser {

	public static void main(String[] args) {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setCpf("12345678909");
		pessoaFisica.setNome("Alexandre Saudate");
		Endereco endereco = new Endereco();
		endereco.setCep("12345-678");
		pessoaFisica.getEndereco().add(endereco);
		JAXB.marshal(pessoaFisica, System.out);
	}

	public static PessoaFisica criarPessoaFisicaTeste() {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setCpf("123.456.789-09");
		pessoaFisica.setId(1L);
		pessoaFisica.setNome("Alexandre");

		Endereco endereco = new Endereco();
		endereco.setCep("12345-678");
		endereco.setLogradouro("Rua Um");

		List<Endereco> enderecos = new ArrayList<>();
		enderecos.add(endereco);

		pessoaFisica.setEndereco(enderecos);
		return pessoaFisica;
	}

}
