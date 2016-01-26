package br.com.geladaonline.client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.jettison.JettisonFeature;

import br.com.geladaonline.model.rest.Cervejas;

public class Client {
	public static void main(String[] args) {
		javax.ws.rs.client.Client client = ClientBuilder.newBuilder().build();
		client.register(JettisonFeature.class);
		Cervejas cervejas = client.target("https://localhost:8443/cervejaria/services").path("/cervejas")
				.request(MediaType.APPLICATION_JSON).get(Cervejas.class);
		System.out.println(cervejas);
	}
}
