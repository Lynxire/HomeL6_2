public class Bankomat {
    int a;
    int b;
    int c;
    int allMoney;

    public Bankomat(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
//a = кол-во 20 номинальных, б = кол-во 50 номинальных вкинуто, с = кол-во 100 номинальных вкинуто
    public void addMoney(int a, int b, int c){
        this.a += a;
        this.b += b;
        this.c += c;
        this.allMoney = this.a* 20 + this.b*50 + this.c*100;
        System.out.println("кол-во купюр = " + (this.a + this.b + this.c));
        System.out.println("сумма всех денег " + this.allMoney);
    }

    public void minus(int spis){
        if(spis < this.allMoney){
            System.out.println("Успех " + (this.allMoney-spis));
        }
        else {
            System.out.println("Недостаточно средств");
        }
        System.out.println("кол-во 20-тизначных купюр = " + this.a + " кол-во 50-тизначных купюр = " + this.b + " кол-во 100-тизначных купюр = " + this.c);

    }

}