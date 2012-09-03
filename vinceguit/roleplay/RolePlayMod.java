package vinceguit.roleplay;

import java.util.logging.Level;

import vinceguit.roleplay.src.BlockTrack;
import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
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
	
	public static Block trackDirt;
	public static Block trackStone;
	public static int trackDirtID;
	public static int trackStoneID;
	
	@Init
	public void load(FMLInitializationEvent par1Event)
	{
		trackDirt = new BlockTrack(trackDirtID, 254, Material.wood).setBlockName("trackDirt").setHardness(0.6F).setStepSound(Block.soundGravelFootstep);
		trackStone = new BlockTrack(trackStoneID, 255, Material.rock).setBlockName("trackStone").setHardness(3F).setStepSound(Block.soundStoneFootstep);
		
		GameRegistry.registerBlock(trackDirt);
		GameRegistry.registerBlock(trackStone);
		
		LanguageRegistry.addName(trackDirt, "Dirt Track");
		LanguageRegistry.addName(trackStone, "Stone Track");
		
	}
	
	
	@PreInit
	public void preInit(FMLPreInitializationEvent par1Event)
	{
		Configuration config = new Configuration(par1Event.getSuggestedConfigurationFile());
	
		try {
			config.load();
			trackDirtID = config.getOrCreateBlockIdProperty("Dirt Track", 2800).getInt();
			trackStoneID = config.getOrCreateBlockIdProperty("Stone Track", 2801).getInt();
		} 
		catch(Exception e) {
			FMLLog.log(Level.SEVERE, e, "Vince's Role Play Stuff has had a problem loading it's configuration file");
		} 
		finally {
			config.save();
		}
	}
}