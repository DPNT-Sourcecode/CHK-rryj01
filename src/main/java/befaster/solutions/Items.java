package befaster.solutions;

public class Items {
    private String itemA = "A";
    private int priceA = 50;
    private String itemB = "B";
    private int priceB = 30;
    private String itemC = "C";
    private int priceC = 20;
    private String itemD = "D";
    private int priceD = 15;

    public Items() {
    }

    public int getPrice(String skus) {
        if (skus == getItemA()) {
            return getPriceA();
        } else if ((skus.indexOf(getItemA()) > 0)) {
            int items = Integer.parseInt(skus.substring(0, 1))
                    

                    ;
        } else if ((skus == getItemB()) || (skus.indexOf(getItemB()) > 0)) {

        } else if ((skus == getItemC()) || (skus.indexOf(getItemC()) > 0)) {

        } else if ((skus == getItemC()) || (skus.indexOf(getItemC()) > 0)) {

        }

        return -1;


    }

    public String getItemA() {
        return itemA;
    }

    public int getPriceA() {
        return priceA;
    }

    public String getItemB() {
        return itemB;
    }

    public int getPriceB() {
        return priceB;
    }

    public String getItemC() {
        return itemC;
    }

    public int getPriceC() {
        return priceC;
    }

    public String getItemD() {
        return itemD;
    }

    public int getPriceD() {
        return priceD;
    }
}
