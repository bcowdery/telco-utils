package com.pointyspoon.telco.util;

import java.util.Iterator;

/**
 * PhoneNumberIterator
 *
 * @author Brian Cowdery
 * @since 8-Dec-2010
 */
public class PhoneNumberIterator implements Iterator<String> {

    public boolean hasNext() {
        return false;
    }

    public String next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Removing digits is not supported.");
    }
}
