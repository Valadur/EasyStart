package com.valadur.easystart.item;

import com.valadur.easystart.reference.ConfigurationValues;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class ShovelBasic extends ItemBasic {

    public ShovelBasic() {
        super();
        setUnlocalizedName(Names.Items.SHOVEL_BASIC);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.clay || block.getMaterial() == Material.sand || block.getMaterial() == Material.ground || block.getMaterial() == Material.grass){
            return ConfigurationValues.TOOL_SPEED_BASE * ConfigurationValues.TOOL_SPEED_MODIFIER;
        }
        return 1.0F;
    }
}
