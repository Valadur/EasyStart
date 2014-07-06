package com.valadur.easystart.item;

import com.valadur.easystart.reference.ConfigurationValues;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class AxeUltimate extends ItemUltimate {

    public AxeUltimate() {
        super();
        setUnlocalizedName(Names.Items.AXE_ULTIMATE);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.wood || block.getMaterial() == Material.leaves){
            return ConfigurationValues.TOOL_SPEED_BASE * ConfigurationValues.TOOL_SPEED_MODIFIER * ConfigurationValues.TOOL_SPEED_ULTIMATE_MODIFIER;
        }
        return 1.0F;
    }
}
