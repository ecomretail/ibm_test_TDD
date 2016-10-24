import java.util.*;

public class CafePurchase {
	private HashMap<Long, Long> purchase = new HashMap<Long, Long>(); //Map of item (ID, quantity)
    private Double purchaseTotal = new Double(0);
	private String currency = "�";
	private Double serviceCharge = new Double(0);
	public CafePurchase(){}
	
	public void addItem(CafeItem item,Long quantity) {
		Long totalQuantity = this.purchase.get(item.getItemId());
		if(totalQuantity != null)
			totalQuantity +=  quantity;
		else
			totalQuantity = quantity;
		purchaseTotal+=item.getItemPrice()*quantity;
		serviceCharge = 0.1*purchaseTotal;
		this.purchase.put(item.getItemId(),totalQuantity);
	}
	
	public HashMap<Long, Long> getPurchase() {
		return this.purchase;
	}

	public String getTotalAsString(){
		return this.currency +""+this.purchaseTotal;
	}
    public Double getTotal(){
		return this.purchaseTotal;
	}
	public String getServiceChargeAsString(){
		return this.currency +""+this.serviceCharge;
	}
    public Double getServiceCharge(){
		return this.serviceCharge;
	}

	
}