package defpackage;

import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lq {
    public final float a;
    private final float b;
    private final float c;
    private final int d;

    public lq(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        int swipeEdge = backEvent.getSwipeEdge();
        this.b = touchX;
        this.c = touchY;
        this.a = progress;
        this.d = swipeEdge;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.b + ", touchY=" + this.c + ", progress=" + this.a + ", swipeEdge=" + this.d + '}';
    }
}
