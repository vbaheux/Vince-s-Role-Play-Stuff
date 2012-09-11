package vinceguit.roleplay.src;

import vinceguit.roleplay.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemRolePlay extends Item{

	public ItemRolePlay(int par1) 
	{
		super(par1);
		this.maxStackSize = 64;
		this.setTabToDisplayOn(CreativeTabs.tabMisc);
	}
	
    public String getTextureFile() 
    {
    	return CommonProxy.ITEMS_PNG;
    }
}

