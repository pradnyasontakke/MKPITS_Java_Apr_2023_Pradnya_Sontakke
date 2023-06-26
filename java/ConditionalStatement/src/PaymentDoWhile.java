public class PaymentDoWhile {
    static boolean isPaymentMade=false;
    public static void main(String[] args) {
        do {
            System.out.println("waiting for processing");

        }while (!isPaymentMade);

    }
}
