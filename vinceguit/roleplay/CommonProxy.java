package vinceguit.roleplay;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler
{
	public static String ITEMS_PNG = "/vinceguit/roleplay/textures/items.png";
	public static String TERRAIN_PNG = "/vinceguit/roleplay/textures/terrain.png";

	public void registerRenderInformation() 
	{
		
	}

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

}