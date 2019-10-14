package com.hcl.exception;


public class Custom {
  /**
   * class is created.
   * @param a is created.
   * @throws NegativeException is created.
   * @throws NumberZeroException is created.
   */
  public void sum(int a,int b) throws NegativeException, NumberZeroException { 
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("nagitive not allowed");
    }
    if (a == 0 || b == 0) { 
      flag = false;
      throw new NumberZeroException("zero not allowed");
    }
    if (flag == true) { 
      c = a + b;
      System.out.println(c);
    }
  }
  /**
   * giving inputs.
   * @param args inputs.
   */
  
  public static void main(String[] args) {
    int a = 5;
    int b = 0;
    try {
      new Custom().sum(a,b);
    } catch (NegativeException | NumberZeroException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  } 
  
  class NegativeException extends Exception { 
    public NegativeException(String error) { 
      super(error);
    }
  }
  
  class NumberZeroException extends Exception { 
    public NumberZeroException(String error) { 
      super(error);
    }
  }  
}
