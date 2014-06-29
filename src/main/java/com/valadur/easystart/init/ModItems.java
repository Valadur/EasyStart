package com.valadur.easystart.init;

import com.valadur.easystart.item.EasyPickaxeBasic;
import com.valadur.easystart.item.EasyPickaxeUltimate;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ModItems {

    public static final Item easyPickaxeBasic = new EasyPickaxeBasic();
    public static final Item getEasyPickaxeUltimate = new EasyPickaxeUltimate();

    // Initialize all the Items
    public static void init(){
        GameRegistry.registerItem(easyPickaxeBasic, Names.Items.EASYPICKAXE_BASIC);
        GameRegistry.registerItem(getEasyPickaxeUltimate, Names.Items.EASYPICKAXE_ULTIMATE);
    }
}