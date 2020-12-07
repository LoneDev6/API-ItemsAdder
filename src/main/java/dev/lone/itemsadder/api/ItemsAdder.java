package dev.lone.itemsadder.api;

import org.bukkit.inventory.ItemStack;

/**
 * This is the public API reference for ItemsAdder.
 * Check out our public static methods for more info, note that these are just "mocks" of the actual
 * project.
 * To properly test your code, you will need a copy of ItemsAdder.
 * 
 * @author LoneDev6
 * @author TheBusyBiscuit
 *
 */
public final class ItemsAdder {

    /**
     * We explicitly hide the public 0-args constructor here
     * to prevent anyone from instantiating this class.
     */
    private ItemsAdder() {}

    /**
     * This method checks if ItemsAdder has finished loading its items and if
     * they are available.
     * <strong>Please use the ItemsAdderFirstLoadEvent instead!</strong>
     * 
     * @return Whether ItemsAdder has finished loading its items.
     */
    public static boolean areItemsLoaded() {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * This checks if an {@link ItemStack} is a custom item provided by ItemsAdder.
     * 
     * @param itemStack
     *            The {@link ItemStack} to check
     * 
     * @return Whether that {@link ItemStack} is a custom item.
     */
    public static boolean isCustomItem(ItemStack itemStack) {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * This checks if a custom item of that given name exists within ItemsAdder.
     * 
     * @param customItemName
     *            The custom item name
     * 
     * @return Whether a custom item with that name exists.
     */
    public static boolean isCustomItem(String customItemName) {
        throw new NotActuallyItemsAdderException();
    }

}
