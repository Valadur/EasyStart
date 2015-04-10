package com.valadur.easystart.creativeTab;

import com.valadur.easystart.init.ModItems;
import com.valadur.easystart.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
    public static final CreativeTabs ES_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ModItems.anderiumPickaxe;
        }
    };
}