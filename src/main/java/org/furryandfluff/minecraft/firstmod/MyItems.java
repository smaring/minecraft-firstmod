package org.furryandfluff.minecraft.firstmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MyItems {public static Item Emerald_Sword;
	public static Item Redstone_Sword;
	public static Item Lapis_Sword;
	public static Item Paper_Sword;
	public static Item Rainbow_Sword;
	public static Item Obsidian_Sword;
	public static Item Quartz_Sword;
	public static Item Lava_Sword;
	public static Item Water_Sword;
	public static Item Super_OP_Sword;
	public static Item Glowstone_Sword;
	public static Item Nether_Sword;
	public static Item Starbucks;
	public static Item Blaze_Sword;
	public static Item Ice_Sword;
	public static Item Fire_Sword;
	public static Item Slime_Sword;
	public static Item Invisible_Sword;




public static void init(){
	
	
Emerald_Sword = new Item().setUnlocalizedName("Emerald_Sword");
Redstone_Sword = new Item().setUnlocalizedName("Redstone_Sword");
Lapis_Sword = new Item().setUnlocalizedName("Lapis_Sword");
Paper_Sword = new Item().setUnlocalizedName("Paper_Sword");
Rainbow_Sword = new Item().setUnlocalizedName("Rainbow_Sword");
Obsidian_Sword = new Item().setUnlocalizedName("Obsidian_Sword");
Quartz_Sword = new Item().setUnlocalizedName("Quartz_Sword");
Lava_Sword = new Item().setUnlocalizedName("Lava_Sword");
Water_Sword = new Item().setUnlocalizedName("Water_Sword");
Super_OP_Sword = new Item().setUnlocalizedName("Super_OP_Sword");
Glowstone_Sword = new Item().setUnlocalizedName("Glowstone_Sword");
Nether_Sword = new Item().setUnlocalizedName("Nether_Sword");
Starbucks = new Item().setUnlocalizedName("Starbucks");
Blaze_Sword = new Item().setUnlocalizedName("Blaze_Sword");
Ice_Sword = new Item().setUnlocalizedName("Ice_Sword");
Fire_Sword = new Item().setUnlocalizedName("Fire_Sword");
Slime_Sword = new Item().setUnlocalizedName("Slime_Sword");
Invisible_Sword = new Item().setUnlocalizedName("Invisible_Sword");

}
public static void register(){
	GameRegistry.registerItem(Emerald_Sword, Emerald_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Redstone_Sword, Redstone_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Lapis_Sword, Lapis_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Paper_Sword, Paper_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Rainbow_Sword, Rainbow_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Obsidian_Sword, Obsidian_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Quartz_Sword, Quartz_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Lava_Sword, Lava_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Water_Sword, Water_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Super_OP_Sword, Super_OP_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Glowstone_Sword, Glowstone_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Nether_Sword, Nether_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Starbucks, Starbucks.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Blaze_Sword, Blaze_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Ice_Sword, Ice_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Fire_Sword, Fire_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Slime_Sword, Slime_Sword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Invisible_Sword, Invisible_Sword.getUnlocalizedName().substring(5));
}


public static void registerRender(Item item){
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(FirstMod.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	
}
public static void registerRenders(){
	registerRender(Emerald_Sword);
	registerRender(Redstone_Sword);
	registerRender(Lapis_Sword);
	registerRender(Paper_Sword);
	registerRender(Rainbow_Sword);
	registerRender(Obsidian_Sword);
	registerRender(Quartz_Sword);
	registerRender(Lava_Sword);
	registerRender(Water_Sword);
	registerRender(Super_OP_Sword);
	registerRender(Glowstone_Sword);
	registerRender(Nether_Sword);
	registerRender(Starbucks);
	registerRender(Blaze_Sword);
	registerRender(Ice_Sword);
	registerRender(Fire_Sword);
	registerRender(Slime_Sword);
	registerRender(Invisible_Sword);
	
}}