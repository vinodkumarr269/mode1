package com.hcl.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * finput.
 * @author Coalesce from vinod.
 *
 */

public class Finput {
  /**
   * main function.
   * @param args for finput.
   */
  public static void main(String[] args) {
    try {
      FileInputStream fin = 
          new FileInputStream("C:/hcljava/day4/exception"
          + "/src/com/hcl/exception/Custom.java");
      int ch;
      while ((ch =  fin.read()) != -1) { 
        System.out.print((char)ch);
      }
      fin.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
