package it.info01.update.service.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
@Path("hello")
public class Hello
{
  private static final SimpleDateFormat SDF = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");

  @GET
  @Path("sayHello")
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHello()
  {
    return "Buongiorno !!!";
  }

  @GET
  @Path("getTime")
  @Produces(MediaType.TEXT_PLAIN)
  public String getTime()
  {
    Date d = new Date(System.currentTimeMillis());
    String s = SDF.format(d);
    d = null;
    return s;
  }
}
