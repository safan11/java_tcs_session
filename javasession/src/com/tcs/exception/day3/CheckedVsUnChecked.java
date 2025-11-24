package com.tcs.exception.day3;

import java.io.IOException;

public class CheckedVsUnChecked {

	public static void main(String[] args) throws IOException  {

		//throw new ArithmeticException("exception occured");
		
		throw new IOException("exception occured");
	}

}
