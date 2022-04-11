//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.client.*;
import java.util.concurrent.*;

public class dxbhgfghncgvfhjgh
{
    private long last;
    private long current;
    protected static Minecraft mc;
    
    public final long getLast() {
        return this.last;
    }
    
    static {
        dxbhgfghncgvfhjgh.mc = Minecraft.getMinecraft();
    }
    
    public boolean sleep(final long n) {
        return this.sleep(n, TimeUnit.MILLISECONDS);
    }
    
    public final void updateLast() {
        this.last = getCurrentMillis();
    }
    
    public boolean sleep(final long n, final TimeUnit timeUnit) {
        final long convert = timeUnit.convert(System.nanoTime() - this.last, TimeUnit.NANOSECONDS);
        if (convert >= n) {
            this.reset();
        }
        return convert >= n;
    }
    
    public void updateTimer() {
        this.current = getCurrentMillis();
    }
    
    public static long getCurrentMillis() {
        return System.nanoTime() / 1000000L;
    }
    
    public void reset() {
        this.last = System.nanoTime();
    }
}
