//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.event.entity.player.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class fghjfghjfghj extends fdghgfdjhgikhyoj
{
    public static ghjkmgvhjlkihjop Chance;
    
    public fghjfghjfghj() {
        super("KeepSprint", 0, fdghgfdjhgikhyoj.Category.Blatant);
        this.addValue(fghjfghjfghj.Chance = new ghjkmgvhjlkihjop("Chance", 100.0, 0.0, 100.0));
    }
    
    @SubscribeEvent
    public void sa7r(final AttackEntityEvent attackEntityEvent) {
        final double random = Math.random();
        if (this.getState() && random < fghjfghjfghj.Chance.getValue() / 100.0) {
            final EntityPlayerSP thePlayer = Minecraft.getMinecraft().thePlayer;
            thePlayer.motionX /= 0.6;
            final EntityPlayerSP thePlayer2 = Minecraft.getMinecraft().thePlayer;
            thePlayer2.motionZ /= 0.6;
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
        }
    }
}
