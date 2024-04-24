package dev.lone.itemsadder.api;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Class representing a custom block in ItemsAdder.
 */
public class CustomBlock extends CustomStack
{
    /**
     * Returns a list of all the registered blocks identifiers in the format {@code namespace:id}
     * @return a list of Namespaces and IDs in the format {@code namespace:id}
     */
    public static Set<String> getNamespacedIdsInRegistry()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns true if the registry contains a block with the specified namespaced id in the format {@code namespace:id}
     * @param namespacedId Namespace and ID in the format {@code namespace:id}
     * @return true if it contains the namespaced id, otherwise false
     */
    public static boolean isInRegistry(String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

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
     * Play the block break particles and sound for this custom block.
     * @return true if the effect was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public boolean playBreakEffect()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play the block break particles and sound for this custom block.
     * @param bukkitBlock the location of which block you want to play break effect of.
     * @return true if the effect was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public static boolean playBreakEffect(Block bukkitBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play the block break sound for this custom block.
     * @return true if the sound was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public boolean playBreakSound()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play the block break sound for this custom block.
     * @param bukkitBlock the location of which block you want to play break sound of.
     * @return true if the effect was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public static boolean playBreakSound(Block bukkitBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play the block break particles for this custom block.
     * @return true if the effect was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public boolean playBreakParticles()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play the block break particles for this custom block.
     * @param bukkitBlock the location of which block you want to play break particles of.
     * @return true if the effect was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public static boolean playBreakParticles(Block bukkitBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play the block place particles for this custom block.
     * @return true if the effect was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public boolean playPlaceSound()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play the block place particles for this custom block.
     * @param bukkitBlock the location of which block you want to play place particles of.
     * @return true if the effect was played successfully because the bukkitBlock is a custom block, otherwise false.
     */
    public static boolean playPlaceSound(Block bukkitBlock)
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
     * @deprecated This method name is misleading.
     * <p> Use {@link CustomBlock#getBaseBlockData()} instead.
     */
    @Deprecated
    @Nullable
    public BlockData generateBlockData()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the base BlockData for this CustomBlock.
     * It doesn't get the current placed block BlockData but the BlockData used to show the custom block in-game.
     * <p>
     * Warning: TILE CustomBlocks (Spawners) will return null. For now there is no way to obtain this data with this API.
     *
     * @return the base BlockData for this CustomBlock.
     */
    @Nullable
    public BlockData getBaseBlockData()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the base BlockData for this CustomBlock.
     * It doesn't get the current placed block BlockData but the BlockData used to show the custom block in-game.
     *
     * Warning: TILE CustomBlocks (Spawners) will return null. For now there is no way to obtain this data with this API.
     *
     * @param namespacedID the Namespace and ID in the format {@code namespace:id} of the block to get base BlockData of.
     * @return the base BlockData for this CustomBlock.
     */
    @Nullable
    public static BlockData getBaseBlockData(String namespacedID)
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
    public List<ItemStack> getLoot(@Nullable ItemStack tool, boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns a list of ItemStack instances to drop as loot for this CustomBlock.
     *
     * @param bukkitBlock      The Bukkit Block to get the loots from.
     * @param tool             The Item required to get the loot for the CustomBlock.
     * @param includeSelfBlock If the CustomBlock itself should be included in the list.
     * @return List containing ItemStack instances for the loot.
     */
    public static List<ItemStack> getLoot(Block bukkitBlock, @Nullable ItemStack tool, boolean includeSelfBlock)
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

    /**
     * This class contains advanced static methods to perform various uncommon tasks, for example read/write directly
     * into the ItemsAdder CustomBlocks region files.
     *
     * Use them only if you know what you're doing.
     */
    public static class Advanced
    {
        /**
         * Gets the Namespace and ID in the format {@code namespace:id} of the placed CustomBlock in a specific location.
         *
         * @param location the location to check
         * @return the Namespace and ID in the format {@code namespace:id} or null if it's not a CustomBlock.
         */
        @Nullable
        public static String getInCustomRegion(Location location)
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Saves a block into the ItemsAdder custom region file.
         *
         * @param customBlock the CustomBlock to place.
         * @param location    the location where the block must be placed.
         */
        public static void placeInCustomRegion(@NotNull CustomBlock customBlock, Location location)
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Saves a block into the ItemsAdder custom region file.
         *
         * @param namespacedId the Namespace and ID in the format {@code namespace:id} of the CustomBlock to be placed.
         * @param location     the location where the block must be placed.
         * @return true if the namespacedId is a registered CustomBlock, otherwise false.
         */
        public static boolean placeInCustomRegion(String namespacedId, Location location)
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Remove a CustomBlock from the custom region file.
         *
         * @param location the location of the block to remove.
         * @return true if the block was removed because it was actually a CustomBlock, otherwise false in case
         * the block wasn't custom (wasn't in the custom region file).
         */
        public static boolean removeFromCustomRegion(Location location)
        {
            throw new NotActuallyItemsAdderException();
        }

        public static void deleteAllCustomBlocksInChunk(Chunk chunk)
        {
            throw new NotActuallyItemsAdderException();
        }

        public static void deleteAllCustomBlocksInChunk(Chunk chunk, boolean removeVanillaBlock, boolean sendChunkPacket)
        {
            throw new NotActuallyItemsAdderException();
        }

        @Nullable
        public static List<Location> getAllBlocksLocationsList(Chunk chunk)
        {
            throw new NotActuallyItemsAdderException();
        }

        @Nullable
        public static Map<Location, String> getAllBlocksLocations(Chunk chunk)
        {
            throw new NotActuallyItemsAdderException();
        }

        public static void runActionOnBlocks(Chunk chunk, BiConsumer<String, Location> action)
        {
            throw new NotActuallyItemsAdderException();
        }
    }
}
