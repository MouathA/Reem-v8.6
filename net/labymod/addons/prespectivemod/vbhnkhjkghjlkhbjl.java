//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import java.lang.reflect.*;

public class vbhnkhjkghjlkhbjl extends fdghgfdjhgikhyoj
{
    public static ghjkmgvhjlkihjop speed;
    
    public void onDisable() {
        stopTmr();
    }
    
    @SubscribeEvent
    public void opt(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (this.getState()) {
            xdeh().timerSpeed = (float)vbhnkhjkghjlkhbjl.speed.getValue();
        }
    }
    
    public static Timer xdeh() {
        try {
            final Field declaredField = Minecraft.class.getDeclaredField(new String(new char[] { 't', 'i', 'm', 'e', 'r' }));
            declaredField.setAccessible(true);
            return (Timer)declaredField.get(vbhnkhjkghjlkhbjl.mc);
        }
        catch (Exception ex) {
            try {
                final Field declaredField2 = Minecraft.class.getDeclaredField(new String(new char[] { 'f', 'i', 'e', 'l', 'd', '_', '7', '1', '4', '2', '8', '_', 'T' }));
                declaredField2.setAccessible(true);
                return (Timer)declaredField2.get(vbhnkhjkghjlkhbjl.mc);
            }
            catch (Exception ex2) {
                return null;
            }
        }
    }
    
    public vbhnkhjkghjlkhbjl() {
        super("Timer", 0, fdghgfdjhgikhyoj.Category.Blatant);
        this.addValue(vbhnkhjkghjlkhbjl.speed = new ghjkmgvhjlkihjop("Speed", 1.0, 1.0, 3.0));
    }
    
    public void onEnable() {
        if (fdghgfdjhgikhyoj.getModule((Class)fghjhgkjcvgivjhbk.class).getState()) {
            fdghgfdjhgikhyoj.getModule((Class)fghjhgkjcvgivjhbk.class).setState(false);
        }
    }
    
    public static void stopTmr() {
        xdeh().timerSpeed = 1.0f;
    }
}
