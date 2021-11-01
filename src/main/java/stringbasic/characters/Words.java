package stringbasic.characters;

import java.util.Scanner;

public class Words {
    private String aWord;
    private String aGuess;
    public void start(){
        askAWord();
        spellingAWord();
        checkTheSpelling();
    }
    public void askAWord(){
        System.out.println("Mit kell lebetúzni? ");
        Scanner sc = new Scanner(System.in);
        aWord= sc.nextLine();
    }
    public void spellingAWord(){
        System.out.println("Betűzd le a: "+aWord+"-szót");
        String temp ="";
        for (int i = 0; i < aWord.length() ; i++) {
            System.out.println("adj meg egy betűt majd enter: ");
            Scanner sc = new Scanner(System.in);
            temp= temp+sc.nextLine();
        }
        aGuess=temp;
    }
    public void checkTheSpelling(){
        if ((aWord.equals(aGuess))) {
            System.out.println("helyes a " +aGuess );
        } else {
        System.out.println("helytelen a " +aGuess);}
    }

    public static void main(String[] args) {
        Words words = new Words();
        words.start();

    }
}
