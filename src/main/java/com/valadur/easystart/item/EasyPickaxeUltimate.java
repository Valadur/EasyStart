package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EasyPickaxeUltimate extends EasyPickaxeBasic {
    public EasyPickaxeUltimate(){
        super();
        setUnlocalizedName(Names.Items.EASYPICKAXE_ULTIMATE);
        setMaxDamage(127);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemstack, World world, Block block, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase entityLivingBase) {
        return false;
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        return 10.0F;
    }
}
