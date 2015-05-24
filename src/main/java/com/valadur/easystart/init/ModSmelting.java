package com.valadur.easystart.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ModSmelting {

    public static void init(){
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreAnderium,1),new ItemStack(ModItems.anderiumIngot), 2.0F);
    }
}