package com.katmoo.mrt.block;

import com.katmoo.mrt.handler.ConfigHandler;
import net.minecraft.block.material.Material;

public class BlockCardboard extends BlockMRT {
    public BlockCardboard() {
        super(Material.cloth);
        this.setBlockName("cardboardCube");
        this.setHardness(0.6f);
        this.setStepSound(soundTypeCloth);
        this.setFlammable(ConfigHandler.cardboardCubeFlammable);
        this.setFlammability(50);
    }
}
