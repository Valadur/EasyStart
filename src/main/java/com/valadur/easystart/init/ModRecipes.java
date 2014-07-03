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
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pickaxeBasic,1), new ItemStack(Blocks.cobblestone),new ItemStack(Blocks.cobblestone),new ItemStack(Blocks.cobblestone),new ItemStack(Blocks.cobblestone));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.axeBasic,1), new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.shovelBasic,1), new ItemStack(Blocks.dirt),new ItemStack(Blocks.dirt),new ItemStack(Blocks.dirt),new ItemStack(Blocks.dirt));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.swordBasic,1), new ItemStack(Items.rotten_flesh),new ItemStack(Items.rotten_flesh),new ItemStack(Items.rotten_flesh),new ItemStack(Items.rotten_flesh));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.swordBasic,1), new ItemStack(Items.bone),new ItemStack(Items.bone),new ItemStack(Items.bone),new ItemStack(Items.bone));

        // Shaped recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pickaxeUltimate, 1), "x x", " y ", "x x", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(ModItems.pickaxeBasic,1,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeUltimate, 1), "x x", " y ", "x x", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(ModItems.axeBasic,1,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.shovelUltimate, 1), "x x", " y ", "x x", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(ModItems.shovelBasic,1,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordUltimate, 1), "x x", " y ", "x x", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(ModItems.swordBasic,1,OreDictionary.WILDCARD_VALUE));
    }
}