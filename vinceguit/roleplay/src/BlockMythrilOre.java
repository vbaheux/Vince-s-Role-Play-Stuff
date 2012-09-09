package vinceguit.roleplay.src;

import java.util.Random;

import vinceguit.roleplay.RolePlayMod;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class BlockMythrilOre extends Block
{
    public BlockMythrilOre(int par1, int par2)
    {
        super(par1, par2, Material.iron);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == Block.oreCoal.blockID ? RolePlayMod.mythril.shiftedIndex : this.blockID;
    }

    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
        {
            int var3 = par2Random.nextInt(par1 + 2) - 1;

            if (var3 < 0)
            {
                var3 = 0;
            }

            return this.quantityDropped(par2Random) * (var3 + 1);
        }
        else
        {
            return this.quantityDropped(par2Random);
        }
    }

    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int var8 = 0;

            if (this.blockID == RolePlayMod.oreMythril.blockID)
            {
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 6);
            }

            this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
        }
    }
}

