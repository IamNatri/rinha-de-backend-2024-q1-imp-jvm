package IamNatri;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

public class ExtratoResource {

    @GET
    @Path("/clientes/{idCliente}/extrato")
    public void getExtrato(@PathParam("idCliente") String idCliente, String transaction) {
        // TODO: Implement this method

    }
}
