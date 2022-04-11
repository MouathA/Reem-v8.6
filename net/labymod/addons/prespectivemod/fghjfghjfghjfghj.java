//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.client.gui.*;
import java.util.*;
import net.minecraft.util.*;
import java.awt.*;

public class fghjfghjfghjfghj extends GuiScreen
{
    private int nameY;
    public ArrayList<xcvbxcvhfgnj> frames;
    
    public fghjfghjfghjfghj() {
        this.nameY = 0;
        this.frames = new ArrayList<xcvbxcvhfgnj>();
        int x = 100;
        fdghgfdjhgikhyoj.Category[] values;
        for (int length = (values = fdghgfdjhgikhyoj.Category.values()).length, i = 0; i < length; ++i) {
            final xcvbxcvhfgnj e = new xcvbxcvhfgnj(values[i]);
            e.setX(x);
            this.frames.add(e);
            x += e.getWidth() + 3;
        }
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) {
        for (final xcvbxcvhfgnj xcvbxcvhfgnj : this.frames) {
            if (xcvbxcvhfgnj.isWithinHeader(n, n2) && n3 == 0) {
                xcvbxcvhfgnj.setDrag(true);
                xcvbxcvhfgnj.dragX = n - xcvbxcvhfgnj.getX();
                xcvbxcvhfgnj.dragY = n2 - xcvbxcvhfgnj.getY();
            }
            if (xcvbxcvhfgnj.isWithinHeader(n, n2) && n3 == 1) {
                xcvbxcvhfgnj.setOpen(!xcvbxcvhfgnj.isOpen());
            }
            if (xcvbxcvhfgnj.isOpen() && !xcvbxcvhfgnj.getComponents().isEmpty()) {
                final Iterator<dfhgsfdghdfgh> iterator2 = xcvbxcvhfgnj.getComponents().iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().mouseClicked(n, n2, n3);
                }
            }
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        fghfghjfghj.getMinecraft().fontRendererObj.drawStringWithShadow(EnumChatFormatting.BOLD + "#created by alsa7r.", 0.0f, (float)this.nameY, new Color(80, 124, 247).getRGB());
        for (final xcvbxcvhfgnj xcvbxcvhfgnj : this.frames) {
            xcvbxcvhfgnj.renderFrame(this.fontRendererObj);
            xcvbxcvhfgnj.updatePosition(n, n2);
            final Iterator<dfhgsfdghdfgh> iterator2 = xcvbxcvhfgnj.getComponents().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().updateComponent(n, n2);
            }
        }
    }
    
    protected void keyTyped(final char c, final int n) {
        for (final xcvbxcvhfgnj xcvbxcvhfgnj : this.frames) {
            if (xcvbxcvhfgnj.isOpen() && n != 1 && !xcvbxcvhfgnj.getComponents().isEmpty()) {
                final Iterator<dfhgsfdghdfgh> iterator2 = xcvbxcvhfgnj.getComponents().iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().keyTyped(c, n);
                }
            }
        }
        if (n == 1) {
            this.mc.displayGuiScreen((GuiScreen)null);
        }
    }
    
    protected void mouseReleased(final int n, final int n2, final int n3) {
        final Iterator<xcvbxcvhfgnj> iterator = this.frames.iterator();
        while (iterator.hasNext()) {
            iterator.next().setDrag(false);
        }
    }
}
