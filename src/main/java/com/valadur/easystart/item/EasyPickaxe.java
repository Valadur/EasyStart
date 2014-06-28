package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class EasyPickaxe extends ESItem{

    public EasyPickaxe(){
        super();
        this.setUnlocalizedName(Names.Items.EASYPICKAXE);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxStackSize(1);
        this.setHarvestLevel("pickaxe", 3);
        this.setMaxDamage(255);
    }
}