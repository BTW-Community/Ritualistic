package net.minecraft.src;

public class RitualisticDefs {
	static public final int m_iMoonShroomHungerHealed = 1;
	static public final float m_fMoonShroomSaturationModifier = 0F;
	static public final String m_sMoonShroomItemName = "Moon Shroom";
	
	//assign ID number
	private static int
		id_MoonShroom = 4040;
		//end 4096
	private static int
		id_ItemMoonShroom = 31000;
		//end 31000
			
	//add block
	public static Block MoonShroom;
	//add item
	public static Item ItemMoonShroom;
	
	//definitions
	public static void addDefinitions() {
		Block MoonShroom = (Block)(new RitualisticBlockMoonShroom(id_MoonShroom));
		Item.itemsList[MoonShroom.blockID] = new ItemBlock(MoonShroom.blockID - 256);
		
		ItemMoonShroom = new RitualisticItemMoonShroom(id_ItemMoonShroom, m_iMoonShroomHungerHealed, m_fMoonShroomSaturationModifier, null, id_MoonShroom);
		
	}
}
