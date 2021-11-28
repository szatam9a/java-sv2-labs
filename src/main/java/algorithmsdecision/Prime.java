package algorithmsdecision;

public class Prime {
    public boolean isPrime(int number){
        int counter=0;
        for (int i = 1; i<number/2+1;i++){
            if (number%i==0){
                counter++;
                if (counter>2){return false;}
            }
        }
    return true;}
}
