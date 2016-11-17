package edu.elon.math;

public interface CalcControllerInterface {

	public void setInputs(String pressed);
	
	public void addToCalculation(String pressed);
	
	public String calculate();
	
	public String getCurrText();
	
	public void processInput(String pressed);
}


