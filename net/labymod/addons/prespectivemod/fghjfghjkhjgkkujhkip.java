//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.util.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;

public class fghjfghjkhjgkkujhkip extends dfhgsfdghdfgh
{
    private boolean binding;
    public boolean open;
    private XRandR.Screen color;
    private boolean isHovered;
    public xcvbxcvhfgnj parent;
    public int offset;
    public fdghgfdjhgikhyoj mod;
    private ArrayList<dfhgsfdghdfgh> subcomponents;
    
    public void updateComponent(final int n, final int n2) {
        this.parent.refresh();
        this.isHovered = this.isMouseOnButton(n, n2);
        if (!this.subcomponents.isEmpty()) {
            final Iterator<dfhgsfdghdfgh> iterator = this.subcomponents.iterator();
            while (iterator.hasNext()) {
                iterator.next().updateComponent(n, n2);
            }
        }
    }
    
    public fghjfghjkhjgkkujhkip(final fdghgfdjhgikhyoj mod, final xcvbxcvhfgnj parent, final int offset) {
        this.mod = mod;
        this.parent = parent;
        this.offset = offset;
        this.subcomponents = new ArrayList<dfhgsfdghdfgh>();
        this.open = false;
        int n = offset + 14;
        if (!mod.getValues().isEmpty()) {
            final Iterator<ghjkmgvhjlkihjop> iterator = mod.getValues().iterator();
            while (iterator.hasNext()) {
                this.subcomponents.add(new gfhdfrtuyfhgcjnghfj(iterator.next(), this, n));
                n += 12;
            }
        }
        if (!mod.getBooleans().isEmpty()) {
            final Iterator<fghjnfcgfhyhin> iterator2 = mod.getBooleans().iterator();
            while (iterator2.hasNext()) {
                this.subcomponents.add(new ghjkghjojom(iterator2.next(), this, n));
                n += 12;
            }
        }
    }
    
    public void setOff(final int offset) {
        this.offset = offset;
        int off = this.offset + 12;
        final Iterator<dfhgsfdghdfgh> iterator = this.subcomponents.iterator();
        while (iterator.hasNext()) {
            iterator.next().setOff(off);
            off += 12;
        }
    }
    
    public boolean isMouseOnButton(final int n, final int n2) {
        return n > this.parent.getX() && n < this.parent.getX() + this.parent.getWidth() && n2 > this.parent.getY() + this.offset && n2 < this.parent.getY() + 12 + this.offset;
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == 2 && this.parent.open) {
            this.binding = !this.binding;
        }
        if (this.isMouseOnButton(n, n2) && n3 == 0) {
            final fdghgfdjhgikhyoj mod = this.mod;
            if (!fdghgfdjhgikhyoj.getModule((Class)fgxhvbhftgj.class).getState()) {
                this.mod.setState(!this.mod.getState());
            }
        }
        if (this.isMouseOnButton(n, n2) && n3 == 1) {
            this.open = !this.open;
            this.parent.refresh();
        }
        final Iterator<dfhgsfdghdfgh> iterator = this.subcomponents.iterator();
        while (iterator.hasNext()) {
            iterator.next().mouseClicked(n, n2, n3);
        }
    }
    
    public static int rainbow(final int n) {
        return Color.getHSBColor((float)(Math.ceil((double)((System.currentTimeMillis() + n) / 4L)) % 360.0 / 360.0), 0.2f, 2.0f).getRGB();
    }
    
    public void render() {
        if (this.isHovered && Mouse.isButtonDown(2)) {
            this.binding = true;
        }
        Gui.drawRect(this.parent.getX() + 1, this.parent.getY() - 2 + this.offset, this.parent.getX() + this.parent.getWidth() - 2, this.parent.getY() + 12 + this.offset, this.isHovered ? new Color(50, 50, 50, 150).getRGB() : new Color(15, 15, 15, 255).getRGB());
        if (this.mod.getState()) {
            fghfghjfghj.drawCenteredString(this.binding ? "" : this.mod.getName(), this.parent.getX() + 35, this.parent.getY() + 1 + this.offset, Color.HSBtoRGB((System.currentTimeMillis() + 1500L) % 5000L / 4750.0f, 0.8f, 0.8f));
        }
        else {
            fghfghjfghj.drawCenteredString(this.binding ? "" : this.mod.getName(), this.parent.getX() + 35, this.parent.getY() + 1 + this.offset, new Color(150, 150, 150).getRGB());
        }
        GL11.glPushMatrix();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        Minecraft.getMinecraft();
        Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(this.binding ? ("Press key buddy... " + Keyboard.getKeyName(this.mod.getKey())) : "", (float)(this.parent.getX() * 2 + 5), (float)((this.parent.getY() + this.offset) * 2 + 6), new Color(150, 150, 150).getRGB());
        GL11.glPopMatrix();
        if (this.subcomponents.size() > 0) {
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(this.open ? "-" : "+", this.parent.getX() + 70.0f, this.parent.getY() + 1.0f + this.offset, new Color(150, 150, 150).getRGB());
        }
        if (this.open && !this.subcomponents.isEmpty()) {
            final Iterator<dfhgsfdghdfgh> iterator = this.subcomponents.iterator();
            while (iterator.hasNext()) {
                iterator.next().render();
            }
            Gui.drawRect(this.parent.getX() + 2, this.parent.getY() + this.offset + 12, this.parent.getX() + 3, this.parent.getY() + this.offset + (this.subcomponents.size() + 1) * 12, Color.HSBtoRGB((System.currentTimeMillis() + 1500L) % 5000L / 4750.0f, 0.8f, 0.8f));
        }
    }
    
    public void keyTyped(final char c, final int key) {
        if (this.binding) {
            if (key == 14) {
                this.mod.setKey(0);
                this.binding = false;
                return;
            }
            this.mod.setKey(key);
            this.binding = false;
            if (key == 42) {
                this.mod.setKey(0);
                this.binding = false;
            }
        }
    }
    
    public int getHeight() {
        if (this.open) {
            return 12 * (this.subcomponents.size() + 1);
        }
        return 12;
    }
}
