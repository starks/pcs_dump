package com.google.android.apps.miphone.astrea.networkusage.db.impl;

import defpackage.acs;
import defpackage.adf;
import defpackage.avc;
import defpackage.ave;
import defpackage.avg;
import defpackage.avh;
import defpackage.avi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NetworkUsageLogDatabase_Impl extends NetworkUsageLogDatabase {
    private volatile avc k;

    @Override // defpackage.add
    public final acs a() {
        return new acs(this, new HashMap(0), new HashMap(0), "NetworkUsageLog");
    }

    @Override // defpackage.add
    public final /* synthetic */ adf c() {
        return new avi(this);
    }

    @Override // defpackage.add
    public final Map e() {
        HashMap map = new HashMap();
        map.put(avc.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.add
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.add
    public final List k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new avg());
        arrayList.add(new avh());
        return arrayList;
    }

    @Override // com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogDatabase
    public final avc l() {
        avc avcVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new ave(this);
            }
            avcVar = this.k;
        }
        return avcVar;
    }
}
