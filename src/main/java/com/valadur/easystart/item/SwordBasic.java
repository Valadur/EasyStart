package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class SwordBasic extends ItemBasic {

    public SwordBasic(){
        super();
        setMaxDamage(50);
        setUnlocalizedName(Names.Items.SWORD_BASIC);
    }

    @Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        p_77644_1_.damageItem(1, p_77644_3_);
        return true;
    }
}
