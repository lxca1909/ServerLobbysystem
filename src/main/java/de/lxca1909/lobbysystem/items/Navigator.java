package de.lxca1909.lobbysystem.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Navigator implements Listener {

    @EventHandler
    public void on(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(e.getItem() == null)return;
        if(e.getItem().getType() == Material.COMPASS){
            Inventory inv = Bukkit.createInventory(null, 3*9, "§2Navigator");

            ItemStack Spawn0 = new ItemStack(Material.NETHER_STAR);
            ItemMeta s0meta = Spawn0.getItemMeta();
            s0meta.setDisplayName("§eSpawn");
            Spawn0.setItemMeta(s0meta);

            ItemStack Spawn1 = new ItemStack(Material.RED_BED);
            ItemMeta s1meta = Spawn1.getItemMeta();
            s1meta.setDisplayName("§cBedwars");
            Spawn1.setItemMeta(s1meta);

            ItemStack Spawn2 = new ItemStack(Material.LEATHER_BOOTS);
            ItemMeta s2meta = Spawn2.getItemMeta();
            s2meta.setDisplayName("§aSkywars");
            Spawn2.setItemMeta(s2meta);

            ItemStack bg = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemMeta bgmeta = bg.getItemMeta();
            bgmeta.setDisplayName(null);
            bg.setItemMeta(bgmeta);

            inv.setItem(0, bg);
            inv.setItem(1, bg);
            inv.setItem(2, bg);
            inv.setItem(3, bg);
            inv.setItem(4, bg);
            inv.setItem(5, bg);
            inv.setItem(6, bg);
            inv.setItem(7, bg);
            inv.setItem(8, bg);
            inv.setItem(9, bg);
            inv.setItem(10, bg);
            inv.setItem(11, Spawn0);
            inv.setItem(12, bg);
            inv.setItem(13, Spawn1);
            inv.setItem(14, bg);
            inv.setItem(15, Spawn2);
            inv.setItem(16, bg);
            inv.setItem(17, bg);
            inv.setItem(18, bg);
            inv.setItem(19, bg);
            inv.setItem(20, bg);
            inv.setItem(21, bg);
            inv.setItem(22, bg);
            inv.setItem(23, bg);
            inv.setItem(24, bg);
            inv.setItem(25, bg);
            inv.setItem(26, bg);



        }
    }
}