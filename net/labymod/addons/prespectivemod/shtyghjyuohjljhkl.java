//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.network.*;
import net.minecraft.network.*;

public class shtyghjyuohjljhkl extends fdghgfdjhgikhyoj
{
    public static fghjnfcgfhyhin Misplace;
    public static ghjkmgvhjlkihjop MaxValue;
    public static float f2;
    public static double maxReach;
    public static fghjnfcgfhyhin Sword;
    public static fghjnfcgfhyhin Spoof;
    public static ghjkmgvhjlkihjop MinValue;
    private static Entity pointedEntity;
    public static MovingObjectPosition moving;
    public static double randReach;
    static boolean reach;
    public Random random;
    public static double minReach;
    
    @SubscribeEvent
    public void IiIIiIiiiiiiiiiiiIiIiIi21(final MouseEvent mouseEvent) {
        if (shtyghjyuohjljhkl.Misplace.getState()) {
            return;
        }
        shtyghjyuohjljhkl.minReach = shtyghjyuohjljhkl.MinValue.getValue();
        shtyghjyuohjljhkl.maxReach = shtyghjyuohjljhkl.MaxValue.getValue();
        shtyghjyuohjljhkl.minReach *= 100.0;
        shtyghjyuohjljhkl.maxReach *= 100.0;
        final int n = (int)shtyghjyuohjljhkl.minReach;
        final int n2 = (int)shtyghjyuohjljhkl.maxReach;
        shtyghjyuohjljhkl.minReach /= 100.0;
        shtyghjyuohjljhkl.maxReach /= 100.0;
        shtyghjyuohjljhkl.randReach = (new Random().nextInt(n2 - n + 1) + n) / 100.0;
        IiIIiIiiiiiiiiiiiIiIiIi23(1.0f);
        shtyghjyuohjljhkl.mc.objectMouseOver = shtyghjyuohjljhkl.moving;
    }
    
    public static void IiIIiIiiiiiiiiiiiIiIiIi23(final float n) {
        if (Minecraft.getMinecraft().getRenderViewEntity() != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().pointedEntity = null;
            final double randReach = shtyghjyuohjljhkl.randReach;
            shtyghjyuohjljhkl.moving = Minecraft.getMinecraft().getRenderViewEntity().rayTrace(randReach, n);
            double distanceTo = randReach;
            final Vec3 getPositionEyes = Minecraft.getMinecraft().getRenderViewEntity().getPositionEyes(n);
            if (shtyghjyuohjljhkl.moving != null) {
                distanceTo = shtyghjyuohjljhkl.moving.hitVec.distanceTo(getPositionEyes);
            }
            final Vec3 getLook = Minecraft.getMinecraft().getRenderViewEntity().getLook(n);
            final Vec3 addVector = getPositionEyes.addVector(getLook.xCoord * randReach, getLook.yCoord * randReach, getLook.zCoord * randReach);
            shtyghjyuohjljhkl.pointedEntity = null;
            Vec3 vec3 = null;
            final List getEntitiesWithinAABBExcludingEntity = Minecraft.getMinecraft().theWorld.getEntitiesWithinAABBExcludingEntity(Minecraft.getMinecraft().getRenderViewEntity(), Minecraft.getMinecraft().getRenderViewEntity().getEntityBoundingBox().addCoord(getLook.xCoord * randReach, getLook.yCoord * randReach, getLook.zCoord * randReach).expand(1.0, 1.0, 1.0));
            double n2 = distanceTo;
            for (int i = 0; i < getEntitiesWithinAABBExcludingEntity.size(); ++i) {
                final Entity pointedEntity = getEntitiesWithinAABBExcludingEntity.get(i);
                if (pointedEntity.canBeCollidedWith()) {
                    if (fdghgfdjhgikhyoj.getModule((Class)cnjgfvhjnbnkghk.class).getState()) {
                        shtyghjyuohjljhkl.f2 = 0.13f * cnjgfvhjnbnkghk.hitBoxMultiplier;
                    }
                    else {
                        shtyghjyuohjljhkl.f2 = 0.13f;
                    }
                    final AxisAlignedBB expand = pointedEntity.getEntityBoundingBox().expand((double)shtyghjyuohjljhkl.f2, (double)shtyghjyuohjljhkl.f2, (double)shtyghjyuohjljhkl.f2);
                    final MovingObjectPosition calculateIntercept = expand.calculateIntercept(getPositionEyes, addVector);
                    if (expand.isVecInside(getPositionEyes)) {
                        if (0.0 < n2 || n2 == 0.0) {
                            shtyghjyuohjljhkl.pointedEntity = pointedEntity;
                            vec3 = ((calculateIntercept == null) ? getPositionEyes : calculateIntercept.hitVec);
                            n2 = 0.0;
                        }
                    }
                    else if (calculateIntercept != null) {
                        final double distanceTo2 = getPositionEyes.distanceTo(calculateIntercept.hitVec);
                        if (distanceTo2 < n2 || n2 == 0.0) {
                            if (pointedEntity == Minecraft.getMinecraft().getRenderViewEntity().ridingEntity && !pointedEntity.canRiderInteract()) {
                                if (n2 == 0.0) {
                                    shtyghjyuohjljhkl.pointedEntity = pointedEntity;
                                    vec3 = calculateIntercept.hitVec;
                                }
                            }
                            else {
                                shtyghjyuohjljhkl.pointedEntity = pointedEntity;
                                vec3 = calculateIntercept.hitVec;
                                n2 = distanceTo2;
                            }
                        }
                    }
                }
            }
            if (shtyghjyuohjljhkl.pointedEntity != null && (n2 < distanceTo || shtyghjyuohjljhkl.moving == null)) {
                shtyghjyuohjljhkl.moving = new MovingObjectPosition(shtyghjyuohjljhkl.pointedEntity, vec3);
                if (shtyghjyuohjljhkl.pointedEntity instanceof EntityLivingBase) {
                    Minecraft.getMinecraft().pointedEntity = shtyghjyuohjljhkl.pointedEntity;
                }
            }
        }
    }
    
    public shtyghjyuohjljhkl() {
        super("Reach", 0, fdghgfdjhgikhyoj.Category.Combat);
        shtyghjyuohjljhkl.MinValue = new ghjkmgvhjlkihjop("Min", 3.2, 3.0, 6.9);
        shtyghjyuohjljhkl.MaxValue = new ghjkmgvhjlkihjop("Max", 3.4, 3.0, 7.0);
        shtyghjyuohjljhkl.Misplace = new fghjnfcgfhyhin("Misplace", false);
        shtyghjyuohjljhkl.Sword = new fghjnfcgfhyhin("Sword / Axe", false);
        this.addValue(shtyghjyuohjljhkl.MinValue);
        this.addValue(shtyghjyuohjljhkl.MaxValue);
        this.addBoolean(shtyghjyuohjljhkl.Misplace);
        this.addBoolean(shtyghjyuohjljhkl.Sword);
    }
    
    public void onDisable() {
        shtyghjyuohjljhkl.randReach = 3.0;
    }
    
    @SubscribeEvent
    public void IiIIiIiiiiiiiiiiiIiIiIi231(final TickEvent.ClientTickEvent clientTickEvent) {
        if (this.getState() && shtyghjyuohjljhkl.Misplace.getState() && Minecraft.getMinecraft().theWorld != null) {
            final INetHandler getNetHandler = Minecraft.getMinecraft().thePlayer.sendQueue.getNetworkManager().getNetHandler();
            if (!(getNetHandler instanceof cxsdgfghfgjhjnk)) {
                Minecraft.getMinecraft().thePlayer.sendQueue.getNetworkManager().setNetHandler((INetHandler)new cxsdgfghfgjhjnk((NetHandlerPlayClient)getNetHandler));
            }
        }
    }
    
    public boolean checks() {
        return shtyghjyuohjljhkl.mc.thePlayer != null && shtyghjyuohjljhkl.mc.theWorld != null;
    }
    
    public void onEnable() {
        if (this.getState() && shtyghjyuohjljhkl.MinValue.getValue() >= shtyghjyuohjljhkl.MaxValue.getValue()) {
            shtyghjyuohjljhkl.MinValue.setValue(shtyghjyuohjljhkl.MaxValue.getValue() - 0.3);
        }
    }
    
    static {
        shtyghjyuohjljhkl.reach = false;
        shtyghjyuohjljhkl.minReach = 3.0;
        shtyghjyuohjljhkl.maxReach = 3.0;
        shtyghjyuohjljhkl.randReach = 3.0;
    }
    
    @SubscribeEvent
    public void Recuder(final TickEvent.ClientTickEvent clientTickEvent) {
        if (this.getState() && shtyghjyuohjljhkl.MinValue.getValue() > shtyghjyuohjljhkl.MaxValue.getValue()) {
            shtyghjyuohjljhkl.MinValue.setValue(shtyghjyuohjljhkl.MaxValue.getValue() - 0.3);
        }
    }
}
