package com.valadur.easystart.item;

import com.valadur.easystart.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class EasyAxeBasic extends EasyBasicTool {

    public EasyAxeBasic() {
        super();
        setUnlocalizedName(Names.Items.EASYAXE_BASIC);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int metadata){
        if(block.getMaterial() == Material.wood || block.getMaterial() == Material.leaves){
            return 5.0F;
        }
        return 1.0F;
    }
}
