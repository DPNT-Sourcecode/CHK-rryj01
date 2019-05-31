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
    private String itemE = "E";
    private int priceE = 40;
    private String itemF = "F";
    private int priceF = 10;

    public Items() {
    }

    public int getPrice(String skus) {
        if (skus.equals("")) {
            return 0;
        }

        int itemPrice = 0;
        int intCounterA = 0;
        int intCounterB = 0;
        int intCounterC = 0;
        int intCounterD = 0;
        int intCounterE = 0;
        int intCounterF = 0;

        for (int i=0; i<skus.length(); i++) {
            char item = skus.charAt(i);
            if ((String.valueOf(item)).equals(getItemA())) {
                intCounterA++;
            } else if ((String.valueOf(item)).equals(getItemB())) {
                intCounterB++;
            }  else if ((String.valueOf(item)).equals(getItemC())) {
                intCounterC++;
            } else if ((String.valueOf(item)).equals(getItemD())) {
                intCounterD++;
            } else if ((String.valueOf(item)).equals(getItemE())) {
                intCounterE++;
            } else if ((String.valueOf(item)).equals(getItemF())) {
                intCounterF++;
            } else {
                break;
            }
        }

        if ((intCounterA + intCounterB + intCounterC + intCounterD + intCounterE + intCounterF) < skus.length()) {
            return -1;
        } else {
            if (intCounterE > 0) {
                if (intCounterE < 2) {
                    itemPrice = itemPrice + getPriceE();
                } else {
                    int modulus = intCounterE % 2;
                    int j = intCounterE - modulus;
                    int k = (j / 2);
                    if (intCounterB > k) {
                        intCounterB = intCounterB - k;
                    } else {
                        intCounterB = 0;
                    }
                    itemPrice = itemPrice + (getPriceE() * intCounterE);

                }
            }

            if (intCounterA > 0) {
                if (intCounterA < 3) {
                    itemPrice = itemPrice + (intCounterA * getPriceA());

                } else if ((intCounterA > 2) && (intCounterA < 5)){
                    int modulus = intCounterA % 3;
                    itemPrice = itemPrice + (modulus * getPriceA());
                    int j = intCounterA - modulus;
                    itemPrice = itemPrice + ((j / 3) * 130);

                } else {
                    int modulus = intCounterA % 5;
                    int j = intCounterA - modulus;
                    itemPrice = itemPrice + ((j / 5) * 200);

                    if (modulus < 3) {
                        itemPrice = itemPrice + (modulus * getPriceA());
                    } else {
                        int newModulus = modulus % 3;
                        itemPrice = itemPrice + (newModulus * getPriceA());
                        int k = modulus - newModulus;
                        itemPrice = itemPrice + ((modulus / 3) * 130);
                    }

                }
            }

            if (intCounterB > 0) {
                if (intCounterB < 2) {
                    itemPrice = itemPrice + (intCounterB * getPriceB());
                } else {
                    int modulus = intCounterB % 2;
                    itemPrice = itemPrice + (modulus * getPriceB());
                    int j = intCounterB - modulus;
                    itemPrice = itemPrice + ((j / 2) * 45);
                }
            }

            if (intCounterC > 0) {
                itemPrice = itemPrice + (intCounterC * getPriceC());
            }

            if (intCounterD > 0) {
                itemPrice = itemPrice + (intCounterD * getPriceD());
            }

            if (intCounterF > 0) {
                if (intCounterF < 2) {
                    itemPrice = itemPrice + getPriceF();
                } else {
                    int modulus = intCounterF % 2;
                    int j = intCounterF - modulus;
                    int k = (j / 2);
                    if (modulus > 0 && intCounterF > 2) {
                        intCounterF = intCounterF - k;
                    }
                    itemPrice = itemPrice + (getPriceF() * intCounterF);

                }
            }

        }

        if(itemPrice == 0) {
            return  -1;
        } else {
            return itemPrice;
        }


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

    public String getItemE() {
        return itemE;
    }

    public void setItemE(String itemE) {
        this.itemE = itemE;
    }

    public int getPriceE() {
        return priceE;
    }

    public void setPriceE(int priceE) {
        this.priceE = priceE;
    }

    public String getItemF() {
        return itemF;
    }

    public void setItemF(String itemF) {
        this.itemF = itemF;
    }

    public int getPriceF() {
        return priceF;
    }

    public void setPriceF(int priceF) {
        this.priceF = priceF;
    }
}

