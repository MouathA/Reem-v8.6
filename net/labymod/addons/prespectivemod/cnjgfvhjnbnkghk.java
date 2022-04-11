//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.*;

public class cnjgfvhjnbnkghk extends fdghgfdjhgikhyoj
{
    private Random random;
    public static fghjnfcgfhyhin Sword;
    private static MovingObjectPosition moving;
    public static float hitBoxMultiplier;
    public static ghjkmgvhjlkihjop maxhitboxValue;
    private static Entity pointedEntity;
    public static float f2;
    public static float d0;
    public static ghjkmgvhjlkihjop minhitboxValue;
    
    @SubscribeEvent
    public void IiIIiIiiiiiiiiiiiIiIiIi21(final MouseEvent mouseEvent) {
        try {
            if (cnjgfvhjnbnkghk.moving != null) {
                cnjgfvhjnbnkghk.mc.objectMouseOver = cnjgfvhjnbnkghk.moving;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @SubscribeEvent
    public void IiIIiIiiiiiiiiiiiIiIiIi21(final TickEvent.ClientTickEvent clientTickEvent) {
        Math.random();
        cnjgfvhjnbnkghk.hitBoxMultiplier = (float)(cnjgfvhjnbnkghk.minhitboxValue.getValue() + this.random.nextDouble() * (cnjgfvhjnbnkghk.minhitboxValue.getValue() - cnjgfvhjnbnkghk.maxhitboxValue.getValue())) * 10.0f;
        IiIIiIiiiiiiiiiiiIiIiIi2(1.0f);
    }
    
    @Override
    public void onDisable() {
        shtyghjyuohjljhkl.f2 = 1.0f;
    }
    
    public cnjgfvhjnbnkghk() {
        super("HitBox", 0, Category.Combat);
        cnjgfvhjnbnkghk.minhitboxValue = new ghjkmgvhjlkihjop("Min", 0.2, 0.0, 2.0);
        cnjgfvhjnbnkghk.maxhitboxValue = new ghjkmgvhjlkihjop("Max", 0.3, 0.0, 2.0);
        cnjgfvhjnbnkghk.Sword = new fghjnfcgfhyhin("Sword / Axe", false);
        this.addValue(cnjgfvhjnbnkghk.minhitboxValue);
        this.addValue(cnjgfvhjnbnkghk.maxhitboxValue);
        this.addBoolean(cnjgfvhjnbnkghk.Sword);
        this.random = new Random();
    }
    
    public static void IiIIiIiiiiiiiiiiiIiIiIi2(final float n) {
        if (Minecraft.getMinecraft().getRenderViewEntity() != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().pointedEntity = null;
            if (fdghgfdjhgikhyoj.getModule(cnjgfvhjnbnkghk.class).getState()) {
                cnjgfvhjnbnkghk.d0 = (float)shtyghjyuohjljhkl.randReach;
            }
            else if (!fdghgfdjhgikhyoj.getModule(cnjgfvhjnbnkghk.class).getState()) {
                cnjgfvhjnbnkghk.d0 = 3.0f;
            }
            cnjgfvhjnbnkghk.moving = Minecraft.getMinecraft().getRenderViewEntity().rayTrace((double)cnjgfvhjnbnkghk.d0, n);
            double distanceTo = cnjgfvhjnbnkghk.d0;
            final Vec3 getPositionEyes = Minecraft.getMinecraft().getRenderViewEntity().getPositionEyes(n);
            if (cnjgfvhjnbnkghk.moving != null) {
                distanceTo = cnjgfvhjnbnkghk.moving.hitVec.distanceTo(getPositionEyes);
            }
            final Vec3 getLook = Minecraft.getMinecraft().getRenderViewEntity().getLook(n);
            final Vec3 addVector = getPositionEyes.addVector(getLook.xCoord * cnjgfvhjnbnkghk.d0, getLook.yCoord * cnjgfvhjnbnkghk.d0, getLook.zCoord * cnjgfvhjnbnkghk.d0);
            cnjgfvhjnbnkghk.pointedEntity = null;
            Vec3 vec3 = null;
            final List getEntitiesWithinAABBExcludingEntity = Minecraft.getMinecraft().theWorld.getEntitiesWithinAABBExcludingEntity(Minecraft.getMinecraft().getRenderViewEntity(), Minecraft.getMinecraft().getRenderViewEntity().getEntityBoundingBox().addCoord(getLook.xCoord * cnjgfvhjnbnkghk.d0, getLook.yCoord * cnjgfvhjnbnkghk.d0, getLook.zCoord * cnjgfvhjnbnkghk.d0).expand(1.0, 1.0, 1.0));
            double n2 = distanceTo;
            for (int i = 0; i < getEntitiesWithinAABBExcludingEntity.size(); ++i) {
                final Entity pointedEntity = getEntitiesWithinAABBExcludingEntity.get(i);
                if (pointedEntity.canBeCollidedWith()) {
                    cnjgfvhjnbnkghk.f2 = 0.13f * cnjgfvhjnbnkghk.hitBoxMultiplier;
                    final AxisAlignedBB expand = pointedEntity.getEntityBoundingBox().expand((double)cnjgfvhjnbnkghk.f2, (double)cnjgfvhjnbnkghk.f2, (double)cnjgfvhjnbnkghk.f2);
                    final MovingObjectPosition calculateIntercept = expand.calculateIntercept(getPositionEyes, addVector);
                    if (expand.isVecInside(getPositionEyes)) {
                        if (0.0 < n2 || n2 == 0.0) {
                            cnjgfvhjnbnkghk.pointedEntity = pointedEntity;
                            vec3 = ((calculateIntercept == null) ? getPositionEyes : calculateIntercept.hitVec);
                            n2 = 0.0;
                        }
                    }
                    else if (calculateIntercept != null) {
                        final double distanceTo2 = getPositionEyes.distanceTo(calculateIntercept.hitVec);
                        if (distanceTo2 < n2 || n2 == 0.0) {
                            if (pointedEntity == Minecraft.getMinecraft().getRenderViewEntity().ridingEntity && !pointedEntity.canRiderInteract()) {
                                if (n2 == 0.0) {
                                    cnjgfvhjnbnkghk.pointedEntity = pointedEntity;
                                    vec3 = calculateIntercept.hitVec;
                                }
                            }
                            else {
                                cnjgfvhjnbnkghk.pointedEntity = pointedEntity;
                                vec3 = calculateIntercept.hitVec;
                                n2 = distanceTo2;
                            }
                        }
                    }
                }
            }
            if (cnjgfvhjnbnkghk.pointedEntity != null && (n2 < distanceTo || cnjgfvhjnbnkghk.moving == null)) {
                cnjgfvhjnbnkghk.moving = new MovingObjectPosition(cnjgfvhjnbnkghk.pointedEntity, vec3);
                if (cnjgfvhjnbnkghk.pointedEntity instanceof EntityLivingBase) {
                    Minecraft.getMinecraft().pointedEntity = cnjgfvhjnbnkghk.pointedEntity;
                }
            }
        }
    }
}
