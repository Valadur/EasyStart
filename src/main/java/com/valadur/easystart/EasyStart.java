package com.valadur.easystart;

import com.valadur.easystart.handler.ConfigurationHandler;
import com.valadur.easystart.init.*;
import com.valadur.easystart.proxy.IProxy;
import com.valadur.easystart.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class EasyStart {

    @Mod.Instance(Reference.MOD_ID)
    public static EasyStart instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        ModWorldGeneration.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        ModRecipes.init();
        ModSmelting.init();
        ModFuel.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}