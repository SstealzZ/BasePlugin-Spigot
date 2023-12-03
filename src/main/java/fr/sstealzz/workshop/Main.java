package fr.sstealzz.workshop;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{

	@Override
    public void onEnable() {
		getLogger().info("TestProject is enable!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TestProject is disable!");
    }
	
}
