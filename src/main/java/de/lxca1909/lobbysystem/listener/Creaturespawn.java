package de.lxca1909.lobbysystem.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Creaturespawn implements Listener {

    @EventHandler
    public void on(CreatureSpawnEvent e){
        if(!(e.getSpawnReason() == CreatureSpawnEvent.SpawnReason.DISPENSE_EGG) || !(e.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG)){
            e.setCancelled(true);
        }
    }
}
