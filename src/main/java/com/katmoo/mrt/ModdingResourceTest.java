package com.katmoo.mrt;

import com.katmoo.mrt.handler.ConfigHandler;
import com.katmoo.mrt.init.ModBlocks;
import com.katmoo.mrt.init.ModItems;
import com.katmoo.mrt.proxy.IProxy;
import com.katmoo.mrt.ref.RefStr;
import com.katmoo.mrt.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStr.MOD_ID, name = RefStr.MOD_NAME, version = RefStr.VERSION, guiFactory = RefStr.GUI_FACTORY_CLASS)
public class ModdingResourceTest {

    @Mod.Instance(RefStr.MOD_ID)
    public static ModdingResourceTest instance;

    @SidedProxy(clientSide = RefStr.CLIENT_PROXY_CLASS, serverSide = RefStr.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete!");
    }
}
