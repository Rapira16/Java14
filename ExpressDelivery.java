public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight, double distance) {
        return 10.0 + (0.8 * weight) + (0.2 * distance);
    }
}
