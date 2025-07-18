package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fue {
    public final int a;
    public final int b;
    public final Object[] c;

    public fue() {
        this.c = new fue[256];
        this.a = 0;
        this.b = 0;
    }

    public fue(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }
}
