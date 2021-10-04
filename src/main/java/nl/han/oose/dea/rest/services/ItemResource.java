package nl.han.oose.dea.rest.services;

import nl.han.oose.dea.rest.services.dto.ItemDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/items")
public class ItemResource {
/*
    @GET
    @Produces("text/plain")
    public String healthy() {
        return "bread, butter";
    }*/

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
    public List<ItemDTO> itemsToJSON(){
        ArrayList<ItemDTO> list = new ArrayList<>();
        list.add(new ItemDTO(0, "bread", null, null));
        list.add(new ItemDTO(1, "butter", null, null));
        return list;
    }
}
