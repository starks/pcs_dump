package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avh extends aeh {
    private final ayg c;

    public avh() {
        super(2, 3);
        this.c = new ayg();
    }

    @Override // defpackage.aeh
    public final void a(ady adyVar) throws Exception {
        uq.k(adyVar, "CREATE TABLE IF NOT EXISTS `_new_NetworkUsageLog` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `status` TEXT, `downloadSize` INTEGER NOT NULL, `uploadSize` INTEGER NOT NULL DEFAULT 0, `creationTime` INTEGER, `fcRunId` INTEGER NOT NULL DEFAULT -1, `policyProto` BLOB, `connectionKey` BLOB, `type` TEXT, `packageName` TEXT)");
        uq.k(adyVar, "INSERT INTO `_new_NetworkUsageLog` (`id`,`url`,`status`,`downloadSize`,`creationTime`,`fcRunId`,`policyProto`,`connectionKey`,`type`,`packageName`) SELECT `id`,`url`,`status`,`size`,`creationTime`,`fcRunId`,`policyProto`,`connectionKey`,`type`,`packageName` FROM `NetworkUsageLog`");
        uq.k(adyVar, "DROP TABLE `NetworkUsageLog`");
        uq.k(adyVar, "ALTER TABLE `_new_NetworkUsageLog` RENAME TO `NetworkUsageLog`");
    }
}
