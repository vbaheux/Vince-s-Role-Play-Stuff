package vinceguit.roleplay;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.Instance;

public class ClientProxy extends CommonProxy
{
	public void registerRenderInformation() 
	{  
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(TERRAIN_PNG);
	}
	
}
