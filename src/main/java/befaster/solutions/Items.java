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
        if (skus == "") {
            return -1;
        }

        int itemPrice = -1;
        int intCounterA = 0;
        int intCounterB = 0;
        int intCounterC = 0;
        int intCounterD = 0;

        for (int i=0; i<skus.length(); i++) {
            char item = skus.charAt(i);
            if ((String.valueOf(item)).equals(getItemA())) {
                intCounterA++;
            }

            if ((String.valueOf(item)).equals(getItemB())) {
                intCounterB++;
            }

            if ((String.valueOf(item)).equals(getItemC())) {
                intCounterC++;
            }

            if ((String.valueOf(item)).equals(getItemD())) {
                intCounterD++;
            }
        }

        if (intCounterA > 0) {
            if (intCounterA < 3) {
                itemPrice = itemPrice + (intCounterA * getPriceA());
            } else {
                int modulus = intCounterA % 3;
                itemPrice = itemPrice + (modulus * getPriceA());
                int j = intCounterA - modulus;
                itemPrice = itemPrice + ((j/3) * 130);
            }
        }

        if (intCounterB > 0) {
            if (intCounterB < 2) {
                itemPrice = itemPrice + (intCounterB * getPriceB());
            } else {
                int modulus = intCounterB % 2;
                itemPrice = itemPrice + (modulus * getPriceB());
                int j = intCounterB - modulus;
                itemPrice = itemPrice + ((j/2) * 45);
            }
        }

        if (intCounterC > 0) {
            itemPrice = itemPrice + (intCounterC * getPriceC());
        }

        if (intCounterD > 0) {
            itemPrice = itemPrice + (intCounterD * getPriceD());
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
