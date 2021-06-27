aimport java.util.Collection;
import java.util.ArrayList;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class FlightClient {

    public static void main(String hh[]) {


        try {

            Session ss = HibernateUtil.currentSession();

            Transaction tx = ss.beginTransaction();


            Flight flight = new Flight();
            flight.setName("F0892");
            flight.setDate(new java.util.Date());
            flight.setFlightId("4009");


            Route route = new Route();
            route.setRouteId("0856");
            route.setOrigin("BLR");
            route.setDestination("COK");
            route.setFlight(flight);

            Route route1 = new Route();
            route1.setRouteId("0450");
            route1.setOrigin("COK");
            route1.setDestination("TRV");
            route1.setFlight(flight);

            flight.getRoutes().add(route1);
            flight.getRoutes().add(route);

//ss.save(flight);

            Flight myFlight = (Flight) ss.load(Flight.class, "4009");

		/*Route route2=new Route();
		route2.setRouteId("092");
		route2.setOrigin("TRV");
		route2.setDestination("COK");
		route2.setFlight(myFlight);

	myFlight.getRoutes().add(route2);
	
ss.saveOrUpdate(myFlight);
*/

            List<Route> routes = myFlight.getRoutes();

            for (Route ro : routes) {

                System.out.println(ro.getOrigin() + " : " + ro.getDestination());

            }


/*

Route r1=(Route)ss.load(Route.class,"090");

Flight myFlight=r1.getFlight();

System.out.println(myFlight.getName()+" : "+myFlight.getDate());

System.out.println(myFlight.getRoutes().size());




ss.delete(myFlight);*/

            tx.commit();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }


}