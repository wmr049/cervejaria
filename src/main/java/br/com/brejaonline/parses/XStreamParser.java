package br.com.brejaonline.parses;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import br.com.brejaonline.pessoa.v1.PessoaFisica;

public class XStreamParser {

	public static void main(String[] args) {
		PessoaFisica pessoaFisica = Parser.criarPessoaFisicaTeste();

		JettisonMappedXmlDriver jettisonMappedXmlDriver = new JettisonMappedXmlDriver();

		XStream xStream = new XStream(new JettisonMappedXmlDriver());

		System.out.println(xStream.toXML(pessoaFisica));

	}

}
