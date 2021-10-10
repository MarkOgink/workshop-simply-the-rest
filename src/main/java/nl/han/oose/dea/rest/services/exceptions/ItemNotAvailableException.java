package nl.han.oose.dea.rest.services.exceptions;

import javax.ws.rs.NotFoundException;

public class ItemNotAvailableException extends RuntimeException {
    public ItemNotAvailableException(){
        throw new NotFoundException();
    }
}
