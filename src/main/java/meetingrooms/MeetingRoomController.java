package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    private Office office;

    public void readOffice() {
        Scanner sc = new Scanner(System.in);
        String name;
        int length;
        int width;
        System.out.println("Meetingroom neve?:");
        name = sc.nextLine();
        System.out.println("Meetingroom hossza?:");
        length = sc.nextInt();
        sc.nextLine();
        System.out.println("Meetingroom szélessége?:");
        width = sc.nextInt();
        sc.nextLine();
        office.addMeetingRoom(new MeetingRoom(name,length,width));
    }


    public void printMenu() {
        String menu = "1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés";

        System.out.println(menu);
        Scanner sc = new Scanner(System.in);
        int readInt = sc.nextInt();
        sc.nextLine();

        switch (readInt){
            case 1:
                readOffice();
                printMenu();
                break;
            case 2:  office.printNames();
            printMenu();
                break;
            case 3:  office.printNamesReverse();
            printMenu();
                break;
            case 4:  office.printEvenNames();
            printMenu();
                break;
            case 5:  office.printAreas();
            printMenu();
                break;
            case 6:
                String name;
                System.out.println("Meetingroom neve?:");
                name = sc.nextLine();
                office.printMeetingRoomsWithName(name);
                printMenu();
                break;
            case 7:
                System.out.println("Meetingroom neve töredék?:");
                name = sc.nextLine();
                office.printMeetingRoomsWithContains(name);
                printMenu();
                break;
            case 8:
                int area;
                System.out.println("Meetingroom területe?:");
                area = sc.nextInt();
                sc.nextLine();
                office.printAreasLargerThan(area);
                printMenu();
                break;
            case 9: break;
            default: printMenu();
                break;

        }
    }


    public void runMenu() {
        Office office= new Office();
        this.office = office;
        printMenu();
    }

    public static void main(String[] args) {
        MeetingRoomController mrc = new MeetingRoomController();
        mrc.runMenu();
    }
}
