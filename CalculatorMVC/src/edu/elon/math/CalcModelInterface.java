package edu.elon.math;

import java.util.Observer;

public interface CalcModelInterface {

	public String calculate();
	
	public void addObserver(Observer o);

	public String getCurrText();
	
	public void setCurrText(String text);
	
	public String getPossOps();
	
	public String getPossNums();
	
	public void addToCurrCalculation(String value);
	
}
