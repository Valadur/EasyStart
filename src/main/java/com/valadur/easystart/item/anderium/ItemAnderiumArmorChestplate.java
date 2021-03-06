package com.valadur.easystart.item.anderium;

import com.valadur.easystart.reference.ModMaterial;
import com.valadur.easystart.reference.Names;
import com.valadur.easystart.reference.Textures;

public class ItemAnderiumArmorChestplate extends ItemAnderiumArmor {

    public ItemAnderiumArmorChestplate() {
        super(ModMaterial.ArmorMaterial.ANDERIUM_ARMOR, Textures.ANDERIUM_ARMOR_ID, 1);
        setUnlocalizedName(Names.Items.ANDERIUM_CHESTPLATE);
    }
}
