package nl.han.oose.dea.rest.services;

import nl.han.oose.dea.rest.services.dto.ItemDTO;
import nl.han.oose.dea.rest.services.exceptions.ItemNotAvailableException;

import javax.ejb.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/items")
@Singleton
public class ItemResource {
    private ItemService itemService = new ItemService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response itemsToJSON(){
        return Response.status(200).entity(itemService.getAll()).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response getItem(@PathParam("id") int id){
        return Response.status(200).entity(itemService.getItem(id)).build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response addItem(ItemDTO itemDTO){
        itemService.addItem(itemDTO);
        return Response.status(201).entity(itemService.getAll()).build();
    }

    @DELETE
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response removeItem(@PathParam("id") int id){
        itemService.deleteItem(id);
        return Response.status(200).entity(itemService.getAll()).build();
    }
}
