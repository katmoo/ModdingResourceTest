package com.katmoo.mrt.block;

import com.katmoo.mrt.handler.ConfigHandler;
import net.minecraft.block.material.Material;

public class BlockCardboardFrame extends BlockMRT {
    public BlockCardboardFrame() {
        super(Material.cloth);
        this.setBlockName("cardboardFrame");
        this.setHardness(0.6f);
        this.setStepSound(soundTypeCloth);
        this.setFlammable(ConfigHandler.cardboardCubeFlammable);
        this.setFlammability(50);
        this.setOpaque(false);
    }
}
