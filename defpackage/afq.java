package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afq extends afp implements aff {
    private final SQLiteStatement a;

    public afq(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final void f() {
        this.a.execute();
    }
}
