package nl.han.oose.dea.rest.services.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class IdAlreadyInUseException extends RuntimeException {
    public IdAlreadyInUseException(){
        throw new WebApplicationException(Response.Status.CONFLICT);
    }
}
