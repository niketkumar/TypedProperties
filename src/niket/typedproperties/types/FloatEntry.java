package niket.typedproperties.types;

import niket.typedproperties.Entry;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public final class FloatEntry implements Entry<Float> {
    private final String name;
    private float value;

    public FloatEntry(String name) {
        this.name = name;
    }

    public FloatEntry(String name, float value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Float getValue() {
        return value;
    }

    @Override
    public String valToString(Float v) {
        return String.valueOf(v);
    }

    @Override
    public Float valToType(String v) {
        return Float.parseFloat(v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FloatEntry that = (FloatEntry) o;

        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
