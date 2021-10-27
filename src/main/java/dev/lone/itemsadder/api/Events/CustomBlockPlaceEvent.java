package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.CustomBlock;
import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when a custom block is placed by a player.
 */
public class CustomBlockPlaceEvent extends PlayerEvent implements Cancellable
{
    public CustomBlockPlaceEvent(BlockPlaceEvent e, Object blockItem)
    {
        super(e.getPlayer());
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
     * Gets the Bukkit Block associated with this CustomBlock.
     *
     * @return Bukkit Block associated with the CustomBlock.
     */
    public Block getBlock()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the value whether the player would be allowed to build here. Defaults to spawn if the server was going to
     * stop them (such as, the player is in Spawn). Note that this is an entirely different check than BLOCK_CANBUILD,
     * as this refers to a player, not universe-physics rule like cactus on dirt.
     *
     * @return whether the server would allow a player to build here
     */
    public boolean isCanBuild()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the block against this block was placed.
     *
     * @return The block against.
     */
    public Block getPlacedAgainst()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the blockstate which was replaced by the placement of this block.
     *
     * @return Replaced blockstate.
     */
    public BlockState getReplacedBlockState()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the item in player hand which triggered this event.
     *
     * @return The item.
     */
    public ItemStack getItemInHand()
    {
        throw new NotActuallyItemsAdderException();
    }
}