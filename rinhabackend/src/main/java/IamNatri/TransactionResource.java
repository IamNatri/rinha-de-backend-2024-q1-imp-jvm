package IamNatri;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

public class TransactionResource {
    @POST
    @Path("/clientes/{idCliente}/transacoes")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createTransaction(@PathParam("idCliente") String idCliente, String transaction) {
        // TODO: Implement this method
    }
}