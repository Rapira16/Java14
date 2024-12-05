public class Main {
    public static void main(String[] args) {
        DeliveryCostCalculator calculator = new DeliveryCostCalculator();

        // Пример стандартной доставки
        calculator.setDeliveryStrategy(new StandardDelivery());
        double standardCost = calculator.calculateCost(10, 100);
        System.out.println("Standard Delivery Cost: " + standardCost);

        // Пример экспресс-доставки
        calculator.setDeliveryStrategy(new ExpressDelivery());
        double expressCost = calculator.calculateCost(10, 100);
        System.out.println("Express Delivery Cost: " + expressCost);

        // Пример курьерской доставки
        calculator.setDeliveryStrategy(new CourierDelivery());
        double courierCost = calculator.calculateCost(10, 100);
        System.out.println("Courier Delivery Cost: " + courierCost);
    }
}
