package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

// https://guides.gradle.org/building-java-web-applications/
// https://www.javacodegeeks.com/2018/04/jax-rs-tutorial-with-jersey-for-restful-web-services.html
// https://github.com/jasonray/jersey-starterkit/wiki/Create-a-%22Hello-World%22-jersey-project

@Path("/hello")
public class HelloWorld {
    @GET
    @Path("/{name}")
    public Response getMessage(@PathParam("name") String name) {
        String outMsg = "Hello " + name + "!";
        return Response.status(200).entity(outMsg).build();
    }

    @GET()
    public String hello() {
        return "hello";
    }

}