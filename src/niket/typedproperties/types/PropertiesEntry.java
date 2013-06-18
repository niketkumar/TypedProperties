package niket.typedproperties.types;

import niket.typedproperties.Entry;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesEntry implements Entry<Properties> {
    private final String name;
    private Properties value;

    public PropertiesEntry(String name) {
        this.name = name;
    }

    public PropertiesEntry(String name, Properties value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Properties getValue() {
        return value;
    }

    @Override
    public String valToString(Properties v) {
        StringWriter stringWriter = new StringWriter();
        try {
            v.store(stringWriter, null);
            return stringWriter.toString();
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public Properties valToType(String v) {
        if (null == v) return null;
        try {
            Properties p = new Properties();
            p.load(new StringReader(v));
            return p;
        } catch (IOException e) {
            return null;
        }

    }
}
