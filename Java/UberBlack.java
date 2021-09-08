package Java;
import java.util.Map;
import java.util.ArrayList;


public class UberBlack extends Car{

    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String licence, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList seatsMaterial){
        super(licence, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
