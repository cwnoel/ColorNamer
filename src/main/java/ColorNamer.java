import jdk.nashorn.internal.objects.annotations.Getter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

// The Java class will be hosted at the URI path "/colornamer"
@Path("/colornamer")
public class ColorNamer {

    // The Java method will process HTTP POST requests


    @POST
    @Produces("text/plain")
    public Response convertPost(@QueryParam("origColor") String origColor) {

        ArrayList<String> Blues = new ArrayList<String>();
        Blues.add("aqua");
        Blues.add("azul");
        Blues.add("turquoise");
        Blues.add("blue");

        ArrayList<String> Greens = new ArrayList<String>();
        Greens.add("chartreuse");
        Greens.add("moss");
        Greens.add("forest");
        Greens.add("green");

        if (Blues.contains(origColor.toLowerCase())) {
            return Response.ok("Blue").build();
        }

        if (Greens.contains(origColor.toLowerCase())) {
            return Response.ok("Green").build();
        }

        return Response.serverError().build();

    }
}
