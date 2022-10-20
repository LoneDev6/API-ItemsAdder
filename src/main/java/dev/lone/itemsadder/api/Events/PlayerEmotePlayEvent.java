package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerEmotePlayEvent extends PlayerEvent implements Cancellable
{
    public PlayerEmotePlayEvent(@NotNull Player who, @NotNull String emoteName)
    {
        super(who);
        throw new NotActuallyItemsAdderException();
    }

    public String getEmoteName()
    {
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

    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }
}
