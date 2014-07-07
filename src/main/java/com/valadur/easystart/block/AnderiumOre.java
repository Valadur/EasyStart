package com.valadur.easystart.block;

import com.valadur.easystart.init.ModBlocks;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class AnderiumOre extends OreES {

    public AnderiumOre(){
        this(Material.rock);
    }

    public AnderiumOre(Material material) {
        super(material);
        setBlockName(Names.Blocks.ANDERIUM_ORE);
        setHarvestLevel("pickaxe",1);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(ModBlocks.oreAnderium);
    }
}