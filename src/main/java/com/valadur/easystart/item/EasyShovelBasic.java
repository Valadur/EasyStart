package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class EasyShovelBasic extends EasyBasicTool {

    public EasyShovelBasic() {
        super();
        setUnlocalizedName(Names.Items.EASYSHOVEL_BASIC);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.clay || block.getMaterial() == Material.sand || block.getMaterial() == Material.ground || block.getMaterial() == Material.grass){
            return 5.0F;
        }
        return 1.0F;
    }
}