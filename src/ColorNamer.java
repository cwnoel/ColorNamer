import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

// The Java class will be hosted at the URI path "/colornamer"
@Path("/colornamer")
public class ColorNamer {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces
    public String convert(@QueryParam("color") String myName){
        if (myName.equalsIgnoreCase("Aqua")){
            return "Blue";
        }else {
            return myName;
        }


    }
}
