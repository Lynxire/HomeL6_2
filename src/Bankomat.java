public class Bankomat {
    int a;
    int b;
    int c;
    int allMoney;

    public Bankomat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //a = кол-во 20 номинальных, б = кол-во 50 номинальных вкинуто, с = кол-во 100 номинальных вкинуто
    public void addMoney(int a, int b, int c) {
        this.a += a;
        this.b += b;
        this.c += c;
        this.allMoney = this.a * 20 + this.b * 50 + this.c * 100;
        System.out.println("кол-во купюр = " + (this.a + this.b + this.c));
        System.out.println("сумма всех денег " + this.allMoney);
        System.out.println("кол-во 20-тизначных купюр = " + this.a + " кол-во 50-тизначных купюр = " + this.b + " кол-во 100-тизначных купюр = " + this.c);

    }

    public void minus(int spis) {
        if (spis < this.allMoney) {
            spis = this.allMoney - spis;
            System.out.println("Списание суммы " + spis + " возможно");
            int count100 = 0;
            int count50 = 0;
            int count20 = 0;
            while (spis != 0) {
                if (spis % 100 == 0 && c > 0) {
                    spis -= 100;
                    this.c -= 1;
                    count100++;
                } else if (spis % 50 == 0 && b > 0) {
                    spis -= 50;
                    this.b -= 1;
                    count50++;
                } else if (a > 0) {
                    spis -= 20;
                    this.a -= 1;
                    count20++;
                } else {
                    System.out.println("Неудача");
                }
            }
            System.out.println("Успешно выдано 20 = " + count20 + ", 50 = " + count50 + ", 100 = " + count100);
        }
        else {
            System.out.println("neydacha");
        }
    }

}

