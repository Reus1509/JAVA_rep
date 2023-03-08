package OOP.seminar1.hw1;

import java.util.List;

public abstract class VendingMachine{

    public abstract void initProduct(List<Product> products);

    public abstract String getProduct(String name);
}
