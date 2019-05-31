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
    }
}

