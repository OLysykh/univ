package com.solvd.university.patterns.iceCreamFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChocolateIcecream implements IEat{
    private static final Logger LOGGER = LogManager.getLogger(ChocolateIcecream.class);
    @Override
    public void eat(){
        LOGGER.info("This is a chocolate Ice cream!");
    }
}
