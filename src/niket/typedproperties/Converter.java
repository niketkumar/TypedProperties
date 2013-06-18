package niket.typedproperties;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Converter<T> {
    String typeToString(T v);

    T stringToType(String v);
}
