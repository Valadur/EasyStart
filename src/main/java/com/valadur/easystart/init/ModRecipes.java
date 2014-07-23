package com.valadur.easystart.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {

    // Initialize all the recipes
    public static void init() {

        enchantItemStacks();

        // Shapeless recipes
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie,4), new Object[]{Blocks.dirt});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.anderiumIngotEnergized), new Object[]{ModItems.anderiumIngot, Items.redstone});

        // Shaped recipes
        //GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumAxe, 1), "xx ", "xy ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        //GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumPickaxe, 1), "xxx", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        //GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumShovel, 1), " x ", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        //GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumSword, 1), " x ", " x ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumHelmet, 1), "xxx", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumHelmet, 1), "   ", "xxx", "x x", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumChestplate, 1), "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumLeggings, 1), "xxx", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumBoots, 1), "x x", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumBoots, 1), "   ", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumHelmet, "xxx", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumHelmet, "   ", "xxx", "x x", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumChestplate, "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumLeggings, "xxx", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumBoots, "x x", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumBoots, "   ", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        //GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumPickaxe, "xxx", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngotEnergized), 'y', new ItemStack(Items.stick,OreDictionary.WILDCARD_VALUE));

        // Oredictionary recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.anderiumSword, 1), " x ", " x ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.anderiumShovel, 1), " x ", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.anderiumAxe, 1), "xx ", "xy ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.anderiumPickaxe, 1), "xxx", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngot), 'y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.enchantedAnderiumPickaxe, "xxx", " y ", " y ", 'x', new ItemStack(ModItems.anderiumIngotEnergized), 'y', "stickWood"));
    }

    private static void enchantItemStacks() {
        ModItems.enchantedAnderiumHelmet.addEnchantment(Enchantment.blastProtection, 4);
        ModItems.enchantedAnderiumHelmet.addEnchantment(Enchantment.projectileProtection, 4);
        ModItems.enchantedAnderiumChestplate.addEnchantment(Enchantment.blastProtection, 4);
        ModItems.enchantedAnderiumChestplate.addEnchantment(Enchantment.projectileProtection, 4);
        ModItems.enchantedAnderiumLeggings.addEnchantment(Enchantment.blastProtection, 4);
        ModItems.enchantedAnderiumLeggings.addEnchantment(Enchantment.projectileProtection, 4);
        ModItems.enchantedAnderiumBoots.addEnchantment(Enchantment.blastProtection, 4);
        ModItems.enchantedAnderiumBoots.addEnchantment(Enchantment.projectileProtection, 4);
        ModItems.enchantedAnderiumPickaxe.addEnchantment(Enchantment.fortune, 3);
    }
}