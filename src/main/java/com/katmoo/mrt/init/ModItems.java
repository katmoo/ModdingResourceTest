package com.katmoo.mrt.init;

import com.katmoo.mrt.item.ItemCardboard;
import com.katmoo.mrt.item.ItemCardboardTube;
import com.katmoo.mrt.item.ItemMRT;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemMRT cardboard = new ItemCardboard();
    public static final ItemMRT cardboardTube = new ItemCardboardTube();

    public static void init() {
        GameRegistry.registerItem(cardboard, "cardboard");
        GameRegistry.registerItem(cardboardTube, "cardboardTube");
    }
}
