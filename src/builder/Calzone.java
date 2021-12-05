package builder;

public class Calzone  extends Pizza{

    private boolean sauceInside;

    public static class Builder extends Pizza.Builder {

        private boolean sauceInside = false;

        @Override
        public Builder sauceInsde() {
            sauceInside = true;
            return this;
        }

        @Override
        Pizza build() {
            return new Calzone(this);
        }

        @Override
        protected Pizza.Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return toppings.toString() + " sauce Inside : " + sauceInside;
    }
}
