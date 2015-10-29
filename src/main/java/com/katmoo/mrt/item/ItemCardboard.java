package com.katmoo.mrt.item;

import com.katmoo.mrt.creativetab.CreativeTabMRT;

public class ItemCardboard extends ItemMRT {
    public ItemCardboard() {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("cardboard");
        this.setCreativeTab(CreativeTabMRT.MRT_TAB);
    }
}
