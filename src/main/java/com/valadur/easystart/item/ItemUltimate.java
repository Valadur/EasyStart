package com.valadur.easystart.item;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ItemUltimate extends ItemES {
    public ItemUltimate(){
        super();
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemstack, World world, Block block, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase entityLivingBase) {
        return true;
    }
}
