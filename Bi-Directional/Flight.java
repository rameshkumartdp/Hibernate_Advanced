import java.io.*;
import java.util.*;
import javax.persistence.*;


@Entity
@Table(name = "Flight")

public class Flight {

    private String flightId, name;
    private Date date;
    private List<Route> routes = new ArrayList<Route>();

    public Flight() {
    }

    public void setName(String n) {
        name = n;
    }

    public void setDate(java.util.Date d) {

        date = d;
    }

    public void setFlightId(String fid) {
        flightId = fid;
    }

    public void setRoutes(List<Route> r) {
        routes = r;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @Id
    public String getFlightId() {
        return flightId;
    }

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    @Basic(fetch = FetchType.LAZY)
    public List<Route> getRoutes() {
        return routes;
    }

    @Column(name = "depDate")
    public Date getDate() {
        return date;
    }

}
