package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class FurnitureInteractEvent extends FurnitureEvent
{
    public FurnitureInteractEvent(@NotNull Player who)
    {
        super(who);
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