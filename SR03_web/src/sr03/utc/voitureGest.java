package sr03.utc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

@ManagedBean
@ViewScoped
public class voitureGest {
	
	private Client client;
	
	private List<vehiculeTemplate> vehiculeTemplate;
	private List<motorisationTemplate> motorisationTemplate;
	
	@PostConstruct
	public void init()
	{		
		this.vehiculeTemplate = new ArrayList<vehiculeTemplate>();
		
		this.client = ClientBuilder.newClient();
		
		this.vehiculeTemplate = client.target("http://localhost:8080/SR03_REST/voiture/all")
				.request(MediaType.APPLICATION_JSON)
				.get(new GenericType<List<vehiculeTemplate>>() {});
		System.out.println("plop");
		
	}
	
	public void setMotorisationTemplateByID(int motorisation) {
		this.motorisationTemplate = new ArrayList<motorisationTemplate>();
		this.motorisationTemplate = client.target("http://localhost:8080/SR03_REST/voiture/motorisationByID")
				.queryParam("id", motorisation)
				.request(MediaType.APPLICATION_JSON)
				.get(new GenericType<List<motorisationTemplate>>() {});
	}

	public List<vehiculeTemplate> getVoitureTemplate() {
		return vehiculeTemplate;
	}

	public void setVoitureTemplate(List<vehiculeTemplate> voitureTemplate) {
		this.vehiculeTemplate = voitureTemplate;
	}

	public List<motorisationTemplate> getMotorisationTemplate() {
		return motorisationTemplate;
	}

	public void setMotorisationTemplate(List<motorisationTemplate> motorisationTemplate) {
		this.motorisationTemplate = motorisationTemplate;
	}

	

}
