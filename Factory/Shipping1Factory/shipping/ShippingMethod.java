public abstract class ShippingMethod {
    public abstract double calculateShippingCost(double weight, double distance);
    public abstract String getMethodName();
}
