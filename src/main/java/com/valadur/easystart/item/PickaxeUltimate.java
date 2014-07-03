package com.valadur.easystart.item;

import com.valadur.easystart.reference.ConfigurationValues;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class PickaxeUltimate extends UltimateItem {
    public PickaxeUltimate(){
        super();
        setUnlocalizedName(Names.Items.PICKAXE_ULTIMATE);
        setHarvestLevel("pickaxe",3);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        // This includes ores
        if(block.getMaterial() == Material.rock){
            return ConfigurationValues.TOOL_SPEED_BASE * ConfigurationValues.TOOL_SPEED_MODIFIER * ConfigurationValues.TOOL_SPEED_ULTIMATE_MODIFIER;
        }
        return 1.0F;
    }
}
