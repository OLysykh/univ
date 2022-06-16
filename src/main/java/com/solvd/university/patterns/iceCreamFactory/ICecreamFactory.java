package com.solvd.university.patterns.iceCreamFactory;

public class ICecreamFactory {

    public IEat getIcecream(IcecreamTypes type) {
        IEat toReturn = switch (type) {
            case CHOCOLATE -> new ChocolateIcecream();
            case VANILLA -> new VanillaIcecream();
            case HAZELNUT -> new HazelnutIcecream();
            default -> throw new IllegalArgumentException("Wrong ice cream type:" + type);
        };
        return toReturn;
    }
}
