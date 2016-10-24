import java.util.*;

public class CafeMenu {
    private static List<CafeItem> menuItems = null;
	private static CafeMenu menu = null;
	private CafeMenu(){
		menuItems = new ArrayList<CafeItem>();
		menuItems.add(new CafeItem(new Long("1"), "Cola", "Cold drink", new Double(.50)));
		menuItems.add(new CafeItem(new Long("2"), "Coffee", "Hot drink", new Double(1.00)));
		menuItems.add(new CafeItem(new Long("3"), "Cheese Sandwich", "Cold food", new Double(2.00)));
		menuItems.add(new CafeItem(new Long("4"), "Steak Sandwich", "Hot food", new Double(4.50)));
	}
	
	public static CafeMenu getCafeMenu(){
		if(menu == null) {
			menu = new CafeMenu();
		}
		
		return menu;
	}
	
	public void showCafeMenu(){
		for(CafeItem item : menuItems){
			System.out.println(item.toString());
		}
	}
	
	public CafeItem getCafeMenuItem(Long itemid) {
		CafeItem menuItem = null;
		for(CafeItem item : menuItems){
			if(item.getItemId().intValue() == itemid.intValue()){
				menuItem = item; break;
			}
		}
		System.out.println("menuItem search: "+itemid + ":" +menuItem);
		return menuItem;
	}
}
	