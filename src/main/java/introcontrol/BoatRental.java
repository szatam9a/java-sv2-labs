package introcontrol;

import java.util.Scanner;

public class BoatRental {
    private boolean isSpaceThreeOccupied = false;
    private boolean isSpaceTwoOccupied = false;
    private boolean isSpaceFiveOccupied = false;
    private int occupiedBoatCounter;

    public void freeBoats (){

        if (isSpaceFiveOccupied==false) System.out.println("5Fős csonak még szabad");
            else System.out.println("5Fős csonak elfoglalva");
        if (isSpaceThreeOccupied==false) System.out.println("3Fős csonak még szabad");
            else System.out.println("3Fős csonak elfoglalva");
        if (isSpaceTwoOccupied==false) System.out.println("2Fős csonak még szabad");
            else System.out.println("2Fős csonak elfoglalva");
        System.out.println("szabad hajók száma: "+ (3-occupiedBoatCounter));

    }


    public static void main(String[] args) {

        BoatRental hajo = new BoatRental();
        Scanner sc =  new Scanner(System.in);
        System.out.println("hányan vagytok");
        int utas = sc.nextInt();
        sc.nextLine();

        if (utas>=5){
            hajo.isSpaceFiveOccupied= true;
            utas-=5;
            hajo.occupiedBoatCounter++;
        }
        if (utas>=3){
            hajo.isSpaceThreeOccupied= true;
            utas-=3;
            hajo.occupiedBoatCounter++;
        }
        if (utas>0){
            hajo.isSpaceTwoOccupied= true;
            utas-=2;
            hajo.occupiedBoatCounter++;
        }
        hajo.freeBoats();
        if (utas>0) {
            System.out.println("sajnos páran nem fértek fel: "+ utas);
        }



    }
}


