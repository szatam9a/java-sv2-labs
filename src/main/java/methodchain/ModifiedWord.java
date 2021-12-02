package methodchain;

import java.util.Locale;

public class ModifiedWord {
    public String modify(String world){
        return world.substring(0,3).toUpperCase(Locale.ROOT).replace(world.toUpperCase(Locale.ROOT).charAt(1),'x').concat("y");
    }
}
