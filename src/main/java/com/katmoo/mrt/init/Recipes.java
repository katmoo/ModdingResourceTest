package com.katmoo.mrt.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
    public static void init() {
        //Items
        GameRegistry.addRecipe(new ItemStack(ModItems.cardboard, 4), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.paper));
        //Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cardboardCube, 2), "cc", "cc", 'c', new ItemStack(ModItems.cardboard));
    }
}
