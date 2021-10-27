package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.jetbrains.annotations.Nullable;

/**
 * Class representing a custom crop in ItemsAdder.
 */
public class CustomCrop
{
    /**
     * Places a CustomCrop at the provided location and return the CustomCrop instance for it.
     * <br>May return null if the Namespace and ID are invalid.
     *
     * @param seed_namespacedId Namespace and ID in the format {@code namespace:id}
     * @param location          The location to place the CustomCrop at.
     * @return Possibly-null CustomCrop instance.
     */
    @Nullable
    public static CustomCrop place(String seed_namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a CustomCrop instance through the provided block.
     * <br>This may return null if the provided block is not a CustomCrop.
     *
     * @param block The block to get a CustomCrop instance from.
     * @return Possibly-null CustomCrop instance.
     */
    @Nullable
    public static CustomCrop byAlreadyPlaced(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a {@link CustomStack} instance of the Seeds associated with this CustomCrop.
     *
     * @return {@link CustomStack} representing the seeds for this CustomCrop.
     */
    public CustomStack getSeed()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the current age of this CustomCrop.
     *
     * @return Integer representing the current age of the CustomCrop.
     */
    public int getAge()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the age of this CustomCrop to the provided one.
     *
     * @param age the age to set for this CustomCrop.
     */
    public void setAge(int age)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether this CustomCrop is fully grown or not.
     *
     * @return true if the CustomCrop is fully grown, otherwise false.
     */
    public boolean isFullyGrown()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the maximum age of this CustomCrop.
     *
     * @return Integer representing the maximum age of the CustomCrop.
     */
    public int getMaxAge()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the growth-stage of this CustomCrop to fully grown.
     */
    public void setFullyGrown()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Increments the current age of this CustomCrop by one.
     */
    public void incrementAge()
    {
        throw new NotActuallyItemsAdderException();
    }
}
