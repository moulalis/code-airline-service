package org.saga;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient(baseUri = "http://localhost:8082")
@Path("/hotel")
public interface HotelClient {
    @GET
    @Path("/book")
    void bookHotel();
}
