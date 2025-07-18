package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyb implements Closeable {
    private static final cbx f = cbr.c("SqliteDbAdapter");
    public final SQLiteOpenHelper a;
    public final dzt b;
    public final cxo c;
    public final Map d;
    public final Map e;

    public dyb(Context context, dzp dzpVar, dzi dziVar) {
        clq.y(dzpVar.b.size() == 1, "schema must contain a single table, found %s", dzpVar.b.size());
        dzt dztVar = (dzt) dzpVar.b.get(0);
        this.b = dztVar;
        HashSet hashSetH = dcr.h(dztVar.c.size());
        this.d = new HashMap();
        this.e = new HashMap();
        for (dzo dzoVar : dztVar.c) {
            String str = dzoVar.b;
            if (str.toLowerCase(Locale.ROOT).startsWith("sensitive_")) {
                dzf dzfVar = dziVar.c;
                dzfVar = dzfVar == null ? dzf.a : dzfVar;
                if ((dzfVar.b == 4 ? (dyv) dzfVar.c : dyv.a).b == 7) {
                    Map map = this.d;
                    ebr ebrVarB = ebr.b(dzoVar.c);
                    map.put(str, ebrVarB == null ? ebr.UNRECOGNIZED : ebrVarB);
                }
            } else {
                hashSetH.add(str);
            }
        }
        this.c = cxo.m(hashSetH);
        this.a = new dya(this, context);
    }

    public static final void b(String str, asr asrVar, Map map, Map map2) {
        if (map.containsKey(str)) {
            dyp dypVar = (dyp) DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((dyr) asrVar.a).b)).get(str + "/" + ((dxq) map.get(str)).b);
            if (dypVar == null) {
                throw new UnsupportedOperationException(String.format("The requested event time column is not returned by the Query %s.", str));
            }
            int iA = dxp.a(((dxq) map.get(str)).c);
            if (iA == 0) {
                iA = dxp.d;
            }
            boolean z = iA == dxp.b;
            if (iA == 0) {
                throw null;
            }
            if (!z) {
                boolean z2 = iA == dxp.c;
                if (iA == 0) {
                    throw null;
                }
                if (!z2) {
                    throw new UnsupportedOperationException("Currently only EventTimeFormat.LOCAL_DATE_DECIMAL/UTC_DATE_DECIMAL is supported.");
                }
            }
            if (dypVar.b != 2) {
                throw new UnsupportedOperationException("Currently only Int64Values is supported for EventTimeFormat.LOCAL_DATE_DECIMAL/UTC_DATE_DECIMAL.");
            }
            HashSet hashSet = new HashSet(((dyn) dypVar.c).b);
            if (hashSet.size() > 1) {
                throw new UnsupportedOperationException(String.format("Query %s has more than one distinct local date decimal value returned.", str));
            }
            if (hashSet.isEmpty()) {
                throw new UnsupportedOperationException(String.format("Query %s has no local date decimal returned.", str));
            }
            long jA = (dypVar.b == 2 ? (dyn) dypVar.c : dyn.a).b.a(0);
            asr asrVar2 = (asr) eiu.a.createBuilder();
            long j = jA / 10000;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ((eiu) asrVar2.a).b = (int) j;
            long j2 = jA / 100;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ((eiu) asrVar2.a).c = (int) (j2 % 100);
            long j3 = jA % 100;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ((eiu) asrVar2.a).d = (int) j3;
            eiu eiuVar = (eiu) asrVar2.z();
            asr asrVar3 = (asr) dye.a.createBuilder();
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            dye dyeVar = (dye) asrVar3.a;
            eiuVar.getClass();
            dyeVar.c = eiuVar;
            dyeVar.b |= 1;
            map2.put(str, (dye) asrVar3.z());
        }
    }

    public final Cursor a(String str, String[] strArr) {
        Cursor cursorRawQuery = this.a.getReadableDatabase().rawQuery(str, strArr);
        cursorRawQuery.getCount();
        return cursorRawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
