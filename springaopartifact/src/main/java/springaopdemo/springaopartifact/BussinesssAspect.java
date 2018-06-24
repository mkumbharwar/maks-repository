package springaopdemo.springaopartifact;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@Aspect
public class BussinesssAspect {

	@Order(1)
	@Around("execution(* springaopdemo.springaopartifact.BusinessEmployee.setAccountHolderName*(..)) && @annotation(bean)")
	public void logBusinessAspect(ProceedingJoinPoint pjp, Bean bean) {
		System.out.println(bean);
		System.out.println("Start business aspect:" + ((BusinessEmployee)pjp.getTarget()));
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("End of bussness aspect:" + pjp.getSignature());
	}

	@Order(2)
	@Around("@annotation(cacheable) && args(accountNumber)")
	public void logBusinessAspect1(ProceedingJoinPoint pjp, Cacheable cacheable, String accountNumber) {

		System.out.println("acc-->"+accountNumber);
		System.out.println(cacheable);
		System.out.println("Start business aspect:" + pjp.getTarget());
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("End of bussness aspect:" + pjp.getSignature());
	}
}
