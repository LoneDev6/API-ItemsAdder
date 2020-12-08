package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CustomBlockBreakEvent extends PlayerEvent implements Cancellable
{
    public CustomBlockBreakEvent(Player player, Block block, Object internal)
    {
        super(player);
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public boolean isCancelled() {
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public void setCancelled(boolean cancelled) {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public HandlerList getHandlers() {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public static HandlerList getHandlerList() {
        throw new NotActuallyItemsAdderException();
    }

    public ItemStack getCustomBlockItem()
    {
        throw new NotActuallyItemsAdderException();
    }

    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    public Block getBlock()
    {
        throw new NotActuallyItemsAdderException();
    }
}