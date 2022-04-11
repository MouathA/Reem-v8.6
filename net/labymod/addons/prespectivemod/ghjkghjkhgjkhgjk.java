//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.client.event.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class ghjkghjkhgjkhgjk extends fdghgfdjhgikhyoj
{
    private ghjkmgvhjlkihjop Distance;
    private ghjkmgvhjlkihjop Angels;
    private Timer timer;
    private TimerTask timerTask;
    
    public ghjkghjkhgjkhgjk() {
        super("RodAimbot", 0, fdghgfdjhgikhyoj.Category.Blatant);
        this.Distance = new ghjkmgvhjlkihjop("Distance", 3.0, 3.0, 20.0);
        this.Angels = new ghjkmgvhjlkihjop("Angel", 30.0, 30.0, 360.0);
        this.addValue(this.Distance);
        this.addValue(this.Angels);
    }
    
    public static boolean mathShit(final Entity entity, float n) {
        n *= 0.5;
        final double n2 = ((ghjkghjkhgjkhgjk.mc.thePlayer.rotationYaw - s7oreAndMath(entity)) % 360.0 + 540.0) % 360.0 - 180.0;
        return (n2 > 0.0 && n2 < n) || (-n < n2 && n2 < 0.0);
    }
    
    @SubscribeEvent
    public void Sa7r(final MouseEvent mouseEvent) {
        if (mouseEvent.button == 1 && mouseEvent.buttonstate && ghjkghjkhgjkhgjk.mc.thePlayer.getCurrentEquippedItem() != null && ghjkghjkhgjkhgjk.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemFishingRod) {
            final Entity validTarget = this.validTarget();
            Math.random();
            if (validTarget != null) {
                mouseEvent.setCanceled(true);
                if (this.timerTask != null) {
                    this.timerTask.cancel();
                }
                this.timer = new Timer();
                this.timerTask = new TimerTask(this, validTarget) {
                    final Entity val$ent;
                    int i = 0;
                    private Object timerTask;
                    private Object timer;
                    final ghjkghjkhgjkhgjk this$0;
                    
                    @Override
                    public void run() {
                        ++this.i;
                        if (this.i == 10) {
                            ghjkghjkhgjkhgjk.s7ore(this.val$ent);
                            fdghgfdjhgikhyoj.mc.playerController.sendUseItem((EntityPlayer)fdghgfdjhgikhyoj.mc.thePlayer, (World)fdghgfdjhgikhyoj.mc.theWorld, fdghgfdjhgikhyoj.mc.thePlayer.getCurrentEquippedItem());
                            ((Timer)this.timerTask).cancel();
                            ((Timer)this.timer).cancel();
                        }
                        else {
                            ghjkghjkhgjkhgjk.s7ore(this.val$ent);
                        }
                    }
                };
                this.timer.scheduleAtFixedRate(this.timerTask, 0L, 7L);
            }
        }
    }
    
    public static float s7oreAndMath(final Entity entity) {
        final double y = entity.posX - ghjkghjkhgjkhgjk.mc.thePlayer.posX;
        final double n = entity.posY - ghjkghjkhgjkhgjk.mc.thePlayer.posY;
        final double x = entity.posZ - ghjkghjkhgjkhgjk.mc.thePlayer.posZ;
        final double n2 = -(Math.atan2(y, x) * 57.2957795);
        final double n3 = -(Math.asin(n / Math.sqrt(y * y + n * n + x * x)) * 57.2957795);
        return (float)n2;
    }
    
    public Entity validTarget() {
        Entity entity = null;
        int n = (int)this.Angels.getValue();
        for (final Entity entity2 : ghjkghjkhgjkhgjk.mc.theWorld.loadedEntityList) {
            if (entity2.isEntityAlive() && entity2 != ghjkghjkhgjkhgjk.mc.thePlayer && ghjkghjkhgjkhgjk.mc.thePlayer.getDistanceToEntity(entity2) <= this.Distance.getValue() && entity2 instanceof EntityLivingBase && mathShit(entity2, (float)n)) {
                entity = entity2;
                n = (int)playerRotation(entity2);
            }
        }
        return entity;
    }
    
    public static double playerRotation(final Entity entity) {
        return ((ghjkghjkhgjkhgjk.mc.thePlayer.rotationYaw - s7oreAndMath(entity)) % 360.0 + 540.0) % 360.0 - 180.0;
    }
    
    public static float[] hmodSa7r(final Entity entity) {
        Math.random();
        if (entity == null) {
            return null;
        }
        final double x = entity.posX - ghjkghjkhgjkhgjk.mc.thePlayer.posX;
        double y;
        if (entity instanceof EntityLivingBase) {
            final EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
            y = entityLivingBase.posY + entityLivingBase.getEyeHeight() * 0.9 - (ghjkghjkhgjkhgjk.mc.thePlayer.posY + ghjkghjkhgjkhgjk.mc.thePlayer.getEyeHeight());
        }
        else {
            y = (entity.getEntityBoundingBox().minY + entity.getEntityBoundingBox().maxY) / 2.0 - (ghjkghjkhgjkhgjk.mc.thePlayer.posY + ghjkghjkhgjkhgjk.mc.thePlayer.getEyeHeight());
        }
        final double y2 = entity.posZ - ghjkghjkhgjkhgjk.mc.thePlayer.posZ;
        return new float[] { ghjkghjkhgjkhgjk.mc.thePlayer.rotationYaw + MathHelper.wrapAngleTo180_float((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - ghjkghjkhgjkhgjk.mc.thePlayer.rotationYaw), ghjkghjkhgjkhgjk.mc.thePlayer.rotationPitch + MathHelper.wrapAngleTo180_float((float)(-(Math.atan2(y, MathHelper.sqrt_double(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - ghjkghjkhgjkhgjk.mc.thePlayer.rotationPitch) };
    }
    
    public static void s7ore(final Entity entity) {
        if (entity != null) {
            final float[] hmodSa7r = hmodSa7r(entity);
            if (hmodSa7r != null) {
                ghjkghjkhgjkhgjk.mc.getNetHandler().addToSendQueue((Packet)new C03PacketPlayer.C05PacketPlayerLook(hmodSa7r[0], hmodSa7r[1] + 4.0f, ghjkghjkhgjkhgjk.mc.thePlayer.onGround));
            }
        }
    }
}
