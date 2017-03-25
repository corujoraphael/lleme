package uff.ic.lleme.ttic10002;

public abstract class Entidade<K extends Comparable<K>, E extends Entidade> implements Comparable<E> {

    public abstract K getChave();
}
