package de.lxca1909.lobbysystem.listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class MoreListeners implements Listener {

    @EventHandler
    public void on(PlayerInteractEvent e){
        if(e.getClickedBlock().getType() == Material.WHEAT || e.getClickedBlock().getType() == Material.OAK_TRAPDOOR){
            e.setCancelled(true);
        }
    }
}
