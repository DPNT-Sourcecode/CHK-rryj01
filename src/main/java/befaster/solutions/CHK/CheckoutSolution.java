package befaster.solutions.CHK;

import befaster.solutions.Items;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        Items items = new Items();
        return items.getPrice(skus);
    }
}
