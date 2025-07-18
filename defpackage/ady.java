package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ady implements AutoCloseable {
    public final afb a;

    public ady(afb afbVar) {
        this.a = afbVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aef b(String str) {
        String string = fjz.i(str).toString();
        int length = string.length();
        afb afbVar = this.a;
        if (length >= 3) {
            String strSubstring = string.substring(0, 3);
            strSubstring.getClass();
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                return new aed(afbVar, str);
            }
        }
        return new aee(afbVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
