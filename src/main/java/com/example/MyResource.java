package com.example;

import java.util.Set;
import java.util.TreeSet;
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

	private static Set<String> words = new TreeSet<String>();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * This method would index (save) the given word
     * @return Confirmation string
     */
    @GET
    @Path("index")
    @Produces(MediaType.TEXT_PLAIN)
    public String indexIt(
    		@QueryParam("word") String word) {
    	words.add(word);
        String ret = (String.format("Thanks for sending: %s", word));
        return ret;
    }
    
    
    /**
     * Returns all indexed words ordered by alphabet.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("show")
    @Produces(MediaType.TEXT_PLAIN)
    public String showIt() {
    	String allwords = words.toString();
    	allwords = allwords.substring(1, allwords.length()-1).replaceAll(", ","\n");
        return allwords;
    }
}
