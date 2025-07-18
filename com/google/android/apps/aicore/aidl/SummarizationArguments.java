package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import defpackage.cxc;
import defpackage.cxg;
import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SummarizationArguments extends bmr {
    public static final Parcelable.Creator CREATOR = new SummarizationArgumentsParcelableCreator();
    private final cxc keys;
    private final cxc values;

    public SummarizationArguments(List list, List list2) {
        this.keys = cxc.o(list);
        this.values = cxc.o(list2);
    }

    public static SummarizationArguments create(Map map) {
        ArrayList arrayList = new ArrayList(map.keySet());
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((String) Map.EL.getOrDefault(map, (String) arrayList.get(i), ""));
        }
        return new SummarizationArguments(arrayList, arrayList2);
    }

    public cxg getArguments() {
        HashMap map = new HashMap();
        for (int i = 0; i < this.keys.size(); i++) {
            map.put((String) this.keys.get(i), (String) this.values.get(i));
        }
        return cxg.g(map);
    }

    public cxc getKeys() {
        return this.keys;
    }

    public cxc getValues() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        SummarizationArgumentsParcelableCreator.writeToParcel(this, parcel, i);
    }
}
