package com.valadur.easystart.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static net.minecraft.init.Blocks.dirt;

public class ModRecipes {

    // Initialize all the Recipes
    public static void init(){
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie, 4), dirt);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.easyPickaxeBasic,1), "xx " , "xx ", "   " , 'x' , new ItemStack(Blocks.dirt));
        // To make it work with any metadata
        ItemStack easyPickaxeBasic = new ItemStack(ModItems.easyPickaxeBasic);
        easyPickaxeBasic.setItemDamage(OreDictionary.WILDCARD_VALUE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.getEasyPickaxeUltimate,1), "x x" , " y " , "x x" , 'x', new ItemStack(Items.diamond), 'y' , easyPickaxeBasic);
    }
}
