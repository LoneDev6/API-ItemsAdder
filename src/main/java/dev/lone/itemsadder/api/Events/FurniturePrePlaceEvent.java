package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called before placing, to avoid useless processing.
 * Exposes the `namespacedId` and `location` of the entity for checking.
 */
public class FurniturePrePlaceEvent extends PlayerEvent implements Cancellable
{
    public FurniturePrePlaceEvent(@NotNull Player who)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins
     *
     * @return true if this event is cancelled
     */
    @Override
    public boolean isCancelled()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins
     *
     * @param cancelled true if you wish to cancel this event
     */
    @Override
    public void setCancelled(boolean cancelled)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the namespaced ID of the item that the player is trying to place.
     *
     * @return Namespaced ID of the item.
     */
    @Nullable
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the location where the entity would be placed.
     *
     * @return Location where the entity would be placed.
     */
    public Location getLocation()
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