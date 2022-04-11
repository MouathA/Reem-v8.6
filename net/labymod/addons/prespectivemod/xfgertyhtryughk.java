//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.client.*;

public class xfgertyhtryughk
{
    protected static Minecraft mc;
    
    public static boolean isMoving() {
        return fghfghjfghj.getPlayer().moveForward != 0.0f || fghfghjfghj.getPlayer().moveStrafing != 0.0f;
    }
    
    public static float getSpeed() {
        return (float)Math.sqrt(fghfghjfghj.getPlayer().motionX * fghfghjfghj.getPlayer().motionX + fghfghjfghj.getPlayer().motionZ * fghfghjfghj.getPlayer().motionZ);
    }
    
    public static void strafe(final float n) {
        if (!isMoving()) {
            return;
        }
        final double n2 = getDirection();
        xfgertyhtryughk.mc.thePlayer.motionX = -Math.sin(n2) * n;
        xfgertyhtryughk.mc.thePlayer.motionZ = Math.cos(n2) * n;
    }
    
    static {
        xfgertyhtryughk.mc = Minecraft.getMinecraft();
    }
    
    public static float getDirection() {
        float rotationYaw = fghfghjfghj.getPlayer().rotationYaw;
        if (fghfghjfghj.getPlayer().moveForward < 0.0f) {
            rotationYaw += 180.0f;
        }
        float n;
        if (fghfghjfghj.getPlayer().moveForward < 0.0f) {
            n = -0.5f;
        }
        else if (fghfghjfghj.getPlayer().moveForward > 0.0f) {
            n = 0.5f;
        }
        else {
            n = 1.0f;
        }
        if (fghfghjfghj.getPlayer().moveStrafing > 0.0f) {
            rotationYaw -= 90.0f * n;
        }
        if (fghfghjfghj.getPlayer().moveStrafing < 0.0f) {
            rotationYaw += 90.0f * n;
        }
        return rotationYaw * 0.017453292f;
    }
    
    public static void setSpeed(final double n) {
        fghfghjfghj.getPlayer().motionX = -(Math.sin(getDirection()) * n);
        fghfghjfghj.getPlayer().motionZ = Math.cos(getDirection()) * n;
    }
}
