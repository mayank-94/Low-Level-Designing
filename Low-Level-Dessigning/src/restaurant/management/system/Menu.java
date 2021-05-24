package restaurant.management.system;

import java.util.List;

public class Menu {
	private Integer menuId;
	private String title;
	private String description;
	private List<MenuSection> menuSections;
	
	public void addMenuSection(final MenuSection section) {
		
	}
	
	public Menu getMenu() {
		return new Menu();
	}
}
