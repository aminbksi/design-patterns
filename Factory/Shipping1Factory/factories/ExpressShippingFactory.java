public class ExpressShippingFactory extends ShippingMethodFactory {
    @Override
    public ShippingMethod createShippingMethod() {
        return new ExpressShipping();
    }
}
