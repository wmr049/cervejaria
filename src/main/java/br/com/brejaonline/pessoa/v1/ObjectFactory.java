//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.01.09 �s 05:04:13 AM BRST 
//


package br.com.brejaonline.pessoa.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.brejaonline.pessoa.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PessoaFisica_QNAME = new QName("http://brejaonline.com.br/pessoa/v1", "pessoaFisica");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.brejaonline.pessoa.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PessoaFisica }
     * 
     */
    public PessoaFisica createPessoaFisica() {
        return new PessoaFisica();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PessoaFisica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brejaonline.com.br/pessoa/v1", name = "pessoaFisica")
    public JAXBElement<PessoaFisica> createPessoaFisica(PessoaFisica value) {
        return new JAXBElement<PessoaFisica>(_PessoaFisica_QNAME, PessoaFisica.class, null, value);
    }

}
