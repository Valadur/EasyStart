package com.valadur.easystart.creativeTab;

import com.valadur.easystart.init.ModItems;
import com.valadur.easystart.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

public class CreativeTab {
    public static final CreativeTabs ES_TAB = new CreativeTabs(Reference.MOD_ID){

        @Override
        public Item getTabIconItem(){
            return ModItems.anderiumPickaxe;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel(){
            return StatCollector.translateToLocal("key.categories.easystart");
        }
    };
}
