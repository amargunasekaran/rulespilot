package gov.texas.oag.obligation.rules.app;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gov.texas.oag.obligation.rules.executor.RuleRunner;
import gov.texas.oag.obligation.rules.model.Obligation;

@SpringBootApplication
public class RulesEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RulesEngineApplication.class, args);
		System.out.println("************** Run Rules Engine ******************");
		
		Obligation model = new Obligation();
		model.setCurrentFund(new BigDecimal(1000.00));
		model.setCspp1Amt(new BigDecimal(400.00));
		model.setMspp1Amt(new BigDecimal(200.00));
		model.setDspp1Amt(new BigDecimal(100.00));
		model.setSspp1Amt(new BigDecimal(900.00));
		
		model = RuleRunner.executeRuleEngine(model);
		
		model.setBalFund(model.getSspp1Type()!=null?model.getSspp1Type().getBalFund():null);
		
		System.out.println("Current Fund : " + model.getCurrentFund());
		System.out.println("After Apply CSPP1 : " + model.getCspp1Type());
		System.out.println("After Apply MSPP1 : " + model.getMspp1Type());
		System.out.println("After Apply DSPP1 : " + model.getDspp1Type());
		System.out.println("After Apply SSPP1 : " + model.getSspp1Type());
		System.out.println("Balance Fund : " + model.getBalFund());
		
	}

}
