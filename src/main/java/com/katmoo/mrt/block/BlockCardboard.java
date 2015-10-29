package com.katmoo.mrt.block;

import com.katmoo.mrt.creativetab.CreativeTabMRT;
import net.minecraft.block.material.Material;

public class BlockCardboard extends BlockMRT {
    public BlockCardboard() {
        super(Material.cloth);
        this.setBlockName("cardboardCube");
        this.setHardness(0.6f);
        this.setStepSound(soundTypeCloth);
        this.setFlammable(true);
        this.setFlammability(50);
        this.setCreativeTab(CreativeTabMRT.MRT_TAB);
    }
}
