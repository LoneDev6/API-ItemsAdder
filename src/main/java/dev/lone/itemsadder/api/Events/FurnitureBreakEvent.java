package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when a player breaks a furniture item.
 */
public class FurnitureBreakEvent extends FurnitureEvent implements Cancellable
{
    /**
     * Constructor of the event
     *
     * @param who Player who is breaking the item.
     */
    public FurnitureBreakEvent(@NotNull Player who)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins.
     *
     * @return true if this event is cancelled
     */
    @Override
    public boolean isCancelled()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins.
     *
     * @param cancelled true if you wish to cancel this event
     */
    @Override
    public void setCancelled(boolean cancelled)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the handler list of this event.
     *
     * @return Handler list of this event.
     */
    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Static utility method to get the handler list of this event.
     *
     * @return Handler list of this event.
     */
    @NotNull
    public static HandlerList getHandlerList()
    {
        throw new NotActuallyItemsAdderException();
    }
}