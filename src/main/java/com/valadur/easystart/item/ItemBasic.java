package com.valadur.easystart.item;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ItemBasic extends ItemES {

    public ItemBasic(){
        super();
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemstack, World world, Block block, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase entityLivingBase) {
        if (itemstack.isItemStackDamageable()) {
            itemstack.damageItem(1, entityLivingBase);
            return true;
        } else {
            return false;
        }
    }
}