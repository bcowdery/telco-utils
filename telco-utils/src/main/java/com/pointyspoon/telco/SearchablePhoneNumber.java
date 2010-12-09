package com.pointyspoon.telco;

import com.pointyspoon.telco.util.PhoneNumberIterator;

import java.util.Iterator;

/**
 * Searchable phone number is a {@link PhoneNumber} that can be "searched" through
 * to identify the country code, area code, and local digits.
 *
 * Searchable operates as a specialized iterator. Calling <code>#next()</code> returns
 * the the current portion of the phone number. Subsequent calls to <code>#next()</code>
 * return the same portion shortened by 1 digit until <code>match()</code> is called, or until
 * no digits remain in the current portion of the phone number.
 *
 * Iterator <code>#hasNext()</code> will return Boolean.TRUE until the entire phone number has
 * been transversed.
 *
 * Example:
 * <code>
 *      SearchablePhoneNumber number = new SearchablePhoneNumber("011442010001000");
 *      PhoneNumberIterator<String> it = number.iterator();
 *
 *      // search for country code
 *      it.next();    => 442
 *      it.next();    => 44
 *      it.match();
 *
 *      // search for area code
 *      it.next();    => 20100
 *      it.next();    => 2010
 *      it.next();    => 201
 *      it.next();    => 20
 *      it.match();
 *
 *      // remainder of the phone number will be used as local digits
 *      it.hasNext(); => false 
 * <code>
 *
 * @author Brian Cowdery
 * @since 8-Dec-2010
 */
public class SearchablePhoneNumber implements PhoneNumber, Iterable<String> {

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

    public PhoneNumberIterator iterator() {
        return null;
    }
}
