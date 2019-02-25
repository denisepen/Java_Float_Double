package com.dee;

public class Main {

    public static void main(String[] args) {
	// float is single precision - 7 digits of accuracy - 4 bytes of memory
    // double is double precision - 16 digits of accuracy - 8 bytes of memory
        //    width of int = 32 (4 bytes)

//    width of int = 32 (4 bytes)
        int myIntValue = 5/2;
        float myFloatValue = 5f/2f;

//        width of double = 64 (8 bytes)
        double myDoubleValue = 5/2.25d;

//        System.out.println("myIntValue = " + myIntValue);
//        System.out.println("myFloatValue = " + myFloatValue);
//        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kg =  pounds * .45359237d;
        System.out.println("kg = " + kg);
    }
}
