
public class NormalShipping extends ShippingFactory {
    @Override
    public ShippingVehicle createShippingVehicle() {
        return new Car();
    }
}

public class HeavyShipping extends ShippingFactory {
    @Override
    public ShippingVehicle createShippingVehicle() {
        return new Truck();
    }
}

public class ExpressShipping extends ShippingFactory {
    @Override
    public ShippingVehicle createShippingVehicle() {
        return new MotorCycle();
    }
}