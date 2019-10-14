package com.hcl.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * @author Coalesce
 *
 */
public class Ex { 
	/** ,
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream f1 = new FileInputStream("c:/hello.txt");
  }
}
