package cases;

import pom.SortingPage;

public class Sorting extends start{
    public void sort() throws IllegalArgumentException, InterruptedException {
        SortingPage p = new SortingPage(driver);
        p.SearchFilter();
        p.SearchFilter1("pen");
        p.sort(driver);
        p.priceLow();
        Thread.sleep(3000);
        p.bestSeller();
        Thread.sleep(3000);
        p.customerReview();
    }
}
