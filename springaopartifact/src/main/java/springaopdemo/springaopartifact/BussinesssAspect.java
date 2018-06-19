package springaopdemo.springaopartifact;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BussinesssAspect {

	@Around("execution(* springaopdemo.springaopartifact.BusinessEmployee.getAccountHolderName*(..))")
	public void logBusinessAspect(ProceedingJoinPoint pjp){
		
		System.out.println("Start business aspect:"+pjp.getTarget());
	try {
		pjp.proceed();
	} catch (Throwable e) {
		e.printStackTrace();
	}
	System.out.println("End of bussness aspect:"+pjp.getSignature());
	}
}
