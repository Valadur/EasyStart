package com.valadur.easystart.init;

import com.valadur.easystart.item.*;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ModItems {

    public static final Item pickaxeBasic = new PickaxeBasic();
    public static final Item pickaxeUltimate = new PickaxeUltimate();
    public static final Item axeBasic = new AxeBasic();
    public static final Item axeUltimate = new AxeUltimate();
    public static final Item shovelBasic = new ShovelBasic();
    public static final Item shovelUltimate = new ShovelUltimate();
    public static final Item swordBasic = new SwordBasic();
    public static final Item swordUltimate = new SwordUltimate();


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