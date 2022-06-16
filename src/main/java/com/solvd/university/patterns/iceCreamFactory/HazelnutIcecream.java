package com.solvd.university.patterns.iceCreamFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HazelnutIcecream implements IEat{
    private static final Logger LOGGER = LogManager.getLogger(HazelnutIcecream.class);
    @Override
    public void eat(){
        LOGGER.info("This is a Hazelnut Ice cream!");
    }
}
