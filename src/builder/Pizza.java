package builder;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, CHEEZE, POTATO}
    final Set<Topping> toppings;

    abstract static class Builder {
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public Builder addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        public Builder sauceInsde() {
            return self();
        }

        abstract Pizza build();

        protected abstract Builder self();
    }

    public Pizza(Builder builder) {
        toppings = builder.toppings.clone();
    }

    @Override
    public String toString() {
        return toppings.toString();
    }
}
