package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Class representing a custom block in ItemsAdder.
 */
public class CustomBlock extends CustomStack
{
    /**
     * Gets a CustomBlock instance through the provided namespace and ID.
     * <br>This may return null if the provided namespace and ID are invalid.
     *
     * @param namespacedID Namespace and ID in the format {@code namespace:id}
     * @return Possibly-null CustomBlock instance.
     */
    @Nullable
    public static CustomBlock getInstance(String namespacedID)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a CustomBlock instance through the provided Bukkit ItemStack.
     * <br>This may return null if the provided Bukkit ItemStack is not associated with any CustomBlock.
     *
     * @param itemStack The Bukkit ItemStack to get the CustomBlock instance from.
     * @return Possibly-null CustomBlock instance.
     */
    @Nullable
    public static CustomBlock byItemStack(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Places a CustomBlock provided through the namespace and ID at the provided location and returns the CustomBlock
     * instance for it.
     * <br>This may return null if the provided namespace and ID are invalid.
     *
     * @param namespacedId Namespace and ID in the format {@code namespace:id}
     * @param location     The location to place the CustomBlock at.
     * @return Possibly-null CustomBlock instance.
     */
    @Nullable
    public static CustomBlock place(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Places a CustomBlock through the provided location and returns a CustomBlock instance for it.
     *
     * @param location The location to place the CustomBlock at.
     * @return CustomBlock instance from the location.
     */
    public CustomBlock place(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a CustomBlock instance through the provided Bukkit Block.
     * <br>This may return null if the provided Block is not associated with a CustomBlock.
     *
     * @param block The Bukkit Block to get the CustomBlock from.
     * @return Possibly-null CustomBlock instance.
     */
    @Nullable
    public static CustomBlock byAlreadyPlaced(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether removing this CustomBlock was successful or not.
     * <br>A removal is successful if the Block associated with this CustomBlock exists.
     *
     * @return true if the CustomBlock could be removed, otherwise false.
     */
    public boolean remove()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether removing the CustomBlock at the provided location was successful or not.
     * <br>A removal is successful if the Block at the provided location is an actual CustomBlock.
     *
     * @param location The location to remove the CustomBlock from.
     * @return true if the CustomBlock could be removed, otherwise false.
     */
    public static boolean remove(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Generates and returns BlockData associated with this CustomBlock.
     *
     * @return BlockData associated with the CustomBlock.
     */
    public BlockData generateBlockData()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit Block associated with this CustomBlock.
     *
     * @return Bukkit Block associated with the CustomBlock.
     */
    public Block getBlock()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether this CustomBlock is placed in the world.
     *
     * @return true if the CustomBlock was placed in the world, otherwise false.
     */
    public boolean isPlaced()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns a list of ItemStack instances to drop as loot for this CustomBlock.
     *
     * @param includeSelfBlock If the CustomBlock itself should be included in the list.
     * @return List containing ItemStack instances for the loot.
     */
    public List<ItemStack> getLoot(boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns a list of ItemStack instances to drop as loot for this CustomBlock.
     *
     * @return List containing ItemStack instances for the loot.
     */
    public List<ItemStack> getLoot()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns a list of ItemStack instances to drop as loot for this CustomBlock.
     *
     * @param tool             The Item required to get the loot for the CustomBlock.
     * @param includeSelfBlock If the CustomBlock itself should be included in the list.
     * @return List containing ItemStack instances for the loot.
     */
    public List<ItemStack> getLoot(ItemStack tool, boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns the original light level of this CustomBlock.
     *
     * @return Integer representing the original light level of the CustomBlock.
     */
    public int getOriginalLightLevel()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the current light level for this CustomBlock.
     *
     * @param level The light level to set for this CustomBlock.
     */
    public void setCurrentLightLevel(int level)
    {
        throw new NotActuallyItemsAdderException();
    }
}
