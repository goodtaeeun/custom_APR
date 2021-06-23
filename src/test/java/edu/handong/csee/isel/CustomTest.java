package edu.handong.csee.isel;

import java.util.*;
import static edu.handong.csee.isel.Custom.*;

import org.junit.Assert;
import org.junit.Test;

public class CustomTest{


    
    @Test
    public void testAdder(){
        Assert.assertEquals( 2, adder(1,1));
        Assert.assertEquals( 3, adder( 1,2 ));
        Assert.assertEquals( 4, adder( 1,3 ));
        Assert.assertEquals( 5, adder( 2,3 ));
        Assert.assertEquals( 7, adder( 3,4 ));
        Assert.assertEquals( 11, adder( 5,6 ));
        Assert.assertEquals( 12, adder( 5,7 ));
        Assert.assertEquals( 16, adder( 8,8 ));
        Assert.assertEquals( 11, adder( 6,5 ));
        Assert.assertEquals( 20, adder( 8,12 ));
        Assert.assertEquals( 23, adder( 12,11 ));
        Assert.assertEquals( 29, adder( 14,15 ));
        Assert.assertEquals( 19, adder( 10,9 ));
        Assert.assertEquals( 17, adder( 15,2 ));
    }

    @Test
    public void testSubtracter(){
        Assert.assertEquals( 0, subtracter(1,1));
        Assert.assertEquals( -3, subtracter( 1,4 ));
        Assert.assertEquals( 6, subtracter( 10,4 ));
        Assert.assertEquals( 151, subtracter( 154,3 ));
        Assert.assertEquals( -95, subtracter( 5,100 ));

    }

    @Test
    public void testMultiplier(){
        Assert.assertEquals( 1, multiplier(1,1));
        Assert.assertEquals( 0, multiplier(10,0));
        Assert.assertEquals( 6, multiplier(2,3));
        Assert.assertEquals( 28, multiplier(4,7));
        Assert.assertEquals( 9, multiplier(3,3));
        Assert.assertEquals( 16, multiplier(8,2));
        Assert.assertEquals( 100, multiplier(10,10));
    }





}