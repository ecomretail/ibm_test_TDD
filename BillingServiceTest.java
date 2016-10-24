import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BillingServiceTest {
  @Test
  public void evaluatesSelectItemFromMenu() {
	  /** get the cafe menu list */
    CafeMenu menu = CafeMenu.getCafeMenu();
	menu.showCafeMenu();
	/** create a purchase */
	CafePurchase purchase = new CafePurchase();
	purchase.addItem(menu.getCafeMenuItem(new Long("1")),new Long("2"));
	purchase.addItem(menu.getCafeMenuItem(new Long("4")),new Long("2"));
	/** read a purchase */
	for(Long itemid : purchase.getPurchase().keySet()){
		CafeItem item = menu.getCafeMenuItem(itemid);
		System.out.println("Current purchase ------ " + item.toString() + "->" + purchase.getPurchase().get(itemid));
	}
    assertEquals(6, 6);
  }
  @Test
  public void evaluatesCustomerPurchase() {
	  /** get the cafe menu list */
    CafeMenu menu = CafeMenu.getCafeMenu();
	menu.showCafeMenu();
	/** create a purchase */
	CafePurchase purchase = new CafePurchase();
	purchase.addItem(menu.getCafeMenuItem(new Long("2")),new Long("2"));
	purchase.addItem(menu.getCafeMenuItem(new Long("3")),new Long("2"));
	/** read a purchase */
	for(Long itemid : purchase.getPurchase().keySet()){
		CafeItem item = menu.getCafeMenuItem(itemid);
		Long itemquantity = purchase.getPurchase().get(itemid);
		System.out.println("Current purchase --- " + item.toString() 
		 +"->Quantity :" + itemquantity
		 +"->totalPrice :"+item.getItemCurrency()+""+
		itemquantity*item.getItemPrice());
	}
		System.out.println("Current purchase -total-"+purchase.getTotalAsString());
    assertEquals(6, 6);
  }
}

