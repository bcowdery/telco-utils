package com.pointyspoon.telco;

/**
 * North American Number Plan phone number.
 *
 * NANP phone numbers always have a 3-digit area code and a 7-digit local
 * number (subscriber number).
 *
 * @author Brian Cowdery
 * @since 8-Dec-2010
 */
public class NANPPhoneNumber implements PhoneNumber {

    public String getCountryCode() {
        return null;
    }

    public String getAreaCode() {
        return null;
    }

    public String getLocalNumber() {
        return null;
    }

    public String[] getDigits() {
        return new String[0];
    }

    public String getNSNLength() {
        return null;
    }

}
