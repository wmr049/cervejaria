package br.com.brejaonline.parses;

import com.google.gson.Gson;

import br.com.brejaonline.pessoa.v1.PessoaFisica;

public class GSONParser {

	public static void main(String[] args) {

		PessoaFisica pessoaFisica = Parser.criarPessoaFisicaTeste();
		Gson gson = new Gson();
		System.out.println(gson.toJson(pessoaFisica));

	}
}
