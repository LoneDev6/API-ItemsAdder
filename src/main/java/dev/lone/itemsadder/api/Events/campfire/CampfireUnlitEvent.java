package dev.lone.itemsadder.api.Events.campfire;

import org.bukkit.block.Campfire;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class CampfireUnlitEvent extends Event implements Cancellable
{
    private static final HandlerList HANDLERS = new HandlerList();

    boolean isCancelled;
    final Campfire campfire;
    final Player player;

    public CampfireUnlitEvent(@NotNull Campfire campfire,
                              @NotNull Player player)
    {
        this.campfire = campfire;
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

    public Campfire getCampfire()
    {
        return campfire;
    }

    public Player getPlayer()
    {
        return player;
    }
}