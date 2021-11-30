package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    private Trooper findClosesTrooper(Position target) {

        Trooper closes = null;
        for (Trooper t : troopers
        ) {
            if (closes == null || t.distanceFrom(target) < closes.distanceFrom(target)) {
                closes = t;
            }
        }
        return closes;
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Position must be not null");
        }
        findClosesTrooper(target).changePosition(target);
    }

    private Trooper findTrooperByNAme(String name) {
        for (Trooper actual : troopers
        ) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        return null;
    }

    public void moveTrooperByName(String name, Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Position must be not null");
        }
        findTrooperByNAme(name).changePosition(target);
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }
}
