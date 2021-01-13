package dev.lone.itemsadder.api;

import dev.lone.itemsadder.api.Events.CustomEntityDeathEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.ItemMeta;

class Examples
{
    @EventHandler
    void test(CustomEntityDeathEvent e)
    {
        System.out.println(e.getKiller().getName() + " killed " + e.getNamespacedID());

        Player player = (Player)e.getKiller();
        CustomStack customStack = CustomStack.byItemStack(player.getItemInHand());
        if(customStack == null)
        {
            System.out.println("killed using: " + player.getItemInHand().getType() + " (non custom item)");
            return;
        }

        System.out.println("killed using: " + customStack.getNamespacedID());
        System.out.println("       model_path:    " + customStack.getModelPath());
        System.out.println("       config_path:   " + customStack.getConfigPath());
        System.out.println("       attack_damage: " + customStack.getDamageMainhand());

        ItemMeta meta = customStack.getItemStack().getItemMeta();
        meta.setDisplayName("TEST");
        customStack.getItemStack().setItemMeta(meta);
    }

    @EventHandler
    void test(PlayerInteractEvent e)
    {
        if(e.getAction() != Action.RIGHT_CLICK_BLOCK || e.getHand() == EquipmentSlot.OFF_HAND)
            return;

        CustomBlock customBlock = CustomBlock.place("ruby_ore", e.getClickedBlock().getLocation().add(1, 0, 1));
        customBlock.setCurrentLightLevel(15);

        System.out.println(customBlock.getLoot());

        CustomCrop customCrop = CustomCrop.place("tomato_seeds", e.getClickedBlock().getLocation().add(0, 1, 0));
        customCrop.setFullyGrown();

        System.out.println(customCrop.getSeed().getItemStack());

        ItemsAdder.playTotemAnimation(e.getPlayer(), "bruh");

        CustomMob customMob = CustomMob.spawn("soul", e.getClickedBlock().getLocation().add(0, 1, 0));
        System.out.println("Spawned mob: " + customMob.getName());
    }

    @EventHandler
    void interact(PlayerInteractEvent e)
    {
        if(e.getHand() == EquipmentSlot.OFF_HAND)
            return;

        CustomCrop crop = CustomCrop.byAlreadyPlaced(e.getClickedBlock());
        if(crop == null)
        {
            System.out.println("Not a crop");
            return;
        }

        System.out.println(crop.getSeed().getNamespacedID());
    }

    @EventHandler
    void interact(PlayerInteractAtEntityEvent e)
    {
        if(e.getHand() == EquipmentSlot.OFF_HAND)
            return;

        CustomMob customMob = CustomMob.byAlreadySpawned(e.getRightClicked());
        if(customMob == null)
        {
            System.out.println("Not a custom mob");
            return;
        }

        System.out.println(customMob.getNamespacedID());
    }
}
