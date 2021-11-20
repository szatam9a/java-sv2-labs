package introexceptiontrycatchtrace;

import java.util.*;

public class Winner {
    List<String> lista = new ArrayList<>(Arrays.asList("Tomi","Feri","Kati","Lori",null,"Józska"));

    public String getWinner(){
        Random rng = new Random();
        int winner =rng.nextInt(6);
        System.out.println(winner);
        return lista.get(winner).toUpperCase(Locale.ROOT);
    }


}
