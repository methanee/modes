package net.methanee.lolmod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.methanee.lolmod.handler.ConfigurationHandler;
import net.methanee.lolmod.init.ModBlocks;
import net.methanee.lolmod.init.ModItems;
import net.methanee.lolmod.proxy.IProxy;
import net.methanee.lolmod.reference.Reference;
import net.methanee.lolmod.utility.LogHelper;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class LolMod
{
    @Mod.Instance( Reference.MOD_ID)
    public static LolMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
       ConfigurationHandler.init(event.getSuggestedConfigurationFile());
       FMLCommonHandler.instance() .bus() .register(new ConfigurationHandler());
       LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }

}
