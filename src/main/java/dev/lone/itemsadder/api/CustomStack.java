package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;

/**
 * Allows the creation and retrieval of cutom Item Stacks.
 */
public class CustomStack
{
    /**
     * Returns a list of all the registered items identifiers in the format {@code namespace:id}
     * @return a list of Namespaces and IDs in the format {@code namespace:id}
     */
    public static Set<String> getNamespacedIdsInRegistry()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns true if the registry contains an item with the specified namespaced id in the format {@code namespace:id}
     * @param namespacedId Namespace and ID in the format {@code namespace:id}
     * @return true if it contains the namespaced id, otherwise false
     */
    public static boolean isInRegistry(String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns null if the provided {@link ItemStack} is not a custom item created with ItemsAdder.
     *
     * @param itemStack the Bukkit ItemStack to get the custom Item Stack from.
     * @return Possibly-null CustomStack instance.
     */
    @Nullable
    public static CustomStack byItemStack(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a clone of the custom stack declared in ItemsAdder registry.
     * <br>May return null if the provided namespace and id don't belong to a registered custom Item.
     *
     * <p>You can give this to a player and do whatever you want without overwriting the original item.
     *
     * @param namespacedID The ID in the format {@code namespace:id} to get the CustomStack-copy from.
     * @return Possibly-null copy of a CustomStack instance.
     */
    @Nullable
    public static CustomStack getInstance(String namespacedID)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit ItemStack associated with this CustomStack instance.
     *
     * @return Bukkit ItemStack used for this CustomStack.
     */
    public ItemStack getItemStack()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the namespace used for this CustomStack instance.
     *
     * @return String representing the namespace of the CustomStack.
     */
    public String getNamespace()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the id used for this CustomStack instance.
     *
     * @return String representing the id of the CustomStack.
     */
    public String getId()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the namespace and id of this CustomStack instance in the format {@code namespace:id}
     *
     * @return String representing namespace and id of the CustomStack.
     */
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the path towards the model used for this CustomStack.
     *
     * @return String representing the path to the CustomStack's model.
     */
    public String getModelPath()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the path towards the configuration file of this CustomStack.
     *
     * @return String representing the path towards the CustomStack's configuration.
     */
    public String getConfigPath()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a {@link FileConfiguration} instance for this CustomStack.
     *
     * @return FileConfiguration for the CustomStack.
     */
    public FileConfiguration getConfig()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the permission associated with this CustomStack.
     *
     * @return Possibly-null String representing the permission for this CustomStack.
     */
    @Nullable
    public String getPermission()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether this CustomStack instance has a permission associated with it.
     *
     * @return true if a permission was set for this CustomStack, otherwise false.
     */
    public boolean hasPermission()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether the namespace and id of the provided CustomStack match the one of this CustomStack.
     *
     * @param other the CustomStack to check the namespace and id against.
     * @return true if namespace and id match, otherwise false.
     */
    public boolean matchNamespacedID(CustomStack other)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether this CustomStack has a auto-generated model.
     *
     * @return true if the CustomStack has a auto-generated model, otherwise false.
     */
    public boolean hasAutoGeneratedModel()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets a list of Textures of this CustomStack.
     *
     * @return list containing Strings representing the CustomStack's textures.
     */
    public List<String> getTextures()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns if this CustomStack blocks all enchantings.
     *
     * @return true if it blocks all enchantings, otherwise false.
     */
    public boolean isBlockAllEnchants()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether this CustomStack has a usages attribute applied.
     *
     * @return true if the CustomStack has a usage attribute applied, otherwise false.
     */
    public boolean hasUsagesAttribute()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the amount of usages for this CustomStack to the provided integer.
     *
     * @param amount the amount of usages to set for this CustomStack.
     */
    public void setUsages(int amount)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Reduces the amount of usages from this CustomStack by the provided interger.
     *
     * @param amount the amount of usages to remove from this CustomStack.
     */
    public void reduceUsages(int amount)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the amount of usages for this CustomStack.
     *
     * @return int representing the amount of usages remaining.
     */
    public int getUsages()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns whether this CustomStack has a custom durability applied.
     *
     * @return true if the CustomStack has custom durability applied, otherwise false.
     */
    public boolean hasCustomDurability()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the current amount of durability of this CustomStack.
     *
     * @return int representing the current durability of the CustomStack.
     */
    public int getDurability()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the custom durability of this CustomStack to the provided integer.
     *
     * @param durability The durability to set for this CustomStack.
     */
    public void setDurability(int durability)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the custom max durability of this CustomStack to the provided integer.
     *
     * @param maxDurability The max durability to set for this CustomStack.
     */
    public void setMaxDurability(int maxDurability)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the maximum custom durability of this CustomStack.
     *
     * @return Integer representing the total custom durability of the CustomStack.
     */
    public int getMaxDurability()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the different attributes for this CustomStack.
     *
     * <p>A full list of available attributes can be found on the
     * <a href="https://minecraft.gamepedia.com/Attribute#Attributes">Minecraft Gamepedia Wiki</a>.
     * <br><b>You do not have to provide the {@code generic.} prefix for the attribute!</b>
     *
     * <p>Not all attributes are available on all Minecraft versions!
     *
     * <h2>Example</h2>
     * <pre><code>
     * item.setAttributeModifier("attack_damage", "mainhand", 10d);
     * </code></pre>
     *
     * @param attributeModifier The attribute to modify. Does not need the {@code generic.} prefix.
     * @param slotStr           The slot to apply it to. Can be mainhand, offhand, head, chest, legs or feet.
     * @param value             The value to set for the attribute.
     */
    public void setAttributeModifier(String attributeModifier, String slotStr, double value)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the displayed name of this CustomStack.
     *
     * @param displayName The display name to set for this CustomStack.
     */
    public void setDisplayName(String displayName)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the displayed name of this CustomStack.
     *
     * @return String representing the display name of the CustomStack.
     */
    public String getDisplayName()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the damage value of the main hand for this CustomStack.
     *
     * @return Double representing the damage for the main hand.
     */
    public double getDamageMainhand()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Use this if you change attack damage of the item (via enchant or attribute modifier)
     *
     * @param slot The slot to apply the String to. Can be mainhand, offhand, head, chest, legs or feet.
     */
    public void updateAttackDamageLore(String slot)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Use this if you change attack speed of the item
     *
     * @param slot The slot to apply the String to. Can be mainhand, offhand, head, chest, legs or feet.
     */
    public void updateAttackSpeedLore(String slot)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns if this CustomStack is actually a Block.
     *
     * @return true if the CustomStack is a block, otherwise false.
     */
    public boolean isBlock()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Tries to drop the CustomStack at the provided location.
     *
     * @param loc The location to drop the CustomStack at.
     * @return true if the CustomStack was dropped, otherwise false.
     */
    public boolean drop(Location loc)
    {
        throw new NotActuallyItemsAdderException();
    }
}
