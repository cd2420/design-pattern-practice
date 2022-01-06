package visitor;

import java.util.Iterator;

public class ListVisitor implements Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {

        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entity> it = directory.iterator();

        while (it.hasNext()) {
            Entity entity = (Entity) it.next();
            entity.accept(this);
        }
        currentDir = saveDir;

    }
}
