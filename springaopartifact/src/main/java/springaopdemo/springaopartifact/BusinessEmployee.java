package springaopdemo.springaopartifact;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;

public class BusinessEmployee {

	private String accountHolderName;
	
	private String iban;
	
	private String accountNumber;
	

	
	public String getAccountNumber() {
		return accountNumber;
	}

	@Cacheable
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	@Bean
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
}
