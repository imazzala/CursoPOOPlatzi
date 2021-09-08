package Java;

class Car {
    private Integer id;
    private String licence;
    private Account driver;
    protected Integer passenger;
    
    public Car(String licence, Account driver){
        this.licence = licence;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Licence: " + licence + " Driver: " + driver.name + "Passangers: " + passenger);
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){

        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
            
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
