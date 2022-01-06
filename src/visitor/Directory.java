package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entity {

    private String name;
    private ArrayList<Entity> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entity> it = dir.iterator();
        while (it.hasNext()) {
            Entity entity = (Entity) it.next();
            size += entity.getSize();
        }

        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Entity add(Entity entity) throws FileTreatmentException {
        dir.add(entity);
        return this;
    }

    @Override
    public Iterator<Entity> iterator() throws FileTreatmentException {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
