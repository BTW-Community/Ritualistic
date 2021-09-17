package net.minecraft.src;

public class RitualisticCore extends FCAddOn{
	private static RitualisticCore instance;

	public RitualisticCore() {
		super("Ritualistic", "1.0.0", "Ritualistic");
	}

	public static RitualisticCore getInstance() {
		if (instance == null) {
			instance = new RitualisticCore();
		}

		return instance;
	}

	@Override
	public void Initialize() {
		FCAddOnHandler.LogMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
		RitualisticDefs.addDefinitions();
		RitualisticRecipes.addRecipes();
		FCAddOnHandler.LogMessage(this.getName() + " Initialized");
	}

	public String GetLanguageFilePrefix()
	{
		return "Ritualistic";
	}
} 