

public class StandardShippingFactory extends ShippingMethodFactory {
    @Override
    public ShippingMethod createShippingMethod() {
        return new StandardShipping();
    }
}

