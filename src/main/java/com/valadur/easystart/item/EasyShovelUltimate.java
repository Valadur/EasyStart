package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class EasyShovelUltimate extends EasyUltimateTool {

    public EasyShovelUltimate() {
        super();
        setUnlocalizedName(Names.Items.EASYSHOVEL_ULTIMATE);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.clay || block.getMaterial() == Material.sand || block.getMaterial() == Material.ground || block.getMaterial() == Material.grass){
            return 10.0F;
        }
        return 1.0F;
    }
}