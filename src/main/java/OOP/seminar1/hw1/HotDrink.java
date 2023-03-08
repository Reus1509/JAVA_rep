package OOP.seminar1.hw1;

public abstract class HotDrink extends Product{
    String name;
    Integer price;
    Integer volume;
    Integer temperature;

    public HotDrink(String name, Integer price, Integer volume, Integer temperature) {
        super.name = name;
        super.price = price;
        super.volume = volume;
        super.temperature = temperature;
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

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public HotDrink() {

    }
}
