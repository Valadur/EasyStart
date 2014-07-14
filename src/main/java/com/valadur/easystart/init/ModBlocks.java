package com.valadur.easystart.init;

import com.valadur.easystart.block.BlockES;
import com.valadur.easystart.block.AnderiumOre;
import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static BlockES oreAnderium = new AnderiumOre();

    // Initialize all the blocks
    public static void init(){
        GameRegistry.registerBlock(oreAnderium, Names.Blocks.ANDERIUM_ORE);
        OreDictionary.registerOre(Names.Blocks.ANDERIUM_ORE, oreAnderium);
    }
}