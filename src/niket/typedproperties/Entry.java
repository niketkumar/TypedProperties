package niket.typedproperties;

/**
 * Created with IntelliJ IDEA.
 * User: niket
 * Date: 18/6/13
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Entry<T> extends Converter<T> {
    public String getName();

    public T getValue();

}
