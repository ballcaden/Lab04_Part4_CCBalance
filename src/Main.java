


public class Main {
    public static void main(String[] args) {
    int initCredBalance = 5000;
    double monthOne;
    double monthTwo;
    double credInterestBalance;


    System.out.println("Initial balance of the credit card is: " + initCredBalance + "$");
    monthOne = initCredBalance * 1.17;
    credInterestBalance = monthOne;
    System.out.println("Balance of the credit card after one month, with the 17% interest rate, is: " + monthOne + "$");
    monthTwo = credInterestBalance * 1.17;
    System.out.println("Balance of the credit card after two months, with the 17% interest rate, is: " + monthTwo + "$");



    }
}