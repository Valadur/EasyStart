package com.valadur.easystart.item.anderium;

import com.valadur.easystart.item.ItemToolAxe;
import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.ModMaterial;

public class ItemAnderiumAxe extends ItemToolAxe {

    public ItemAnderiumAxe(){
        super(ModMaterial.ToolMaterial.ANDERIUM_TOOL);
        setUnlocalizedName(Names.Items.ANDERIUM_AXE);
    }
}
