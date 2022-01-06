package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {
    private List<String> addressesToDelivery = new ArrayList<>();

    public void addAddress(String address){
            addressesToDelivery.add(address);
    }
    public void removeAddress(String address){
        addressesToDelivery.remove(address);
    }
    public List<String> getAddressesToDelivery() {
        return addressesToDelivery;
    }
}
