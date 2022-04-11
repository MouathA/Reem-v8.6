//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.util.*;
import java.util.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class nklghjkghjkghjlhgjuik extends fdghgfdjhgikhyoj
{
    public static ArrayList<String> playerName;
    private fghjnfcgfhyhin addFriends;
    private fghjnfcgfhyhin getFriends;
    private fghjnfcgfhyhin removeFriends;
    
    public void onEnable() {
        if (this.getFriends.getState()) {
            this.getFriends();
        }
    }
    
    public void getFriends() {
        if (!this.getState()) {
            return;
        }
        if (!this.getFriends.getState()) {
            return;
        }
        Collections.sort(nklghjkghjkghjlhgjuik.playerName);
        final Iterator<String> iterator = nklghjkghjkghjlhgjuik.playerName.iterator();
        while (iterator.hasNext()) {
            nklghjkghjkghjlhgjuik.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_RED + "Friend: " + EnumChatFormatting.GREEN + iterator.next()));
        }
    }
    
    public nklghjkghjkghjlhgjuik() {
        super("Friends", 0, fdghgfdjhgikhyoj.Category.Other);
        this.addFriends = new fghjnfcgfhyhin("Add Friend", false);
        this.removeFriends = new fghjnfcgfhyhin("Remove Friend", false);
        this.getFriends = new fghjnfcgfhyhin("Friends List", false);
        this.addBoolean(this.addFriends);
        this.addBoolean(this.removeFriends);
        this.addBoolean(this.getFriends);
    }
    
    static {
        nklghjkghjkghjlhgjuik.playerName = new ArrayList<String>();
    }
    
    @SubscribeEvent
    public void addFriend(final AttackEntityEvent attackEntityEvent) {
        if (!this.getState()) {
            return;
        }
        if (!this.addFriends.getState()) {
            return;
        }
        if (attackEntityEvent.target instanceof EntityPlayer) {
            if (nklghjkghjkghjlhgjuik.playerName.contains(attackEntityEvent.target.getName())) {
                return;
            }
            nklghjkghjkghjlhgjuik.playerName.add(attackEntityEvent.target.getName());
        }
    }
    
    @SubscribeEvent
    public void removeFriend(final AttackEntityEvent attackEntityEvent) {
        if (!this.getState()) {
            return;
        }
        if (!this.removeFriends.getState()) {
            return;
        }
        if (attackEntityEvent.target instanceof EntityPlayer) {
            if (!nklghjkghjkghjlhgjuik.playerName.contains(attackEntityEvent.target.getName())) {
                return;
            }
            nklghjkghjkghjlhgjuik.playerName.remove(attackEntityEvent.target.getName());
        }
    }
}
