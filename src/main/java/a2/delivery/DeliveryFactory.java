package a2.delivery;

public class DeliveryFactory {
        public Delivery SetDelivery(String name,String address, String details, int number) {
            if (name.equalsIgnoreCase("Ubereat")) {
                return new Ubereat(address,  details,  number);
            } else if (name.equalsIgnoreCase("Foodora")) {
                return new Foodora(address,  details,  number);
            } else if (name.equalsIgnoreCase("PizzaPalour")) {
                return new Delivery(address,  details,  number);
            }
            return null;
        }

}
