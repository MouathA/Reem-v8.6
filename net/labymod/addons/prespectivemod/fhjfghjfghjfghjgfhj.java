//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.util.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.entity.*;

public class fhjfghjfghjfghjgfhj extends fdghgfdjhgikhyoj
{
    public static fghjnfcgfhyhin Click;
    public static ghjkmgvhjlkihjop Chance;
    private Random random;
    private ghjghkmvhbnjkvbn timer;
    public static ghjkmgvhjlkihjop APS;
    public static fghjnfcgfhyhin Sword;
    
    private boolean InvalidTarget() {
        return fhjfghjfghjfghjgfhj.mc.objectMouseOver != null && fhjfghjfghjfghjgfhj.mc.objectMouseOver.entityHit != null && fhjfghjfghjfghjgfhj.mc.objectMouseOver.entityHit instanceof EntityPlayer;
    }
    
    public fhjfghjfghjfghjgfhj() {
        super("Trigger", 0, fdghgfdjhgikhyoj.Category.Combat);
        fhjfghjfghjfghjgfhj.APS = new ghjkmgvhjlkihjop("APS", 5.0, 5.0, 20.0);
        fhjfghjfghjfghjgfhj.Chance = new ghjkmgvhjlkihjop("Chance", 100.0, 0.0, 100.0);
        fhjfghjfghjfghjgfhj.Click = new fghjnfcgfhyhin("While Click", false);
        fhjfghjfghjfghjgfhj.Sword = new fghjnfcgfhyhin("Swords / Axe", false);
        this.addValue(fhjfghjfghjfghjgfhj.APS);
        this.addValue(fhjfghjfghjfghjgfhj.Chance);
        this.addBoolean(fhjfghjfghjfghjgfhj.Click);
        this.addBoolean(fhjfghjfghjfghjgfhj.Sword);
        this.random = new Random();
        this.timer = new ghjghkmvhbnjkvbn();
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        final double random = Math.random();
        if (this.getState() && Mouse.isButtonDown(1)) {
            return;
        }
        if (fhjfghjfghjfghjgfhj.Sword.getState()) {
            if (fhjfghjfghjfghjgfhj.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(fhjfghjfghjfghjgfhj.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(fhjfghjfghjfghjgfhj.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (fhjfghjfghjfghjgfhj.Click.getState() && !Mouse.isButtonDown(0)) {
            return;
        }
        if (fhjfghjfghjfghjgfhj.mc.objectMouseOver != null && fhjfghjfghjfghjgfhj.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY) {
            final Entity entityHit = fhjfghjfghjfghjgfhj.mc.objectMouseOver.entityHit;
            if (random < fhjfghjfghjfghjgfhj.Chance.getValue() / 100.0 && !nklghjkghjkghjlhgjuik.playerName.contains(entityHit.getName()) && this.InvalidTarget() && entityHit.isEntityAlive() && this.timer.hasReached(1000.0 / fhjfghjfghjfghjgfhj.APS.getValue())) {
                this.attackEntity((EntityLivingBase)entityHit);
                this.timer.reset();
            }
        }
    }
    
    private boolean canAttack(final EntityPlayerSP entityPlayerSP, final EntityLivingBase entityLivingBase) {
        return fhjfghjfghjfghjgfhj.mc.currentScreen == null && !entityLivingBase.isInvisible() && !entityPlayerSP.isUsingItem();
    }
    
    private void attackEntity(final EntityLivingBase entityLivingBase) {
        if (!this.canAttack(fhjfghjfghjfghjgfhj.mc.thePlayer, entityLivingBase)) {
            return;
        }
        fhjfghjfghjfghjgfhj.mc.thePlayer.swingItem();
        fhjfghjfghjfghjgfhj.mc.playerController.attackEntity((EntityPlayer)fhjfghjfghjfghjgfhj.mc.thePlayer, (Entity)entityLivingBase);
    }
}
