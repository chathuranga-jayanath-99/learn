import design_patterns.creational.builder.House;
import design_patterns.creational.builder.HouseBuilder;

public class Builder {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();
        House house = engineer.getHouse();

        System.out.println("Builder constructured: " + house);
    }
}
