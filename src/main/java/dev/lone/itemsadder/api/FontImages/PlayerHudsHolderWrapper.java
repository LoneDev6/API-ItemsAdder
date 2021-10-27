package dev.lone.itemsadder.api.FontImages;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

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
    @Nullable
    public Object getInternal()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if the player HUDs holder is correctly registered in ItemsAdder.
     */
    public boolean exists()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get owner of this holder.
     *
     * @return Owner of this holder.
     */
    public Player getPlayer()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Force the recalculation the offsets if you have shown a new HUD, added/removed new font images
     * to a {@link PlayerCustomHudWrapper} HUD.
     */
    public void recalculateOffsets()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Forces the HUDs rendering packet to be sent to the player, this is useful if you have high frequency HUDs.
     * Be careful sending this too fast, it may use a lot of bandwidth if you abuse it.
     */
    public void sendUpdate()
    {
        throw new NotActuallyItemsAdderException();
    }
}
