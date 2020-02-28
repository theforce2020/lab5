package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cd;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		
		cd= 	(CDWindow)ob;
		nonEmptyField();
		priceRules();
		
	}
	
	private void nonEmptyField() throws RuleException  {
		if(cd.getArtistValue().trim().isEmpty() || cd.getTitleValue().trim().isEmpty() || cd.getPriceValue().trim().isEmpty()) {
			throw new RuleException("Fields shouldn't be empty!");
		}
	}
	
	private void priceRules() throws RuleException{
		try {
			double pr = Double.parseDouble(cd.getPriceValue());
			if(pr < 0.49) {
				throw new RuleException("price must be greater than 0.49");
			}
			if(!cd.getPriceValue().equals(String.format("%.2f", pr))) {
				throw new RuleException("price must be a floating point number with two decimal places ");
			}
		}catch(NumberFormatException e) {
			throw new RuleException("Must be a number! ");
		}
		
		
	}
	
}
