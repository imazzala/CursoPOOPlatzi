package Java;

class Main{

    public static void main(String[] args) {
        System.out.println("Hello World");
        UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("AMQ123", new Account("Andrés Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}