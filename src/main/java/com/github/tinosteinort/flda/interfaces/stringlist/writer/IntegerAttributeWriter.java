package com.github.tinosteinort.flda.interfaces.stringlist.writer;


import com.github.tinosteinort.flda.accessor.writer.AttributeWriter;
import com.github.tinosteinort.flda.interfaces.stringlist.StringListAttribute;

import java.util.List;

public class IntegerAttributeWriter implements AttributeWriter<List<String>, Integer, StringListAttribute<Integer>> {

    @Override public void write(final List<String> record, final StringListAttribute<Integer> attribute, final Integer value) {
        final String stringValue = value == null ? null : String.valueOf(value);
        record.set(attribute.getIndex(), stringValue);
    }
}
