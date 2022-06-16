package com.solvd.university.patterns.iceCreamFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaIcecream implements IEat{
    private static final Logger LOGGER = LogManager.getLogger(VanillaIcecream.class);
    @Override
    public void eat(){
        LOGGER.info("This is a Vanilla Ice cream!");
    }
}
