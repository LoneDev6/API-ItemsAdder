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

    /**
     * Get url of the sent resourcepack.
     *
     * @return URL of the sent resourcepack.
     */
    public String getUrl()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get hash of the sent resourcepack.
     *
     * @return Hash of the sent resourcepack.
     */
    public String getHash()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get if it's the ItemsAdder resourcepack or another plugin tried to set its own resourcepack.
     * @return True if it's the ItemsAdder resourcepack. False if another plugin tried to set its own resourcepack.
     */
    public boolean isItemsAdderPack()
    {
        throw new NotActuallyItemsAdderException();
    }
}