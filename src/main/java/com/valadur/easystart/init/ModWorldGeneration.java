package com.valadur.easystart.init;

import com.valadur.easystart.oreGenerator.ModWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGeneration {

    public static void init(){
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 1);
    }

}
