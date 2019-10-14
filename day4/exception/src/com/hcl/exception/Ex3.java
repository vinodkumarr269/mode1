package com.hcl.exception;
/**
 * Program for Handling Exceptions.
 * @author Coalesce User Vinod.
 * 
 */

public class Ex3 {
  /**
   * Program main for calling methods.
   * @param args to pass runtime arguments.
   */
  public static void main(String[] args) {
   
    try {
      System.out.println("A");
      throw new NullPointerException();
    } catch (ArithmeticException e) {  
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (NullPointerException e) { 
      // TODO Auto-generated catch block
      throw  new NumberFormatException();
      //System.out.println("eroor"); 
    } catch (NumberFormatException e) {
      System.out.println("rethrow");
    }
  }
}
