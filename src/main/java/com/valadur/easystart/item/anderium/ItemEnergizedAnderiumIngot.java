package com.valadur.easystart.item.anderium;

import com.valadur.easystart.reference.Names;
import net.minecraft.item.ItemStack;

public class ItemEnergizedAnderiumIngot extends ItemAnderiumIngot {

    public ItemEnergizedAnderiumIngot(){
        super();
        setUnlocalizedName(Names.Items.ANDERIUM_INGOT_ENERGIZED);
    }

    @Override
    public boolean hasEffect(ItemStack itemstack){
        return true;
    }
}
