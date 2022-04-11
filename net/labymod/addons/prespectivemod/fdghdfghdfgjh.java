//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.event.entity.living.*;
import net.minecraft.block.material.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class fdghdfghdfgjh extends fdghgfdjhgikhyoj
{
    public fdghdfghdfgjh() {
        super("Regen", 0, Category.Blatant);
    }
    
    @SubscribeEvent
    public void onTick(final LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (this.getState() && fdghdfghdfgjh.mc.thePlayer.getFoodStats().getFoodLevel() > 16 && !fdghdfghdfgjh.mc.thePlayer.isUsingItem() && fdghdfghdfgjh.mc.thePlayer.isCollidedVertically && fdghdfghdfgjh.mc.thePlayer.onGround && !fdghdfghdfgjh.mc.gameSettings.keyBindJump.isPressed() && !fdghdfghdfgjh.mc.thePlayer.isInsideOfMaterial(Material.lava) && !fdghdfghdfgjh.mc.thePlayer.isInWater()) {
            if (fdghdfghdfgjh.mc.thePlayer.getHealth() == 20.0f) {
                return;
            }
            for (int i = 0; i < 5; ++i) {
                fdghdfghdfgjh.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer());
            }
        }
    }
}
