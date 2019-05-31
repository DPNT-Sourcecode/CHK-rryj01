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
        int itemPrice = -1;
        int items = 0;
        if (skus == getItemA()) {
            return getPriceA();
        } else if ((skus.indexOf(getItemA()) > 0)) {
            items = Integer.parseInt(skus.substring(0, 1));
            if (items < 3) {
                itemPrice = items * getPriceA();
            } else {
                itemPrice = 130 + ((items % 3) * getPriceA());
            }
        }

        if (skus == getItemB()) {
            return getPriceB();
        } else if ((skus.indexOf(getItemB()) > 0)) {
            items = Integer.parseInt(skus.substring(0, 1));
            if (items < 3) {
                itemPrice = items * getPriceB();
            } else {
                itemPrice = 45 + ((items % 3) * getPriceA());
            }
        }

        if (skus == getItemC()) {
            itemPrice = getPriceC();
        }

        if (skus == getItemD()) {
            itemPrice =  getPriceD();
        }

        return itemPrice;


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


