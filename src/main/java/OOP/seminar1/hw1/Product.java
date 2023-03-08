package OOP.seminar1.hw1;

public abstract class Product{
    protected String name;
    protected Integer price;

    protected Integer volume;

    protected Integer temperature;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Integer getPrice() {
        return price;
    }

    protected void setPrice(Integer price) {
        this.price = price;
    }

    protected Integer getVolume() {
        return volume;
    }

    protected void setVolume(Integer volume) {
        this.volume = volume;
    }

    protected Integer getTemperature() {
        return temperature;
    }

    protected void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
