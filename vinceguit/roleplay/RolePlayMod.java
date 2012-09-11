package vinceguit.roleplay;

import java.util.logging.Level;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import vinceguit.roleplay.src.BlockMythrilOre;
import vinceguit.roleplay.src.BlockRolePlayOre;
import vinceguit.roleplay.src.BlockTrack;
import vinceguit.roleplay.src.ItemRolePlay;
import vinceguit.roleplay.src.OreWorldGenerator;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = "RolePlayMod", name="Vince's Role Play Stuff", version="0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = "[0.1]")
public class RolePlayMod
{
	@SidedProxy(clientSide = "vinceguit.roleplay.ClientProxy", serverSide = "vinceguit.roleplay.CommonProxy")
	public static CommonProxy proxy;
	@Instance
	public static RolePlayMod instance;
	
	//Blocks
	public static Block trackDirt;
	public static Block trackStone;
	public static Block oreMythril;
	public static Block oreCopper;
	public static Block oreSilver;
	public static Block oreAmber;
	//Block IDs
	public static int trackDirtID;
	public static int trackStoneID;
	public static int oreMythrilID;
	public static int oreCopperID;
	public static int oreSilverID;
	public static int oreAmberID;
	//Items
	public static Item mythril;
	public static Item copper;
	public static Item silver;
	public static Item stoneAmber;
	public static Item relicStone;
	public static Item scaleDragon;
	public static Item dragonSword;
	public static Item dragonSpade;
	public static Item dragonPickaxe;
	public static Item dragonAxe;
	public static Item dragonHoe;
	//Item IDs
	public static int mythrilID;
	public static int copperID;
	public static int silverID;
	public static int stoneAmberID;
	public static int relicStoneID;
	public static int scaleDragonID;
	public static int dragonSwordID;
	public static int dragonSpadeID;
	public static int dragonPickaxeID;
	public static int dragonAxeID;
	public static int dragonHoeID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent par1Event)
	{
		Configuration var1Config = new Configuration(par1Event.getSuggestedConfigurationFile());
	
		try 
		{
			var1Config.load();
			//Blocks
			trackDirtID = var1Config.getOrCreateBlockIdProperty("Dirt Track", 2800).getInt();
			trackStoneID = var1Config.getOrCreateBlockIdProperty("Stone Track", 2801).getInt();
			oreMythrilID = var1Config.getOrCreateBlockIdProperty("Mythril Ore Block", 2802).getInt();
			oreCopperID = var1Config.getOrCreateBlockIdProperty("Copper Ore Block", 2803).getInt();
			oreSilverID = var1Config.getOrCreateBlockIdProperty("Silver Ore Block", 2804).getInt();
			oreAmberID = var1Config.getOrCreateBlockIdProperty("Amber Ore", 2805).getInt();
			//Items
			mythrilID = var1Config.getOrCreateBlockIdProperty("Mythril Ore", 3000).getInt();
			copperID = var1Config.getOrCreateBlockIdProperty("Copper Ore", 3001).getInt();
			silverID = var1Config.getOrCreateBlockIdProperty("Silver Ore", 3002).getInt();
			stoneAmberID = var1Config.getOrCreateBlockIdProperty("Amber Stone", 3003).getInt();
			relicStoneID = var1Config.getOrCreateBlockIdProperty("Reliqual Stone", 3004).getInt();
			scaleDragonID = var1Config.getOrCreateBlockIdProperty("Dragon Scale", 3005).getInt();
			dragonSwordID = var1Config.getOrCreateBlockIdProperty("Dragon Scale Sword", 3006).getInt();
			dragonSpadeID = var1Config.getOrCreateBlockIdProperty("Dragon Scale Shovel", 3007).getInt();
			dragonPickaxeID = var1Config.getOrCreateBlockIdProperty("Dragon Scale Pickaxe", 3008).getInt();
			dragonAxeID = var1Config.getOrCreateBlockIdProperty("Dragon Scale Axe", 3009).getInt();
			dragonHoeID = var1Config.getOrCreateBlockIdProperty("Dragon Scale Hoe", 3010).getInt();
			
		} 
		
		catch(Exception e) 
		{
			FMLLog.log(Level.SEVERE, e, "Vince's Role Play Stuff had a problem loading it's configuration file");
		} 
		
		finally 
		{
			var1Config.save();
		}
	}
	
	@Init
	public void Init(FMLInitializationEvent par1Event)
	{
		//Blocks
		trackDirt = new BlockTrack(trackDirtID, 0, Material.wood).setBlockName("trackDirt").setHardness(0.6F).setStepSound(Block.soundGravelFootstep);
		trackStone = new BlockTrack(trackStoneID, 1, Material.rock).setBlockName("trackStone").setHardness(3F).setStepSound(Block.soundStoneFootstep);
		oreMythril = new BlockMythrilOre(oreMythrilID, 2).setBlockName("oreMythril").setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep);
		oreCopper = new BlockRolePlayOre(oreCopperID, 3).setBlockName("oreCopper").setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep);
	    oreSilver = new BlockRolePlayOre(oreSilverID, 4).setBlockName("oreSilver").setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep);
	    oreAmber = new BlockRolePlayOre(oreAmberID, 5).setBlockName("oreAmber").setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep);
		GameRegistry.registerBlock(trackDirt);
		GameRegistry.registerBlock(trackStone);
		GameRegistry.registerBlock(oreMythril);
		GameRegistry.registerBlock(oreCopper);
		GameRegistry.registerBlock(oreSilver);
		GameRegistry.registerBlock(oreAmber);
		LanguageRegistry.addName(trackDirt, "Dirt Track");
		LanguageRegistry.addName(trackStone, "Stone Track");
		LanguageRegistry.addName(oreMythril, "Mythril Ore");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		LanguageRegistry.addName(oreSilver, "Silver Ore");
		LanguageRegistry.addName(oreAmber, "Amber Ore");
		//Items
		mythril = new ItemRolePlay(mythrilID).setItemName("mythril").setIconIndex(0);
		copper = new ItemRolePlay(copperID).setItemName("copper").setIconIndex(1);
		silver = new ItemRolePlay(silverID).setItemName("silver").setIconIndex(2);
		stoneAmber = new ItemRolePlay(stoneAmberID).setItemName("stoneAmber").setIconIndex(3);
		LanguageRegistry.addName(mythril, "Mythril Ore");
		LanguageRegistry.addName(copper, "Copper Ore");
		LanguageRegistry.addName(silver, "Silver Ore");
		LanguageRegistry.addName(stoneAmber, "Amber Stone");
		//World Generator
		GameRegistry.registerWorldGenerator(new OreWorldGenerator());
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent par1Event)
	{
		
	}
	
}