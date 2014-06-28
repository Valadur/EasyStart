package com.valadur.easystart.init;

import com.valadur.easystart.item.ESItem;
import com.valadur.easystart.item.EasyPickaxe;
import com.valadur.easystart.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems {

    public static final ESItem easyPickaxe = new EasyPickaxe();

    public static void init(){
        GameRegistry.registerItem(easyPickaxe, Names.Items.EASYPICKAXE);
    }
}