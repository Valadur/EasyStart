package com.valadur.easystart.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {

    // Initialize all the recipes
    public static void init() {

        // Enchant the ItemStacks first so we can add the enchanted versions to the recipes
        enchantItemStacks();

        // Shapeless recipes
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie,4), Blocks.dirt);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.anderiumIngotEnergized), ModItems.anderiumIngot, Items.redstone);

        // Upgrades for pickaxes
        GameRegistry.addShapelessRecipe(new ItemStack(Items.stone_pickaxe), new ItemStack(Items.wooden_pickaxe, 1, OreDictionary.WILDCARD_VALUE), Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_pickaxe), new ItemStack(Items.stone_pickaxe, 1, OreDictionary.WILDCARD_VALUE), Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_pickaxe), new ItemStack(Items.iron_pickaxe, 1, OreDictionary.WILDCARD_VALUE), Items.diamond, Items.diamond, Items.diamond);

        //Upgrades for axes
        GameRegistry.addShapelessRecipe(new ItemStack(Items.stone_axe), new ItemStack(Items.wooden_axe, 1, OreDictionary.WILDCARD_VALUE), Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_axe), new ItemStack(Items.stone_axe, 1, OreDictionary.WILDCARD_VALUE), Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_axe), new ItemStack(Items.iron_axe, 1, OreDictionary.WILDCARD_VALUE), Items.diamond, Items.diamond, Items.diamond);

        // Upgrades for shovels
        GameRegistry.addShapelessRecipe(new ItemStack(Items.stone_shovel), new ItemStack(Items.wooden_shovel, 1, OreDictionary.WILDCARD_VALUE), Blocks.cobblestone);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_shovel), new ItemStack(Items.stone_shovel, 1, OreDictionary.WILDCARD_VALUE), Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_shovel), new ItemStack(Items.iron_shovel, 1, OreDictionary.WILDCARD_VALUE), Items.diamond);

        // Upgrades for swords
        GameRegistry.addShapelessRecipe(new ItemStack(Items.stone_sword), new ItemStack(Items.wooden_sword, 1, OreDictionary.WILDCARD_VALUE), Blocks.cobblestone, Blocks.cobblestone);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_sword), new ItemStack(Items.stone_sword, 1, OreDictionary.WILDCARD_VALUE), Items.iron_ingot, Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_sword), new ItemStack(Items.iron_sword, 1, OreDictionary.WILDCARD_VALUE), Items.diamond, Items.diamond);



        // Shaped recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumHelmet, 1), "xxx", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumHelmet, 1), "   ", "xxx", "x x", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumChestplate, 1), "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumLeggings, 1), "xxx", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumBoots, 1), "x x", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.anderiumBoots, 1), "   ", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngot));

        // Enchanted ones for the energized Anderium
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumHelmet, "xxx", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumHelmet, "   ", "xxx", "x x", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumChestplate, "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumLeggings, "xxx", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumBoots, "x x", "x x", "   ", 'x', new ItemStack(ModItems.anderiumIngotEnergized));
        GameRegistry.addShapedRecipe(ModItems.enchantedAnderiumBoots, "   ", "x x", "x x", 'x', new ItemStack(ModItems.anderiumIngotEnergized));

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