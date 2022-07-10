package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FurniturePlaceEvent extends PlayerEvent implements Cancellable
{
    public FurniturePlaceEvent(@NotNull Player who)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public boolean isCancelled()
    {
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public void setCancelled(boolean cancelled)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public static HandlerList getHandlerList()
    {
        throw new NotActuallyItemsAdderException();
    }
}