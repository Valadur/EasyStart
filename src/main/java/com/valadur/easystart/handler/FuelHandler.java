package com.valadur.easystart.handler;

import com.valadur.easystart.init.ModItems;
import com.valadur.easystart.reference.ConfigurationValues;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == ModItems.anderiumIngot){
            return ConfigurationValues.ANDERIUM_FUEL_QUALITY;
        }
        else if (fuel.getItem() == ModItems.anderiumIngotEnergized){
            return ConfigurationValues.ANDERIUM_FUEL_QUALITY * 4;
        }
        return 0;
    }
}
