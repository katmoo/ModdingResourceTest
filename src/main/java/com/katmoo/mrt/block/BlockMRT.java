package com.katmoo.mrt.block;

import com.katmoo.mrt.creativetab.CreativeTabMRT;
import com.katmoo.mrt.ref.RefStr;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockMRT extends Block {
    protected boolean flammable = false;
    protected int flammability = 1;
    protected boolean opaque = true;

    public BlockMRT(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabMRT.MRT_TAB);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", RefStr.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    //Block Flammability
    public BlockMRT setFlammable(boolean flammable) {
        this.flammable = flammable;
        return this;
    }

    public BlockMRT setFlammability(int flammability) {
        this.flammability = flammability;
        return this;
    }

    @Override
    public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
        return flammable ? 300 : 0;
    }

    @Override
    public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
        return flammability;
    }

    @Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
        return flammable;
    }

    @Override
    public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side) {
        return flammable && flammability == 0;
    }

    //Block Opaqueness
    public BlockMRT setOpaque(boolean opaque) {
        this.opaque = opaque;
        return this;
    }

    @Override
    public boolean isOpaqueCube() {
        return opaque;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        return side == 0 || !world.getBlock(x, y, z).isOpaqueCube();
    }
}
