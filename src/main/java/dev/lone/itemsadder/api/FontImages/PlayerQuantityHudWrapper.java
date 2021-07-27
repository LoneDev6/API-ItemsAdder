package dev.lone.itemsadder.api.FontImages;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;

/**
 * Class representing a HUD which accepts float values and its textures are handled by ItemsAdder.
 */
public class PlayerQuantityHudWrapper extends PlayerHudWrapper
{
    public PlayerQuantityHudWrapper(PlayerHudsHolderWrapper playerHUDsHolderWrapper, String namespacedID)
    {
        super(playerHUDsHolderWrapper, namespacedID);
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
     * Set the float value of this HUD.
     *
     * @param value
     *        Float value to set.
     */
    public void setFloatValue(float value)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the float value of this HUD.
     * @return The float value of this hud.
     */
    public float getFloatValue()
    {
        throw new NotActuallyItemsAdderException();
    }
}
