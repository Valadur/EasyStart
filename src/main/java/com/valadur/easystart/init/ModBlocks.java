package com.valadur.easystart.init;

import com.valadur.easystart.block.BlockES;
import com.valadur.easystart.block.AnderiumOre;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockES oreAnderium = new AnderiumOre();

    // Initialize all the blocks
    public static void init(){
        GameRegistry.registerBlock(oreAnderium, Names.Blocks.ANDERIUM_ORE);
    }
}