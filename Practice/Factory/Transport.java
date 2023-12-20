package Practice.Factory;


public interface Route {
    String getRouteDetails();
}

public interface Schedule {
    String getDepartureTime();
    String getArrivalTime();
}

public interface Transport {
    void loadCargo();
    void transport();
    void unloadCargo();
    String getRoute();
    String getSchedule();
}

public interface Cargo {
    String getType();
}

public class PerishableCargo implements Cargo {
    public String getType() {
        return "Perishable Cargo";
    }
}

public class HazardousCargo implements Cargo {
    public String getType() {
        return "Hazardous Cargo";
    }
}

public class Truck implements Transport {
    private Route route;
    private Schedule schedule;
    private Cargo cargo;

    public Truck(Route route, Schedule schedule, Cargo cargo) {
        this.route = route;
        this.schedule = schedule;
        this.cargo = cargo;
    }

    public void loadCargo() {
        System.out.println("Loading " + cargo.getType() + " onto truck");
    }

    public void transport() {
        System.out.println("Transporting " + cargo.getType() + " on truck");
    }

    public void unloadCargo() {
        System.out.println("Unloading " + cargo.getType() + " from truck");
    }

    public String getRoute() {
        return route.getRouteDetails();
    }

    public String getSchedule() {
        return "Departure time: " + schedule.getDepartureTime() + ", Arrival time: " + schedule.getArrivalTime();
    }
}

public class Train implements Transport {
    private Route route;
    private Schedule schedule;
    private Cargo cargo;

    public Train(Route route, Schedule schedule, Cargo cargo) {
        this.route = route;
        this.schedule = schedule;
        this.cargo = cargo;
    }

    public void loadCargo() {
        System.out.println("Loading " + cargo.getType() + " onto train");
    }

    public void transport() {
        System.out.println("Transporting " + cargo.getType() + " on train");
    }

    public void unloadCargo() {
        System.out.println("Unloading " + cargo.getType() + " from train");
    }

    public String getRoute() {
        return route.getRouteDetails();
    }

    public String getSchedule() {
        return "Departure time: " + schedule.getDepartureTime() + ", Arrival time: " + schedule.getArrivalTime();
    }
}

public class Airplane implements Transport {
    private Route route;
    private Schedule schedule;
    private Cargo cargo;

    public Airplane(Route route, Schedule schedule, Cargo cargo) {
        this.route = route;
        this.schedule = schedule;
        this.cargo = cargo;
    }

    public void loadCargo() {
        System.out.println("Loading " + cargo.getType() + " onto airplane");
    }

    public void transport() {
        System.out.println("Transporting " + cargo.getType() + " on airplane");
    }

    public void unloadCargo() {
        System.out.println("Unloading " + cargo.getType() + " from airplane");
    }

    public String getRoute() {
        return route.getRouteDetails();
    }

    public String getSchedule() {
        return "Departure time: " + schedule.getDepartureTime() + ", Arrival time: " + schedule.getArrivalTime();
    }
}

public interface TransportFactory {
    Transport createTransport(Route route, Schedule schedule, Cargo cargo);
}

public class TruckFactory implements TransportFactory {
    public Transport createTransport(Route route, Schedule schedule, Cargo cargo) {
        return new Truck(route, schedule, cargo);
    }
}

public class TrainFactory implements TransportFactory {
    public Transport createTransport(Route route, Schedule schedule, Cargo cargo) {
        return new Train(route, schedule, cargo);
    }
}

public class AirplaneFactory implements TransportFactory {
    public Transport createTransport(Route route, Schedule schedule, Cargo cargo) {
        return new Airplane(route, schedule, cargo);
    }
}


public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TruckFactory();
        Route route = new Route() {
            public String getRouteDetails() {
                return "Route: New York to Los Angeles";
            }
        };
        Schedule schedule = new Schedule() {
            public String getDepartureTime() {
                return "10:00";
            }
            public String getArrivalTime() {
                return "18:00";
            }
        };
        Cargo cargo = new PerishableCargo();
        Transport transport = factory.createTransport(route, schedule, cargo);
        transport.loadCargo();
        transport.transport();
        transport.unloadCargo();
        System.out.println(transport.getRoute());
        System.out.println(transport.getSchedule());
    }
}