package com.valadur.easystart.item.anderium;

import com.valadur.easystart.item.ItemToolShovel;
import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.ModMaterial;

public class ItemAnderiumShovel extends ItemToolShovel {

    public ItemAnderiumShovel(){
        super(ModMaterial.ToolMaterial.ANDERIUM_TOOL);
        setUnlocalizedName(Names.Items.ANDERIUM_SHOVEL);
    }
}
