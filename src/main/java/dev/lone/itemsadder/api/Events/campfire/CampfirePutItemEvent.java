package dev.lone.itemsadder.api.Events.campfire;

import org.bukkit.block.Campfire;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class CampfirePutItemEvent extends Event implements Cancellable
{
    private static final HandlerList HANDLERS = new HandlerList();

    boolean isCancelled;
    final Player player;
    ItemStack item;
    Campfire campfire;

    public CampfirePutItemEvent(@NotNull Campfire campfire,
                                @NotNull ItemStack item,
                                @NotNull Player player)
    {
        this.campfire = campfire;
        this.item = item;
        this.player = player;
    }

    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled()
    {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean b)
    {
        this.isCancelled = b;
    }

    public static HandlerList getHandlerList()
    {
        return HANDLERS;
    }

    public Player getPlayer()
    {
        return player;
    }

    public ItemStack getItem()
    {
        return item;
    }

    public void setItem(ItemStack item)
    {
        this.item = item;
    }

    public Campfire getCampfire()
    {
        return campfire;
    }
}