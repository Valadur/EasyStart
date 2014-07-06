package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.ToolMaterials;

public class ItemAnderiumSword extends ItemSword {

    public ItemAnderiumSword(){
        super(ToolMaterials.ANDERIUM);
        setUnlocalizedName(Names.Items.ANDERIUM_SWORD);
    }
}
