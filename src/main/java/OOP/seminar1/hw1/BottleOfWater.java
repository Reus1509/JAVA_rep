package OOP.seminar1.hw1;

public class BottleOfWater extends Product{
    private String name;
    private Integer price;

    public BottleOfWater(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public BottleOfWater() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
