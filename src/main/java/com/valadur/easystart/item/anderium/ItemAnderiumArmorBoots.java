package com.valadur.easystart.item.anderium;

import com.valadur.easystart.reference.ModMaterial;
import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.Textures;

public class ItemAnderiumArmorBoots extends ItemAnderiumArmor {

    public ItemAnderiumArmorBoots(){
        super(ModMaterial.ArmorMaterial.ANDERIUM_ARMOR, Textures.ANDERIUM_ARMOR_ID, 3);
        setUnlocalizedName(Names.Items.ANDERIUM_BOOTS);
    }

}
