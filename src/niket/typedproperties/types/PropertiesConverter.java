package niket.typedproperties.types;

import niket.typedproperties.Converter;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 3:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesConverter implements Converter<Properties> {
    @Override
    public String typeToString(Properties v) {
        StringWriter stringWriter = new StringWriter();
        try {
            v.store(stringWriter, null);
            return stringWriter.toString();
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public Properties stringToType(String v) {
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
