import java.util.*;
import javax.persistence.*;


@Entity
@Table(name ="Route")

public class Route
{
private String origin,destination;

private Flight flight;

private String routeId;
	public Route(){}

public void setFlight(Flight fl)
{
	this.flight=fl;
}


	public void setOrigin(String o)
	{
		origin=o;
	}

	public void setDestination(String h)
	{
		destination=h;
	}

	@Column(name ="Origin")
	public String getOrigin()
	{
		return origin;
	}
@Column(name = "destination")
	public String getDestination()
	{
		return destination;
	}

@ManyToOne
    @JoinColumn(name="flightId")
public Flight getFlight()
{
	return flight;
}

public void setRouteId(String p)
{
	this.routeId=p;
}
	
@Id
public String getRouteId()
{
	return routeId;
}


}