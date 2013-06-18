TypedProperties
===============

Java's java.util.Properties reads and writes values as String.

This one aims at reading and writing typed values.

Currently the following types are supported:
 int, float, java.io.File and java.util.Properties itself.

New types' support can be added by implementing underlying interface: niket.typedproperties.Converter<T>.

Usage:

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

