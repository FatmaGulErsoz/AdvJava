package generics.interfaces.Example;

public interface Repository<T> {

    void save(T object);

    T find();


}