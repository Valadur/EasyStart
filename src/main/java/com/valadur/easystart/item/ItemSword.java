package com.valadur.easystart.item;

import com.valadur.easystart.creativeTab.CreativeTab;
import com.valadur.easystart.reference.Textures;
import net.minecraft.item.ItemStack;

public class ItemSword extends net.minecraft.item.ItemSword{

    public ItemSword(ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTab.ES_TAB);
        setMaxStackSize(1);

    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }*/

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
