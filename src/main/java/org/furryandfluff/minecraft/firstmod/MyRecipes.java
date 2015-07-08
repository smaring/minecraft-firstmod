package org.furryandfluff.minecraft.firstmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MyRecipes {
	public static void addRecipes(){
		
		GameRegistry.addRecipe(new ItemStack(Blocks.command_block),
				"ABA",
				"BCB",
				"ABA",
				'A',Blocks.glowstone,
		        'B',Blocks.glass,
                'C',Blocks.redstone_block);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Emerald_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.emerald,
						'B',Items.stick);
	
				GameRegistry.addRecipe(new ItemStack(MyItems.Redstone_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.redstone,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Lapis_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.lapis_block,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Paper_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.paper,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Rainbow_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.glass,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Obsidian_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.obsidian,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Quartz_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.quartz,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Lava_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.lava_bucket,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Water_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.water_bucket,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Super_OP_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.beacon,
						'B',Blocks.diamond_block);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Glowstone_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.glowstone,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Nether_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.nether_brick,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Starbucks),
						"   ",
						" A ",
						" B ",
						'A',Items.sugar,
						'B',Items.water_bucket);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Blaze_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.blaze_rod,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Ice_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.ice,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Fire_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.flint_and_steel,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Slime_Sword),
						" A ",
						" A ",
						" B ",
						'A',Blocks.slime_block,
						'B',Items.stick);
				
				GameRegistry.addRecipe(new ItemStack(MyItems.Invisible_Sword),
						" A ",
						" A ",
						" B ",
						'A',Items.glass_bottle,
						'B',Items.stick);
						
						
	}}
						
						  
						
						
				
	


