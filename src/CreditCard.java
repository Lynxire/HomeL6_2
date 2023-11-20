public class CreditCard {
    int number;
    int sum;
    public CreditCard(int number, int sum){
        this.number = number;
        this.sum = sum;
    }
    public void addSum(int sum){
        this.sum = this.sum + sum;
    }

    public void minus(int sum){
        this.sum = this.sum - sum;
    }

   public void info(){
       System.out.println(this.sum);
   }
}
