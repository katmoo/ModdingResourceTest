package com.katmoo.mrt.init;

import com.katmoo.mrt.block.BlockCardboard;
import com.katmoo.mrt.block.BlockMRT;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final BlockMRT cardboardCube = new BlockCardboard();

    public static void init() {
        GameRegistry.registerBlock(cardboardCube, "cardboardCube");
    }
}
