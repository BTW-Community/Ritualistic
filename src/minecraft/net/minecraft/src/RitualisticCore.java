package net.minecraft.src;

public class RitualisticCore extends AddonExt{
	/* 
	   	public static SocksCropsMod getInstance() {
		if (instance == null) {
			instance = new SocksCropsMod();
		}

		return instance;
		}
	 */
	public static RitualisticDefs ritualisticDefs;
	public static RitualisticRecipes ritualisticRecipes;
	
	public RitualisticCore() {
		super("Ritualistic", "1.0", "");
	}

	@Override
	public void Initialize() {
		{
			FCAddOnHandler.LogMessage("Ritualistic Addon Initializing...");
			
			ritualisticDefs = RitualisticDefs.instance;
			ritualisticRecipes = RitualisticRecipes.instance;
			
			
		}
	
	}

}



/*	Instancing the addon
 * 
 * private static SocksCropsMod instance;
 * 
 * 	public static SocksCropsMod getInstance() {
		if (instance == null) {
			instance = new SocksCropsMod();
		}

		return instance;
	}
 */

/* Get instance
 * 	public static SocksCropsMod getInstance() {
		if (instance == null) {
			instance = new SocksCropsMod();
		}

		return instance;
	}
 */

/* Language File
 * public String GetLanguageFilePrefix()
	{
		return "SocksCrops";
	}
 * 
 */
