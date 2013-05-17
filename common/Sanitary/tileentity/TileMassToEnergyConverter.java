package Sanitary.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import Sanitary.block.SanitaryBlocks;

public class TileMassToEnergyConverter extends TileEntity implements IInventory{

    public int numUsingPlayers;
    
    public static final int INVENTORY_SIZE = 1;
    
    private ItemStack[] inventory;
    
    public TileMassToEnergyConverter() {
        
        super();
        inventory = new ItemStack[INVENTORY_SIZE];
    }
    
    @Override
    public int getSizeInventory() {
        return inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return inventory[i];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amt) {
        ItemStack itemStack = getStackInSlot(slot);
        if (itemStack != null) {
            if (itemStack.stackSize <= amt) {
                setInventorySlotContents(slot, null);
            }
            else {
                itemStack = itemStack.splitStack(amt);
                if (itemStack.stackSize == 0) {
                    setInventorySlotContents(slot, null);
                }
            }
        }

        return itemStack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        if (inventory[slot] != null) {
            ItemStack itemStack = inventory[slot];
            inventory[slot] = null;
            return itemStack;
        }
        else
            return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemstack) {
        inventory[slot] = itemstack;

        if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
            itemstack.stackSize = this.getInventoryStackLimit();
        }

        this.onInventoryChanged();
    }

    @Override
    public String getInvName() {
        return "container.TileMassToEnergyConverter";
    }

    @Override
    public boolean isInvNameLocalized() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void openChest() {
        ++numUsingPlayers;
        worldObj.addBlockEvent(xCoord, yCoord, zCoord, SanitaryBlocks.massToEnergyConverter.blockID, 1, numUsingPlayers);
    }

    @Override
    public void closeChest() {
        --numUsingPlayers;
        worldObj.addBlockEvent(xCoord, yCoord, zCoord, SanitaryBlocks.massToEnergyConverter.blockID, 1, numUsingPlayers);
    }

    @Override
    public boolean isStackValidForSlot(int i, ItemStack itemstack) {
        return true;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return true;
    }

}
