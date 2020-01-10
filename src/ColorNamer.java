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

        ArrayList<String> Blues2 = new ArrayList<String>();
        Blues2.add("aqua");
        Blues2.add("azul");
        Blues2.add("turquoise");
        Blues2.add("blue");

        ArrayList<String> Greens2 = new ArrayList<String>();
        Greens2.add("chartreuse");
        Greens2.add("moss");
        Greens2.add("forest");
        Greens2.add("green");

        if (Blues2.contains(origColor.toLowerCase())) {
            return Response.ok("Blue").build();
        }

        if (Greens2.contains(origColor.toLowerCase())) {
            return Response.ok("Green").build();
        }

        return Response.serverError().build();

    }
}
