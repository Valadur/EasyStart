package com.valadur.easystart.item.anderium;

import com.valadur.easystart.creativeTab.CreativeTab;
import com.valadur.easystart.init.ModItems;
import com.valadur.easystart.item.ItemArmorES;
import com.valadur.easystart.reference.Textures;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAnderiumArmor extends ItemArmorES {

    public ItemAnderiumArmor(ArmorMaterial material, int renderIndex, int slot){
        super(material, renderIndex, slot);
        setCreativeTab(CreativeTab.ES_TAB);
        setMaxStackSize(1);
    }

    @Override
    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type){
        if (itemStack.getItem() == ModItems.anderiumHelmet || itemStack.getItem() == ModItems.anderiumChestplate || itemStack.getItem() == ModItems.anderiumBoots){
            return Textures.RESOURCE_PREFIX + Textures.ARMOR_MODEL_FOLDER + "anderium_layer_1.png";
        }
        else if (itemStack.getItem() == ModItems.anderiumLeggings){
            return Textures.RESOURCE_PREFIX + Textures.ARMOR_MODEL_FOLDER + "anderium_layer_2.png";
        }
        else{
            return null;
        }
    }

    @Override
    public void onCreated(ItemStack itemStack, World world, EntityPlayer player){
        itemStack.addEnchantment(Enchantment.unbreaking, 4);
        itemStack.addEnchantment(Enchantment.thorns, 4);
    }
}