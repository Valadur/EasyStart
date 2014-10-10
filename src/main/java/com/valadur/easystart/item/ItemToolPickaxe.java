package com.valadur.easystart.item;

import com.valadur.easystart.creativeTab.CreativeTab;
import com.valadur.easystart.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static net.minecraftforge.common.util.ForgeDirection.*;

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

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

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
    public boolean onItemUse (ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ) {
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
                    int posX = x;
                    int posY = y;
                    int posZ = z;
                    int playerPosX = (int) Math.floor(player.posX);
                    int playerPosY = (int) Math.floor(player.posY);
                    int playerPosZ = (int) Math.floor(player.posZ);
                    if (side == 0) {
                        --posY;
                    }

                    if (side == 1) {
                        ++posY;
                    }

                    if (side == 2) {
                        --posZ;
                    }

                    if (side == 3) {
                        ++posZ;
                    }

                    if (side == 4) {
                        --posX;
                    }

                    if (side == 5) {
                        ++posX;
                    }
                    if (posX == playerPosX && (posY == playerPosY || posY == playerPosY + 1 || posY == playerPosY - 1) && posZ == playerPosZ) {
                        return false;
                    }

                    int dmg = nearbyStack.getItemDamage();
                    int count = nearbyStack.stackSize;

                    used = item.onItemUse(nearbyStack, player, world, x, y, z, side, clickX, clickY, clickZ);
                    // handle creative mode
                    if (player.capabilities.isCreativeMode) {
                        // fun fact: vanilla minecraft does it exactly the same way
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