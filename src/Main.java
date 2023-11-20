public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1,0);
        CreditCard creditCard1 = new CreditCard(2,10);
        CreditCard creditCard2 = new CreditCard(3,100);

        creditCard.addSum(100);
        creditCard1.addSum(150);
        creditCard2.minus(50);
        creditCard.info();
        creditCard1.info();
        creditCard2.info();

        Bankomat bankomat = new Bankomat(20,50,100);
        bankomat.addMoney(10,30,40);
        bankomat.minus(10);

    }
}