package com.valadur.easystart.block;

import com.valadur.easystart.init.ModBlocks;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class OreEasy extends BlockES {

    public OreEasy(){
        this(Material.rock);
    }

    public OreEasy(Material material) {
        super(material);
        setBlockName(Names.Blocks.ORE_EASY);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundTypeStone);
        setHarvestLevel("pickaxe",2);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(ModBlocks.oreEasy);
    }
}