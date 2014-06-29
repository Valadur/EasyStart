package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EasyPickaxeBasic extends ESItem{

    public EasyPickaxeBasic(){
        super();
        setUnlocalizedName(Names.Items.EASYPICKAXE_BASIC);
        setCreativeTab(CreativeTabs.tabMisc);
        setMaxStackSize(1);
        // Diamond Level
        setHarvestLevel("pickaxe",3);
        // Set number of uses
        setMaxDamage(5);
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

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        return 1.0F;
    }
}