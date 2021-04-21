package com.practice.cutShort;

import java.util.*;
public class Outer extends Inner 
{
    public static void main(String [] args) 
    {
        Inner obj = new Inner();
        obj.cnt();
    }
}
protected class Inner
{
    void cnt() 
    {
        for (int x = 0;x<7;x++,x++ ) 
        {
            System.out.print(" " + x);
        }
    }
}

/* Output : Compilation Error
 * RCA : Illegal modifier for the class Inner; only public, abstract & final are permitted
 */

/* NOTE : If we remove the protected modifier We will get the output as  0 2 4 6 */
