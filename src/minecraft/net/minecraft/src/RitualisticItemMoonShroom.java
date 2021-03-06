package net.minecraft.src;

import net.minecraft.src.RitualisticDefs;

public class RitualisticItemMoonShroom extends FCItemFood {
	static public final int m_iMoonShroomHungerHealed = 1;
	static public final float m_fMoonShroomSaturationModifier = 0F;
	static public final String m_sMoonShroomItemName = "Moon Shroom";

	public final int m_iPlacedBlockID;
	
    public RitualisticItemMoonShroom( int iItemID, int iHungerHealed, float fSaturationModifier, String sItemName, int iPlacedBlockID )
    {
		super( iItemID, m_iMoonShroomHungerHealed, m_fMoonShroomSaturationModifier, false, m_sMoonShroomItemName);
		this.m_iPlacedBlockID = 4040;
    }

	@Override
    public boolean onItemUse( ItemStack itemStack, EntityPlayer player, World world, int i, int j, int k, int iFacing, float fClickX, float fClickY, float fClickZ )
    {
        if ( iFacing == 1 )
        {
	        if ( player == null || ( player.canPlayerEdit( i, j, k, iFacing, itemStack ) && 
	        	player.canPlayerEdit( i, j + 1, k, iFacing, itemStack ) ) )
	        {
	            Block placedBlock = Block.blocksList[m_iPlacedBlockID];
	            
	            if ( world.isAirBlock( i, j + 1, k ) && placedBlock != null && 
	            	placedBlock.canPlaceBlockAt( world, i, j + 1, k ) )
	            {
	                world.setBlockWithNotify( i, j + 1, k, m_iPlacedBlockID );
	                
	                world.playSoundEffect( i + 0.5D, j + 0.5D, k + 0.5D, 
	                	Block.soundGrassFootstep.getStepSound(), 
	                	( Block.soundGrassFootstep.getVolume() + 1F ) / 2F, 
	                	Block.soundGrassFootstep.getPitch() * 0.8F );
	                
	                --itemStack.stackSize;
	                
	                return true;
	            }
	        }
        }
        
        return false;
    }
    
    @Override
	public boolean OnItemUsedByBlockDispenser( ItemStack stack, World world, 
		int i, int j, int k, int iFacing )
	{
    	FCUtilsBlockPos targetPos = new FCUtilsBlockPos( i, j, k, iFacing );
        Block placedBlock = Block.blocksList[m_iPlacedBlockID]; 
    	
        if ( world.isAirBlock( targetPos.i, targetPos.j, targetPos.k ) && placedBlock != null && 
        	placedBlock.canPlaceBlockAt( world, targetPos.i, targetPos.j, targetPos.k ) )
        {
            world.setBlockWithNotify( targetPos.i, targetPos.j, targetPos.k, m_iPlacedBlockID );
            
            world.playSoundEffect( targetPos.i + 0.5D, targetPos.j + 0.5D, targetPos.k + 0.5D, 
            	Block.soundGrassFootstep.getStepSound(), 
            	( Block.soundGrassFootstep.getVolume() + 1F ) / 2F, 
            	Block.soundGrassFootstep.getPitch() * 0.8F );
            
            return true;
        }
        
        return false;
	}
    
    @Override
    public int GetHungerRestored()
    {
    	// do not multiply the heal amount so that mushrooms only restore a bit of hunger
    	
    	return getHealAmount();
    }
}
