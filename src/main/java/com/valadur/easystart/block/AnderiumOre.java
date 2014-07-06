package com.valadur.easystart.block;

import com.valadur.easystart.init.ModBlocks;
import com.valadur.easystart.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class AnderiumOre extends BlockES {

    public AnderiumOre(){
        this(Material.rock);
    }

    public AnderiumOre(Material material) {
        super(material);
        setBlockName(Names.Blocks.ANDERIUM_ORE);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundTypeStone);
        setHarvestLevel("pickaxe",2);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(ModBlocks.oreAnderium);
    }
}