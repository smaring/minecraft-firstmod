package org.furryandfluff.minecraft.firstmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FirstMod.MODID, version = FirstMod.VERSION)
public class FirstMod
{
    public static final String MODID = "cole";
    public static final String VERSION = "1.0";
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    
    {MyItems.init();
    MyItems.register();
   
		
        
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {MyItems.registerRenders();
    MyRecipes.addRecipes();
		
        
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
        
    }
}