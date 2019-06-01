package befaster.solutions;

import java.util.HashMap;
import java.util.Map;

public class Items {
    Map<String, Integer> items = new HashMap<String, Integer>();
    Map<String, Integer> counters = new HashMap<String, Integer>();
    public Items() {
        items.put("A", 50);
        items.put("B", 30);
        items.put("C", 20);
        items.put("D", 15);
        items.put("E", 40);
        items.put("F", 10);
        items.put("G", 20);
        items.put("H", 10);
        items.put("I", 35);
        items.put("J", 60);
        items.put("K", 80);
        items.put("L", 90);
        items.put("M", 15);
        items.put("N", 40);
        items.put("O", 10);
        items.put("P", 50);
        items.put("Q", 30);
        items.put("R", 50);
        items.put("S", 30);
        items.put("T", 20);
        items.put("U", 40);
        items.put("V", 50);
        items.put("W", 20);
        items.put("X", 90);
        items.put("Y", 10);
        items.put("Z", 50);

        counters.put("A", 0);
        counters.put("B", 0);
        counters.put("C", 0);
        counters.put("D", 0);
        counters.put("E", 0);
        counters.put("F", 0);
        counters.put("G", 0);
        counters.put("H", 0);
        counters.put("I", 0);
        counters.put("J", 0);
        counters.put("K", 0);
        counters.put("L", 0);
        counters.put("M", 0);
        counters.put("N", 0);
        counters.put("O", 0);
        counters.put("P", 0);
        counters.put("Q", 0);
        counters.put("R", 0);
        counters.put("S", 0);
        counters.put("T", 0);
        counters.put("U", 0);
        counters.put("V", 0);
        counters.put("W", 0);
        counters.put("X", 0);
        counters.put("Y", 0);
        counters.put("Z", 0);

    }

    public int getPrice(String skus) {
        if (skus.equals("")) {
            return 0;
        }

        boolean blnCorrectNumValues = true;
        int itemPrice = 0;

        for (int i=0; i<skus.length(); i++) {
            char item = skus.charAt(i);
            if ((String.valueOf(item)).equals("A")) {
                int value = counters.get("A");
                value++;
                counters.put("A", value);

            } else if ((String.valueOf(item)).equals("B")) {
                int value = counters.get("B");
                value++;
                counters.put("B", value);

            }  else if ((String.valueOf(item)).equals("C")) {
                int value = counters.get("C");
                value++;
                counters.put("C", value);

            } else if ((String.valueOf(item)).equals("D")) {
                int value = counters.get("D");
                value++;
                counters.put("D", value);

            } else if ((String.valueOf(item)).equals("E")) {
                int value = counters.get("E");
                value++;
                counters.put("E", value);

            } else if ((String.valueOf(item)).equals("F")) {
                int value = counters.get("F");
                value++;
                counters.replace("F", value);

            } else if ((String.valueOf(item)).equals("G")) {
                int value = counters.get("G");
                value++;
                counters.put("G", value);

            } else if ((String.valueOf(item)).equals("H")) {
                int value = counters.get("H");
                value++;
                counters.put("H", value);

            } else if ((String.valueOf(item)).equals("I")) {
                int value = counters.get("I");
                value++;
                counters.put("I", value);
                ;
            } else if ((String.valueOf(item)).equals("J")) {
                int value = counters.get("J");
                value++;
                counters.put("J", value);

            } else if ((String.valueOf(item)).equals("K")) {
                int value = counters.get("K");
                value++;
                counters.put("K", value);

            } else if ((String.valueOf(item)).equals("L")) {
                int value = counters.get("L");
                value++;
                counters.put("L", value);

            } else if ((String.valueOf(item)).equals("M")) {
                int value = counters.get("M");
                value++;
                counters.put("M", value);

            } else if ((String.valueOf(item)).equals("N")) {
                int value = counters.get("N");
                value++;
                counters.put("N", value);

            } else if ((String.valueOf(item)).equals("O")) {
                int value = counters.get("O");
                value++;
                counters.put("O", value);

            } else if ((String.valueOf(item)).equals("P")) {
                int value = counters.get("P");
                value++;
                counters.put("P", value);

            } else if ((String.valueOf(item)).equals("Q")) {
                int value = counters.get("Q");
                value++;
                counters.put("Q", value);

            } else if ((String.valueOf(item)).equals("R")) {
                int value = counters.get("R");
                value++;
                counters.put("R", value);

            } else if ((String.valueOf(item)).equals("S")) {
                int value = counters.get("S");
                value++;
                counters.put("S", value);

            } else if ((String.valueOf(item)).equals("T")) {
                int value = counters.get("T");
                value++;
                counters.put("T", value);

            } else if ((String.valueOf(item)).equals("U")) {
                int value = counters.get("U");
                value++;
                counters.put("U", value);

            } else if ((String.valueOf(item)).equals("V")) {
                int value = counters.get("V");
                value++;
                counters.put("V", value);

            } else if ((String.valueOf(item)).equals("W")) {
                int value = counters.get("W");
                value++;
                counters.put("W", value);

            } else if ((String.valueOf(item)).equals("X")) {
                int value = counters.get("X");
                value++;
                counters.put("X", value);

            } else if ((String.valueOf(item)).equals("Y")) {
                int value = counters.get("Y");
                value++;
                counters.put("Y", value);

            } else if ((String.valueOf(item)).equals("Z")) {
                int value = counters.get("Z");
                value++;
                counters.put("Z", value);

            } else {
                blnCorrectNumValues = false;
                break;
            }
        }

        if (!(blnCorrectNumValues)) {
            return -1;
        } else {
            if (counters.get("E") > 0) {
                itemPrice = itemPrice + singleReplaceOffer(counters.get("E"), items.get("E"), 2, "B");
            }

            if (counters.get("A") > 0) {
                itemPrice = itemPrice + multipleOffers(counters.get("A"),3, items.get("A"),130,
                        5,  200);
            }

            if (counters.get("B") > 0) {
                itemPrice = itemPrice + singleOffer(counters.get("B"), items.get("B"), 2, 45);
            }

            if (counters.get("C") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("C"), items.get("C"));
            }

            if (counters.get("D") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("D"),  items.get("D"));
            }

            if (counters.get("F") > 0) {
                itemPrice = itemPrice + singleFreeOffer(counters.get("F"), 2, items.get("F"));
            }

            if (counters.get("G") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("G"), items.get("G"));
            }

            if (counters.get("H") > 0) {
                itemPrice = itemPrice + multipleOffers(counters.get("H"),5, items.get("H"),45,
                        10,  80);
            }

            if (counters.get("I") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("I"), items.get("I"));
            }

            if (counters.get("J") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("J"), items.get("J"));
            }

            if (counters.get("K") > 0) {
                itemPrice = itemPrice + singleOffer(counters.get("K"), items.get("K"), 2, 150);
            }

            if (counters.get("L") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("L"), items.get("L"));
            }

            if (counters.get("N") > 0) {
                itemPrice = itemPrice + singleReplaceOffer(counters.get("N"), items.get("N"), 3, "M");
            }

            if (counters.get("M") > 0) {
                itemPrice = itemPrice + (counters.get("M") * items.get("M"));
            }

            if (counters.get("O") > 0) {
                itemPrice = itemPrice + (counters.get("O") * items.get("O"));
            }

            if (counters.get("P") > 0) {
                itemPrice = itemPrice + singleOffer(counters.get("P"), items.get("P"), 5, 200);
            }

            if (counters.get("R") > 0) {
                itemPrice = itemPrice + singleReplaceOffer(counters.get("R"), items.get("R"), 3, "Q");
            }

            if (counters.get("Q") > 0) {
                itemPrice = itemPrice + singleOffer(counters.get("Q"), items.get("Q"), 3, 80);
            }

            if (counters.get("S") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("S"), items.get("S"));
            }

            if (counters.get("T") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("T") , items.get("T"));
            }

            if (counters.get("U") > 0) {
                itemPrice = itemPrice + singleFreeOffer(counters.get("U"), 3, items.get("U"));
            }

            if (counters.get("V") > 0) {
                itemPrice = itemPrice + multipleOffers(counters.get("V"), 2, items.get("V"), 90,
                        3,  130);
            }

            if (counters.get("W") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("W") , items.get("W"));
            }

            if (counters.get("X") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("X") , items.get("X"));
            }

            if (counters.get("Y") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("Y") , items.get("Y"));
            }

            if (counters.get("Z") > 0) {
                itemPrice = itemPrice + singleItem(counters.get("Z"), items.get("Z"));
            }

        }

        if(itemPrice == 0) {
            return  -1;
        } else {
            return itemPrice;
        }


    }

    private int singleItem(int counterValue, int itemsValue) {
        return counterValue * itemsValue;
    }

    private int singleOffer(int counterValue, int itemsValue, int offerIntValue, int offerAmountValue) {
        int itemPriceOffer = 0;
        int intCounter = counterValue;
        if (intCounter < offerIntValue) {
            itemPriceOffer = (intCounter * itemsValue);
        } else {
            int modulus = intCounter % offerIntValue;
            itemPriceOffer = (modulus * itemsValue);
            int j = intCounter - modulus;
            itemPriceOffer = itemPriceOffer + ((j / offerIntValue) * offerAmountValue);
        }

        return itemPriceOffer;

    }

    private int singleFreeOffer(int counterValue, int firstOfferInt, int itemsValue) {
        int itemPriceOffer = 0;
        int intCounter = counterValue;
        if (intCounter <= firstOfferInt) {
            itemPriceOffer = (intCounter * itemsValue);
        } else {
            int modulus = intCounter % firstOfferInt;
            intCounter = intCounter - modulus;

            int staticIntCounter = intCounter;
            for (int k = firstOfferInt; k <= staticIntCounter ; k += firstOfferInt) {
                intCounter--;
            }
            itemPriceOffer = (itemsValue * (intCounter + modulus));

        }

        return  itemPriceOffer;
    }

    private int singleReplaceOffer(int counterValue, int itemValue, int offerInt, String updateElement) {
        int itemPriceOffer = 0;
        int intCounter = counterValue;
        if (intCounter < offerInt) {
            itemPriceOffer = (intCounter * itemValue);
        } else {
            int modulus = intCounter % offerInt;
            int j = intCounter - modulus;
            int k = (j / 2);
            if (counters.get(updateElement) > k) {
                int value = counters.get(updateElement);
                counters.replace(updateElement, value, (value - k));
            } else {
                counters.replace(updateElement, 0);
            }
            itemPriceOffer = (itemValue * intCounter);

        }

        return itemPriceOffer;

    }

    private int multipleOffers(int counterValue, int firstOfferInt, int itemsValue, int firstofferAmount,
                               int secondOfferInt,  int secondOfferAmount) {
        int itemPriceOffer = 0;
        int intCounter = counterValue;
        if (intCounter < firstOfferInt) {
            itemPriceOffer = (intCounter * itemsValue);

        } else if ((intCounter >= firstOfferInt) && (intCounter < secondOfferInt)){
            int modulus = intCounter % firstOfferInt;
            itemPriceOffer = (modulus * itemsValue);
            int j = intCounter - modulus;
            itemPriceOffer =  itemPriceOffer + ((j / firstOfferInt) * firstofferAmount);

        } else {
            int modulus = intCounter % secondOfferInt;
            int j = intCounter - modulus;
            itemPriceOffer = ((j / secondOfferInt) * secondOfferAmount);

            if (modulus < firstOfferInt) {
                itemPriceOffer = itemPriceOffer + (modulus * itemsValue);
            } else {
                int newModulus = modulus % firstOfferInt;
                itemPriceOffer = itemPriceOffer + (newModulus * itemsValue);
                int k = modulus - newModulus;
                itemPriceOffer = itemPriceOffer + ((modulus / firstOfferInt) * firstofferAmount);
            }

        }

        return itemPriceOffer;
    }
}
