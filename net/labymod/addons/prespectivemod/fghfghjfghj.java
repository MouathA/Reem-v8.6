//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.client.multiplayer.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.*;

public class fghfghjfghj
{
    public static WorldClient getWorld() {
        return getMinecraft().theWorld;
    }
    
    public static PlayerControllerMP getPlayerController() {
        return getMinecraft().playerController;
    }
    
    public static EntityPlayerSP getPlayer() {
        return getMinecraft().thePlayer;
    }
    
    public static Minecraft getMinecraft() {
        return Minecraft.getMinecraft();
    }
    
    public static void drawCenteredString(final String s, final int n, final int n2, final int n3) {
        getMinecraft().fontRendererObj.drawString(s, n - getMinecraft().fontRendererObj.getStringWidth(s) / 2, n2, n3);
    }
}
