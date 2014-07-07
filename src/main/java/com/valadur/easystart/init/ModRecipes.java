package com.valadur.easystart.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

    // Initialize all the recipes
    public static void init() {

        // Shapeless recipes
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie,4), new Object[]{Blocks.dirt});

        // Shaped recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumAxe, 1), "xx ", "xy ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumPickaxe, 1), "xxx", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumShovel, 1), " x ", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumSword, 1), " x ", " x ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumHelmet, 1), "xxx", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumChestplate, 1), "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumLeggings, 1), "xxx", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumBoots, 1), "x x", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngot));
    }
}