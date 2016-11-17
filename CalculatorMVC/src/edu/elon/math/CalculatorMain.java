package edu.elon.math;
public class CalculatorMain {
	
	public static void main(String [] args) {
		CalcModelInterface model = new CalcModel();
		CalcControllerInterface controller = new CalcController(model);
	}
	
}
