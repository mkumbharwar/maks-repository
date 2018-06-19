package springaopdemo.springaopartifact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusinessApplicationContext {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test-context.xml");
		BusinessEmployee businessEmployee = (BusinessEmployee) applicationContext.getBean("businessEmployee");
		businessEmployee.setAccountHolderName("Mahesh");
		System.out.println(businessEmployee.getAccountHolderName());
	}
}
