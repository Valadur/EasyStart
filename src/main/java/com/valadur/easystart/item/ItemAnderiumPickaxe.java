package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.ToolMaterials;

public class ItemAnderiumPickaxe extends ItemToolPickaxe {

    public ItemAnderiumPickaxe(){
        super(ToolMaterials.ANDERIUM);
        setUnlocalizedName(Names.Items.ANDERIUM_PICKAXE);
    }
}
