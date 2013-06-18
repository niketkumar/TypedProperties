package niket.typedproperties;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 3:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class TypedProperties2 extends TypedProperties {

    public <T> T get(String name, Class<Converter<T>> converterClass) throws IllegalAccessException, InstantiationException {
        return converterClass.newInstance().stringToType(properties.getProperty(name));
    }

    public <T> void set(String name, Class<Converter<T>> converterClass, T value) throws IllegalAccessException, InstantiationException {
        properties.setProperty(name, converterClass.newInstance().typeToString(value));
    }
}
