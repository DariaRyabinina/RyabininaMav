package com.githab.DRyabinina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoAnything {
    public static final Logger LOG = LoggerFactory.getLogger(DoAnything.class);




    public void greeting (String name){
        LOG.info("Привет {}!",name);
        LOG.error("Привет {}!",name);
        LOG.warn("Привет {}!",name);
        LOG.trace("Привет {}!",name);
    }

    public static void main(String[] args) {
        DoAnything doAnything=new DoAnything();
        doAnything.greeting("Василий");
    }
}

