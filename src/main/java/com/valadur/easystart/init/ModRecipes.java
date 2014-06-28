package com.valadur.easystart.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static net.minecraft.init.Blocks.dirt;

public class ModRecipes {
    public static void init(){
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie, 4), dirt);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.easyPickaxe,1), "xx " , "xx ", "   " , 'x' , new ItemStack(Blocks.dirt));
    }
}
