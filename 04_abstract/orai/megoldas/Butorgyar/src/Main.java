import furniture.Furniture;
import furniture.FurniturePanel;

public class Main {
    public static void main(String[] args) {

        FurniturePanel furniturePanel = new FurniturePanel(1220, 4340, true);
        FurniturePanel furniturePanel2 = new FurniturePanel(1423, 1000, false);
        FurniturePanel furniturePanel3 = new FurniturePanel(3220, 4060, true);
        FurniturePanel furniturePanel4 = new FurniturePanel(1225, 8039, false);
        FurniturePanel furniturePanel5 = new FurniturePanel(6223, 4091, true);

        Furniture furniture = new Furniture();
        furniture.addFurniturePanel(furniturePanel);
        furniture.addFurniturePanel(furniturePanel2);
        furniture.addFurniturePanel(furniturePanel3);
        furniture.addFurniturePanel(furniturePanel4);
        furniture.addFurniturePanel(furniturePanel5);

        System.out.println(furniture);


    }
}