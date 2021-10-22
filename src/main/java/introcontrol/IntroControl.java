package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number){
        return number<11?number:number-10;
    }
    public String describeNumber(int number){
        if (number == 0){
            return "zero";
        } else return "not zero";
    }
    public String greetingToJoe(String name){
        return name.equals("Joe")?"hello Joe": "";
    }
    public int calculateBonus(int sale){
        return sale>999_999? (int) (sale * 0.1) :0;
    }
    public double  calculateBonuss(int sale){
        return sale>999999? sale*0.1 :0;
    }
    public int calculateConsumption(int prev, int next){
        return prev<next?next-prev:(10000 -prev + next );
    }
    public void printNumbers(int max){
        for (int i=0 ; i<=max ;i++)System.out.println(i);

    }
    public void printNumbersBetween(int min, int max){
        for (int i=min;i<=max;i++) System.out.println(i);
    };
    public void printNumbersBetweenAnyDirection(int a, int b){
        if (b<a) {for(int j = a; j>=b ;j--){System.out.println(j);}}
            else {for(int i = a; i<=b ;i++) {System.out.println(i);}}
    }
    public void printOddNumbers(int max){
            for (int i=1;i<=max;i++){
                if (i%2 ==1){
                    System.out.println(i);
                }
        }
    }
}
