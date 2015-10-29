package com.katmoo.mrt.creativetab;

import com.katmoo.mrt.init.ModItems;
import com.katmoo.mrt.ref.RefStr;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMRT {
    public static CreativeTabs MRT_TAB = new CreativeTabs(RefStr.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.cardboard;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Modding Resource Test";
        }
    };
}
