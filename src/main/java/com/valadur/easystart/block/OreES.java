package com.valadur.easystart.block;

import net.minecraft.block.material.Material;

public class OreES extends BlockES {

    public OreES(){
        this(Material.rock);
    }

    public OreES(Material material) {
        super(material);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(soundTypeStone);
    }
}
