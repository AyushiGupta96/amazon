package cases;
import pom.Login;
import  pom.SearchFilters.*;
import org.testng.annotations.Test;

public class SearchFilter extends  start{
    @Test
    public void filter() throws InterruptedException{
     SearchFilter sf = new SearchFilter();
     Thread.sleep(30);
     sf.SearchFilter();
     Thread.sleep(30);
     sf.setSearch("book");
     Thread.sleep(30);
     sf.sort().click();
     Thread.sleep(30);
     boolean sort = sf.sort().isEnabled();
     if(sort == true){
         System.out.println("sort is enabled");
     }
     else {
         System.out.println("sort is disabled");
     }
     Thread.sleep(30);
     boolean price = sf.price().isEnabled();
     if(price == true){
         System.out.println("pricesselect is Displayed ");
     }
        else{
         System.out.println("pricesselect is not Displayed");
     }

    }
}
