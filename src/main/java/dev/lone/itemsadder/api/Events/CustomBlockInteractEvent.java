package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.CustomBlock;
import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when a player interacts with a custom block.
 */
public class CustomBlockInteractEvent extends PlayerEvent implements Cancellable
{
    public CustomBlockInteractEvent(Player player, Action action, ItemStack item, Block block,
                                    BlockFace blockFace, EquipmentSlot slot, Object internal)
    {
        super(player);
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins
     *
     * @return true if this event is cancelled
     */
    @Override
    public boolean isCancelled()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Sets the cancellation state of this event. A cancelled event will not be executed in the server, but will still pass to other plugins.
     *
     * @param cancelled true if you wish to cancel this event
     */
    @Override
    public void setCancelled(boolean cancelled)
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public static HandlerList getHandlerList()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get a clone of the ItemStack of the custom block broken.
     *
     * @return the ItemStack for the {@link CustomBlock}
     */
    public ItemStack getCustomBlockItem()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Namespace and ID in the format {@code namespace:id} for this CustomBlock.
     *
     * @return String representing the namespace and ID of the CustomBlock.
     */
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns the item in hand represented by this event
     *
     * @return ItemStack the item used
     */
    public ItemStack getItem()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns the action type
     *
     * @return Action returns the type of interaction
     */
    public Action getAction()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Return the block clicked
     *
     * @return the clicked block
     */
    public Block getBlockClicked()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the face on the clicked block
     *
     * @return the clicked face
     */
    public BlockFace getBlockFace()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the hand which placed the block
     *
     * @return Main or off-hand, depending on which hand was used to place the block
     */
    public EquipmentSlot getHand()
    {
        throw new NotActuallyItemsAdderException();
    }
}