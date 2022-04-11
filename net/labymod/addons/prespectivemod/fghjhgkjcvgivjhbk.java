//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class fghjhgkjcvgivjhbk extends fdghgfdjhgikhyoj
{
    public static ghjkmgvhjlkihjop speed;
    
    public void onEnable() {
        if (fdghgfdjhgikhyoj.getModule((Class)vbhnkhjkghjlkhbjl.class).getState()) {
            fdghgfdjhgikhyoj.getModule((Class)vbhnkhjkghjlkhbjl.class).setState(false);
        }
    }
    
    @SubscribeEvent
    public void onTick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (!fghjhgkjcvgivjhbk.mc.thePlayer.onGround) {
            vbhnkhjkghjlkhbjl.xdeh().timerSpeed = (float)fghjhgkjcvgivjhbk.speed.getValue();
        }
        if (fghjhgkjcvgivjhbk.mc.thePlayer != null) {
            fghjhgkjcvgivjhbk.mc.thePlayer.capabilities.isFlying = true;
        }
    }
    
    public void onDisable() {
        vbhnkhjkghjlkhbjl.stopTmr();
        fghjhgkjcvgivjhbk.mc.thePlayer.capabilities.isFlying = false;
    }
    
    public fghjhgkjcvgivjhbk() {
        super("Fly", 0, fdghgfdjhgikhyoj.Category.Blatant);
        this.addValue(fghjhgkjcvgivjhbk.speed = new ghjkmgvhjlkihjop("Speed", 1.0, 1.0, 2.0));
    }
}
