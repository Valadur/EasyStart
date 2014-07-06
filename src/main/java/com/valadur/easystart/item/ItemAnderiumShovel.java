package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.ToolMaterials;

public class ItemAnderiumShovel extends ItemToolShovel {

    public ItemAnderiumShovel(){
        super(ToolMaterials.ANDERIUM);
        setUnlocalizedName(Names.Items.ANDERIUM_SHOVEL);
    }
}
