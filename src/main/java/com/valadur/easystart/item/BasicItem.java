package com.valadur.easystart.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class BasicItem extends Item {

    public BasicItem(){
        super();
        setCreativeTab(CreativeTabs.tabMisc);
        setMaxStackSize(1);
        // Set number of uses
        setMaxDamage(20);
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