package com.valadur.easystart.init;

import com.valadur.easystart.handler.FuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModFuel {

    public static FuelHandler fuelHandler = new FuelHandler();

    public static void init(){
        GameRegistry.registerFuelHandler(fuelHandler);
    }
}
