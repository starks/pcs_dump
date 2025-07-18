package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aac {
    public final ahm b;
    public static final ur c = new ur(null);
    public static final aaf a = new zr();

    public aac(fsc fscVar, zz zzVar) {
        this(fscVar, zzVar, aae.a);
    }

    public final zx a(Class cls) {
        fkk fkkVarN = fjp.n(cls);
        String strB = fkkVarN.b();
        if (strB != null) {
            return this.b.a(fkkVarN, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public aac(fsc fscVar, zz zzVar, aag aagVar) {
        aagVar.getClass();
        this.b = new ahm(fscVar, zzVar, aagVar);
    }

    public aac(aad aadVar, zz zzVar) {
        this(aadVar.ak(), zzVar, aaj.a(aadVar));
    }
}
