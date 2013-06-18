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

    public <T> T get(Entry<T> entry) {
        return entry.stringToType(properties.getProperty(entry.getName()));
    }

    public <T> void set(Entry<T> entry) {
        properties.setProperty(entry.getName(), entry.typeToString(entry.getValue()));
    }
}
