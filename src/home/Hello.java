package home;


import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {
	
	private String jsonResponse = "{\"users\":[{\"firstName\":\"ted\",\"lastName\":\"Villalobos\",\"reg\":{\"month\":\"January\",\"day\":12,\"year\":2012}},{\"firstName\":\"John\",\"lastName\":\"Jones\",\"reg\":{\"month\":\"April\",\"day\":28,\"year\":2010}}]}";

  // This method is called if TEXT_PLAIN is request
//  @GET
//  @Produces(MediaType.TEXT_PLAIN)
//  public String sayPlainTextHello() {
//    return "Hello Jersey";
//  }

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayPlainTextHello2() {
		//jsonResponse = "{\"users\":[{\"firstName\":\"ted\",\"lastName\":\"Villalobos\",\"reg\":{\"month\":\"January\",\"day\":12,\"year\":2012}},{\"firstName\":\"John\",\"lastName\":\"Jones\",\"reg\":{\"month\":\"April\",\"day\":28,\"year\":2010}}]}";
		return jsonResponse;
	}  
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String reciveBooking(@FormParam("date") String date, @FormParam("time") String time, @FormParam("endTime") String endTime) {
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(endTime);
		
		jsonResponse = "{\"users\":[{\"firstName\":\"Oscar\",\"lastName\":\"Villalobos\",\"reg\":{\"month\":\"January\",\"day\":12,\"year\":2012}}]}";
		
		return "Bokat " +date +" "+ time +" till "+endTime;
	}  	
  
  // This method is called if XML is request
//  @GET
//  @Produces(MediaType.TEXT_XML)
//  public String sayXMLHello() {
//    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
//  }

  // This method is called if HTML is request
//  @GET
//  @Produces(MediaType.TEXT_HTML)
//  public String sayHtmlHello() {
//    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
//        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
//  }

} 