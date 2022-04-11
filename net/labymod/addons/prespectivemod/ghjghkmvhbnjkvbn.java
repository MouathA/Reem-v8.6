//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

public class ghjghkmvhbnjkvbn
{
    public long previousMS;
    
    public void reset() {
        this.previousMS = this.getTime();
    }
    
    public boolean hasReached(final double n) {
        return this.getTime() - this.previousMS >= n;
    }
    
    public ghjghkmvhbnjkvbn() {
        this.previousMS = 0L;
    }
    
    public long getTime() {
        return System.nanoTime() / 1000000L;
    }
}
