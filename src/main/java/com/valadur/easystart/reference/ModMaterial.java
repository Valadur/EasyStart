package com.valadur.easystart.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterial {

    public static class ToolMaterial {
        public static Item.ToolMaterial ANDERIUM_TOOL = EnumHelper.addToolMaterial(Names.Materials.ANDERIUM_NAME, 3, 2047, 16.0F, 10.0F, 30);
    }

    public static class ArmorMaterial {
        public static ItemArmor.ArmorMaterial ANDERIUM_ARMOR = EnumHelper.addArmorMaterial(Names.Materials.ANDERIUM_NAME, 33, new int[]{3,8,6,3}, 30);
    }
}