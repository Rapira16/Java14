public class CourierDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight, double distance) {
        return 15.0 + (1.0 * weight) + (0.3 * distance);
    }
}
