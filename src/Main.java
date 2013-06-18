import niket.typedproperties.TypedProperties;
import niket.typedproperties.types.FileConverter;
import niket.typedproperties.types.FloatConverter;
import niket.typedproperties.types.IntConverter;
import niket.typedproperties.types.PropertiesConverter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {
        TypedProperties p2 = new TypedProperties();
        p2.set("count", IntConverter.class, 100);
        p2.set("salary", FloatConverter.class, 2000.00f);
        p2.set("hello.java", FileConverter.class, new File("helloworld.java"));

        ByteArrayOutputStream store2 = new ByteArrayOutputStream();

        p2.store(store2, "hello comments");

        System.out.println(store2.toString());

        p2.load(new ByteArrayInputStream(store2.toByteArray()));
        int x2 = p2.get("count", IntConverter.class);
        assert x2 == 100;

        float s2 = p2.get("salary", FloatConverter.class);
        assert s2 == 2000.00;

        File f2 = p2.get("hello.java", FileConverter.class);
        assert f2.equals(new File("helloworld.java"));

        Properties props2 = p2.get("helloProps", PropertiesConverter.class);
        assert null == props2;
    }
}
