public class DeliveryCostCalculator {
    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public double calculateCost(double weight, double distance) {
        if (deliveryStrategy == null) {
            throw new IllegalStateException("Delivery strategy not set");
        }
        return deliveryStrategy.calculateCost(weight, distance);
    }
}
