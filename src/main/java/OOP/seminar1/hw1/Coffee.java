package OOP.seminar1.hw1;

public class Coffee extends HotDrink {
    private String name;
    private Integer price;
    private Integer volume;
    private Integer temperature;

    public Coffee(String name, Integer price, Integer volume, Integer temperature) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;

    }



    public Coffee() {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
