public class Car extends ShippingVehicle(){
    @Override
    public String ship(){
        return "Shipping by car";
    }
}

public class Truck extends ShippingVehicle(){
    @Override
    public String ship(){
        return "Shipping by truck";
    }
}

public class MotorCycle extends ShippingVehicle(){
    @Override
    public String ship(){
        return "Shipping by motorcycle";
    }
}