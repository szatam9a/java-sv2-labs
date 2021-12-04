package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {
    private List<PublicVehicle> publicVehicles = new ArrayList<>();


    public void addVechiles(PublicVehicle publicVehicle){
        publicVehicles.add(publicVehicle);
    }

    public List<PublicVehicle> getPublicVehicles() {
        return publicVehicles;
    }

  }
