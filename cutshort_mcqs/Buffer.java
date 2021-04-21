package com.practice.cutShort;

public class Buffer
{
    public static void main(String[] args)
    {
        String s1 = "xyz";
        String s2 = s1;
        s1 += "d";
        // This s1==s2 will return False 
        // String class overrides the equals() method of Object class. 
        //So you can compare the contents of two strings by equals() method.
        System.out.println(s1 + " " + s2 + " " + (s1==s2));
        
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        // This s1==s2 will return True 
        //StringBuffer class doesn't override the equals() method of Object class.
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
    }
}
/*Output 
    xyzd xyz false
    abcd abcd true
 */
