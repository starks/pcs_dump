package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fly extends fhf implements fnp {
    public static final fhl b = new fhl();
    public final long a;

    public fly(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.fnp
    public final /* bridge */ /* synthetic */ Object be(fhq fhqVar) {
        flz flzVar = (flz) fhqVar.get(flz.b);
        String str = flzVar != null ? flzVar.a : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iH = fjz.h(name);
        name.getClass();
        int iLastIndexOf = name.lastIndexOf(" @", iH);
        if (iLastIndexOf < 0) {
            iLastIndexOf = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iLastIndexOf + 10);
        String strSubstring = name.substring(0, iLastIndexOf);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.fnp
    public final /* bridge */ /* synthetic */ void bf(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fly) && this.a == ((fly) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ")";
    }
}
