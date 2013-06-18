package niket.typedproperties.types;

import niket.typedproperties.Entry;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public final class FileEntry implements Entry<File> {
    private final String name;
    private File value;

    public FileEntry(String name) {
        this.name = name;
    }

    public FileEntry(String name, File value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public File getValue() {
        return value;
    }

    @Override
    public String typeToString(File v) {
        return v.getAbsolutePath();
    }

    @Override
    public File stringToType(String v) {
        return new File(v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileEntry fileEntry = (FileEntry) o;

        if (!name.equals(fileEntry.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
