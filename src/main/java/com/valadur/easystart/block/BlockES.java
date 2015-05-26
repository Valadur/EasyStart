package com.valadur.easystart.block;

import com.valadur.easystart.creativeTab.CreativeTab;
import com.valadur.easystart.reference.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

import java.util.Random;

public class BlockES extends Block {

    public BlockES(){
        this(Material.rock);
    }

    public BlockES(Material material){
        super(material);
        this.setCreativeTab(CreativeTab.ES_TAB);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }*/

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random){
        return 1;
    }
}
