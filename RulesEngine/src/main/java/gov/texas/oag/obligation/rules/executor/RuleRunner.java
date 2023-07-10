package gov.texas.oag.obligation.rules.executor;


import java.util.HashMap;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieRuntimeFactory;
import org.kie.dmn.api.core.DMNContext;
import org.kie.dmn.api.core.DMNDecisionResult;
import org.kie.dmn.api.core.DMNModel;
import org.kie.dmn.api.core.DMNResult;
import org.kie.dmn.api.core.DMNRuntime;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.texas.oag.obligation.rules.model.OblType;
import gov.texas.oag.obligation.rules.model.Obligation;
public class RuleRunner {
    
	
	/**
	 * @return
	 */
	private static DMNRuntime getDMNRuntime() {
		KieServices ks = KieServices.Factory.get();
	       KieContainer kContainer = ks.getKieClasspathContainer();   
	       DMNRuntime dmnRuntime = KieRuntimeFactory.of(kContainer.getKieBase()).get(DMNRuntime.class);
		return dmnRuntime;
	}
	
	
	/**
	 * @return
	 */
	public static Obligation executeRuleEngine(Obligation model) {
		
		if(model!=null) { 
		  DMNRuntime dmnRuntime = getDMNRuntime();
		  DMNModel dmnModel = dmnRuntime.getModel(model.getDmnNamespace(), model.getDmnModel());
	      DMNContext dmnContext = dmnRuntime.newContext();  
	    
	       dmnContext.set("model", model);    
	      
	       
	       HashMap<String,Object> mainMap = new HashMap<String,Object>();
	       
	           DMNResult dmnResult =
	               dmnRuntime.evaluateAll(dmnModel, dmnContext);  
	           for(DMNDecisionResult dr : dmnResult.getDecisionResults()){
	        	   @SuppressWarnings("unchecked")
				HashMap<String,java.math.BigDecimal> resultMap = (HashMap<String,java.math.BigDecimal>) dr.getResult();
	        	   for(String key : resultMap.keySet()) {
	        		    ObjectMapper mapper = new ObjectMapper(); 
	        		    OblType obl = mapper.convertValue(resultMap, OblType.class);
	        		  if("cspp1Type".equals(dr.getDecisionName())) { 
	        			 model.setCspp1Type(obl);
	        		  }
	        		  
	        		  if("mspp1Type".equals(dr.getDecisionName())) { 
		        			 model.setMspp1Type(obl);
		        		  }
	        		  
	        		  if("dspp1Type".equals(dr.getDecisionName())) { 
		        			 model.setDspp1Type(obl);
		        		  }
	        		  
	        		  if("sspp1Type".equals(dr.getDecisionName())) { 
		        			 model.setSspp1Type(obl);
		        		  }
	        	   }
	           } 
		}
		return model;
	}
	
}
