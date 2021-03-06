package com.github.tinosteinort.flda.interfaces.fixedlengthstring.reader;

import com.github.tinosteinort.flda.accessor.reader.AttributeReader;
import com.github.tinosteinort.flda.interfaces.fixedlengthstring.FixedLengthString;
import com.github.tinosteinort.flda.interfaces.fixedlengthstring.FixedLengthStringAttribute;

public class StringAttributeReader
        implements AttributeReader<FixedLengthString, String, FixedLengthStringAttribute<String>> {

    private final StringReader reader = new StringReader();

    @Override public String read(final FixedLengthString data, final FixedLengthStringAttribute<String> attribute) {
        final String value = reader.read(data, attribute);
        if (value.equals("")) {
            return null;
        }
        return value;
    }
}
