package edu.kit.informatik;

public class ExceptionChecker {
	
	public boolean checkPrintWithoutArguments(int inputLength) {
		boolean valid = true;
		if(inputLength > 1) {
			valid = false;
			Terminal.printError("no arguments allowed with the print command");
		}
		return valid;
	}
	
	public boolean checkPlaceProperNumberOfArguments(int inputLength) {
		boolean valid = true;
		if(inputLength > 4) {
			valid = false ;
			Terminal.printError("wrong number of arguments");
		}
		return valid;
	}
	
	public boolean checkStateProperNumberOfArguments(int inputLength) {
		boolean valid = true;
		if(inputLength > 2) {
			valid = false;
			Terminal.printError("unexisting slot");
		}
		
		return valid;
	}
	
	public boolean checkQuitWithoutArguments(int inputLength) {
		boolean valid = true;
		if(inputLength > 1) {
			valid = false;
			Terminal.printError("no arguments allowed with the quit command");
		}
		
		return valid;
	}
	
	public boolean checkPrintColProperArguments(int inputLength) {
		boolean valid = true;
		if(inputLength > 1) {
			valid = false;
			Terminal.printError("unexisting column");
		}
		
		return valid;
	}
	
	public boolean checkPrintRowProperArguments(int inputLength) {
		boolean valid = true;
		if(inputLength > 1) {
			valid = false;
			Terminal.printError("unexisting row");
		}
		
		return valid;
	}

}
