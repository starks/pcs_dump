package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxx implements bqd {
    public final bqd a;
    public final dyb b;
    private final Executor c;
    private final dxs d;
    private final dyy e;
    private final String f;
    private volatile Deque g = null;
    private final int h;

    public dxx(Context context, Executor executor, dxs dxsVar, bqd bqdVar, int i, dyy dyyVar, String str, dzi dziVar) {
        dzp dzpVar;
        this.c = new dkh(executor);
        if ((dxsVar.b & 8) != 0) {
            dzs dzsVar = dxsVar.f;
            dzpVar = (dzsVar == null ? dzs.a : dzsVar).c;
            if (dzpVar == null) {
                dzpVar = dzp.a;
            }
        } else {
            dzq dzqVar = dxsVar.c;
            dzpVar = (dzqVar == null ? dzq.a : dzqVar).b;
            if (dzpVar == null) {
                dzpVar = dzp.a;
            }
        }
        this.b = new dyb(context, dzpVar, dziVar);
        this.d = dxsVar;
        this.a = bqdVar;
        this.h = i;
        this.e = dyyVar;
        this.f = str;
    }

    private static Map d(Map map, dxs dxsVar, String str, dyy dyyVar) {
        HashMap map2 = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            map2.put((String) ((Map.Entry) it.next()).getKey(), g(dxsVar, str, dyyVar));
        }
        return map2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final boolean e() throws dxu, dxy, SQLException {
        dki dkiVar = new dki();
        this.a.a(new dxw(dkiVar));
        try {
            cru cruVar = (cru) dkiVar.get();
            if (!cruVar.c()) {
                return true;
            }
            try {
                byte[] bArr = (byte[]) cruVar.a();
                een eenVar = een.a;
                egr egrVar = egr.a;
                fwx fwxVar = (fwx) efb.parseFrom(fwx.a, bArr, een.a);
                dyb dybVar = this.b;
                ContentValues contentValues = new ContentValues();
                fxb fxbVar = fwxVar.c;
                if (fxbVar == null) {
                    fxbVar = fxb.a;
                }
                Iterator it = DesugarCollections.unmodifiableMap(fxbVar.b).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!dybVar.b.d.isEmpty()) {
                            contentValues.put(dybVar.b.d, "Outis");
                        }
                        dybVar.a.getWritableDatabase().insertOrThrow(dybVar.b.b, null, contentValues);
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (dybVar.c.contains(str)) {
                        fwz fwzVar = (fwz) entry.getValue();
                        clq.A(!contentValues.containsKey(str), "Column name `%s` already present in the specified contentValues.", str);
                        int iB = fwy.b(fwzVar.b);
                        int i = iB - 1;
                        if (iB == 0) {
                            throw null;
                        }
                        if (i == 0) {
                            fww fwwVar = fwzVar.b == 1 ? (fww) fwzVar.c : fww.a;
                            clq.y(fwwVar.b.size() == 1, "Expected %s to be scalar, but bytes_list.value count was: %d", fwwVar.b.size());
                            contentValues.put(str, ((eea) fwwVar.b.get(0)).x());
                        } else if (i == 1) {
                            fxc fxcVar = fwzVar.b == 2 ? (fxc) fwzVar.c : fxc.a;
                            clq.y(fxcVar.b.size() == 1, "Expected %s to be scalar, but float_list.value count was: %d", fxcVar.b.size());
                            contentValues.put(str, Float.valueOf(fxcVar.b.d(0)));
                        } else {
                            if (i != 2) {
                                throw new AssertionError();
                            }
                            fxd fxdVar = fwzVar.b == 3 ? (fxd) fwzVar.c : fxd.a;
                            clq.y(fxdVar.b.size() == 1, "Expected %s to be scalar, but int64_list.value count was: %d", fxdVar.b.size());
                            contentValues.put(str, Long.valueOf(fxdVar.b.a(0)));
                        }
                    } else if (dybVar.d.containsKey(str)) {
                        Map map = dybVar.e;
                        fwz fwzVar2 = (fwz) entry.getValue();
                        ebr ebrVar = (ebr) dybVar.d.get(str);
                        asr asrVar = (asr) dyp.a.createBuilder();
                        switch (ebrVar) {
                            case UNSPECIFIED:
                            case UNRECOGNIZED:
                                throw new AssertionError();
                            case INT32:
                                asr asrVar2 = (asr) dym.a.createBuilder();
                                asrVar2.m(ebq.f(fwzVar2));
                                dym dymVar = (dym) asrVar2.z();
                                if (!asrVar.a.isMutable()) {
                                    asrVar.B();
                                }
                                dyp dypVar = (dyp) asrVar.a;
                                dymVar.getClass();
                                dypVar.c = dymVar;
                                dypVar.b = 1;
                                map.put(str, (dyp) asrVar.z());
                                break;
                            case INT64:
                                asr asrVar3 = (asr) dyn.a.createBuilder();
                                asrVar3.l(ebq.f(fwzVar2));
                                dyn dynVar = (dyn) asrVar3.z();
                                if (!asrVar.a.isMutable()) {
                                    asrVar.B();
                                }
                                dyp dypVar2 = (dyp) asrVar.a;
                                dynVar.getClass();
                                dypVar2.c = dynVar;
                                dypVar2.b = 2;
                                map.put(str, (dyp) asrVar.z());
                                break;
                            case BOOL:
                                asr asrVar4 = (asr) dyi.a.createBuilder();
                                asrVar4.q(ebq.f(fwzVar2) == 1);
                                dyi dyiVar = (dyi) asrVar4.z();
                                if (!asrVar.a.isMutable()) {
                                    asrVar.B();
                                }
                                dyp dypVar3 = (dyp) asrVar.a;
                                dyiVar.getClass();
                                dypVar3.c = dyiVar;
                                dypVar3.b = 3;
                                map.put(str, (dyp) asrVar.z());
                                break;
                            case FLOAT:
                                asr asrVar5 = (asr) dyl.a.createBuilder();
                                asrVar5.n(ebq.e(fwzVar2));
                                dyl dylVar = (dyl) asrVar5.z();
                                if (!asrVar.a.isMutable()) {
                                    asrVar.B();
                                }
                                dyp dypVar4 = (dyp) asrVar.a;
                                dylVar.getClass();
                                dypVar4.c = dylVar;
                                dypVar4.b = 4;
                                map.put(str, (dyp) asrVar.z());
                                break;
                            case DOUBLE:
                                asr asrVar6 = (asr) dyk.a.createBuilder();
                                asrVar6.o(ebq.e(fwzVar2));
                                dyk dykVar = (dyk) asrVar6.z();
                                if (!asrVar.a.isMutable()) {
                                    asrVar.B();
                                }
                                dyp dypVar5 = (dyp) asrVar.a;
                                dykVar.getClass();
                                dypVar5.c = dykVar;
                                dypVar5.b = 5;
                                map.put(str, (dyp) asrVar.z());
                                break;
                            case BYTES:
                                asr asrVar7 = (asr) dyj.a.createBuilder();
                                asrVar7.p(ebq.g(fwzVar2));
                                dyj dyjVar = (dyj) asrVar7.z();
                                if (!asrVar.a.isMutable()) {
                                    asrVar.B();
                                }
                                dyp dypVar6 = (dyp) asrVar.a;
                                dyjVar.getClass();
                                dypVar6.c = dyjVar;
                                dypVar6.b = 7;
                                map.put(str, (dyp) asrVar.z());
                                break;
                            case STRING:
                                asr asrVar8 = (asr) dyo.a.createBuilder();
                                asrVar8.k(ebq.g(fwzVar2).u());
                                dyo dyoVar = (dyo) asrVar8.z();
                                if (!asrVar.a.isMutable()) {
                                    asrVar.B();
                                }
                                dyp dypVar7 = (dyp) asrVar.a;
                                dyoVar.getClass();
                                dypVar7.c = dyoVar;
                                dypVar7.b = 6;
                                map.put(str, (dyp) asrVar.z());
                                break;
                            default:
                                map.put(str, (dyp) asrVar.z());
                                break;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (efp e) {
                throw new dxu(e);
            }
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            cause.getClass();
            dxy dxyVar = (dxy) cause;
            throw new dxy(dxyVar.a, dxyVar.getMessage(), e2);
        }
    }

    private final byte[] f() {
        Cursor cursorA;
        Map map;
        dyb dybVar;
        int i;
        Iterator it;
        Map map2;
        Iterator it2;
        int i2;
        String string;
        while (!e()) {
        }
        this.g = new ArrayDeque();
        int i3 = this.h;
        byte[] byteArray = null;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 2;
        if (i4 == -1 || i4 == 0) {
            dyb dybVar2 = this.b;
            dzq dzqVar = this.d.c;
            if (dzqVar == null) {
                dzqVar = dzq.a;
            }
            cursorA = dybVar2.a(dzqVar.c, g(this.d, this.f, this.e));
            try {
                ArrayDeque<fwx> arrayDeque = new ArrayDeque(cursorA.getCount());
                while (cursorA.moveToNext()) {
                    asr asrVar = (asr) fxb.a.createBuilder();
                    for (int i5 = 0; i5 < cursorA.getColumnCount(); i5++) {
                        asr asrVar2 = (asr) fwz.a.createBuilder();
                        int type = cursorA.getType(i5);
                        if (type == 0) {
                            throw new dxt(cursorA.getColumnName(i5));
                        }
                        if (type == 1) {
                            asr asrVar3 = (asr) fxd.a.createBuilder();
                            asrVar3.s(cursorA.getLong(i5));
                            fxd fxdVar = (fxd) asrVar3.z();
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            fwz fwzVar = (fwz) asrVar2.a;
                            fxdVar.getClass();
                            fwzVar.c = fxdVar;
                            fwzVar.b = 3;
                        } else if (type == 2) {
                            asr asrVar4 = (asr) fxc.a.createBuilder();
                            asrVar4.t(cursorA.getFloat(i5));
                            fxc fxcVar = (fxc) asrVar4.z();
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            fwz fwzVar2 = (fwz) asrVar2.a;
                            fxcVar.getClass();
                            fwzVar2.c = fxcVar;
                            fwzVar2.b = 2;
                        } else if (type == 3) {
                            asr asrVar5 = (asr) fww.a.createBuilder();
                            String string2 = cursorA.getString(i5);
                            string2.getClass();
                            asrVar5.i(eea.t(string2));
                            fww fwwVar = (fww) asrVar5.z();
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            fwz fwzVar3 = (fwz) asrVar2.a;
                            fwwVar.getClass();
                            fwzVar3.c = fwwVar;
                            fwzVar3.b = 1;
                        } else {
                            if (type != 4) {
                                throw new UnsupportedOperationException(String.format("Unsupported column type for column `%s`: %d", cursorA.getColumnName(i5), Integer.valueOf(cursorA.getType(i5))));
                            }
                            asr asrVar6 = (asr) fww.a.createBuilder();
                            asrVar6.i(eea.r(cursorA.getBlob(i5)));
                            fww fwwVar2 = (fww) asrVar6.z();
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            fwz fwzVar4 = (fwz) asrVar2.a;
                            fwwVar2.getClass();
                            fwzVar4.c = fwwVar2;
                            fwzVar4.b = 1;
                        }
                        asrVar.h(cursorA.getColumnName(i5), (fwz) asrVar2.z());
                    }
                    asr asrVar7 = (asr) fwx.a.createBuilder();
                    fxb fxbVar = (fxb) asrVar.z();
                    if (!asrVar7.a.isMutable()) {
                        asrVar7.B();
                    }
                    fwx fwxVar = (fwx) asrVar7.a;
                    fxbVar.getClass();
                    fwxVar.c = fxbVar;
                    fwxVar.b |= 1;
                    arrayDeque.add((fwx) asrVar7.z());
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                for (fwx fwxVar2 : arrayDeque) {
                    Deque deque = this.g;
                    deque.getClass();
                    deque.addLast(fwxVar2.toByteArray());
                }
                asr asrVar8 = (asr) fwx.a.createBuilder();
                asr asrVar9 = (asr) fxb.a.createBuilder();
                asr asrVar10 = (asr) fwz.a.createBuilder();
                asr asrVar11 = (asr) fxd.a.createBuilder();
                asrVar11.s(6L);
                if (!asrVar10.a.isMutable()) {
                    asrVar10.B();
                }
                fwz fwzVar5 = (fwz) asrVar10.a;
                fxd fxdVar2 = (fxd) asrVar11.z();
                fxdVar2.getClass();
                fwzVar5.c = fxdVar2;
                fwzVar5.b = 3;
                asrVar9.h("client_sql_version", (fwz) asrVar10.z());
                fxb fxbVar2 = (fxb) asrVar9.z();
                if (!asrVar8.a.isMutable()) {
                    asrVar8.B();
                }
                fwx fwxVar3 = (fwx) asrVar8.a;
                fxbVar2.getClass();
                fwxVar3.c = fxbVar2;
                fwxVar3.b |= 1;
                byteArray = ((fwx) asrVar8.z()).toByteArray();
            } finally {
            }
        } else if (i4 == 1) {
            dzs dzsVar = this.d.f;
            if (dzsVar == null) {
                dzsVar = dzs.a;
            }
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(dzsVar.b);
            Map mapD = d(mapUnmodifiableMap, this.d, this.f, this.e);
            dyb dybVar3 = this.b;
            Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(this.d.g);
            asr asrVar12 = (asr) dyr.a.createBuilder();
            HashMap map3 = new HashMap();
            Iterator it3 = mapUnmodifiableMap.entrySet().iterator();
            int count = 0;
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                String str = (String) entry.getKey();
                dzq dzqVar2 = (dzq) entry.getValue();
                efm<dzo> efmVar = dzqVar2.d;
                String[] strArr = (String[]) mapD.get(str);
                if (strArr == null) {
                    throw new IllegalArgumentException(String.format("Query %s has no selection args", str));
                }
                cursorA = dybVar3.a(dzqVar2.c, strArr);
                try {
                    String str2 = str + "/";
                    Map map4 = dybVar3.d;
                    Map map5 = dybVar3.e;
                    HashMap map6 = new HashMap();
                    int count2 = cursorA.getCount();
                    Iterator it4 = it3;
                    if (count2 == 0) {
                        for (dzo dzoVar : efmVar) {
                            String str3 = dzoVar.b;
                            Map map7 = mapD;
                            String strConcat = String.valueOf(str2).concat(String.valueOf(str3));
                            asr asrVar13 = (asr) dyp.a.createBuilder();
                            ebr ebrVarB = ebr.b(dzoVar.c);
                            if (ebrVarB == null) {
                                ebrVarB = ebr.UNRECOGNIZED;
                            }
                            switch (ebrVarB) {
                                case UNSPECIFIED:
                                case UNRECOGNIZED:
                                    throw new UnsupportedOperationException(String.format("Unspecified type for column `%s`", str3));
                                case INT32:
                                    dym dymVar = dym.a;
                                    if (!asrVar13.a.isMutable()) {
                                        asrVar13.B();
                                    }
                                    dyp dypVar = (dyp) asrVar13.a;
                                    dymVar.getClass();
                                    dypVar.c = dymVar;
                                    dypVar.b = 1;
                                    break;
                                case INT64:
                                    dyn dynVar = dyn.a;
                                    if (!asrVar13.a.isMutable()) {
                                        asrVar13.B();
                                    }
                                    dyp dypVar2 = (dyp) asrVar13.a;
                                    dynVar.getClass();
                                    dypVar2.c = dynVar;
                                    dypVar2.b = 2;
                                    break;
                                case BOOL:
                                    dyi dyiVar = dyi.a;
                                    if (!asrVar13.a.isMutable()) {
                                        asrVar13.B();
                                    }
                                    dyp dypVar3 = (dyp) asrVar13.a;
                                    dyiVar.getClass();
                                    dypVar3.c = dyiVar;
                                    dypVar3.b = 3;
                                    break;
                                case FLOAT:
                                    dyl dylVar = dyl.a;
                                    if (!asrVar13.a.isMutable()) {
                                        asrVar13.B();
                                    }
                                    dyp dypVar4 = (dyp) asrVar13.a;
                                    dylVar.getClass();
                                    dypVar4.c = dylVar;
                                    dypVar4.b = 4;
                                    break;
                                case DOUBLE:
                                    dyk dykVar = dyk.a;
                                    if (!asrVar13.a.isMutable()) {
                                        asrVar13.B();
                                    }
                                    dyp dypVar5 = (dyp) asrVar13.a;
                                    dykVar.getClass();
                                    dypVar5.c = dykVar;
                                    dypVar5.b = 5;
                                    break;
                                case BYTES:
                                    dyj dyjVar = dyj.a;
                                    if (!asrVar13.a.isMutable()) {
                                        asrVar13.B();
                                    }
                                    dyp dypVar6 = (dyp) asrVar13.a;
                                    dyjVar.getClass();
                                    dypVar6.c = dyjVar;
                                    dypVar6.b = 7;
                                    break;
                                case STRING:
                                    dyo dyoVar = dyo.a;
                                    if (!asrVar13.a.isMutable()) {
                                        asrVar13.B();
                                    }
                                    dyp dypVar7 = (dyp) asrVar13.a;
                                    dyoVar.getClass();
                                    dypVar7.c = dyoVar;
                                    dypVar7.b = 6;
                                    break;
                            }
                            map6.put(strConcat, (dyp) asrVar13.z());
                            mapD = map7;
                        }
                        map = mapD;
                        dybVar = dybVar3;
                        i = count;
                    } else {
                        map = mapD;
                        HashMap map8 = new HashMap();
                        while (cursorA.moveToNext()) {
                            for (dzo dzoVar2 : efmVar) {
                                Map map9 = map5;
                                efm efmVar2 = efmVar;
                                String str4 = dzoVar2.b;
                                String str5 = str2;
                                int columnIndex = cursorA.getColumnIndex(str4);
                                dyb dybVar4 = dybVar3;
                                if (columnIndex == -1) {
                                    throw new UnsupportedOperationException(String.format("Column `%s` not found in the query result", str4));
                                }
                                if (cursorA.isNull(columnIndex)) {
                                    throw new dxt(str4);
                                }
                                ebr ebrVarB2 = ebr.b(dzoVar2.c);
                                if (ebrVarB2 == null) {
                                    ebrVarB2 = ebr.UNRECOGNIZED;
                                }
                                switch (ebrVarB2) {
                                    case UNSPECIFIED:
                                    case UNRECOGNIZED:
                                        throw new UnsupportedOperationException(String.format("Unspecified type for column `%s`", str4));
                                    case INT32:
                                        i2 = count;
                                        asr asrVar14 = (asr) map8.get(str4);
                                        if (asrVar14 == null) {
                                            asrVar14 = (asr) dym.a.createBuilder();
                                            map8.put(str4, asrVar14);
                                        }
                                        asrVar14.m(cursorA.getInt(columnIndex));
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                        count = i2;
                                    case INT64:
                                        i2 = count;
                                        asr asrVar15 = (asr) map8.get(str4);
                                        if (asrVar15 == null) {
                                            asrVar15 = (asr) dyn.a.createBuilder();
                                            map8.put(str4, asrVar15);
                                        }
                                        asrVar15.l(cursorA.getLong(columnIndex));
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                        count = i2;
                                    case BOOL:
                                        i2 = count;
                                        asr asrVar16 = (asr) map8.get(str4);
                                        if (asrVar16 == null) {
                                            asrVar16 = (asr) dyi.a.createBuilder();
                                            map8.put(str4, asrVar16);
                                        }
                                        asrVar16.q(cursorA.getInt(columnIndex) == 1);
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                        count = i2;
                                    case FLOAT:
                                        i2 = count;
                                        asr asrVar17 = (asr) map8.get(str4);
                                        if (asrVar17 == null) {
                                            asrVar17 = (asr) dyl.a.createBuilder();
                                            map8.put(str4, asrVar17);
                                        }
                                        asrVar17.n(cursorA.getFloat(columnIndex));
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                        count = i2;
                                    case DOUBLE:
                                        i2 = count;
                                        asr asrVar18 = (asr) map8.get(str4);
                                        if (asrVar18 == null) {
                                            asrVar18 = (asr) dyk.a.createBuilder();
                                            map8.put(str4, asrVar18);
                                        }
                                        asrVar18.o(cursorA.getDouble(columnIndex));
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                        count = i2;
                                    case BYTES:
                                        i2 = count;
                                        asr asrVar19 = (asr) map8.get(str4);
                                        if (asrVar19 == null) {
                                            asrVar19 = (asr) dyj.a.createBuilder();
                                            map8.put(str4, asrVar19);
                                        }
                                        asrVar19.p(eea.r(cursorA.getBlob(columnIndex)));
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                        count = i2;
                                    case STRING:
                                        asr asrVar20 = (asr) map8.get(str4);
                                        if (asrVar20 == null) {
                                            asrVar20 = (asr) dyo.a.createBuilder();
                                            map8.put(str4, asrVar20);
                                        }
                                        int type2 = cursorA.getType(columnIndex);
                                        i2 = count;
                                        if (type2 == 3) {
                                            string = cursorA.getString(columnIndex);
                                        } else {
                                            if (type2 != 4) {
                                                throw new UnsupportedOperationException(String.format("Unsupported column type for column `%s`: %d", str4, Integer.valueOf(cursorA.getType(columnIndex))));
                                            }
                                            string = eea.r(cursorA.getBlob(columnIndex)).u();
                                        }
                                        string.getClass();
                                        asrVar20.k(string);
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                        count = i2;
                                    default:
                                        efmVar = efmVar2;
                                        map5 = map9;
                                        str2 = str5;
                                        dybVar3 = dybVar4;
                                }
                            }
                        }
                        Map map10 = map5;
                        String str6 = str2;
                        dybVar = dybVar3;
                        i = count;
                        for (dzo dzoVar3 : efmVar) {
                            String str7 = dzoVar3.b;
                            ebr ebrVarB3 = ebr.b(dzoVar3.c);
                            if (ebrVarB3 == null) {
                                ebrVarB3 = ebr.UNRECOGNIZED;
                            }
                            Object obj = map8.get(str7);
                            if (obj == null) {
                                throw new UnsupportedOperationException(String.format("Unexpected NULL value in column `%s`", str7));
                            }
                            HashMap map11 = map8;
                            String strConcat2 = String.valueOf(str6).concat(String.valueOf(str7));
                            switch (ebrVarB3) {
                                case UNSPECIFIED:
                                case UNRECOGNIZED:
                                    throw new UnsupportedOperationException(String.format("Unspecified type for column `%s`", str7));
                                case INT32:
                                    asr asrVar21 = (asr) dyp.a.createBuilder();
                                    dym dymVar2 = (dym) ((asr) obj).z();
                                    if (!asrVar21.a.isMutable()) {
                                        asrVar21.B();
                                    }
                                    dyp dypVar8 = (dyp) asrVar21.a;
                                    dymVar2.getClass();
                                    dypVar8.c = dymVar2;
                                    dypVar8.b = 1;
                                    map6.put(strConcat2, (dyp) asrVar21.z());
                                    break;
                                case INT64:
                                    asr asrVar22 = (asr) dyp.a.createBuilder();
                                    dyn dynVar2 = (dyn) ((asr) obj).z();
                                    if (!asrVar22.a.isMutable()) {
                                        asrVar22.B();
                                    }
                                    dyp dypVar9 = (dyp) asrVar22.a;
                                    dynVar2.getClass();
                                    dypVar9.c = dynVar2;
                                    dypVar9.b = 2;
                                    map6.put(strConcat2, (dyp) asrVar22.z());
                                    break;
                                case BOOL:
                                    asr asrVar23 = (asr) dyp.a.createBuilder();
                                    dyi dyiVar2 = (dyi) ((asr) obj).z();
                                    if (!asrVar23.a.isMutable()) {
                                        asrVar23.B();
                                    }
                                    dyp dypVar10 = (dyp) asrVar23.a;
                                    dyiVar2.getClass();
                                    dypVar10.c = dyiVar2;
                                    dypVar10.b = 3;
                                    map6.put(strConcat2, (dyp) asrVar23.z());
                                    break;
                                case FLOAT:
                                    asr asrVar24 = (asr) dyp.a.createBuilder();
                                    dyl dylVar2 = (dyl) ((asr) obj).z();
                                    if (!asrVar24.a.isMutable()) {
                                        asrVar24.B();
                                    }
                                    dyp dypVar11 = (dyp) asrVar24.a;
                                    dylVar2.getClass();
                                    dypVar11.c = dylVar2;
                                    dypVar11.b = 4;
                                    map6.put(strConcat2, (dyp) asrVar24.z());
                                    break;
                                case DOUBLE:
                                    asr asrVar25 = (asr) dyp.a.createBuilder();
                                    dyk dykVar2 = (dyk) ((asr) obj).z();
                                    if (!asrVar25.a.isMutable()) {
                                        asrVar25.B();
                                    }
                                    dyp dypVar12 = (dyp) asrVar25.a;
                                    dykVar2.getClass();
                                    dypVar12.c = dykVar2;
                                    dypVar12.b = 5;
                                    map6.put(strConcat2, (dyp) asrVar25.z());
                                    break;
                                case BYTES:
                                    asr asrVar26 = (asr) dyp.a.createBuilder();
                                    dyj dyjVar2 = (dyj) ((asr) obj).z();
                                    if (!asrVar26.a.isMutable()) {
                                        asrVar26.B();
                                    }
                                    dyp dypVar13 = (dyp) asrVar26.a;
                                    dyjVar2.getClass();
                                    dypVar13.c = dyjVar2;
                                    dypVar13.b = 7;
                                    map6.put(strConcat2, (dyp) asrVar26.z());
                                    break;
                                case STRING:
                                    asr asrVar27 = (asr) dyp.a.createBuilder();
                                    dyo dyoVar2 = (dyo) ((asr) obj).z();
                                    if (!asrVar27.a.isMutable()) {
                                        asrVar27.B();
                                    }
                                    dyp dypVar14 = (dyp) asrVar27.a;
                                    dyoVar2.getClass();
                                    dypVar14.c = dyoVar2;
                                    dypVar14.b = 6;
                                    map6.put(strConcat2, (dyp) asrVar27.z());
                                    break;
                            }
                            map8 = map11;
                        }
                        Iterator it5 = map10.entrySet().iterator();
                        while (it5.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it5.next();
                            String str8 = (String) entry2.getKey();
                            dyp dypVar15 = (dyp) entry2.getValue();
                            ebr ebrVar = (ebr) map4.get(str8);
                            ebrVar.getClass();
                            String strConcat3 = String.valueOf(str6).concat(String.valueOf(str8));
                            switch (ebrVar) {
                                case UNSPECIFIED:
                                case UNRECOGNIZED:
                                    throw new UnsupportedOperationException(String.format("Unspecified type for column `%s`", str8));
                                case INT32:
                                    it = it5;
                                    map2 = map4;
                                    asr asrVar28 = (asr) dym.a.createBuilder();
                                    int iD = (dypVar15.b == 1 ? (dym) dypVar15.c : dym.a).b.d(0);
                                    for (int i6 = 0; i6 < count2; i6++) {
                                        asrVar28.m(iD);
                                    }
                                    asr asrVar29 = (asr) dyp.a.createBuilder();
                                    dym dymVar3 = (dym) asrVar28.z();
                                    if (!asrVar29.a.isMutable()) {
                                        asrVar29.B();
                                    }
                                    dyp dypVar16 = (dyp) asrVar29.a;
                                    dymVar3.getClass();
                                    dypVar16.c = dymVar3;
                                    dypVar16.b = 1;
                                    map6.put(strConcat3, (dyp) asrVar29.z());
                                    it5 = it;
                                    map4 = map2;
                                case INT64:
                                    Iterator it6 = it5;
                                    asr asrVar30 = (asr) dyn.a.createBuilder();
                                    it = it6;
                                    map2 = map4;
                                    long jA = (dypVar15.b == 2 ? (dyn) dypVar15.c : dyn.a).b.a(0);
                                    for (int i7 = 0; i7 < count2; i7++) {
                                        asrVar30.l(jA);
                                    }
                                    asr asrVar31 = (asr) dyp.a.createBuilder();
                                    dyn dynVar3 = (dyn) asrVar30.z();
                                    if (!asrVar31.a.isMutable()) {
                                        asrVar31.B();
                                    }
                                    dyp dypVar17 = (dyp) asrVar31.a;
                                    dynVar3.getClass();
                                    dypVar17.c = dynVar3;
                                    dypVar17.b = 2;
                                    map6.put(strConcat3, (dyp) asrVar31.z());
                                    it5 = it;
                                    map4 = map2;
                                case BOOL:
                                    it2 = it5;
                                    asr asrVar32 = (asr) dyi.a.createBuilder();
                                    boolean zG = (dypVar15.b == 3 ? (dyi) dypVar15.c : dyi.a).b.g(0);
                                    for (int i8 = 0; i8 < count2; i8++) {
                                        asrVar32.q(zG);
                                    }
                                    asr asrVar33 = (asr) dyp.a.createBuilder();
                                    dyi dyiVar3 = (dyi) asrVar32.z();
                                    if (!asrVar33.a.isMutable()) {
                                        asrVar33.B();
                                    }
                                    dyp dypVar18 = (dyp) asrVar33.a;
                                    dyiVar3.getClass();
                                    dypVar18.c = dyiVar3;
                                    dypVar18.b = 3;
                                    map6.put(strConcat3, (dyp) asrVar33.z());
                                    it5 = it2;
                                case FLOAT:
                                    it2 = it5;
                                    asr asrVar34 = (asr) dyl.a.createBuilder();
                                    float fD = (dypVar15.b == 4 ? (dyl) dypVar15.c : dyl.a).b.d(0);
                                    for (int i9 = 0; i9 < count2; i9++) {
                                        asrVar34.n(fD);
                                    }
                                    asr asrVar35 = (asr) dyp.a.createBuilder();
                                    dyl dylVar3 = (dyl) asrVar34.z();
                                    if (!asrVar35.a.isMutable()) {
                                        asrVar35.B();
                                    }
                                    dyp dypVar19 = (dyp) asrVar35.a;
                                    dylVar3.getClass();
                                    dypVar19.c = dylVar3;
                                    dypVar19.b = 4;
                                    map6.put(strConcat3, (dyp) asrVar35.z());
                                    it5 = it2;
                                case DOUBLE:
                                    asr asrVar36 = (asr) dyk.a.createBuilder();
                                    it2 = it5;
                                    double d = (dypVar15.b == 5 ? (dyk) dypVar15.c : dyk.a).b.d(0);
                                    for (int i10 = 0; i10 < count2; i10++) {
                                        asrVar36.o(d);
                                    }
                                    asr asrVar37 = (asr) dyp.a.createBuilder();
                                    dyk dykVar3 = (dyk) asrVar36.z();
                                    if (!asrVar37.a.isMutable()) {
                                        asrVar37.B();
                                    }
                                    dyp dypVar20 = (dyp) asrVar37.a;
                                    dykVar3.getClass();
                                    dypVar20.c = dykVar3;
                                    dypVar20.b = 5;
                                    map6.put(strConcat3, (dyp) asrVar37.z());
                                    it5 = it2;
                                case BYTES:
                                    asr asrVar38 = (asr) dyj.a.createBuilder();
                                    eea eeaVar = (eea) (dypVar15.b == 7 ? (dyj) dypVar15.c : dyj.a).b.get(0);
                                    for (int i11 = 0; i11 < count2; i11++) {
                                        asrVar38.p(eeaVar);
                                    }
                                    asr asrVar39 = (asr) dyp.a.createBuilder();
                                    dyj dyjVar3 = (dyj) asrVar38.z();
                                    if (!asrVar39.a.isMutable()) {
                                        asrVar39.B();
                                    }
                                    dyp dypVar21 = (dyp) asrVar39.a;
                                    dyjVar3.getClass();
                                    dypVar21.c = dyjVar3;
                                    dypVar21.b = 7;
                                    map6.put(strConcat3, (dyp) asrVar39.z());
                                case STRING:
                                    asr asrVar40 = (asr) dyo.a.createBuilder();
                                    String str9 = (String) (dypVar15.b == 6 ? (dyo) dypVar15.c : dyo.a).b.get(0);
                                    for (int i12 = 0; i12 < count2; i12++) {
                                        asrVar40.k(str9);
                                    }
                                    asr asrVar41 = (asr) dyp.a.createBuilder();
                                    dyo dyoVar3 = (dyo) asrVar40.z();
                                    if (!asrVar41.a.isMutable()) {
                                        asrVar41.B();
                                    }
                                    dyp dypVar22 = (dyp) asrVar41.a;
                                    dyoVar3.getClass();
                                    dypVar22.c = dyoVar3;
                                    dypVar22.b = 6;
                                    map6.put(strConcat3, (dyp) asrVar41.z());
                            }
                        }
                    }
                    if (!asrVar12.a.isMutable()) {
                        asrVar12.B();
                    }
                    dyr dyrVar = (dyr) asrVar12.a;
                    egd egdVar = dyrVar.b;
                    if (!egdVar.b) {
                        dyrVar.b = egdVar.a();
                    }
                    dyrVar.b.putAll(map6);
                    count = i + cursorA.getCount();
                    if (cursorA.getCount() > 0) {
                        dyb.b(str, asrVar12, mapUnmodifiableMap2, map3);
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    it3 = it4;
                    mapD = map;
                    dybVar3 = dybVar;
                } finally {
                }
            }
            int i13 = count;
            asr asrVar42 = (asr) dys.a.createBuilder();
            dyr dyrVar2 = (dyr) asrVar12.z();
            if (!asrVar42.a.isMutable()) {
                asrVar42.B();
            }
            dys dysVar = (dys) asrVar42.a;
            dyrVar2.getClass();
            dysVar.c = dyrVar2;
            dysVar.b |= 1;
            asr asrVar43 = (asr) dyh.a.createBuilder();
            if (!asrVar43.a.isMutable()) {
                asrVar43.B();
            }
            ((dyh) asrVar43.a).b = i13;
            if (!asrVar43.a.isMutable()) {
                asrVar43.B();
            }
            dyh dyhVar = (dyh) asrVar43.a;
            egd egdVar2 = dyhVar.c;
            if (!egdVar2.b) {
                dyhVar.c = egdVar2.a();
            }
            dyhVar.c.putAll(map3);
            if (!asrVar42.a.isMutable()) {
                asrVar42.B();
            }
            dys dysVar2 = (dys) asrVar42.a;
            dyh dyhVar2 = (dyh) asrVar43.z();
            dyhVar2.getClass();
            dysVar2.d = dyhVar2;
            dysVar2.b |= 2;
            byteArray = ((dys) asrVar42.z()).toByteArray();
        }
        byteArray.getClass();
        return byteArray;
    }

    private static String[] g(dxs dxsVar, String str, dyy dyyVar) {
        if ((dxsVar.b & 4) != 0) {
            dxo dxoVar = dxsVar.e;
            if (dxoVar == null) {
                dxoVar = dxo.a;
            }
            if (!dxoVar.b) {
                ehf ehfVar = (ehf) DesugarCollections.unmodifiableMap(dyyVar.b).get(str);
                return new String[]{ehfVar != null ? String.valueOf(ehz.a(ehfVar)) : "0"};
            }
        }
        return new String[0];
    }

    @Override // defpackage.bqd
    public final void a(bqc bqcVar) {
        this.c.execute(new cfz(this, bqcVar, 6, (char[]) null));
    }

    public final /* synthetic */ void c(bqc bqcVar) {
        byte[] bArrF;
        if (this.g == null) {
            try {
                bArrF = f();
            } catch (dxv e) {
                bqcVar.a(e.a, e.getMessage());
                return;
            } catch (InterruptedException | UnsupportedOperationException e2) {
                bqcVar.a(8, e2.getMessage());
                return;
            }
        } else {
            bArrF = (byte[]) this.g.pollFirst();
        }
        bqcVar.b(bArrF, null);
    }

    @Override // defpackage.bqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.execute(new chg(this, 5));
    }

    @Override // defpackage.bqd
    public final void b(int i) {
    }
}
