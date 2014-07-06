package com.valadur.easystart.item;

import com.valadur.easystart.reference.ConfigurationValues;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class ShovelUltimate extends ItemUltimate {

    public ShovelUltimate() {
        super();
        setUnlocalizedName(Names.Items.SHOVEL_ULTIMATE);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.clay || block.getMaterial() == Material.sand || block.getMaterial() == Material.ground || block.getMaterial() == Material.grass){
            return ConfigurationValues.TOOL_SPEED_BASE * ConfigurationValues.TOOL_SPEED_MODIFIER * ConfigurationValues.TOOL_SPEED_ULTIMATE_MODIFIER;
        }
        return 1.0F;
    }
}