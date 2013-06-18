package niket.typedproperties;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class TypedProperties {

    protected final Properties properties;

    public TypedProperties() {
        properties = new Properties();
    }

    /**
     * Reads and loads the properties keys and corresponding values.
     *
     * @param fromStream
     */
    public synchronized void load(InputStream fromStream) throws IOException {
        properties.load(fromStream);
    }

    /**
     * Stores the properties to the given outputstream.
     *
     * @param toStream
     * @param comments
     * @throws IOException
     */
    public synchronized void store(OutputStream toStream, String comments) throws IOException {
        properties.store(toStream, comments);
    }

    public <T> T get(String name, Class<? extends Converter<T>> converterClass) {
        try {
            return converterClass.newInstance().stringToType(properties.getProperty(name));
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> void set(String name, Class<? extends Converter<T>> converterClass, T value) {
        try {
            properties.setProperty(name, converterClass.newInstance().typeToString(value));
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
