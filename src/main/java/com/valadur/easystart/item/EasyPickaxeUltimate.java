package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class EasyPickaxeUltimate extends EasyUltimateTool {
    public EasyPickaxeUltimate(){
        super();
        setUnlocalizedName(Names.Items.EASYPICKAXE_ULTIMATE);
        setHarvestLevel("pickaxe",3);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        // This includes ores
        if(block.getMaterial() == Material.rock){
            return 10.0F;
        }
        return 1.0F;
    }
}
