package inheritance;

public class VipCustomer extends Customer{
	private double saleRatio;
	private int agentID;
	
	public VipCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName); // 상위 클래스를 참조하는 것인데 선언하지 않아도 자동 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		
		
//		System.out.println("VIPCustomer(int, String) 호출");
	}
	public int calcPrice(int price) { // overriding
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
}
