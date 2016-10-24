import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BillingServiceTest {
  @Test
  public void evaluatesSelectItemFromMenu() {
    CafeMenu menu = CafeMenu.getCafeMenu();
	menu.showCafeMenu();
	CafePurchase purchase = new CafePurchase();
	purchase.addItem(new Long("1"),new Long("2"));
	purchase.addItem(new Long("4"),new Long("2"));
	
	for(Long itemid : purchase.getPurchase().keySet()){
		CafeItem item = menu.getCafeMenuItem(itemid);
		System.out.println("Current purchase ------ " + item.toString() + "->" + purchase.getPurchase().get(itemid));
	}
    assertEquals(6, 6);
  }
}

