package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CustomFire extends CustomStack
{
    @Nullable
    public static CustomFire getInstance(String namespacedID)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public static CustomFire byItemStack(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Places a CustomFire at the provided location and return the CustomFire instance for it.
     * <br>May return null if the Namespace and ID are invalid.
     *
     * @param namespacedId Namespace and ID in the format {@code namespace:id}
     * @param location          The location to place the CustomFire at.
     * @return Possibly-null CustomFire instance.
     */
    @Nullable
    public static CustomFire place(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a CustomFire instance through the provided block.
     * <br>This may return null if the provided block is not a CustomFire.
     *
     * @param block The block to get a CustomFire instance from.
     * @return Possibly-null CustomFire instance.
     */
    @Nullable
    public static CustomFire byAlreadyPlaced(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether removing the CustomFire at the provided location was successful or not.
     * <br>A removal is successful if the Block at the provided location is an actual CustomFire.
     *
     * @param location The location to remove the CustomFire from.
     * @return true if the CustomFire could be removed, otherwise false.
     */
    public static boolean remove(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the current age of this CustomFire.
     *
     * @return Integer representing the current age of the CustomFire.
     */
    public static int getAge(@NotNull Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the age of this CustomFire to the provided one.
     *
     * @param age the age to set for this CustomFire.
     */
    public static void setAge(@NotNull Block block, int age)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public Location getLocation()
    {
        throw new NotActuallyItemsAdderException();
    }

    public boolean isPlaced()
    {
        throw new NotActuallyItemsAdderException();
    }

    public CustomFire place(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    public boolean remove()
    {
        throw new NotActuallyItemsAdderException();
    }

    public int getAge()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setAge(int age)
    {
        throw new NotActuallyItemsAdderException();
    }
}
