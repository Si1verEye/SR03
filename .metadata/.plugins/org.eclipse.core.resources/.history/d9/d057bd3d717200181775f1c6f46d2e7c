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
	@Path("/all")
    public Response getAll()
    {
		return Response.ok(this.voiture.getTousVehicules()).build();
    }
	
	@GET
	@Path("/motorisationByID")
    public Response getMotorisation(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getMotorisation(id)).build();
    }
	
	@GET
	@Path("/priceByID")
    public Response getPriceByID(@QueryParam("id") int id)
    {
		return Response.ok(this.voiture.getMotorisation(id)).build();
    }
	
	@GET
	@Path("/tout")
    public Response getTout()
    {
		return Response.ok(this.voiture.getTout()).build();
    }
	
}
