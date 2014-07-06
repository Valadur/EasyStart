package com.valadur.easystart.init;

import com.valadur.easystart.item.*;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ModItems {

    public static final Item anderiumPickaxe = new ItemAnderiumPickaxe();
    public static final Item anderiumAxe = new ItemAnderiumAxe();
    public static final Item anderiumSword = new ItemAnderiumSword();
    public static final Item anderiumShovel = new ItemAnderiumShovel();
    public static final Item anderiumIngot = new IngotAnderium();


    // Initialize all the items
    public static void init() {
        GameRegistry.registerItem(anderiumAxe, Names.Items.ANDERIUM_AXE);
        GameRegistry.registerItem(anderiumPickaxe, Names.Items.ANDERIUM_PICKAXE);
        GameRegistry.registerItem(anderiumShovel, Names.Items.ANDERIUM_SHOVEL);
        GameRegistry.registerItem(anderiumSword, Names.Items.ANDERIUM_SWORD);
        GameRegistry.registerItem(anderiumIngot, Names.Items.ANDERIUM_INGOT);
    }
}