package br.com.brejaonline.pessoa.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de PessoaFisica complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaFisica">
 *   &lt;complexContent>
 *     &lt;extension base="{http://brejaonline.com.br/pessoa/v1}Pessoa">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://brejaonline.com.br/pessoa/v1}CPF"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaFisica", propOrder = { "cpf" })
public class PessoaFisica extends Pessoa {

	@XmlElement(required = true)
	protected String cpf;
	private String dadoTransiente = "dadoTransiente";

	@XmlTransient
	public String getDadoTransiente() {
		return dadoTransiente;
	}

	public void setDadoTransiente(String dadoTransiente) {
		this.dadoTransiente = dadoTransiente;
	}

	/**
	 * Obt�m o valor da propriedade cpf.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Define o valor da propriedade cpf.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCpf(String value) {
		this.cpf = value;
	}

}
