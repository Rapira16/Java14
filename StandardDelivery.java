public class StandardDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight, double distance) {
        return 5.0 + (0.5 * weight) + (0.1 * distance);
    }
}
