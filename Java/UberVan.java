package Java;
import java.util.Map;
import java.util.ArrayList;

public class UberVan extends Car{

    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
  
    public UberVan(String licence, Account driver){
        super(licence, driver);

    }

    @Override
    public void setPassenger(Integer passenger) {

        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}
