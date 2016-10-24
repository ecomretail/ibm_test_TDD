public class CafeItem {

    private Long itemId;
    private String itemCategory;
    private String itemName;
    private Double itemPrice = new Double(0);
    private String itemCurrency = "£";

    public CafeItem(Long id, String itemname, String category, Double itemprice) {
       this.itemId = id;
	   this.itemCategory = category;
       this.itemName = itemname;
	   this.itemPrice = itemprice;
    }
	
	public String getItemPriceAsString(){
		return this.itemCurrency + this.itemPrice.toString();
	}
	@Override
	public String toString(){
		return this.itemId.toString()
		+ ". " + this.itemName + " - "+this.itemCategory + " - " + this.getItemPriceAsString();
	}
	public Long getItemId(){
		return this.itemId;
	}
	public void setItemId(Long d){
		this.itemId = d;
	}
	public String getItemCategory(){
		return this.itemCategory;
	}
	public void setItemCategory(String category) {
		this.itemCategory = category;
	}
	public String getItemName(){
		return this.itemName;
	}
	public void setItemName(String itname){
		this.itemName = itname;
	}
	public Double getItemPrice(){
		return this.itemPrice;
	}
	public void setItemPrice(Double price) {
		this.itemPrice = price;
	}
	public String getItemCurrency(){
		return this.itemCurrency;
	}
	public void setItemCurrency(String currency){
		this.itemCurrency = currency;
	}
}