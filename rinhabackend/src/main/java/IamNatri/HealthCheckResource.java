package IamNatri;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hs")
public class HealthCheckResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String healthCheck() {
        return "OK";
    }
}