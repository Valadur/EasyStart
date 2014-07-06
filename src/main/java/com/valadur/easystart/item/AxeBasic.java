package com.valadur.easystart.item;

import com.valadur.easystart.reference.ConfigurationValues;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class AxeBasic extends ItemBasic {

    public AxeBasic() {
        super();
        setUnlocalizedName(Names.Items.AXE_BASIC);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.wood || block.getMaterial() == Material.leaves){
            return ConfigurationValues.TOOL_SPEED_BASE * ConfigurationValues.TOOL_SPEED_MODIFIER;
        }
        return 1.0F;
    }
}