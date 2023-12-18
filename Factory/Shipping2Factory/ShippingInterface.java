public abstract class ShippingVehicle{
    String ship();
}

public abstract class ShippingFactory{
    ShippingVehicle createShippingVehicle();
}