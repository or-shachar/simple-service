package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "words" path)
 */
@Path("words")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("index")
    @Produces(MediaType.TEXT_PLAIN)
    public String indexIt(
    		@QueryParam("word") String word) {
        String ret = (String.format("Thanks for sending: %s", word));
        return ret;
    }
    
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("show")
    @Produces(MediaType.TEXT_PLAIN)
    public String showIt() {
        return "Please implement";
    }
}
