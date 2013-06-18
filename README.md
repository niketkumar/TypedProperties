TypedProperties
===============

Java's java.util.Properties reads and writes values as String.

This one aims at reading and writing typed values.

Currently the following types are supported:
 int, float, file and properties itself.

New types' support can be added by implementing underlying interface: niket.typedproperties.Entry<T>.

Usage:

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

