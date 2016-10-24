import java.util.*;

public class CafePurchase {
	private HashMap<Long, Long> purchase = new HashMap<Long, Long>(); //Map of item (ID, quantity)
    
	public CafePurchase(){}
	
	public void addItem(Long itemid, Long quantity) {
		Long totalQuantity = this.purchase.get(itemid); 
		if(totalQuantity != null)
			totalQuantity +=  quantity;
		else
			totalQuantity = quantity;
		this.purchase.put(itemid,totalQuantity);
	}
	
	public HashMap<Long, Long> getPurchase() {
		return this.purchase;
	}
    

	
}