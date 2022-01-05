package iterator;

public class IteratorFactory extends Factory {

    private static IteratorFactory iteratorFactory = new IteratorFactory();
    private IteratorFactory() {}

    public static IteratorFactory getInstance() {
        if(iteratorFactory == null) {
            iteratorFactory = new IteratorFactory();
        }

        return iteratorFactory;
    }

    @Override
    protected Iterator createProduct(Aggregate list, int type) {

        if(type == Constant.FORWARD) {
            return new BookShelfIterator(list);
        } else if (type == Constant.REVERSE) {
            return new ReverseIterator(list);
        } else {
            return null;
        }
    }
}
