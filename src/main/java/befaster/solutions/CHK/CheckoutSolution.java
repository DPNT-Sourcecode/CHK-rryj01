package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.List;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");

        if (!(items.contains(skus))) {
            return -1;
        }

        if ((skus.indexOf("A") == -1) && (skus.indexOf("B") == -1) &&
                (skus.indexOf("C") == -1) && (skus.indexOf("A") == -1)) {
            return -1;
        }

        if 
    }
}


