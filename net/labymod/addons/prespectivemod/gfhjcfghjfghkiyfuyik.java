//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.event.entity.living.*;
import net.minecraft.item.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class gfhjcfghjfghkiyfuyik extends fdghgfdjhgikhyoj
{
    public static fghjnfcgfhyhin Sword;
    public static ghjkmgvhjlkihjop Horizontal;
    
    public gfhjcfghjfghkiyfuyik() {
        super("Velocity", 0, fdghgfdjhgikhyoj.Category.Combat);
        gfhjcfghjfghkiyfuyik.Horizontal = new ghjkmgvhjlkihjop("Horizontal", 100.0, 0.0, 100.0);
        gfhjcfghjfghkiyfuyik.Sword = new fghjnfcgfhyhin("Sword", false);
        this.addValue(gfhjcfghjfghkiyfuyik.Horizontal);
        this.addBoolean(gfhjcfghjfghkiyfuyik.Sword);
    }
    
    @SubscribeEvent
    public void IiIIiIiiiiiiiiiiiIiIiIi2311111(final LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (gfhjcfghjfghkiyfuyik.Sword.getState()) {
            if (gfhjcfghjfghkiyfuyik.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(gfhjcfghjfghkiyfuyik.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(gfhjcfghjfghkiyfuyik.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (fghfghjfghj.getPlayer() == null) {
            return;
        }
        if (gfhjcfghjfghkiyfuyik.mc.thePlayer == null) {
            return;
        }
        if (gfhjcfghjfghkiyfuyik.mc.theWorld == null) {
            return;
        }
        if (gfhjcfghjfghkiyfuyik.mc.thePlayer.hurtTime == gfhjcfghjfghkiyfuyik.mc.thePlayer.maxHurtTime && gfhjcfghjfghkiyfuyik.mc.thePlayer.maxHurtTime > 0) {
            final EntityPlayerSP thePlayer = gfhjcfghjfghkiyfuyik.mc.thePlayer;
            thePlayer.motionX *= gfhjcfghjfghkiyfuyik.Horizontal.getValue() / 100.0;
            final EntityPlayerSP thePlayer2 = gfhjcfghjfghkiyfuyik.mc.thePlayer;
            thePlayer2.motionZ *= gfhjcfghjfghkiyfuyik.Horizontal.getValue() / 100.0;
        }
    }
}
