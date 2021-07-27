package dev.lone.itemsadder.api.FontImages;


import dev.lone.itemsadder.api.NotActuallyItemsAdderException;

import java.util.List;

/**
 * Class representing a container for the custom HUD of a particular player. Its textures are handled by the developer
 * which is making use of this class.
 */
public class PlayerCustomHudWrapper extends PlayerQuantityHudWrapper
{
    /**
     *
     * @param playerHUDsHolderWrapper
     *        Object which holds all HUDs of a player.
     *
     * @param namespacedID
     *        Namespace and ID in the format {@code namespace:id} of the HUD.
     */
    public PlayerCustomHudWrapper(PlayerHudsHolderWrapper playerHUDsHolderWrapper, String namespacedID)
    {
        super(playerHUDsHolderWrapper, namespacedID);
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Removes all the font_imaged from this HUD and sends the change to the client.
     */
    public void clearFontImagesAndRefresh()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Set font images of this HUD overwriting the current ones.
     *
     * @param fontImageWrappers
     *        Font images to be set to this HUD overwriting the current ones.
     */
    public void setFontImages(List<FontImageWrapper> fontImageWrappers)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Remove a font_image from this HUD at a particular index.
     *
     * @param index
     *        Index of the font_image.
     */
    public void removeFontImageByIndex(int index)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Adds a font_image to this HUD at a particular index.
     *
     * @param fontImageWrapper
     *        The font_image to add.
     *
     * @param index
     *        Index of where to add the font_image.
     */
    public void addFontImageToIndex(FontImageWrapper fontImageWrapper, int index)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Add a font_image at the end of this HUD.
     *
     * @param fontImageWrapper
     *        The font_image to add.
     */
    public void addFontImage(FontImageWrapper fontImageWrapper)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get total amount of font images in this HUD.
     *
     * @return Total amount of font images in this HUD.
     */
    public int getFontImagesCount()
    {
        throw new NotActuallyItemsAdderException();
    }
}
