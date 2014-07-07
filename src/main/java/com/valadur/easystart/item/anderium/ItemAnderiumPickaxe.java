package com.valadur.easystart.item.anderium;

import com.valadur.easystart.item.ItemToolPickaxe;
import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.ModMaterial;

public class ItemAnderiumPickaxe extends ItemToolPickaxe {

    public ItemAnderiumPickaxe(){
        super(ModMaterial.ToolMaterial.ANDERIUM_TOOL);
        setUnlocalizedName(Names.Items.ANDERIUM_PICKAXE);
    }
}
