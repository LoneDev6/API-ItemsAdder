package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Please use the {@link ItemsAdderLoadDataEvent} to know if ItemsAdder is ready.
 * <br>This event may still work, but could be removed in the future.
 */
@Deprecated
public class ItemsAdderFirstLoadEvent extends Event
{
    public ItemsAdderFirstLoadEvent()
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

    public String getMessage()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setMessage(String message)
    {
        throw new NotActuallyItemsAdderException();
    }
}