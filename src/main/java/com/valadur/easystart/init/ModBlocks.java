package com.valadur.easystart.init;

import com.valadur.easystart.block.BlockES;
import com.valadur.easystart.block.OreEasy;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockES oreEasy = new OreEasy();

    // Initialize all the blocks
    public static void init(){
        GameRegistry.registerBlock(oreEasy, Names.Blocks.ORE_EASY);
    }
}
