package com.valadur.easystart.init;

import com.valadur.easystart.item.anderium.*;
import com.valadur.easystart.reference.Names;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ModItems {

    public static final Item anderiumPickaxe = new ItemAnderiumPickaxe();
    public static final Item anderiumAxe = new ItemAnderiumAxe();
    public static final Item anderiumSword = new ItemAnderiumSword();
    public static final Item anderiumShovel = new ItemAnderiumShovel();
    public static final Item anderiumIngot = new ItemAnderiumIngot();
    public static final Item anderiumIngotEnergized = new ItemEnergizedAnderiumIngot();

    public static final Item anderiumHelmet = new ItemAnderiumArmorHelmet();
    public static final Item anderiumChestplate = new ItemAnderiumArmorChestplate();
    public static final Item anderiumLeggings = new ItemAnderiumArmorLeggings();
    public static final Item anderiumBoots = new ItemAnderiumArmorBoots();


    public static ItemStack enchantedAnderiumPickaxe = new ItemStack(anderiumPickaxe);
    public static ItemStack enchantedAnderiumHelmet = new ItemStack(anderiumHelmet);
    public static ItemStack enchantedAnderiumChestplate = new ItemStack(anderiumChestplate);
    public static ItemStack enchantedAnderiumLeggings = new ItemStack(anderiumLeggings);
    public static ItemStack enchantedAnderiumBoots = new ItemStack(anderiumBoots);

    // Initialize all the items
    public static void init() {
        GameRegistry.registerItem(anderiumAxe, Names.Items.ANDERIUM_AXE);
        GameRegistry.registerItem(anderiumPickaxe, Names.Items.ANDERIUM_PICKAXE);
        GameRegistry.registerItem(anderiumShovel, Names.Items.ANDERIUM_SHOVEL);
        GameRegistry.registerItem(anderiumSword, Names.Items.ANDERIUM_SWORD);
        GameRegistry.registerItem(anderiumIngot, Names.Items.ANDERIUM_INGOT);
        GameRegistry.registerItem(anderiumIngotEnergized, Names.Items.ANDERIUM_INGOT_ENERGIZED);
        GameRegistry.registerItem(anderiumHelmet, Names.Items.ANDERIUM_HELMET);
        GameRegistry.registerItem(anderiumChestplate, Names.Items.ANDERIUM_CHESTPLATE);
        GameRegistry.registerItem(anderiumLeggings, Names.Items.ANDERIUM_LEGGINGS);
        GameRegistry.registerItem(anderiumBoots, Names.Items.ANDERIUM_BOOTS);
    }
}