import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import SR03.fr.RequestLocal;


@Stateless
@Path("/voiture")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
public class testrest {
	
	@EJB
	private RequestLocal voiture;
	
	@GET
	@Path("/finitionByID")
    public Response getFinition(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getFinition(id)).build();
    }
	
	@GET
	@Path("/couleurJanteByID")
    public Response getCouleurJante(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getCouleurJante(id)).build();
    }
	
	@GET
	@Path("/couleurVehiculeByID")
    public Response getCouleurVehicule(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getCouleurVehicule(id)).build();
    }
	
	@GET
	@Path("/janteByID")
    public Response getJante(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getJante(id)).build();
    }
	
	@GET
	@Path("/modeleByID")
    public Response getModele(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getModele(id)).build();
    }
	
	@GET
	@Path("/all")
    public Response getAll()
    {
		return Response.ok(this.voiture.getTousVehicules()).build();
    }
	
	@GET
	@Path("/allM")
    public Response getAllMotorisation()
    {
		return Response.ok(this.voiture.getTousMotorisation()).build();
    }
	
	@GET
	@Path("/allMod")
    public Response getAllModele()
    {
		return Response.ok(this.voiture.getTousModeles()).build();
    }
	
	@GET
	@Path("/allCV")
    public Response getAllColorV()
    {
		return Response.ok(this.voiture.getTousCouleurVehicule()).build();
    }
	
	@GET
	@Path("/motorisationByID")
    public Response getMotorisation(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getMotorisation(id)).build();
    }
	
	@GET
	@Path("/tout")
    public Response getVehiculeForm(@QueryParam("idMod") int idMod,@QueryParam("idColorV") int idColorV)
    {
		return Response.ok(this.voiture.getTousVehiculeModColor(idMod, idColorV)).build();
    }
	
}
