package com.github.tinosteinort.flda.interfaces.fixedlengthstring.writer;

import com.github.tinosteinort.flda.accessor.writer.AttributeWriter;
import com.github.tinosteinort.flda.interfaces.fixedlengthstring.FixedLengthString;
import com.github.tinosteinort.flda.interfaces.fixedlengthstring.FixedLengthStringAttribute;

public class EnumAttributeWriter<T extends Enum<T>> implements AttributeWriter<FixedLengthString, T, FixedLengthStringAttribute<T>> {

    private final StringFitter stringFitter;

    public EnumAttributeWriter() {
        this.stringFitter = new StringFitter(StringFitter.Alignment.LEFT, ' ');
    }

    public EnumAttributeWriter(final StringFitter.Alignment alignment, final char filler) {
        this.stringFitter = new StringFitter(alignment, filler);
    }

    @Override public void write(final FixedLengthString data, final FixedLengthStringAttribute<T> attribute, final T value) {

        final String enumValue = value == null ? null : value.name();
        data.update(attribute.getIndex(), stringFitter.fit(enumValue, attribute.getLength()));
    }
}
