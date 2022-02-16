package jersey;

//import javax.ws.rs.core.MediaType;

//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;

public class JerseyTest {
	/**
	public void doPost(){
			 try{
				Client client = Client.create();
				 
				WebResource webResource = client
				   .resource("http://localhost:8080/RESTfulExample/rest/json/metallica/post");
		 
				String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
		 
				ClientResponse response = webResource.type("application/json").accept("application/xml").header("name1", "value1").header("n1", "v1")
				   .post(ClientResponse.class, input);
				System.out.println("Output from Server .... \n");
				String output = response.getEntity(String.class);
				System.out.println(output);}
            catch (Exception e)
            {
              System.out.println (e.getMessage());
              e.printStackTrace();
              System.exit(0);
            }
	}
	public void doGet()
	{
		try{

			Client client = Client.create();
			 
			WebResource webResource = client
			   .resource("http://localhost:8080/RESTfulExample/rest/json/metallica/post");
	 
			ClientResponse response = webResource.type("application/json").accept("application/json").header("name1", "value1").header("n1", "v1")
			   .get(ClientResponse.class);
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
		}catch(Exception e){e.printStackTrace();}
	}**/
}
