package com.valadur.easystart.init;

import com.valadur.easystart.item.*;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ModItems {

    public static final Item easyPickaxeBasic = new EasyPickaxeBasic();
    public static final Item easyPickaxeUltimate = new EasyPickaxeUltimate();
    public static final Item easyAxeBasic = new EasyAxeBasic();
    public static final Item easyAxeUltimate = new EasyAxeUltimate();
    public static final Item easyShovelBasic = new EasyShovelBasic();
    public static final Item easyShovelUltimate = new EasyShovelUltimate();


    // Initialize all the items
    public static void init() {
        GameRegistry.registerItem(easyPickaxeBasic, Names.Items.EASYPICKAXE_BASIC);
        GameRegistry.registerItem(easyPickaxeUltimate, Names.Items.EASYPICKAXE_ULTIMATE);
        GameRegistry.registerItem(easyAxeBasic, Names.Items.EASYAXE_BASIC);
        GameRegistry.registerItem(easyAxeUltimate, Names.Items.EASYAXE_ULTIMATE);
        GameRegistry.registerItem(easyShovelBasic, Names.Items.EASYSHOVEL_BASIC);
        GameRegistry.registerItem(easyShovelUltimate, Names.Items.EASYSHOVEL_ULTIMATE);
    }
}