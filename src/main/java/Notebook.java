public class Notebook {
    private double cost;
    private int opMemory;
    private String brandName;

    public Notebook(double cost, int opMemory, String brandName) {
        this.cost = cost;
        this.opMemory = opMemory;
        this.brandName = brandName;
    }



    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getOpMemory() {
        return opMemory;
    }

    public void setOpMemory(int opMemory) {
        this.opMemory = opMemory;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
