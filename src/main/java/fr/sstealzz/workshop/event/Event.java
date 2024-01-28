package fr.sstealzz.workshop.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Event implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("§a" + event.getPlayer().getName() + " a rejoint le serveur !");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage("§c" + event.getPlayer().getName() + " a quitté le serveur !");
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event) {
        // Gestion du click droit avec le coffre
    }

    private void openInventory(Player player) {
        // Création de l'inventaire
    }

}
