package linebreak;

public class CityNames {
    public static void main(String[] args) {
        System.out.print("Pilis \r\n" +
                "CeglédBercel \n" +
                "Cegléd \n");
        System.out.print("Pilis " + System.lineSeparator()+
                "CeglédBercel " + System.lineSeparator()+
                "Cegléd ");
    }
}
