package defpackage;

import com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogDatabase_Impl;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avi extends ade {
    final /* synthetic */ NetworkUsageLogDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avi(NetworkUsageLogDatabase_Impl networkUsageLogDatabase_Impl) {
        super(3, "d44a3d5c6fc1858a3059872d9e28f635", "1c1ecdc41cfd20e327122c24a006c62c");
        this.d = networkUsageLogDatabase_Impl;
    }

    @Override // defpackage.ade
    public final void a(ady adyVar) throws Exception {
        uq.k(adyVar, "CREATE TABLE IF NOT EXISTS `NetworkUsageLog` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `status` TEXT, `downloadSize` INTEGER NOT NULL, `uploadSize` INTEGER NOT NULL DEFAULT 0, `creationTime` INTEGER, `fcRunId` INTEGER NOT NULL DEFAULT -1, `policyProto` BLOB, `connectionKey` BLOB, `type` TEXT, `packageName` TEXT)");
        uq.k(adyVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        uq.k(adyVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd44a3d5c6fc1858a3059872d9e28f635')");
    }

    @Override // defpackage.ade
    public final void b(ady adyVar) throws Exception {
        uq.k(adyVar, "DROP TABLE IF EXISTS `NetworkUsageLog`");
    }

    @Override // defpackage.ade
    public final void c(ady adyVar) throws Exception {
        acs acsVarB = this.d.b();
        adu aduVar = acsVarB.b;
        afa afaVarB = adyVar.b("PRAGMA query_only");
        try {
            afaVarB.k();
            boolean zN = afaVarB.n();
            fjp.w(afaVarB, null);
            if (!zN) {
                uq.k(adyVar, "PRAGMA temp_store = MEMORY");
                uq.k(adyVar, "PRAGMA recursive_triggers = 1");
                uq.k(adyVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (aduVar.b) {
                    uq.k(adyVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    uq.k(adyVar, fjz.B("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                acv acvVar = aduVar.c;
                ReentrantLock reentrantLock = (ReentrantLock) acvVar.b;
                reentrantLock.lock();
                try {
                    acvVar.a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (acsVarB.g) {
                wh whVar = acsVarB.h;
            }
        } finally {
        }
    }

    @Override // defpackage.ade
    public final void d(ady adyVar) throws Exception {
        fgt fgtVar = new fgt((byte[]) null);
        afa afaVarB = adyVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (afaVarB.k()) {
            try {
                fgtVar.add(afaVarB.d(0));
            } finally {
            }
        }
        fjp.w(afaVarB, null);
        for (String str : ffh.y(fgtVar)) {
            if (fjz.E(str, "room_fts_content_sync_")) {
                uq.k(adyVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0410  */
    @Override // defpackage.ade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ezo g(defpackage.ady r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avi.g(ady):ezo");
    }

    @Override // defpackage.ade
    public final void e() {
    }

    @Override // defpackage.ade
    public final void f() {
    }
}
