TypedProperties
===============

Java's java.util.Properties reads and writes the values as String.

This code aims at reading and writing values as strongly typed.

Look at Main.main for a sample usage.

Currently the following types are supported int, float, file and properties itself. New types can be added by implementing underlying interface: niket.typedproperties.Entry<T>.


