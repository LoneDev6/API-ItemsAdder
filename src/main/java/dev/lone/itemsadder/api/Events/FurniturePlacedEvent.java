package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called after placing the furniture.
 * Warning:
 * You should probably not use this event `FurniturePlacedEvent`.
 * If you need to cancel furniture placement you should instead listen to `FurniturePrePlaceEvent` event.
 * Using this event `FurniturePlacedEvent` just to cancel the placement of the furniture is CPU consuming.
 */
public class FurniturePlacedEvent extends FurnitureEvent implements Cancellable
{
    /**
     * Constructs a new FurnitureEvent.
     *
     * @param who The player who triggered the event.
     * @throws NotActuallyItemsAdderException Always thrown to indicate this is a placeholder.
     */
    public FurniturePlacedEvent(@NotNull Player who)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public boolean isCancelled()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Warning:
     * You should probably not use this event `FurniturePlacedEvent`.
     * If you need to cancel furniture placement you should instead listen to `FurniturePrePlaceEvent` event.
     * Using this event `FurniturePlacedEvent` just to cancel the placement of the furniture is CPU consuming.
     */
    @Override
    public void setCancelled(boolean cancelled)
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