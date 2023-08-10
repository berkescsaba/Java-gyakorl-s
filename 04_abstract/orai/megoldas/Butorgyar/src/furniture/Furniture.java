package furniture;

public class Furniture {

    private int numberOfFurniturePanels;
    FurniturePanel[] furniturePanels;

    public Furniture() {
        this.numberOfFurniturePanels = 0;
        this.furniturePanels = new FurniturePanel[100];
    }

    public void addFurniturePanel(FurniturePanel furniturePanel){
        for (int i = 0; i < furniturePanels.length; i++) {
            if (furniturePanels[i] == null){
                furniturePanels[i] = furniturePanel;
                numberOfFurniturePanels++;
                break;
            }
        }
    }


    public double furnitureFullPrice(){
        double result = 0;
        for (int i = 0; i < furniturePanels.length; i++) {
            if (furniturePanels[i] != null){
               result += countPrice(furniturePanels[i]);
            }
        }
        return result;
    }

    public double countPrice(FurniturePanel furniturePanel){
        double length = furniturePanel.getLength();
        double width = furniturePanel.getWidth();
        boolean isFrontal = furniturePanel.isFrontal();
        return furniturePanel.countPrice(width, length, isFrontal);

    }

    @Override
    public String toString() {
        return "Furniture{" +
                "numberOfFurniturePanels=" + numberOfFurniturePanels +
                ", price=" + furnitureFullPrice() +
                "Ft" + '}';
    }
}
