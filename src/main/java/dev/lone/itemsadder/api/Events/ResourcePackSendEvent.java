package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Event triggered when the server sends a resourcepack to the client.
 * This event includes url, hash and also contains info if it's an ItemsAdder resourcepack or another plugin resourcepack.
 */
public class ResourcePackSendEvent extends PlayerEvent
{
    public ResourcePackSendEvent(Player player, String url, String hash, boolean isItemsAdderPack)
    {
        super(player);
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

    public String getUrl()
    {
        throw new NotActuallyItemsAdderException();
    }

    public String getHash()
    {
        throw new NotActuallyItemsAdderException();
    }

    public boolean isItemsAdderPack()
    {
        throw new NotActuallyItemsAdderException();
    }
}