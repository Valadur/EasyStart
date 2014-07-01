package com.valadur.easystart.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

    // Initialize all the recipes
    public static void init() {

        // Shapeless recipes
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie, 4), new ItemStack(Blocks.dirt));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.easyPickaxeBasic,1), new ItemStack(Blocks.stone),new ItemStack(Blocks.stone),new ItemStack(Blocks.stone),new ItemStack(Blocks.stone));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.easyAxeBasic,1), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.easyShovelBasic,1), new ItemStack(Blocks.dirt),new ItemStack(Blocks.dirt),new ItemStack(Blocks.dirt),new ItemStack(Blocks.dirt));

        // Shaped recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.easyPickaxeUltimate, 1), "x x", " y ", "x x", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(ModItems.easyPickaxeBasic,1,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.easyAxeUltimate, 1), "x x", " y ", "x x", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(ModItems.easyAxeBasic,1,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.easyShovelUltimate, 1), "x x", " y ", "x x", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(ModItems.easyShovelBasic,1,OreDictionary.WILDCARD_VALUE));
    }
}