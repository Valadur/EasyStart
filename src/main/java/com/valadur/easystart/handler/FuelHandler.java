package com.valadur.easystart.handler;

import com.valadur.easystart.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == ModItems.anderiumIngot){
            return 1600;
        }
        return 0;
    }
}
