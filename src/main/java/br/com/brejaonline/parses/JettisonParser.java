package br.com.brejaonline.parses;

import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLStreamWriter;

import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;

import br.com.brejaonline.pessoa.v1.PessoaFisica;

public class JettisonParser {

	public static void main(String[] args) throws JAXBException {
		PessoaFisica pessoaFisica = Parser.criarPessoaFisicaTeste();

		JAXBContext context = JAXBContext.newInstance(PessoaFisica.class);

		MappedNamespaceConvention con = new MappedNamespaceConvention();

		Writer writer = new OutputStreamWriter(System.out);

		XMLStreamWriter xmlStreamWriter = new MappedXMLStreamWriter(con, writer);

		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(pessoaFisica, xmlStreamWriter);

	}
}
