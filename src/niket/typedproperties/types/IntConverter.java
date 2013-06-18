package niket.typedproperties.types;

import niket.typedproperties.Converter;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntConverter implements Converter<Integer> {
    @Override
    public String typeToString(Integer v) {
        return String.valueOf(v);
    }

    @Override
    public Integer stringToType(String v) {
        return Integer.parseInt(v);
    }
}
