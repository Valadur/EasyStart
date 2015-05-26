package com.valadur.easystart.item;

import com.valadur.easystart.creativeTab.CreativeTab;
import com.valadur.easystart.reference.Textures;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemToolPickaxe extends ItemPickaxe {

    public ItemToolPickaxe(ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTab.ES_TAB);
        setMaxStackSize(1);

    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }*/

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public ItemStack onItemRightClick (ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        return itemStack;
    }

    /*
      This is actually Tinkers Construct code. Thanks for hosting it on github and help me learn to mod
    */
    @Override
    public boolean onItemUse (ItemStack stack, EntityPlayer player, World world, BlockPos blockPos, EnumFacing facing, float clickX, float clickY, float clickZ) {
        /*if (world.isRemote)
            return true;*/

        boolean used = false;
        int hotbarSlot = player.inventory.currentItem;
        int itemSlot = hotbarSlot == 0 ? 8 : hotbarSlot + 1;
        ItemStack nearbyStack = null;

        if (hotbarSlot < 8) {
            nearbyStack = player.inventory.getStackInSlot(itemSlot);
            if (nearbyStack != null) {
                Item item = nearbyStack.getItem();
                if (item instanceof ItemBlock) {
                    int posX = blockPos.getX();
                    int posY = blockPos.getY();
                    int posZ = blockPos.getZ();
                    int playerPosX = (int) Math.floor(player.posX);
                    int playerPosY = (int) Math.floor(player.posY);
                    int playerPosZ = (int) Math.floor(player.posZ);
                    if (posX == playerPosX && (posY == playerPosY || posY == playerPosY + 1 || posY == playerPosY - 1) && posZ == playerPosZ) {
                        return false;
                    }

                    int dmg = nearbyStack.getItemDamage();
                    int count = nearbyStack.stackSize;

                    used = item.onItemUse(nearbyStack, player, world, blockPos, facing, clickX, clickY, clickZ);
                    // handle creative mode
                    if (player.capabilities.isCreativeMode) {
                        nearbyStack.setItemDamage(dmg);
                        nearbyStack.stackSize = count;
                    }
                    if (nearbyStack.stackSize < 1) {
                        nearbyStack = null;
                        player.inventory.setInventorySlotContents(itemSlot, null);
                    }
                }
            }
        }
        return used;
    }
}