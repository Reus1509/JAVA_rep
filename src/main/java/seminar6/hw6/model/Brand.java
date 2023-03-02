package seminar6.hw6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Brand {
    private String brand;
    private String country;
    private String language;

    @Override
    public String toString() {
        return brand + " (country= " + country + ", language= " + language + ")";
    }
}


