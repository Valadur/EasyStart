package com.valadur.easystart.block;

import com.valadur.easystart.init.ModBlocks;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class AnderiumOre extends OreES {

    public AnderiumOre(){
        this(Material.rock);
    }

    public AnderiumOre(Material material) {
        super(material);
        setUnlocalizedName(Names.Blocks.ANDERIUM_ORE);
        setHarvestLevel("pickaxe",1);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return Item.getItemFromBlock(ModBlocks.oreAnderium);
    }
}