package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.*;
import lab5.prob1.rulesets.RuleException;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	private BookWindow bw;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		bw= (BookWindow)ob;
		nonEmptyFields();
		isbnNumeric();
		priceRules();
		
	}
	
	private void nonEmptyFields() throws RuleException {
		if(bw.getIsbnValue().trim().isEmpty() || bw.getTitleValue().trim().isEmpty() || bw.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}
	
	
	private void isbnNumeric() throws RuleException {
		String isbn = bw.getIsbnValue().trim();
		try {
			
			if(isbn.length() < 10 || isbn.length() > 13) {
				throw new RuleException("ISBN must be between 10 and 13 characters");
			}
			
			if(isbn.length() == 10) {
				if (!(isbn.charAt(0) == '0' || isbn.charAt(0) == '1')) {

					throw new RuleException("The first isbn character must be 0 or 1 " );
				}
				
			}
			if(isbn.length() == 13) {
				if(!(isbn.substring(0, 3).equals("979") || isbn.substring(0, 3).equals("978"))) {
					
					throw new RuleException("The first 3 letters of isbn character must be 979 or 978");
				}
			}
				
           Long.parseLong(isbn);
			
		}catch(NumberFormatException e) {
			System.out.println("Execptionn thrown");
			System.out.println(e.getMessage());
			System.out.println(isbn);
			throw new RuleException("ISBN must be numeric");
		}
	}
	
	private void priceRules() throws RuleException{
		try {
			double pr = Double.parseDouble(bw.getPriceValue());
			
			if(pr < 0.49) {
				throw new RuleException("price must be greater than 0.49");
			}
			if(!bw.getPriceValue().equals(String.format("%.2f", pr))) {
				throw new RuleException("price must be a floating point number with two decimal places ");
			}
		}catch(NumberFormatException e) {
			throw new RuleException("price must be a number ");
		}
	
	}
		

}
