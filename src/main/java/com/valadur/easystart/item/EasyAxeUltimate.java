package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class EasyAxeUltimate extends EasyUltimateTool{

    public EasyAxeUltimate() {
        super();
        setUnlocalizedName(Names.Items.EASYAXE_ULTIMATE);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.wood || block.getMaterial() == Material.leaves){
            return 10.0F;
        }
        return 1.0F;
    }
}
