package springaopdemo.springaopartifact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusinessApplicationContext {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test-context.xml");
		BusinessEmployee businessEmployee = (BusinessEmployee) applicationContext.getBean("businessEmployee");
		businessEmployee.setAccountHolderName("Mahesh");
		businessEmployee.setAccountNumber("123456");
		System.out.println("account holder name===>"+businessEmployee.getAccountHolderName());
		System.out.println("acc number in appContext===>"+businessEmployee.getAccountNumber());
	}
}
