package net.minecraft.src;

import java.util.Random;


public class RitualisticBlockMoonShroom extends BlockFlower{

	public RitualisticBlockMoonShroom(int par1) {
		super(par1);
		this.setStepSound(soundGrassFootstep);
		this.setHardness(0.0F);
		this.SetBuoyant();
		this.setUnlocalizedName("MoonShroom");
		
	}
	
	
	public void registerIcons(IconRegister iconRegister)
	    {
	        this.blockIcon = iconRegister.registerIcon("RitualisticMoonShroom");
	    }


}
