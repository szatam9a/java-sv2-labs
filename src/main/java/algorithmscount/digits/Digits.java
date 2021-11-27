package algorithmscount.digits;

public class Digits {
    public int getCounterOfNumbers(){
        int sum =0;
        for (int i = 10; i < 100 ; i++) {
            int firstDigit = (i-(i%10))/10;
            int secondDigit = (i%10);
            if (Math.abs(firstDigit-secondDigit)==5){
                sum++;
            }
        }
    return sum;}
}
