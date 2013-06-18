import niket.typedproperties.TypedProperties;
import niket.typedproperties.types.FileEntry;
import niket.typedproperties.types.FloatEntry;
import niket.typedproperties.types.IntEntry;
import niket.typedproperties.types.PropertiesEntry;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        TypedProperties p = new TypedProperties();
        p.set(new IntEntry("count", 100));
        p.set(new FloatEntry("salary", 2000.00f));
        p.set(new FileEntry("hello.java", new File("helloworld.java")));

        ByteArrayOutputStream store = new ByteArrayOutputStream();

        p.store(store, "hello comments");

        System.out.println(store.toString());

        p.load(new ByteArrayInputStream(store.toByteArray()));
        int x = p.get(new IntEntry("count"));
        assert x == 100;

        float s = p.get(new FloatEntry("salary"));
        assert s == 2000.00;

        File f = p.get(new FileEntry("hello.java"));
        assert f.equals(new File("helloworld.java"));

        Properties props = p.get(new PropertiesEntry("helloProps"));
        assert null == props;
    }
}
