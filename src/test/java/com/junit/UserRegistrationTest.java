package com.junit;

import junit.framework.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Deepak");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("deepak");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Kumbhar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("kumbhar");
        Assert.assertEquals(false, result);

    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("deepak15@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.email("deepak&12.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPhoneNumber_WhenProper_shouldReturnTrue(){
        boolean result=userRegistration.phoneNumber("91 9629695246");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse(){
        boolean result=userRegistration.phoneNumber("919629695246");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        boolean result=userRegistration.password("deep@111");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse(){
        boolean result=userRegistration.password("dee@11");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue(){
        boolean result=userRegistration.password2("Deep@123");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse(){
        boolean result=userRegistration.password2("deep@123");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue(){
        boolean result=userRegistration.passwordRule3("deepak@123");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse(){
        boolean result=userRegistration.passwordRule3("de@ep");
        Assert.assertEquals(false,result);

    }
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password("deepak@123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.password("dee22");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }

}
