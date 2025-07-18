package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arf implements Iterator {
    private final Cursor a;

    public arf(Cursor cursor) {
        cursor.getClass();
        this.a = cursor;
        if (cursor.moveToFirst()) {
            int columnCount = cursor.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                int type = this.a.getType(i);
                if (type == 0) {
                    throw new IllegalArgumentException("Value of column '" + this.a.getColumnName(i) + "' is null. Consider IFNULL function.");
                }
                if (type == 4) {
                    throw new IllegalArgumentException(a.E(4, "DefaultExamplesGenerator does not support columns of type ", "."));
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fwx next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Cursor cursor = this.a;
        asr asrVar = (asr) fxb.a.createBuilder();
        asrVar.getClass();
        int columnCount = cursor.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            String str = cursor.getColumnNames()[i];
            int type = cursor.getType(i);
            if (type == 1) {
                long j = cursor.getLong(i);
                asr asrVar2 = (asr) fwz.a.createBuilder();
                asr asrVar3 = (asr) fxd.a.createBuilder();
                asrVar3.s(j);
                fxd fxdVar = (fxd) asrVar3.z();
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                fwz fwzVar = (fwz) asrVar2.a;
                fxdVar.getClass();
                fwzVar.c = fxdVar;
                fwzVar.b = 3;
                asrVar.h(str, (fwz) asrVar2.z());
            } else if (type == 2) {
                float f = cursor.getFloat(i);
                asr asrVar4 = (asr) fwz.a.createBuilder();
                asr asrVar5 = (asr) fxc.a.createBuilder();
                asrVar5.t(f);
                fxc fxcVar = (fxc) asrVar5.z();
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                fwz fwzVar2 = (fwz) asrVar4.a;
                fxcVar.getClass();
                fwzVar2.c = fxcVar;
                fwzVar2.b = 2;
                asrVar.h(str, (fwz) asrVar4.z());
            } else {
                if (type != 3) {
                    throw new IllegalArgumentException(type + " not supported.");
                }
                String string = cursor.getString(i);
                asr asrVar6 = (asr) fwz.a.createBuilder();
                asr asrVar7 = (asr) fww.a.createBuilder();
                asrVar7.i(eea.t(string));
                fww fwwVar = (fww) asrVar7.z();
                if (!asrVar6.a.isMutable()) {
                    asrVar6.B();
                }
                fwz fwzVar3 = (fwz) asrVar6.a;
                fwwVar.getClass();
                fwzVar3.c = fwwVar;
                fwzVar3.b = 1;
                asrVar.h(str, (fwz) asrVar6.z());
            }
        }
        asr asrVar8 = (asr) fwx.a.createBuilder();
        if (!asrVar8.a.isMutable()) {
            asrVar8.B();
        }
        fwx fwxVar = (fwx) asrVar8.a;
        fxb fxbVar = (fxb) asrVar.z();
        fxbVar.getClass();
        fwxVar.c = fxbVar;
        fwxVar.b |= 1;
        efb efbVarZ = asrVar8.z();
        efbVarZ.getClass();
        fwx fwxVar2 = (fwx) efbVarZ;
        this.a.moveToNext();
        return fwxVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (this.a.isAfterLast() || this.a.isClosed()) ? false : true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
