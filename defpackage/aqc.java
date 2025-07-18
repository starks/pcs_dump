package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqc extends apt {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/fl/brella/api/StartQueryCallback");
    private final bua b;

    public aqc(bua buaVar) {
        this.b = buaVar;
    }

    @Override // defpackage.apu
    public final void a() {
        this.b.a(26, "StartQuery failure reported");
    }

    @Override // defpackage.apu
    public final void b(int i) {
        this.b.a(i, "StartQuery failure reported");
    }

    @Override // defpackage.apu
    public final void c(apo apoVar) {
        this.b.b(new aqb(apoVar));
    }
}
