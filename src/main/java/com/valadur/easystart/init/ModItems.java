package com.valadur.easystart.init;

import com.valadur.easystart.item.*;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems {

    public static final ItemES pickaxeBasic = new PickaxeBasic();
    public static final ItemES pickaxeUltimate = new PickaxeUltimate();
    public static final ItemES axeBasic = new AxeBasic();
    public static final ItemES axeUltimate = new AxeUltimate();
    public static final ItemES shovelBasic = new ShovelBasic();
    public static final ItemES shovelUltimate = new ShovelUltimate();
    public static final ItemES swordBasic = new SwordBasic();
    public static final ItemES swordUltimate = new SwordUltimate();


    // Initialize all the items
    public static void init() {
        GameRegistry.registerItem(pickaxeBasic, Names.Items.PICKAXE_BASIC);
        GameRegistry.registerItem(pickaxeUltimate, Names.Items.PICKAXE_ULTIMATE);
        GameRegistry.registerItem(axeBasic, Names.Items.AXE_BASIC);
        GameRegistry.registerItem(axeUltimate, Names.Items.AXE_ULTIMATE);
        GameRegistry.registerItem(shovelBasic, Names.Items.SHOVEL_BASIC);
        GameRegistry.registerItem(shovelUltimate, Names.Items.SHOVEL_ULTIMATE);
        GameRegistry.registerItem(swordBasic, Names.Items.SWORD_BASIC);
        GameRegistry.registerItem(swordUltimate, Names.Items.SWORD_ULTIMATE);
    }
}