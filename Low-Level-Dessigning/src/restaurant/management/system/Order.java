package restaurant.management.system;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Integer orderId;
	private PaymentType paymentType;
	private OrderStatus orderStatus;
	private LocalDate orderDateTime;
	private PaymentStatus paymentStatus;
	
	private Waiter waiter;
	private Chef chef;
	private List<Meal> meals;
	
	public void addMeal(final Meal meal) {}
	
	public void removeMeal(final Meal meal) {}
}
