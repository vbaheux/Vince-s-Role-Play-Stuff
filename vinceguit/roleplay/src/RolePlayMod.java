package vinceguit.roleplay.src;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod( modid = "RolePlayMod", name="Vinceguit's Role Play Stuff", version="0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = "[0.1]")
public class RolePlayMod
{
	@SidedProxy(clientSide = "vinceguit.roleplay.src.ClientProxy", serverSide = "vinceguit.roleplay.src.CommonProxy")
	public static CommonProxy proxy;
	@Instance
	public static RolePlayMod instance;
	
	@Init
	public void load(FMLInitializationEvent par1Event)
	{
	}
}