package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Async event called when ItemsAdder has finished loading all its stuff.
 */
public class ItemsAdderLoadDataEvent extends Event
{
    public ItemsAdderLoadDataEvent(boolean isReload)
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }

    public static HandlerList getHandlerList()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Cause of this load event.
     *
     * @return The cause of this load event.
     */
    public Cause getCause()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Reason why {@link ItemsAdderLoadDataEvent} event was called
     */
    public enum Cause
    {
        FIRST_LOAD,
        RELOAD
    }
}