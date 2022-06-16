package com.solvd.university.patterns.iceCreamFactory;

import java.util.List;

public class Executor {

    public static void main(String[] args) {
        ICecreamFactory factory = new ICecreamFactory();
        IEat choco = factory.getIcecream(IcecreamTypes.CHOCOLATE);
        IEat vanilla = factory.getIcecream(IcecreamTypes.VANILLA);
        IEat hazel = factory.getIcecream(IcecreamTypes.HAZELNUT);

        List<IEat> list = List.of(choco,vanilla,hazel);
        list.forEach(IEat::eat);
    }
}
