package vinceguit.roleplay.src;

import vinceguit.roleplay.CommonProxy;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockTrack extends Block
{
    public BlockTrack(int par1, int par2, Material par3Material)
    {
        super(par1, par2, par3Material);
        setTickRandomly(true);
    }
 
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float var1 = 0.125F;
        return AxisAlignedBB.getBoundingBox(par2, par3, par4, par2 + 1, (float)(par3 + 1) - var1, par4 + 1);
    }
 
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.motionX *= 1.5D;
        par5Entity.motionZ *= 1.5D;
    }
    
    public String getTextureFile() 
    {
    	return CommonProxy.TERRAIN_PNG;
    }
    
	{this.setCreativeTab(CreativeTabs.tabBlock);}
}
