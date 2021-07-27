package dev.lone.itemsadder.api.FontImages;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;

/**
 * Class representing a container which holds all HUDs of a player.
 */
public class PlayerHudsHolderWrapper
{
    public PlayerHudsHolderWrapper(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the internal ItemsAdder object. Should only be used by the plugin developer.
     */
    public Object getInternal()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get owner of this holder.
     * @return Owner of this holder.
     */
    public Player getPlayer()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Force the recalculation the offsets if you shown a new HUD, added/removed new font images to a {@link PlayerCustomHudWrapper} HUD.
     */
    public void recalculateOffsets()
    {
        throw new NotActuallyItemsAdderException();
    }
}
