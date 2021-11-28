public class CafeJava{
    public static void main(String[] args) {
        // App Variable
        String generalGreeting = "Welcome to Cafe Java!, ";
        String pendingMessage =  ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = " Your total is $";

        // Menu Variable
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.25;
        double lattePrice = 3.25;
        double cappuccinoPrice = 4;

        // Customer name Variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order Completions
        boolean isReadyOrder1  = false;
        boolean isReadyOrder2  = false;
        boolean isReadyOrder3  = false;
        boolean isReadyOrder4  = true;

        System.out.println(customer1 + pendingMessage);
        if ( isReadyOrder4 ) {
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(customer2 + pendingMessage + displayTotalMessage + (lattePrice * 2));
        if ( isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else { 
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice));

    }
}