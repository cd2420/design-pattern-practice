package visitor;

import java.util.Iterator;

public abstract class Entity implements Acceptor {

    public abstract int getSize();
    public abstract String getName();

    public Entity add(Entity entity) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ") ";
    }

}
