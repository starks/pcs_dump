package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddc extends ddb {
    public static final Map c;
    private final dav d;

    static {
        EnumMap enumMap = new EnumMap(dav.class);
        for (dav davVar : dav.values()) {
            ddc[] ddcVarArr = new ddc[10];
            for (int i = 0; i < 10; i++) {
                ddcVarArr[i] = new ddc(i, davVar, daw.a);
            }
            enumMap.put((EnumMap) davVar, (dav) ddcVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public ddc(int i, dav davVar, daw dawVar) {
        super(dawVar, i);
        davVar.getClass();
        this.d = davVar;
        if (dawVar.c()) {
            return;
        }
        int i2 = davVar.l;
        i2 = dawVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        dawVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.ddb
    public final void a(ddf ddfVar, Object obj) throws IOException {
        ddfVar.f(obj, this.d, this.b);
    }
}
