package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerEmoteEndEvent extends PlayerEvent
{
    public PlayerEmoteEndEvent(@NotNull Player who)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    public String getEmoteName()
    {
        throw new NotActuallyItemsAdderException();
    }

    public Cause getCause()
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }

    public enum Cause
    {
        STOP,
        FINISHED
    }
}
