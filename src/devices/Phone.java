package devices;

public class Phone {
    final Integer id;
    final String producer;
    final String model;
    final Double screenSize;
    Boolean isAndroid;

    public Phone(Integer id, String producer, String model, Double screenSize) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
    }

    void turnOn()
    {
        System.out.println("nacisnij przycisk");
        System.out.println("Czekaj");
        System.out.println("Czekaj");
        System.out.println("o mój telefon działa!" + producer + " działa!");
    }
}