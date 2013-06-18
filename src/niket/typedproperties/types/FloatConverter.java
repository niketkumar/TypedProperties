package niket.typedproperties.types;

import niket.typedproperties.Converter;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class FloatConverter implements Converter<Float> {
    @Override
    public String typeToString(Float v) {
        return String.valueOf(v);
    }

    @Override
    public Float stringToType(String v) {
        return Float.parseFloat(v);
    }
}
