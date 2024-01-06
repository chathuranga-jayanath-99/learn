import design_patterns.creational.builder.House;
import design_patterns.creational.builder.HouseBuilder;

public class TipiHouseBuilder implements HouseBuilder {
    private House house;

    public TipiHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    public void buildStructure() {
        house.setStructure("Wood and Ice");
    }

    public void buildInterior() {
        house.setStructure("Fire wood");
    }

    public void buildRoof() {
        house.setRoof("Wood, caribeau and seal skins");
    }

    public House getHouse() {
        return this.house;
    }
}
