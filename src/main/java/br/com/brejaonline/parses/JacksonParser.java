package br.com.brejaonline.parses;

import java.io.IOException;

import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.xc.JaxbAnnotationIntrospector;

import br.com.brejaonline.pessoa.v1.PessoaFisica;

public class JacksonParser {

	public static void main(String[] args) throws IOException {
		PessoaFisica pessoaFisica = Parser.criarPessoaFisicaTeste();
		ObjectMapper objectMapper = new ObjectMapper();

		AnnotationIntrospector annotationIntrospector = new JaxbAnnotationIntrospector();
		objectMapper.setAnnotationIntrospector(annotationIntrospector);
		System.out.println(objectMapper.writeValueAsString(pessoaFisica));

	}
}
