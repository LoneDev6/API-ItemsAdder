package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when ItemsAdder has finished compressing the resourcepack.
 */
public class ItemsAdderPackCompressedEvent extends Event
{
    public ItemsAdderPackCompressedEvent()
    {
        super(true);
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }
}