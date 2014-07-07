package com.valadur.easystart.item.anderium;

import com.valadur.easystart.item.ItemSword;
import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.ModMaterial;

public class ItemAnderiumSword extends ItemSword {

    public ItemAnderiumSword(){
        super(ModMaterial.ToolMaterial.ANDERIUM_TOOL);
        setUnlocalizedName(Names.Items.ANDERIUM_SWORD);
    }
}
