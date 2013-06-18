package niket.typedproperties.types;

import niket.typedproperties.Entry;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 12:20 PM
 * To change this template use File | Settings | File Templates.
 */
public final class IntEntry implements Entry<Integer> {
    private final String name;
    private int value;

    public IntEntry(String name) {
        this.name = name;
    }

    public IntEntry(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String typeToString(Integer v) {
        return String.valueOf(v);
    }

    @Override
    public Integer stringToType(String v) {
        return Integer.parseInt(v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntEntry intEntry = (IntEntry) o;

        if (!name.equals(intEntry.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
