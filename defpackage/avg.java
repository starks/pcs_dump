package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avg extends aeh {
    public avg() {
        super(1, 2);
    }

    @Override // defpackage.aeh
    public final void a(ady adyVar) throws Exception {
        uq.k(adyVar, "ALTER TABLE `NetworkUsageLog` ADD COLUMN `fcRunId` INTEGER NOT NULL DEFAULT -1");
    }
}
