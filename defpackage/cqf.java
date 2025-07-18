package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqf extends cpt {
    public static final cqf a = new cqf(UUID.randomUUID());

    private cqf(UUID uuid) {
        super("<skip trace>", uuid, cqh.a, cqa.h());
    }

    @Override // defpackage.cqn
    public final cqi i() {
        return cqh.a;
    }

    @Override // defpackage.cqn
    public final cqn k(String str, cqi cqiVar, ezn eznVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }
}
