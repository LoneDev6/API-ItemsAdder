package dev.lone.itemsadder.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class ItemsAdder
{
    /**
     * Please listen to {@link dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent} event instead.
     */
    @Deprecated
    public static boolean areItemsLoaded()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack#byItemStack(ItemStack)} {@code != null} instead.
     */
    @Deprecated
    public static boolean isCustomItem(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack#getInstance(String)} {@code != null} instead.
     */
    @Deprecated
    public static boolean isCustomItem(String customItemName)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack#getInstance(String)} instead.
     */
    @Deprecated
    public static ItemStack getCustomItem(String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomBlock#place(Location)} instead.
     */
    @Deprecated
    public static void placeCustomBlock(Location location, ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomBlock} instead.
     */
    @Deprecated
    public static void removeCustomBlock(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please don't use this method anymore, it's not reliable as blocks are not only mushrooms.
     * <p>
     * Get a custom block based on the {@link BlockFace} values.
     *
     * @param material
     * @param blockFaces
     * @return
     */
    @Deprecated
    public static ItemStack getCustomBlockByFaces(Material material, HashMap<BlockFace, Boolean> blockFaces)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomBlock} instead.
     */
    @Deprecated
    public static boolean isCustomBlock(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomBlock} instead.
     */
    @Deprecated
    public static List<ItemStack> getCustomBlockLoot(Block block, boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomBlock} instead.
     */
    @Deprecated
    public static List<ItemStack> getCustomBlockLoot(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomBlock} instead.
     */
    @Deprecated
    public static List<ItemStack> getCustomBlockLoot(Block block, ItemStack tool, boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomCrop} instead.
     */
    @Deprecated
    public static void placeCustomCrop(Location location, ItemStack seed)//TODO: not tested
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomCrop} instead.
     */
    @Deprecated
    public static boolean isCustomCrop(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomCrop} instead.
     */
    @Deprecated
    public static String getCustomSeedNameFromCrop(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomBlock} instead.
     * <p>
     * Gets a CustomBlock instance through the provided Bukkit Block.
     * <br>This may return null if the provided Block is not associated with a CustomBlock.
     *
     * @param block The Bukkit Block to get the CustomBlock from.
     * @return Possibly-null CustomBlock instance.
     */
    @Deprecated
    public static ItemStack getCustomBlock(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Returns whether the namespace and id of the provided CustomStack match the one of this CustomStack.
     *
     * @param itemStack      The CustomStack to check the namespace and id against.
     * @param customItemName The CustomStack ID in the format {@code namespace:id} to check the item namespaced ID against.
     * @return true if namespace and id match, otherwise false.
     */
    @Deprecated
    public static boolean matchCustomItemName(ItemStack itemStack, String customItemName)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomFurniture} instead.
     * <p>
     * Check if a Bukkit {@link Entity} is a custom furniture.
     *
     * @param entity The {@link Bukkit} entity.
     * @return true if it's a custom entity, false if not.
     */
    @Deprecated
    public static boolean isFurniture(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Gets the namespace and id of this CustomStack instance in the format {@code namespace:id}
     *
     * @param itemStack Custom item.
     * @return String representing namespace and id of the custom item.
     */
    @Deprecated
    public static String getCustomItemName(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Get custom usages of a custom item. (Usages is a special property of this plugin. It's not a Vanilla attribute)
     *
     * @param itemStack Custom item.
     * @return Custom durability of a custom item.
     */
    @Deprecated
    public static int getCustomItemUsages(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Set the custom durability of a custom item.
     *
     * @param item       Custom item.
     * @param durability Durability to set.
     * @return The modified ItemStack.
     */
    @Deprecated
    public static ItemStack setCustomItemDurability(ItemStack item, int durability)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Set the custom durability of a custom item.
     *
     * @param item       Custom item.
     * @param maxDurability Max durability to set.
     * @return The modified ItemStack.
     */
    @Deprecated
    public static ItemStack setCustomItemMaxDurability(ItemStack item, int maxDurability)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Get the custom durability of a custom item.
     *
     * @param itemStack Custom item.
     * @return Custom durability of a custom item.
     */
    @Deprecated
    public static int getCustomItemDurability(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Get the custom max durability of a custom item.
     *
     * @param itemStack Custom item.
     * @return Custom max durability of a custom item.
     */
    @Deprecated
    public static int getCustomItemMaxDurability(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get list of custom blocks IDs in the format {@code namespace:id} which contains the {@code searchStr} keyword.
     *
     * @param searchStr Keyword to search for.
     * @return Complete list of custom blocks IDs in the format {@code namespace:id}.
     */
    @Deprecated
    public static List<String> getNamespacedBlocksNamesInConfig(String searchStr)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get complete list of custom blocks IDs in the format {@code namespace:id}.
     *
     * @return Complete list of custom blocks IDs in the format {@code namespace:id}.
     */
    @Deprecated
    public static List<String> getNamespacedBlocksNamesInConfig()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Please use {@link CustomStack} instead.
     * <p>
     * Get the Bukkit {@link BlockData}
     *
     * @param customBlock The ItemStack of the custom block you want to get Bukkit {@link BlockData} of.
     * @param lightweight Unused property.
     * @return Bukkit {@link BlockData}
     */
    @Deprecated
    public static BlockData getCustomBlockBlockData(ItemStack customBlock, boolean lightweight)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play totem animation.
     * <br>Warning: Make sure to delay it using a bukkit runnable (1 tick should be ok)
     * if you call this after you close an inventory or sometimes animation won't show.
     *
     * @param player       The player to play the anomation towards.
     * @param namespacedId The ID in the format {@code namespace:id} to get the totem animation from.
     * @return true if successful, false when provided ID was invalid.
     */
    public static boolean playTotemAnimation(Player player, String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Place a custom liquid in the specified location.
     *
     * @param namespacedID The ID in the format {@code namespace:id} of the liquid you want to place.
     * @param location     Location of where you want to place the liquid
     */
    @Deprecated
    public static void setLiquid(String namespacedID, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the name of the liquid in this location.
     *
     * @param location Location you want to check.
     * @return null if no custom liquid is available in the location.
     */
    @Deprecated
    @Nullable
    public static String getLiquidName(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if a custom item has keep_on_death behaviour enabled.
     * @param itemStack the custom item
     * @return true if it has 'keep_on_death: true', false if not or if it's not a custom item
     */
    public static boolean hasKeepOnDeath(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if a custom item has keep_on_death behaviour enabled.
     * @param namespacedId Namespace and ID in the format {@code namespace:id} of the custom item
     * @return true if it has 'keep_on_death: true', false if not or if it's not a custom item
     */
    public static boolean hasKeepOnDeath(String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Applies the Resource pack set for ItemsAdder to the provided player.
     *
     * @param player The player to apply the resource pack to.
     */
    public static void applyResourcepack(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns all the registered items.
     *
     * @return null if ItemsAdder is not loaded completely, be sure to listen to ItemsAdderLoadDataEvent
     */
    public static List<CustomStack> getAllItems()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns all the registered items by a specific namespace.
     *
     * @return null if ItemsAdder is not loaded completely, be sure to listen to ItemsAdderLoadDataEvent
     */
    public static List<CustomStack> getAllItems(String namespace)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns all the registered items which use a specific Bukkit Material.
     *
     * @return null if ItemsAdder is not loaded completely, be sure to listen to ItemsAdderLoadDataEvent
     */
    public static List<CustomStack> getAllItems(Material material)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if a custom recipe is registered by ItemsAdder.
     * @param namespacedKey the recipe namespaced key.
     * @return true if it's an ItemsAdder recipe, false if not.
     */
    public static boolean isCustomRecipe(NamespacedKey namespacedKey)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if a custom recipe is registered by ItemsAdder.
     * @param namespacedKey the recipe Namespace and ID in the format {@code namespace:id}.
     * @return true if it's an ItemsAdder recipe, false if not.
     */
    public static boolean isCustomRecipe(String namespacedKey)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Retrieve the resourcepack direct download URL.
     *
     * @param appendHash append the hash to the URL or not.
     * @return returns the URL if is available, null if the resourcepack is still generating or the plugin still loading.
     */
    @Nullable
    public static String getPackUrl(boolean appendHash)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Advanced stuff, better not touch it.
     */
    public static class Advanced
    {
        /**
         * Calculates the correct Bukkit BlockData based on the internal ItemsAdder registry ID.
         * This is used by some specific special plugins.
         * @param id internal ItemsAdder registry ID
         * @return Bukkit BlockData
         */
        @Deprecated
        @Nullable
        public static BlockData getBlockDataByInternalId(int id)
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Inject a function which can edit a specific item registered into the ItemsAdder registry.
         * Use this to customize your item even more.
         * @param plugin the plugin where you are calling this method
         * @param namespacedId the Id of the item you want to edit in the format {@code namespace:id}
         * @param modifier the function which will edit the item
         */
        public static void injectItemModifier(Plugin plugin, String namespacedId, ModifierHandler modifier)
        {
            throw new NotActuallyItemsAdderException();
        }

        /**
         * Inject a function which can edit ANY item registered into the ItemsAdder registry.
         * Use this to customize your item even more.
         * @param plugin the plugin where you are calling this method
         * @param modifier the function which will edit the item
         */
        public static void injectItemModifier(Plugin plugin, ModifierHandler modifier)
        {
            throw new NotActuallyItemsAdderException();
        }

        @FunctionalInterface
        public interface ModifierHandler
        {
            ItemStack call(String namespacedId, ItemStack par);
        }

        /**
         * Returns the model path of the specified item in the Minecraft ResourceLocation format
         * {@code namespace:path}
         * @param namespacedId the Id of the item you want to get the model of in the format {@code namespace:id}
         * @return the ResourceLocation.
         */
        @Nullable
        public static String getItemModelResourceLocation(String namespacedId)
        {
            throw new NotActuallyItemsAdderException();
        }
    }
}
