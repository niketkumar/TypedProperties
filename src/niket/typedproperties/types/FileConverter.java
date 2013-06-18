package niket.typedproperties.types;

import niket.typedproperties.Converter;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileConverter implements Converter<File> {
    @Override
    public String typeToString(File v) {
        return v.getAbsolutePath();
    }

    @Override
    public File stringToType(String v) {
        return new File(v);
    }
}
