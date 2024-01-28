package fr.sstealzz.workshop;

import org.bukkit.plugin.java.JavaPlugin;

import fr.sstealzz.workshop.event.Event;


public class Main extends JavaPlugin{

	@Override
    public void onEnable() {
		getLogger().info("TestProject is enable!");
    getServer().getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("TestProject is disable!");
    }
	
}
