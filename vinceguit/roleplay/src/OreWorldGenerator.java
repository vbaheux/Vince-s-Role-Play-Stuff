package vinceguit.roleplay.src;

import java.util.Random;
import vinceguit.roleplay.RolePlayMod;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreWorldGenerator implements IWorldGenerator
{
	 public void generate(Random par1Random, int par2ChunkX, int par3ChunkZ, World par4World, IChunkProvider par5ChunkGenerator, IChunkProvider par6ChunkProvider)
	 {
		 switch (par4World.provider.worldType)
		 {
		 	case -1: generateNether(par4World, par1Random, par2ChunkX*16, par3ChunkZ*16);
		 	case 0: generateSurface(par4World, par1Random, par2ChunkX*16, par3ChunkZ*16);
		 }
	 }

	 private void generateSurface(World par1World, Random par2Random, int par3BlockX, int par4BlockZ) 
	 {
		 
		 for (int i = 0; i < 1; i++)
	        {
				int posX = par3BlockX + par2Random.nextInt(16);
				int posY = par2Random.nextInt(12);
				int posZ = par4BlockZ + par2Random.nextInt(16);
				new WorldGenMinable(RolePlayMod.oreMythrilID, 4).generate(par1World, par2Random, posX, posY, posZ);
	        }
			
		 for (int i = 0; i < 6; i++)
	        {
	        	int posX = par3BlockX + par2Random.nextInt(16);
	        	int posY = par2Random.nextInt(47);
	        	int posZ = par4BlockZ + par2Random.nextInt(16);
	        	new WorldGenMinable(RolePlayMod.oreCopperID, 10).generate(par1World, par2Random, posX, posY, posZ);
	        }

		 for (int i = 0; i < 5; i++)
	        {
	        	int posX = par3BlockX + par2Random.nextInt(16);
	        	int posY = par2Random.nextInt(28);
	        	int posZ = par4BlockZ + par2Random.nextInt(16);
	        	new WorldGenMinable(RolePlayMod.oreSilverID, 7).generate(par1World, par2Random, posX, posY, posZ);
	        }
	        
		 for (int i = 0; i < 3; i++)
	        {
	        	int posX = par3BlockX + par2Random.nextInt(16);
	        	int posY = par2Random.nextInt(18);
	        	int posZ = par4BlockZ + par2Random.nextInt(16);
	        	new WorldGenMinable(RolePlayMod.oreAmberID, 10).generate(par1World, par2Random, posX, posY, posZ);
	        }
	 }
	 
	 private void generateNether(World par1World, Random par2Random, int par3BlockX, int par4BlockZ) 
	 {
	 }
}
