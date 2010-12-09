package com.pointyspoon.telco;

/**
 * PhoneNumber interface.
 *
 * @author Brian Cowdery
 * @since 8-Dec-2010
 */
public interface PhoneNumber {

    /**
     * Country code digits.
     * @return country code digits.
     */
    public String getCountryCode();

    /**
     * Area code digits.
     * @return area code digits.
     */
    public String getAreaCode();

    /**
     * Local phone number digits, also known as a "subscriber number".
     * @return local digits
     */
    public String getLocalNumber();

    /**
     * Phone number digits as a character array.
     * @return phone number digits.
     */
    public String[] getDigits();

    /**
     * Return the National Significant Number length of this phone number. The NSN
     * length represents the number of digits relevant to calling within the country.
     *  
     * @return NSN length
     */
    public String getNSNLength();

}
