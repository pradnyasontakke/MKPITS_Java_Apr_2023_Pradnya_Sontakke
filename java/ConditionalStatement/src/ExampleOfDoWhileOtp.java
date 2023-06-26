public class ExampleOfDoWhileOtp {

    public static void main(String[] args) {
        int OTP=30;
        int counter=1;
        do {

            System.out.println(counter);
            counter++;
            if (OTP>30){
                System.out.println("resend the otp");
            }
        }
        while (OTP>counter);
        System.out.println("complete the process");

    }
}
