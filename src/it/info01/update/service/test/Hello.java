package it.info01.update.service.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.info01.update.bean.test.DateBean;

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
  @Path("jsonHello")
  @Produces(MediaType.APPLICATION_JSON)
  public Response jsonHello() throws JsonProcessingException
  {
    ObjectMapper mapper = new ObjectMapper();

    Date d = new Date();
    it.info01.update.bean.test.Hello h = new it.info01.update.bean.test.Hello();
    h.setTesto("CIAO. " + SDF.format(d));
    return Response.ok(mapper.writeValueAsString(h)).build();
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

  @GET
  @Path("getTimeJSon")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getTimeJSon() throws JsonProcessingException
  {
    ObjectMapper mapper = new ObjectMapper();
    Calendar cal = Calendar.getInstance();
    DateBean db = new DateBean();
    db.setYear(cal.get(Calendar.YEAR));
    db.setMonth(cal.get(Calendar.MONTH) + 1);
    db.setMonthS(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ITALIAN));
    db.setDay(cal.get(Calendar.DAY_OF_MONTH));
    db.setDayS(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ITALIAN));

    db.setHour(cal.get(Calendar.HOUR_OF_DAY));
    db.setMinute(cal.get(Calendar.MINUTE));
    db.setSecond(cal.get(Calendar.SECOND));

    return Response.ok(mapper.writeValueAsString(db)).build();
  }
}
